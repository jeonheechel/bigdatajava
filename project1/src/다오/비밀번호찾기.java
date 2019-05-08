package 다오;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;


public class 비밀번호찾기 {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	public 비밀번호찾기() {
		JFrame f = new JFrame();
		f.setTitle("비밀번호 찾기");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("");
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("아이디 입력");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_2 = new JLabel("이름 입력");
		label_2.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 40));
		textField_1.setColumns(10);
		f.getContentPane().add(textField_1);
		
		JLabel label_3 = new JLabel("힌트입력");
		label_3.setFont(new Font("굴림", Font.PLAIN, 60));
		
		f.getContentPane().add(label_3);
		JComboBoxTest Pw = new JComboBoxTest();
		
		
		
		
		
		JLabel label_4 = new JLabel("힌트 답 입력");
		label_4.setFont(new Font("굴림", Font.PLAIN, 48));
		f.getContentPane().add(label_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("굴림", Font.PLAIN, 55));
		textField_3.setColumns(10);
		f.getContentPane().add(textField_3);
		
		JButton button = new JButton("비밀번호찾기");
		button.setFont(new Font("굴림", Font.PLAIN, 38));
		f.getContentPane().add(button);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

	
}
