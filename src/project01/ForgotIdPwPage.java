package project01;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ForgotIdPwPage extends JPanel {
	userDAO dao;
	userDTO dto;
	private JTextField inputNameField;
	private JTextField inputPwHintField;
	String[] question = { "질문을 선택해주세요.", "당신의 고향은?", "나의 1순위 보물은?",
			"당신의 장래희망은?", "가장 기억에 남는 영화 제목은?" };
	JComboBox combo;
	JComboBox combo2;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField inputIdField2;
	private JTextField inputNameField2;
	private JTextField inputPwHintField2;
	private JTextField textField_2;

	public ForgotIdPwPage() {

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
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		JLabel titleLabel = new JLabel("아이디 / 비밀번호 찾기");
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		titleLabel.setBounds(122, 10, 654, 150);
		p1.add(titleLabel);

		JLabel findIdLabel = new JLabel("아이디 찾기");
		findIdLabel.setBounds(122, 170, 130, 34);
		findIdLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		findIdLabel.setForeground(new Color(255, 250, 205));
		p1.add(findIdLabel);

		// Find Id Field
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 250, 205));
		lblNewLabel.setBounds(140, 231, 130, 20);
		p1.add(lblNewLabel);

		inputNameField = new JTextField();
		inputNameField.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputNameField.setBounds(320, 225, 430, 35);
		p1.add(inputNameField);
		inputNameField.setColumns(10);

		JLabel lblHint = new JLabel("비밀번호 힌트");
		lblHint.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblHint.setForeground(new Color(255, 250, 205));
		lblHint.setBounds(140, 291, 130, 20);
		p1.add(lblHint);

		combo = new JComboBox<String>(question);
		combo.setBackground(new Color(255, 255, 255));
		combo.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		combo.setBounds(320, 285, 430, 35);
		p1.add(combo);

		JLabel lblPwhintanwer = new JLabel("비밀번호 힌트 답");
		lblPwhintanwer.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblPwhintanwer.setForeground(new Color(255, 250, 205));
		lblPwhintanwer.setBounds(140, 350, 160, 20);
		p1.add(lblPwhintanwer);

		textField_2 = new JTextField();
		textField_2.setBounds(320, 345, 430, 35);
		textField_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(textField_2);
		textField_2.setColumns(10);

		JButton findIdBtn = new JButton();
		findIdBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.selectIdFind(inputNameField.getText(), combo.getSelectedIndex(), textField_2.getText());

				if (dto == null) {
					JOptionPane.showMessageDialog(null, "입력 정보를 다시 확인해주세요.");
				} else if (dto.getName().equals(inputNameField.getText())) {
					JOptionPane.showMessageDialog(null, "찾으시는 아이디는 \"" + dto.getId() + "\"입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "입력 정보를 다시 확인해주세요.");
				}
			}
		});
		findIdBtn.setBounds(140, 405, 610, 35);
		p1.add(findIdBtn);
		findIdBtn.setIcon(img.findIdBtn);
		findIdBtn.setRolloverIcon(img.findIdBtn1);
		findIdBtn.setPressedIcon(img.findIdBtn2);

		// Find Pw Field
		JLabel findPwLabel = new JLabel("비밀번호 찾기");
		findPwLabel.setBounds(122, 500, 150, 35);
		findPwLabel.setFont(new Font("맑은 고딕", Font.BOLD, 23));
		findPwLabel.setForeground(new Color(255, 250, 205));
		p1.add(findPwLabel);
		
		
		
		
		JLabel lblId = new JLabel("아이디");
		lblId.setForeground(new Color(255, 250, 205));
		lblId.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		lblId.setBounds(140, 550, 130, 35);
		p1.add(lblId);
		
		inputIdField2 = new JTextField();
		inputIdField2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputIdField2.setColumns(10);
		inputIdField2.setBounds(320, 544, 430, 35);
		p1.add(inputIdField2);
		p1.setVisible(true);

		JLabel label = new JLabel("이름");
		label.setForeground(new Color(255, 250, 205));
		label.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label.setBounds(140, 610, 130, 35);
		p1.add(label);
		
		inputNameField2 = new JTextField();
		inputNameField2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputNameField2.setColumns(10);
		inputNameField2.setBounds(320, 604, 430, 35);
		p1.add(inputNameField2);

		JLabel label_1 = new JLabel("비밀번호 힌트");
		label_1.setForeground(new Color(255, 250, 205));
		label_1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label_1.setBounds(140, 670, 130, 35);
		p1.add(label_1);
		
		
		combo2 = new JComboBox<String>(question);
		combo2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		combo2.setBackground(new Color(255, 255, 255));
		combo2.setBounds(320, 664, 430, 35);
		p1.add(combo2);

		JLabel label_2 = new JLabel("비밀번호 힌트 답");
		label_2.setForeground(new Color(255, 250, 205));
		label_2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		label_2.setBounds(140, 730, 160, 35);
		p1.add(label_2);
		
		inputPwHintField2 = new JTextField();
		inputPwHintField2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		inputPwHintField2.setColumns(10);
		inputPwHintField2.setBounds(320, 724, 430, 35);
		p1.add(inputPwHintField2);

		JButton findPwBtn = new JButton();
		findPwBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dao = new userDAO();
				dto = dao.selectPwFind(inputIdField2.getText(), inputNameField2.getText(), combo2.getSelectedIndex(),
						inputPwHintField2.getText());

				if (dto == null) {
					JOptionPane.showMessageDialog(null, "입력 정보를 다시 확인해주세요.");
				} else if (dto.getId().equals(inputIdField2.getText())) {
					JOptionPane.showMessageDialog(null, "찾으시는 비밀번호는  \"" + dto.getPw() + "\"입니다.");
				} else {
					JOptionPane.showMessageDialog(null, "입력 정보를 다시 확인해주세요.");
				}

			}
		});
		findPwBtn.setBounds(140, 784, 610, 35);
		p1.add(findPwBtn);
		findPwBtn.setIcon(img.findPwBtn);
		findPwBtn.setRolloverIcon(img.findPwBtn1);
		findPwBtn.setPressedIcon(img.findPwBtn2);

		JButton backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?", "뒤로가기",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MainPage back = new MainPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);

				} else {
					// If you selected No.
				}

			}
		});
		backwardBtn.setBounds(140, 904, 610, 35);
		p1.add(backwardBtn);
		backwardBtn.setIcon(img.idPwPageBackwardBtn);
		backwardBtn.setRolloverIcon(img.idPwPageBackwardBtn1);
		backwardBtn.setPressedIcon(img.idPwPageBackwardBtn2);

		p1.setVisible(true);

	}
}
