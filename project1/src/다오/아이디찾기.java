package 다오;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 아이디찾기 {
	private JTextField textField;
	private JTextField textField_1;
	
	
	public 아이디찾기() {
		JFrame f = new JFrame();
		f.setTitle("아이디찾기");
		f.setSize(800,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("이름입력");
		label.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_1 = new JLabel("이메일 입력");
		label_1.setFont(new Font("굴림", Font.PLAIN, 45));
		f.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("굴림", Font.PLAIN, 45));
		textField_1.setColumns(10);
		f.getContentPane().add(textField_1);
		
		JButton btnNewButton = new JButton("아이디 찾기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton,"당신의 아이디는" +"abc");
				
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(btnNewButton);
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
