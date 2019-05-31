package project01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

import java.awt.Font;

public class MainMenuPage extends JPanel {
	MainPage m = new MainPage();

	public MainMenuPage() {

		CollectingImage img = new CollectingImage();

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null); // absolute layout

		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		add(p1);
		p1.setLayout(null);

		JPanel p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		JLabel l2 = new JLabel();
		l2.setBounds(20, 150, 360, 170);
		p1.add(l2);
		l2.setIcon(img.flower5);

		JLabel l3 = new JLabel();
		l3.setBounds(485, 291, 400, 170);
		p1.add(l3);
		l3.setIcon(img.flower6);

		JLabel l1 = new JLabel();
		l1.setBounds(10, 445, 480, 244);
		p1.add(l1);
		l1.setIcon(img.flower2);

		JLabel l5 = new JLabel();
		l5.setBounds(373, 735, 512, 217);
		p1.add(l5);
		l5.setIcon(img.flower8);

		JButton CurrentlyOntheScreenBtn = new JButton();
		CurrentlyOntheScreenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CurrentlyOntheScreen_A next = new CurrentlyOntheScreen_A();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		CurrentlyOntheScreenBtn.setBounds(10, 10, 163, 130);
		p1.add(CurrentlyOntheScreenBtn);
		CurrentlyOntheScreenBtn.setIcon(img.CurrentlyOntheScreen);
		CurrentlyOntheScreenBtn.setRolloverIcon(img.CurrentlyOntheScreen1);
		CurrentlyOntheScreenBtn.setPressedIcon(img.CurrentlyOntheScreen2);

		JButton AFilmDueForReleaseBtn = new JButton();
		AFilmDueForReleaseBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AFilmDueForRelease_B next = new AFilmDueForRelease_B();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		AFilmDueForReleaseBtn.setBounds(188, 10, 163, 130);
		p1.add(AFilmDueForReleaseBtn);
		AFilmDueForReleaseBtn.setIcon(img.AFilmDueForRelease);
		AFilmDueForReleaseBtn.setRolloverIcon(img.AFilmDueForRelease1);
		AFilmDueForReleaseBtn.setPressedIcon(img.AFilmDueForRelease2);

		JButton movieRanking = new JButton();
		movieRanking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EvaluationRankingPage next = new EvaluationRankingPage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		movieRanking.setBounds(366, 10, 163, 130);
		p1.add(movieRanking);
		movieRanking.setIcon(img.movieRanking);
		movieRanking.setRolloverIcon(img.movieRanking1);
		movieRanking.setPressedIcon(img.movieRanking2);

		JButton myPageBtn = new JButton();
		myPageBtn.setBounds(544, 10, 163, 130);
		p1.add(myPageBtn);
		myPageBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MyPage next = new MyPage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		myPageBtn.setIcon(img.myPageBtn);
		myPageBtn.setRolloverIcon(img.myPageBtn1);
		myPageBtn.setPressedIcon(img.myPageBtn2);

		JButton exitBtn = new JButton();
		exitBtn.setBounds(722, 10, 163, 130);
		p1.add(exitBtn);
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", "종료",
						JOptionPane.YES_NO_OPTION);
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
		exitBtn.setIcon(img.mainMenuPageExitBtn);
		exitBtn.setRolloverIcon(img.mainMenuPageExitBtn1);
		exitBtn.setPressedIcon(img.mainMenuPageExitBtn2);
		
		setVisible(true);

	}
}