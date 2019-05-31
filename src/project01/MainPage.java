package project01;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;

public class MainPage extends JPanel {
	private static JTextField inputIdField;
	static userDAO dao;
	static userDTO dto;
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	static String id;

	public MainPage() {
		CollectingImage img = new CollectingImage();

		setBounds(0, 0, 900,1000); // frame size
		setLayout(null); // absolute layout

		// panel 1
		JPanel p1 = new JPanel();
		p1.setBackground(new Color(18, 18, 18));
		p1.setBounds(0, 0, 900,1000);
		add(p1);
		p1.setLayout(null);
		// panel 2
		JPanel p2 = new JPanel();
		p2.setBounds(0, 0, 900,1000);
		p2.setLayout(null);
		add(p2);
		p2.setVisible(false);

		JLabel l3 = new JLabel();
		l3.setBounds(412, 570, 476, 196);
		p1.add(l3);
		l3.setIcon(img.flower3);

		JLabel l2 = new JLabel();
		l2.setBounds(12, 395, 371, 204);
		p1.add(l2);
		l2.setIcon(img.flower4);

		JLabel l1 = new JLabel();
		l1.setBounds(376, 177, 512, 219);
		p1.add(l1);
		l1.setIcon(img.flower1);

		// exit button
		JButton exitBtn = new JButton();
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
				try {
					rs.close();
					ps.close();
					con.close();
				} catch (Exception e2) {
				}

			}
		});
		exitBtn.setBounds(682, 893, 206, 70);
		p1.add(exitBtn);
		exitBtn.setIcon(img.loginPageExitBtn);
		exitBtn.setRolloverIcon(img.loginPageExitBtn1);
		exitBtn.setPressedIcon(img.loginPageExitBtn2);

		// ID Input Box
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lblNewLabel.setBounds(40, 786, 46, 48);
		p1.add(lblNewLabel);
		inputIdField = new JTextField();
		inputIdField.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		inputIdField.setBounds(254, 801, 416, 36);
		
		p1.add(inputIdField);
		inputIdField.setColumns(10);

		// Password Input Box
		JLabel lblNewLabel_1 = new JLabel("PASSWORD");
		lblNewLabel_1.setForeground(new Color(255, 250, 205));
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 30));
		lblNewLabel_1.setBounds(40, 844, 180, 36);
		p1.add(lblNewLabel_1);
		JPasswordField inputPwField = new JPasswordField();
		inputPwField.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		inputPwField.setColumns(10);
		inputPwField.setBounds(254, 844, 416, 36);
		p1.add(inputPwField);

		// login button
		JButton loginBtn = new JButton();
		loginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				char[] pwValues = inputPwField.getPassword();
				String pwString = String.valueOf(pwValues);

				dao = new userDAO();
				dto = dao.select(inputIdField.getText());

				if (dto == null) {
					JOptionPane.showMessageDialog(null, "아이디, 비밀번호를 다시 확인 해주세요.");
				} else if (dto.getPw().equals(pwString)) {
					id = inputIdField.getText();
					JOptionPane.showMessageDialog(null, "         로그인 성공 !!");
					MainMenuPage mainMenuPage = new MainMenuPage();
					p2.add(mainMenuPage);
					p2.setVisible(true);
					p1.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "아이디, 비밀번호를 다시 확인 해주세요.");
				}
			}
		});

		loginBtn.setBounds(682, 801, 206, 82); // login button size
		p1.add(loginBtn);
		loginBtn.setIcon(img.loginBtn);
		loginBtn.setRolloverIcon(img.loginBtn2);
		loginBtn.setPressedIcon(img.loginBtn3);
		
		// join membership button
		JButton joinBtn = new JButton();
		joinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JoinMembershipPage joinMembershipPage = new JoinMembershipPage();
				p2.add(joinMembershipPage);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		joinBtn.setBounds(12, 893, 230, 70);
		p1.add(joinBtn);
		joinBtn.setIcon(img.JoinMembershipBtn);
		joinBtn.setRolloverIcon(img.JoinMembershipBtn1);
		joinBtn.setPressedIcon(img.JoinMembershipBtn2);

		// forgot id / pw button
		JButton forgotIdPwBtn = new JButton();
		forgotIdPwBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgotIdPwPage next = new ForgotIdPwPage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
				
			}
		});
		forgotIdPwBtn.setBounds(254, 893, 417, 70);
		p1.add(forgotIdPwBtn);
		forgotIdPwBtn.setBackground(new Color(18,18,18));
		forgotIdPwBtn.setIcon(img.forgotIdPwBtn);
		forgotIdPwBtn.setRolloverIcon(img.forgotIdPwBtn1);
		forgotIdPwBtn.setPressedIcon(img.forgotIdPwBtn2);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome to MovieWorld !!");
		lblNewLabel_2.setForeground(new Color(255, 250, 205));
		lblNewLabel_2.setFont(new Font("Consolas", Font.BOLD, 60));
		lblNewLabel_2.setBounds(40, 10, 848, 158);
		p1.add(lblNewLabel_2);

		setVisible(true);

	}

	public static String getId() {
		return id;

	}
}
