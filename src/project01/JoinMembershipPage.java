package project01;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;

public class JoinMembershipPage extends JPanel {

	String[] question = { "질문을 선택해주세요.", "당신의 고향은?", "나의 1순위 보물은?",
			"당신의 장래희망은?", "가장 기억에 남는 영화 제목은?" };
	JComboBox combo;
	userDTO dto;
	userDTO dto1;
	userDTO dto2;
	userDTO dto3;

	userDAO dao;
	userDAO dao1;
	userDAO dao2;
	userDAO dao3;
	static int idVal, nicnameVal, emailVal;
	static char[] chs1;
	static String str1;
	static char[] chs2;
	static String str2;
	public JoinMembershipPage() {
		CollectingImage img = new CollectingImage();

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);

		// panel 1
		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		p1.setVisible(true);
		p1.setLayout(null);
		add(p1);

		// panel 2
		JPanel p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		JLabel title = new JLabel("회원가입");
		title.setForeground(new Color(255, 250, 205));
		title.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		title.setBounds(285, 10, 245, 150);
		p1.add(title);

		// ID input
		JLabel lblNewLabel_1 = new JLabel("아이디");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 250, 205));
		p1.add(lblNewLabel_1);
		lblNewLabel_1.setBounds(85, 200, 145, 36);
		JTextField inputIdField = new JTextField();
		inputIdField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputIdField.setBounds(267, 200, 358, 36);
		p1.add(inputIdField);
		inputIdField.setColumns(10);

		// ID Duplicate check
		JButton idDuplicateBtn = new JButton();
		idDuplicateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.select(inputIdField.getText());
				if (dto == null) {
					JOptionPane.showMessageDialog(null, "사용 가능 한 아이디 입니다.");
					idVal = 1;
				} else {
					JOptionPane.showMessageDialog(null, "이미 등록 된 아이디 입니다.");
					idVal = 0;
				}

			}
		});
		idDuplicateBtn.setBounds(637, 201, 170, 36);
		p1.add(idDuplicateBtn);
		idDuplicateBtn.setIcon(img.duplicateBtn);
		idDuplicateBtn.setRolloverIcon(img.duplicateBtn1);
		idDuplicateBtn.setPressedIcon(img.duplicateBtn2);

		// PW input
		JLabel lblPassword = new JLabel("비밀번호");
		lblPassword.setForeground(new Color(255, 250, 205));
		lblPassword.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblPassword.setBounds(85, 251, 145, 36);
		p1.add(lblPassword);
		JPasswordField inputPwField = new JPasswordField();
		inputPwField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputPwField.setColumns(10);
		inputPwField.setBounds(267, 250, 358, 36);
		p1.add(inputPwField);

		// Confirm Password
		JLabel confirmPassword = new JLabel("비밀번호 확인");
		confirmPassword.setForeground(new Color(255, 250, 205));
		confirmPassword.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		confirmPassword.setBounds(85, 298, 170, 36);
		p1.add(confirmPassword);
		JPasswordField inputConfirmPwField = new JPasswordField();
		inputConfirmPwField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputConfirmPwField.setColumns(10);
		inputConfirmPwField.setBounds(267, 296, 358, 36);
		p1.add(inputConfirmPwField);
		
		JLabel l = new JLabel();
		p1.add(l);
		l.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		l.setBounds(637, 298, 145, 36);
		
		inputConfirmPwField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            	chs1 = inputPwField.getText().toCharArray();
            	chs2 = inputConfirmPwField.getText().toCharArray();
            	str1 = new String(chs1);
            	str2 = new String(chs2);
            	if(str1.equals(str2)) {
            		l.setText("사용가능");
            		l.setForeground(new Color(0, 204, 102));
            		l.setFont(new Font("맑은 고딕", Font.BOLD, 20));
            	}else {
            		l.setText("사용불가");
            		l.setForeground(new Color(255, 0, 0));
            		l.setFont(new Font("맑은 고딕", Font.BOLD, 20));
            	}
            }
            public void keyPressed(KeyEvent e) {
            }
        });



		// NAME input
		JLabel lblName = new JLabel("이름");
		lblName.setForeground(new Color(255, 250, 205));
		lblName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblName.setBounds(85, 342, 145, 36);
		p1.add(lblName);
		JTextField inputNameField = new JTextField();
		inputNameField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputNameField.setColumns(10);
		inputNameField.setBounds(267, 342, 358, 36);
		p1.add(inputNameField);

		// NICNAME input
		JLabel lblNicName = new JLabel("닉네임");
		lblNicName.setForeground(new Color(255, 250, 205));
		lblNicName.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNicName.setBounds(85, 388, 145, 36);
		p1.add(lblNicName);
		JTextField inputNicNameField = new JTextField();
		inputNicNameField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputNicNameField.setColumns(10);
		inputNicNameField.setBounds(267, 388, 358, 36);
		p1.add(inputNicNameField);

		// Nicname Duplicate check
		JButton NicnameDuplicateBtn = new JButton();
		NicnameDuplicateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.selectNicName(inputNicNameField.getText());
				if (dto == null) {
					JOptionPane.showMessageDialog(null, "사용 가능 한 닉네임 입니다.");
					nicnameVal = 1;
				} else {
					JOptionPane.showMessageDialog(null, "이미 등록 된 닉네임 입니다.");
					nicnameVal = 0;
				}

			}
		});
		NicnameDuplicateBtn.setBounds(637, 389, 170, 36);
		p1.add(NicnameDuplicateBtn);
		NicnameDuplicateBtn.setIcon(img.duplicateBtn);
		NicnameDuplicateBtn.setRolloverIcon(img.duplicateBtn1);
		NicnameDuplicateBtn.setPressedIcon(img.duplicateBtn2);

		// E-MAIL input
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setForeground(new Color(255, 250, 205));
		lblEmail.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblEmail.setBounds(85, 434, 145, 36);
		p1.add(lblEmail);
		JTextField inputEMailField = new JTextField();
		inputEMailField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputEMailField.setColumns(10);
		inputEMailField.setBounds(267, 434, 358, 36);
		p1.add(inputEMailField);

		JButton emailDuplicateBtn = new JButton();
		emailDuplicateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.selectEmail(inputEMailField.getText());
				if (dto == null) {
					JOptionPane.showMessageDialog(null, "사용 가능 한 이메일입니다.");
					emailVal = 1;
				} else {
					JOptionPane.showMessageDialog(null, "이미 등록된 이메일 입니다.");
					emailVal = 0;
				}

			}
		});
		emailDuplicateBtn.setBounds(637, 435, 170, 36);
		p1.add(emailDuplicateBtn);
		emailDuplicateBtn.setIcon(img.duplicateBtn);
		emailDuplicateBtn.setRolloverIcon(img.duplicateBtn1);
		emailDuplicateBtn.setPressedIcon(img.duplicateBtn2);

		// Password Hint
		JLabel lblPasswordHint = new JLabel("비밀번호 힌트");
		lblPasswordHint.setForeground(new Color(255, 250, 205));
		lblPasswordHint.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblPasswordHint.setBounds(85, 480, 145, 36);
		p1.add(lblPasswordHint);
		combo = new JComboBox<String>(question); // combo@@@@@@@@@@@@@@@@@@@
		combo.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		combo.setBackground(new Color(255, 255, 255));
		combo.setBounds(267, 480, 358, 36);
		p1.add(combo);

		// Answer of password hint
		JLabel pwHintAnswer = new JLabel();
		pwHintAnswer.setForeground(new Color(255, 250, 205));
		pwHintAnswer.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		pwHintAnswer.setBounds(85, 526, 155, 36);
		p1.add(pwHintAnswer);
		pwHintAnswer.setText("비밀번호 힌트 답");
		JTextField inputPwHintField = new JTextField();
		inputPwHintField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputPwHintField.setColumns(10);
		inputPwHintField.setBounds(267, 524, 358, 38);
		p1.add(inputPwHintField);

		// completion Button
		JButton completionBtn = new JButton();
		completionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "회원가입을 완료 하시겠습니까?",
						"완료", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					dao = new userDAO();
					dto = new userDTO();
					dao1 = new userDAO();
					dao2 = new userDAO();
					dao3 = new userDAO();
					
					dto1 = dao1.select(inputIdField.getText());
					dto2 = dao2.selectNicName(inputNicNameField.getText());
					dto3 = dao3.selectEmail(inputEMailField.getText());
					
					if (dto1 == null && dto2 == null && dto3 == null) {
						if(idVal == 1 && nicnameVal == 1 && emailVal == 1) {
							if (inputConfirmPwField.getText().equals(inputPwField.getText())) {
								dto.setId(inputIdField.getText());
								dto.setPw(inputConfirmPwField.getText());
								dto.setName(inputNameField.getText());
								dto.setNicname(inputNicNameField.getText());
								dto.setEmail(inputEMailField.getText());
								dto.setHint(combo.getSelectedIndex());
								dto.setPwhint(inputPwHintField.getText());
								dto.setGrade(0);
								
								dao.insert(dto);
								JOptionPane.showMessageDialog(null, "회원가입이 완료 되었습니다.");
								MainPage next = new MainPage();
								p2.add(next);
								p2.setVisible(true);
								p1.setVisible(false);
							} else {
								JOptionPane.showMessageDialog(null, "입력 정보를 다시 확인 해주세요.");
							}
							
						}else {
							JOptionPane.showMessageDialog(null, "중복 확인을 다시 진행해주세요.");
						}

					} else {
						JOptionPane.showMessageDialog(null, "중복 확인을 다시 진행해주세요.");
					}

				}
			}
		});
		completionBtn.setBounds(85, 620, 355, 60);
		p1.add(completionBtn);
		completionBtn.setIcon(img.completionBtn);
		completionBtn.setRolloverIcon(img.completionBtn1);
		completionBtn.setPressedIcon(img.completionBtn2);

		// Cancel Button
		JButton cancelBtn = new JButton();
		cancelBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "회원가입을 취소하시겠습니까?", "취소",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MainPage next = new MainPage();
					p2.add(next);
					p2.setVisible(true);
					p1.setVisible(false);

				} else {
					// If you selected No.
				}
			}
		});
		cancelBtn.setBounds(455, 620, 355, 60);
		p1.add(cancelBtn);
		cancelBtn.setIcon(img.cancelBtn);
		cancelBtn.setRolloverIcon(img.cancelBtn1);
		cancelBtn.setPressedIcon(img.cancelBtn2);

		setVisible(true);
	}
}
