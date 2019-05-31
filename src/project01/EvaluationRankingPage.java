package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class EvaluationRankingPage extends JPanel {

	JButton Alignment1Btn, Alignment2Btn, Alignment3Btn;
	
	public EvaluationRankingPage() {
		CollectingImage img = new CollectingImage();
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
		
		
		JLabel la7 = new JLabel("평가순위");
		la7.setBounds(330, 10, 500, 70);
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
				MovieEvaluationRanking next = new MovieEvaluationRanking();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
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
				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?" + 
						"", "뒤로가기", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MainMenuPage back = new MainMenuPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);
				}
				else {
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
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					System.exit(0);
					
				}
				else {
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
