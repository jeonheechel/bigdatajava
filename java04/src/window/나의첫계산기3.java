package window;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//선생님코드
public class 나의첫계산기3 {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 계산기"); 
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(500,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel label = new JLabel("<<<< 나의 계산기 >>>>");
		label.setForeground(Color.RED);
		label.setFont(new Font("굴림", Font.PLAIN, 40));
		f.getContentPane().add(label);
		
		JLabel lblNewLabel = new JLabel("숫자 1 >>>>");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBackground(Color.RED);
		n1.setForeground(Color.BLUE);
		n1.setFont(new Font("굴림", Font.PLAIN, 30));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label_1 = new JLabel("숫자 2 >>>>");
		label_1.setForeground(Color.BLUE);
		label_1.setFont(new Font("굴림", Font.PLAIN, 30));
		label_1.setBackground(Color.RED);
		f.getContentPane().add(label_1);
		
		n2 = new JTextField();
		n2.setForeground(Color.BLUE);
		n2.setFont(new Font("굴림", Font.PLAIN, 30));
		n2.setColumns(10);
		n2.setBackground(Color.RED);
		f.getContentPane().add(n2);
		
		JButton a = new JButton("더하기");
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 String num1 =	n1.getText();
			 String num2 =	n2.getText();
			 
			 //스트링을 분석해서 인트로 바꿔라
			 int number1 = Integer.parseInt(num1);
			 int number2 = Integer.parseInt(num2);
			 
			 System.out.println(number1+number2);
			}
		});
		a.setBackground(Color.BLACK);
		a.setForeground(Color.WHITE);
		a.setFont(new Font("굴림", Font.PLAIN, 26));
		f.getContentPane().add(a);
		
		JButton b = new JButton("빼기");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num1 =	n1.getText();
				 String num2 =	n2.getText();
				 
				 //스트링을 분석해서 인트로 바꿔라
				 int number1 = Integer.parseInt(num1);
				 int number2 = Integer.parseInt(num2);
				 
				 System.out.println(number1-number2);
			}
		});
		b.setForeground(Color.WHITE);
		b.setFont(new Font("굴림", Font.PLAIN, 26));
		b.setBackground(Color.BLACK);
		f.getContentPane().add(b);
		
		JButton c = new JButton("곱하기");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num1 =	n1.getText();
				 String num2 =	n2.getText();
				 
				 //스트링을 분석해서 인트로 바꿔라
				 int number1 = Integer.parseInt(num1);
				 int number2 = Integer.parseInt(num2);
				 
				 System.out.println(number1*number2);
			}
		});
		c.setForeground(Color.WHITE);
		c.setFont(new Font("굴림", Font.PLAIN, 26));
		c.setBackground(Color.BLACK);
		f.getContentPane().add(c);
		
		JButton d = new JButton("나누기");
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num1 =	n1.getText();
				 String num2 =	n2.getText();
				 
				 //스트링을 분석해서 인트로 바꿔라
				 int number1 = Integer.parseInt(num1);
				 int number2 = Integer.parseInt(num2);
				 
				 System.out.println(number1/number2);
			}
		});
		d.setForeground(Color.WHITE);
		d.setFont(new Font("굴림", Font.PLAIN, 26));
		d.setBackground(Color.BLACK);
		f.getContentPane().add(d);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
