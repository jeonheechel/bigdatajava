package 부품만들기;

import javax.swing.JFrame;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 주문시스템 {
	static int sum = 0;//바깥에서 써야한다
	private static JTextField t1;
	private static JTextField t2;
	public static void main(String[] args) {
		String[]  china = {"짬뽕.jpg","우동.jpg","자장.jpg","중국집.jpg"};
		int count = 0;
		
		
		
		
		
		JFrame f = new JFrame();
		f.getContentPane().setForeground(Color.RED);
		f.setTitle("중국집 주문 시스템");
		f.setSize(600,600);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		JButton b0 = new JButton("");
		b0.setFont(new Font("굴림", Font.PLAIN, 12));
		f.getContentPane().add(b0);
		ImageIcon icon = new ImageIcon(china[3]);
		b0.setIcon(icon);
		
		
		
		JButton b1 = new JButton("짬뽕");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(china[0]);
				b0.setIcon(icon);
				sum += count+1;
				t1.setText(String.valueOf(sum));
				t2.setText(String.valueOf(sum*5500));
			}
		});
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("우동");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(china[1]);
				b0.setIcon(icon);
				sum += count+1;
				t1.setText(String.valueOf(sum));
				t2.setText(String.valueOf(sum*6000));
			}
		});
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("자장");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon icon = new ImageIcon(china[2]);
				b0.setIcon(icon);
				sum += count+1;
				t1.setText(String.valueOf(sum));
				t2.setText(String.valueOf(sum*5000));
		
				
			}
		});
		f.getContentPane().add(b3);
		
		JLabel label = new JLabel("개수");
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel label_1 = new JLabel("합계금액");
		f.getContentPane().add(label_1);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		
		
		f.getContentPane().add(b0);
		

		
		
		f.setVisible(true);
	}
}
