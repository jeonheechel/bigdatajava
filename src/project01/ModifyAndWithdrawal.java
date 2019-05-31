package project01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class ModifyAndWithdrawal extends JPanel {
	MainPage m = new MainPage();
	userDAO dao;
	userDAO dao1;
	userDAO dao2;
	userDAO dao3;
	userDTO dto;
	userDTO dto2;
	userDTO dto3;
	private JTextField idTextField;
	private JPasswordField CurrentPwinputField;
	private JPasswordField passwordToChangePwField;
	private JPasswordField confirmPasswordToChangeField;
	private JTextField nameTextField;
	private JTextField emailTextField;
	private JTextField nicNameTextField;
	private JTextField answerOfPasswordHintTextField;
	JComboBox combo;
	String[] question = { "질문을 선택해주세요.", "당신의 고향은?", "나의 1순위 보물은?",
			"당신의 장래희망은?", "가장 기억에 남는 영화 제목은?" };
	static int nicNameVal;
	static int emailVal;
	static char[] chs1;
	static String str1;
	static char[] chs2;
	static String str2;

	public ModifyAndWithdrawal() {

		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);

		JPanel p1 = new JPanel();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);
		JPanel p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		p2.setBackground(new Color(18, 18, 18));
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		
		JLabel titleLabel = new JLabel("회원정보 수정 및 탈퇴");
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		titleLabel.setBounds(150, 10, 700, 150);
		p1.add(titleLabel);

		// ID Field
		JLabel idLabel = new JLabel("아이디");
		idLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		idLabel.setForeground(new Color(255, 250, 205));
		idLabel.setBounds(85, 200, 145, 36);
		p1.add(idLabel);

		idTextField = new JTextField();
		idTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		idTextField.setBounds(267, 200, 358, 36);
		p1.add(idTextField);
		idTextField.setEditable(false);
		idTextField.setText(m.getId());
		idTextField.setColumns(10);

		// PW Field
		JLabel currentPwLabel = new JLabel("현재 비밀번호");
		currentPwLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		currentPwLabel.setForeground(new Color(255, 250, 205));
		currentPwLabel.setBounds(85, 255, 213, 20);
		p1.add(currentPwLabel);

		// Current pw input field
		CurrentPwinputField = new JPasswordField();
		CurrentPwinputField.setFont(new Font("Consolas", Font.BOLD, 20));
		CurrentPwinputField.setBounds(267, 250, 358, 36);
		p1.add(CurrentPwinputField);
		CurrentPwinputField.setColumns(10);

		// Pw to Change Field
		JLabel passwordToChangeLabel = new JLabel("변경할 비밀번호");
		passwordToChangeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		passwordToChangeLabel.setForeground(new Color(255, 250, 205));
		passwordToChangeLabel.setBounds(85, 300, 358, 36);
		p1.add(passwordToChangeLabel);

		passwordToChangePwField = new JPasswordField();
		passwordToChangePwField.setFont(new Font("맑은 고딕", Font.BOLD, 26));
		passwordToChangePwField.setColumns(10);
		passwordToChangePwField.setBounds(267, 300, 358, 36);
		p1.add(passwordToChangePwField);

		// Confirm Pw To Change Field
		JLabel confirmPasswordToChangeLabel = new JLabel("변경할 비밀번호 확인");
		confirmPasswordToChangeLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		confirmPasswordToChangeLabel.setForeground(new Color(255, 250, 205));
		confirmPasswordToChangeLabel.setBounds(85, 355, 213, 20);
		p1.add(confirmPasswordToChangeLabel);

		confirmPasswordToChangeField = new JPasswordField();
		confirmPasswordToChangeField.setFont(new Font("맑은 고딕", Font.BOLD, 26));
		confirmPasswordToChangeField.setColumns(10);
		confirmPasswordToChangeField.setBounds(267, 350, 358, 36);
		p1.add(confirmPasswordToChangeField);
		
		JLabel lala = new JLabel();
		p1.add(lala);
		
		lala.setBounds(635, 350, 145, 36);
		
		confirmPasswordToChangeField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
            }
            public void keyReleased(KeyEvent e) {
            	chs1 = passwordToChangePwField.getText().toCharArray();
            	chs2 = confirmPasswordToChangeField.getText().toCharArray();
            	str1 = new String(chs1);
            	str2 = new String(chs2);
            	if(str1.equals(str2)) {
            		lala.setText("사용가능");
            		lala.setForeground(new Color(0, 204, 102));
            		lala.setFont(new Font("맑은 고딕", Font.BOLD, 20));
            	}else {
            		lala.setText("사용불가");
            		lala.setForeground(new Color(255, 0, 0));
            		lala.setFont(new Font("맑은 고딕", Font.BOLD, 20));
            	}
            }
            public void keyPressed(KeyEvent e) {
            }
        });
		
		

		// Name Field
		JLabel nameLabel = new JLabel("이름");
		nameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		nameLabel.setForeground(new Color(255, 250, 205));
		nameLabel.setBounds(85, 405, 213, 20);
		p1.add(nameLabel);

		nameTextField = new JTextField();
		nameTextField.setText(dto.getName());
		nameTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		nameTextField.setEditable(false);
		nameTextField.setColumns(10);
		nameTextField.setBounds(267, 400, 358, 36);
		p1.add(nameTextField);

		// NicName Field
		JLabel nicNameLabel = new JLabel("닉네임");
		nicNameLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		nicNameLabel.setForeground(new Color(255, 250, 205));
		nicNameLabel.setBounds(85, 455, 213, 20);
		p1.add(nicNameLabel);

		nicNameTextField = new JTextField();
		nicNameTextField.setText(dto.getNicname());
		nicNameTextField.setBounds(267, 450, 358, 36);
		nicNameTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		nicNameTextField.setColumns(10);
		p1.add(nicNameTextField);

		JButton nicNameDuplicateBtn = new JButton();
		
		nicNameDuplicateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.selectNicName(nicNameTextField.getText());
				dao2 = new userDAO();
				dto2 = dao2.select(m.getId());
				
				// dto == null : db에 정보가 없다.
				// dto != null : db에 정보가 있다.
				
				if (dto == null || nicNameTextField.getText().equals(dto2.getNicname())) {
					JOptionPane.showMessageDialog(null, "사용 가능한 닉네임 입니다.");
					emailVal = 1;
				} else if(dto != null || !nicNameTextField.getText().equals(dto2.getNicname())) {
					JOptionPane.showMessageDialog(null, "이미 등록 된 닉네임 입니다.");
					emailVal = 0;
				}
				System.out.println("dto2.getEmail() : " + dto2.getEmail());
				System.out.println("nicNameTextField.getText() : " + nicNameTextField.getText());

			}
		});
		nicNameDuplicateBtn.setBounds(635, 450, 170, 36);
		p1.add(nicNameDuplicateBtn);
		nicNameDuplicateBtn.setIcon(img.duplicateBtn);
		nicNameDuplicateBtn.setRolloverIcon(img.duplicateBtn1);
		nicNameDuplicateBtn.setPressedIcon(img.duplicateBtn2);
		
		
		

		// Email Field
		JLabel emailLabel = new JLabel("이메일");
		emailLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		emailLabel.setForeground(new Color(255, 250, 205));
		emailLabel.setBounds(85, 505, 130, 20);
		p1.add(emailLabel);

		emailTextField = new JTextField();
		emailTextField.setText(dto.getEmail());
		emailTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		emailTextField.setColumns(10);
		emailTextField.setBounds(267, 500, 358, 36);
		p1.add(emailTextField);

		JButton emailDuplicateBtn = new JButton();
		emailDuplicateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.selectEmail(emailTextField.getText());
				dao2 = new userDAO();
				dto2 = dao2.select(m.getId());
				if (dto == null || emailTextField.getText().equals(dto2.getEmail())) {
					JOptionPane.showMessageDialog(null, "사용 가능한 이메일 입니다.");
					nicNameVal = 1;
				} else if(dto != null || !emailTextField.getText().equals(dto2.getEmail())) {
					JOptionPane.showMessageDialog(null, "이미 등록 된 이메일 입니다.");
					nicNameVal = 0;
				}

			}
		});
		
		emailDuplicateBtn.setBounds(635, 500, 170, 36);
		p1.add(emailDuplicateBtn);
		emailDuplicateBtn.setIcon(img.duplicateBtn);
		emailDuplicateBtn.setRolloverIcon(img.duplicateBtn1);
		emailDuplicateBtn.setPressedIcon(img.duplicateBtn2);

		// Pw Hint Field
		JLabel passwordHint = new JLabel("비밀번호 힌트");
		passwordHint.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		passwordHint.setForeground(new Color(255, 250, 205));
		passwordHint.setBounds(85, 555, 130, 20);
		p1.add(passwordHint);

		combo = new JComboBox<String>(question); // combo@@@@@@@@@@@@@@@@@@@
		combo.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		combo.setSelectedIndex(dto.getHint());
		combo.setBackground(new Color(255, 255, 255));
		combo.setBounds(267, 550, 358, 36);
		p1.add(combo);

		// Answer of pw hint Field
		JLabel answerOfPasswordHintLabel = new JLabel("비밀번호 힌트 답");
		answerOfPasswordHintLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		answerOfPasswordHintLabel.setForeground(new Color(255, 250, 205));
		answerOfPasswordHintLabel.setBounds(85, 605, 213, 20);
		p1.add(answerOfPasswordHintLabel);

		answerOfPasswordHintTextField = new JTextField();
		answerOfPasswordHintTextField.setText(dto.getPwhint());
		answerOfPasswordHintTextField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		answerOfPasswordHintTextField.setColumns(10);
		answerOfPasswordHintTextField.setBounds(267, 600, 358, 36);
		p1.add(answerOfPasswordHintTextField);

		// Completion Button
		JButton completionBtn = new JButton();
		completionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "회원 정보 수정을 완료 하시겠습니까?",
						"Completion", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					dao = new userDAO();
					dto = new userDTO();
 
					dao2 = new userDAO();
					dto2 = dao2.select(idTextField.getText());
					
					if(dto2.getPw().equals(CurrentPwinputField.getText())) {
						if (nicNameVal == 1 && emailVal == 1) {
							if (confirmPasswordToChangeField.getText().equals(passwordToChangePwField.getText())) {
								dto.setId(idTextField.getText());
								dto.setPw(confirmPasswordToChangeField.getText());
								dto.setName(nameTextField.getText());
								dto.setNicname(nicNameTextField.getText());
								dto.setEmail(emailTextField.getText());
								dto.setHint(combo.getSelectedIndex());
								dto.setPwhint(answerOfPasswordHintTextField.getText());
								dto.setGrade(0);
								
								dao.ModifyingInformation(dto);
								JOptionPane.showMessageDialog(null, "정보 수정 완료.");
								MyPage back = new MyPage();
								p2.add(back);
								p2.setVisible(true);
								p1.setVisible(false);
								
							} else {
								JOptionPane.showMessageDialog(null, "비밀번호를 다시 확인 해주세요.");
							}
							
						} else {
							JOptionPane.showMessageDialog(null, "중복확인을 다시 진행 해주세요.");
						}
						
					}else {
						JOptionPane.showMessageDialog(null, "비밀번호를 다시 확인 해주세요.");
					}


				}
			}
		});
		completionBtn.setBounds(85, 670, 355, 60);
		p1.add(completionBtn);
		completionBtn.setIcon(img.completion2Btn);
		completionBtn.setRolloverIcon(img.completion2Btn1);
		completionBtn.setPressedIcon(img.completion2Btn2);

		// Cancel Button
		JButton cancelBtn = new JButton();
		cancelBtn.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "회원 정보 수정을 취소 하시겠습니까?", "취소",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MyPage back = new MyPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);

				} else {
					// If you selected No.
				}
			}
		});
		cancelBtn.setBounds(455, 670, 355, 60);
		p1.add(cancelBtn);
		cancelBtn.setIcon(img.cancelBtn);
		cancelBtn.setRolloverIcon(img.cancelBtn1);
		cancelBtn.setPressedIcon(img.cancelBtn2);
		
		
		JButton withdrawalBtn = new JButton();
		withdrawalBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "회원 탈퇴를 하시겠습니까?", "회원탈퇴", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					dao = new userDAO();
					dto = new userDTO();
					dao.delete(m.getId());
					
					JOptionPane.showMessageDialog(null, "회원 탈퇴가 완료 되었습니다.");
					MainPage back = new MainPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);
					
				}
				else {
					// If you selected No.
				}
			}
		});
		withdrawalBtn.setBounds(690, 920, 177, 30);
		p1.add(withdrawalBtn);
		withdrawalBtn.setIcon(img.withdrawalBtn);
		withdrawalBtn.setRolloverIcon(img.withdrawalBtn1);
		withdrawalBtn.setPressedIcon(img.withdrawalBtn2);

	}
}
