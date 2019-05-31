package project01;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Rating extends JFrame {
	MainPage m = new MainPage();
	userDAO dao;
	userDTO dto;
	userDAO dao1;
	userDTO dto1;

	JButton[] b;
	private JTextField inputReviewField;
	static double ratingCount;
	String movieName;
	ArrayList list, name;
	MovieDAO daoM;
	MovieDTO dtoM;
	MovieDAO daoM1;
	MovieDTO dtoM1;

	public Rating() {

	}

	public Rating(String urlDataGet) {

		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());

		getContentPane().setLayout(null);
		setSize(500, 400);
		setLocationRelativeTo(null); // center frame
		setResizable(false); // Unable to change frame size
		getContentPane().setBackground(new Color(18, 18, 18));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("평가하기");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 10, 150, 35);
		getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(new Color(255, 250, 205));

		JLabel label1 = new JLabel("## 이 영화의 별점을 매겨주세요. (0.5 ~ 5)");
		label1.setBounds(45, 30, 400, 100);
		label1.setForeground(new Color(255, 250, 205));
		label1.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		getContentPane().add(label1);

		JLabel label2 = new JLabel("## 이 영화의 간단한 리뷰를 남겨주세요.");
		label2.setBounds(45, 145, 400, 100);
		label2.setForeground(new Color(255, 250, 205));
		label2.setFont(new Font("맑은 고딕", Font.BOLD, 13));
		getContentPane().add(label2);

		inputReviewField = new JTextField();
		inputReviewField.setBounds(45, 210, 400, 35);
		getContentPane().add(inputReviewField);
		inputReviewField.setColumns(10);

		JButton ratingPageCompletionBtn = new JButton();
		ratingPageCompletionBtn.setBounds(45, 326, 195, 35);
		getContentPane().add(ratingPageCompletionBtn);
		ratingPageCompletionBtn.setIcon(img.ratingPageCompletionBtn);
		ratingPageCompletionBtn.setRolloverIcon(img.ratingPageCompletionBtn1);
		ratingPageCompletionBtn.setPressedIcon(img.ratingPageCompletionBtn2);
		ratingPageCompletionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (ratingCount == 0.0 || inputReviewField.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "별점과 리뷰를 모두 남겨주세요!!");
				} else {

					movieName = getMovieName(urlDataGet);
					System.out.println(ratingCount);
					System.out.println(inputReviewField.getText());
					System.out.println(movieName);
					daoM = new MovieDAO();
					dtoM = new MovieDTO();
					dao1 = new userDAO();

					dtoM.setId(m.getId());
					dtoM.setEvaluationScore(ratingCount);
					dtoM.setMovieName(movieName);
					dtoM.setReview(inputReviewField.getText());
					daoM.insert(dtoM);

					dto1 = new userDTO();
					dto1.setId(m.getId());
					dto1.setGrade(dto.getGrade() + 1);
					dao1.gradeUpdate(dto1);

					JOptionPane.showMessageDialog(null, "소중한 평가 감사드립니다.");
					JOptionPane.showMessageDialog(null, "포인트 1점 획득!!");
					setVisible(false);

				}
			}
		});

		JButton ratingPageCancelBtn = new JButton();
		ratingPageCancelBtn.setBounds(250, 326, 195, 35);
		getContentPane().add(ratingPageCancelBtn);
		ratingPageCancelBtn.setIcon(img.ratingPageCancelBtn);
		ratingPageCancelBtn.setRolloverIcon(img.ratingPageCancelBtn1);
		ratingPageCancelBtn.setPressedIcon(img.ratingPageCancelBtn2);
		ratingPageCancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "평가하기를 종료 하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					setVisible(false);
				} else {
					// If you selected No.
				}
			}
		});

		b = new JButton[10];
		for (int i = 0; i < b.length; i++) {
			final int indexNum = i;
			b[i] = new JButton();
			b[i].setBounds(45 + (i * 40), 100, 40, 40);
			getContentPane().add(b[i]);
			b[i].setIcon(img.test1);
			b[i].setPressedIcon(img.test2);
			b[i].setBorderPainted(false);
			b[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					for (int j = 0; j < b.length; j++) {
						b[j].setIcon(img.test1);
					}
					for (int k = 0; k <= indexNum; k++) {
						b[k].setIcon(img.test2);
						b[k].setPressedIcon(img.test2);
					}
					ratingCount = 0.5;
					for (int j = 0; j < indexNum; j++) {
						ratingCount += 0.5;
					}
				}
			});
		}

		setVisible(true);
	}

	public String getMovieName(String urlDataGet) {

		String url = urlDataGet;

		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Elements element = doc.select("div.mv_info_area");

		list = new ArrayList();
		for (Element el : element.select("h3.h_movie a")) {
			list.add(el.text());
			movieName = (String) list.get(0);

		}
		return movieName;
	}
}
