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

public class 나의첫계산기2 {
	private static JTextField n1;
	private static JTextField n2;
	private static JTextField n3;

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
		
		JLabel label_2 = new JLabel("내가 선택할 연산자>>");
		label_2.setForeground(Color.BLUE);
		label_2.setFont(new Font("굴림", Font.PLAIN, 18));
		label_2.setBackground(Color.RED);
		f.getContentPane().add(label_2);
		
		n3 = new JTextField();
		n3.setForeground(Color.BLUE);
		n3.setFont(new Font("굴림", Font.PLAIN, 30));
		n3.setColumns(10);
		n3.setBackground(Color.RED);
		
		JButton d = new JButton("선택한 연산자로 계산");
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String num1 =	n1.getText();
				 String num2 =	n2.getText();
				 String data =  n3.getText();
				 
				 //스트링을 분석해서 인트로 바꿔라
				 int number1 = Integer.parseInt(num1);
				 int number2 = Integer.parseInt(num2);
				 
				 
				 if(data.equals("+") || data.equals("-") || data.equals("*") || data.equals("/")) {
	                    int imsi = 0;
	                    if(data.equals("+")) {
	                        imsi = number1 + number2;
	                    }else if(data.equals("-")) {
	                        imsi = number1 - number2;
	                    }else if(data.equals("*")) {
	                        imsi = number1 * number2;
	                    }else if(data.equals("/")) {
	                        imsi = number1 / number2;
	                    }   
	                    System.out.println("두 수의 연산 결과는 " + imsi + "입니다.");
	                }else {
	                    System.out.println("연산할 수 없는 기호입니다.");
	                }
			}
			
		});
		

		f.getContentPane().add(n3);
		d.setForeground(Color.WHITE);
		d.setFont(new Font("굴림", Font.PLAIN, 40));
		d.setBackground(Color.BLACK);
		f.getContentPane().add(d);
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
