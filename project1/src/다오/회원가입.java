package 다오;

import javax.swing.JFrame;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.Font;

public class 회원가입 {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	String[] hint = {"0  Choose","My hometown is", "My first pet is", "My Treasure No. 1", "My parents' name is", "My first nickname is"};
	JComboBox combo;
	
	public 회원가입() {
		JFrame f = new JFrame();
		f.setTitle("회원가입창");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("아이디");
		label.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("중복확인");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel("비밀번호");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 45));
		textField_1.setColumns(10);
		f.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("비밀번호 확인");
		label_2.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("굴림", Font.PLAIN, 45));
		textField_2.setColumns(10);
		f.getContentPane().add(textField_2);
		
		JLabel label_3 = new JLabel("닉네임");
		label_3.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("굴림", Font.PLAIN, 45));
		textField_3.setColumns(10);
		f.getContentPane().add(textField_3);
		
		JButton button = new JButton("중복확인");
		button.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(button);
		
		JLabel label_4 = new JLabel("이메일");
		label_4.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_4);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("굴림", Font.PLAIN, 45));
		textField_4.setColumns(10);
		f.getContentPane().add(textField_4);
		
		JLabel label_5 = new JLabel("비밀번호 힌트고르기");
		label_5.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(label_5);
		
		
		combo = new JComboBox<String>(hint);
		combo.setFont(new Font("Consolas",Font.BOLD,30));
		combo.setBackground(new Color(255,255,255));
		combo.setBounds(235, 480, 235, 36);
		f.getContentPane().add(combo);
		
		JLabel label_6 = new JLabel("비밀번호 힌트 정답");
		label_6.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_6);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("굴림", Font.PLAIN, 45));
		textField_5.setColumns(10);
		f.getContentPane().add(textField_5);
		
		JButton btnNewButton_1 = new JButton("회원가입!");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 80));
		f.getContentPane().add(btnNewButton_1);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
