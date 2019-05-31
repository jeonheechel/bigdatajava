package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MovieEvaluationRanking extends JPanel {
	MovieDAO daoM;
	MovieDTO dtoM;

	HashSet hs;
	ArrayList movieList, mNameAndEvaluation;
	String[] arr, mNameAndEvaluationArr;
	Double[] dou;
	Double[] mEvaluation = null;

	JButton Alignment1Btn, Alignment2Btn, Alignment3Btn;

	public MovieEvaluationRanking() {
		CollectingImage img = new CollectingImage();
		daoM = new MovieDAO();
		dtoM = new MovieDTO();

		// 프레임 구성
		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		add(p1);
		p1.setLayout(null);
		JPanel p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		p2.setBackground(new Color(18, 18, 18));
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		movieList = daoM.selectAll();
		mNameAndEvaluation = new ArrayList();
		hs = new HashSet();
		for (int i = 0; i < movieList.size(); i++) {
			dtoM = (MovieDTO) movieList.get(i);
			System.out.println(dtoM.getMovieName()); // DB에서 평가한 영화제목들만 순서대로 출력
			mNameAndEvaluation.add(dtoM.getMovieName());
			mNameAndEvaluation.add(dtoM.getEvaluationScore());
			hs.add(dtoM.getMovieName()); // 중복되지 않게 hashset에 영화제목 넣기
		}

		for (int i = 0; i < movieList.size(); i++) {
			dtoM = (MovieDTO) movieList.get(i);
			System.out.println(dtoM.getEvaluationScore()); // DB에서 평가한 영화들의 평점들만 순서대로 출력
		}

		// hashset에 있는 영화이름들을 arr배열에 저장
		arr = new String[hs.size()];
		Iterator<String> i = hs.iterator();
		int count1 = 0;
		while (i.hasNext()) {
			arr[count1] = i.next(); // arr[index]는 영화 평점을 남긴 영화제목들을 한번씩만 저장하게 됨
			System.out.println("배열 : " + arr[count1]);
			count1++;
		}

		System.out.println();

		// 영화이름 평점 <-- 모습으로 출력
		for (int j = 0; j < mNameAndEvaluation.size(); j++) {
			System.out.print(mNameAndEvaluation.get(j) + " ");
			if (j % 2 != 0) {
				System.out.println();
			}
		}

		System.out.println("-------------");
		System.out.println("-------------");

		String[] mName = new String[arr.length];
		mEvaluation = new Double[arr.length];
		int[] aaa = new int[arr.length];
		for (int j = 0; j < mEvaluation.length; j++) {
			mEvaluation[j] = 0.0;
			aaa[j] = 0;

		}
		for (int j = 0; j < arr.length; j++) {
			int count2 = 0;
			for (int j2 = 0; j2 < mNameAndEvaluation.size(); j2++) {
				if (arr[j].equals(mNameAndEvaluation.get(j2))) {
					System.out.println("!!!!!" + j2);
					mName[j] = arr[j];
					mEvaluation[j] += (Double) mNameAndEvaluation.get(j2 + 1);
					count2++;
					aaa[j] = count2;
				}
			}
		}

		for (int j = 0; j < aaa.length; j++) {
			System.out.println("aaa : " + aaa[j]);
			mEvaluation[j] = Double.parseDouble(String.format("%.2f", mEvaluation[j] / aaa[j]));
		}

		System.out.println("=======");
		System.out.println("=======");

		for (int j = 0; j < mName.length; j++) {
			System.out.println("제목 : " + mName[j]);
			System.out.printf("평점합계 : %.2f", mEvaluation[j]);
			System.out.println();
		}

		// 영화 이름과 평점을 평점 오름차순으로 정렬
		for (int j = 0; j < aaa.length; j++) {
			for (int j2 = j + 1; j2 < aaa.length; j2++) {
				if (mEvaluation[j] < mEvaluation[j2]) {
					double num = mEvaluation[j];
					String str = mName[j];
					mEvaluation[j] = mEvaluation[j2];
					mName[j] = mName[j2];
					mEvaluation[j2] = num;
					mName[j2] = str;
				}
			}
		}
		System.out.println("=======");
		System.out.println("=======");
		for (int j = 0; j < aaa.length; j++) {
			System.out.printf("!!영화!! : " + mName[j]);
			System.out.println();
			System.out.printf("!!평점!! : %.2f", mEvaluation[j]);
			System.out.println();
		}

		// 아이디마다 평점남긴 갯수 백분율로 만들기
		int[] per = new int[arr.length];
		for (int j = 0; j < arr.length; j++) {
			per[j] = (int) (mEvaluation[j] * 100 / 5);
		}

		int sum = 0;
		int laY = 0;
		int count4 = 0;
		JLabel[] la = new JLabel[arr.length];
		JLabel[] la2 = new JLabel[arr.length];
		// 순위, 영화이름, 평점
		for (int j = 0; j < 10; j++) {
			la[j] = new JLabel(mName[j]);
			la2[j] = new JLabel("( " + Double.toString(mEvaluation[j]) + "점 )");
			la[j].setBounds(80, 150 + laY, 150, 30);
			la2[j].setBounds(100, 170 + laY, 150, 30);
			la[j].setFont(new Font("맑은 고딕", Font.BOLD, 20));
			la2[j].setFont(new Font("맑은 고딕", Font.BOLD, 20));
			la[j].setForeground(new Color(249, 134, 137));
			la2[j].setForeground(new Color(255, 250, 205));
			laY += 75;
			p1.add(la[j]);
			p1.add(la2[j]);
		}

		// 그래프
		int laY2 = 0;
		int laY3 = 0;
		double count6 = 0;
		JLabel[] la3 = new JLabel[arr.length];
		JLabel[] la4 = new JLabel[300];
		JLabel[] la5 = new JLabel[arr.length];
		for (int j = 0; j < 10; j++) {
			la3[j] = new JLabel();
			la3[j].setBounds(220, 250 + laY2, 300, 10);
			p1.add(la3[j]);
			for (int j2 = 0; j2 < per[j]; j2++) {
				la4[j] = new JLabel();
				la4[j].setBounds(220 + laY3, 160 + laY2, 6, 20);
				la4[j].setIcon(img.percent);
				p1.add(la4[j]);
				laY3 += 6;
				if (j2 == (int) per[j] - 1) {
					la5[j] = new JLabel();
					la5[j].setText(String.valueOf(per[j] + "%"));
					la5[j].setForeground(new Color(255, 250, 205));
					la5[j].setFont(new Font("맑은 고딕", Font.PLAIN, 23));
					la5[j].setBounds(220 + laY3 + 10, 160 + laY2, 50, 20);
					p1.add(la5[j]);

				}
			}
			laY3 = 0;
			laY2 += 75;
		}

		JLabel[] la6 = new JLabel[arr.length];
		int laY4 = 0;
		for (int j = 0; j < 10; j++) {
			la6[j] = new JLabel(j + 1 + "위");
			la6[j].setBounds(30, 155 + laY4, 50, 20);
			la6[j].setForeground(new Color(255, 250, 205));
			la6[j].setFont(new Font("맑은 고딕", Font.BOLD, 23));
			p1.add(la6[j]);
			laY4 += 75;
		}

		JLabel la7 = new JLabel("영화평점랭킹");
		la7.setBounds(270, 10, 500, 70);
		la7.setForeground(new Color(255, 250, 205));
		la7.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		p1.add(la7);

		Alignment1Btn = new JButton();
		Alignment1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReviewRankingPage next = new ReviewRankingPage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		Alignment1Btn.setBounds(10, 100, 290, 30);
		p1.add(Alignment1Btn);
		Alignment1Btn.setIcon(img.reviewRankingBtn);
		Alignment1Btn.setRolloverIcon(img.reviewRankingBtn1);
		Alignment1Btn.setPressedIcon(img.reviewRankingBtn2);

		Alignment2Btn = new JButton();
		Alignment2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "현재 보고있는 페이지 입니다.");
			}
		});
		Alignment2Btn.setBounds(310, 100, 290, 30);
		p1.add(Alignment2Btn);
		Alignment2Btn.setIcon(img.movieEvaluationRanking);
		Alignment2Btn.setRolloverIcon(img.movieEvaluationRanking1);
		Alignment2Btn.setPressedIcon(img.movieEvaluationRanking2);

		Alignment3Btn = new JButton();
		Alignment3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MovieRanking next = new MovieRanking();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		Alignment3Btn.setBounds(610, 100, 280, 30);
		p1.add(Alignment3Btn);
		Alignment3Btn.setIcon(img.movieWatchBtn);
		Alignment3Btn.setRolloverIcon(img.movieWatchBtn1);
		Alignment3Btn.setPressedIcon(img.movieWatchBtn2);

		JButton backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?" + "", "뒤로가기",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MainMenuPage back = new MainMenuPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);
				} else {
					// If you selected No.
				}

			}
		});
		backwardBtn.setBounds(10, 10, 200, 45);
		p1.add(backwardBtn);
		backwardBtn.setIcon(img.backwardBtn);
		backwardBtn.setRolloverIcon(img.backwardBtn1);
		backwardBtn.setPressedIcon(img.backwardBtn2);

		JButton exitBtn = new JButton();
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", "Exit", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					System.exit(0);

				} else {
					// If you selected No.
				}
			}
		});
		exitBtn.setBounds(690, 10, 200, 45);
		p1.add(exitBtn);
		exitBtn.setIcon(img.exit2Btn);
		exitBtn.setRolloverIcon(img.exit2Btn1);
		exitBtn.setPressedIcon(img.exit2Btn2);

	}

}
