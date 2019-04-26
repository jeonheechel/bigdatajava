package 이차원배열;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 이미지변경 {

	public static void main(String[] args) {
		String[] img = {"1.png","2.png","3.png","4.png","5.png"};
		JFrame f = new JFrame();
		f.setTitle("이미지 변경 프로그램");
		f.setSize(400,400);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		JButton b0 = new JButton();
		
		//버튼에 끼운다
	    ImageIcon icon = new ImageIcon("1.png");
		
		
		JButton b1 = new JButton("왼쪽으로");
		b1.setFont(new Font("굴림", Font.PLAIN, 20));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					ImageIcon icon = new ImageIcon(img[4]);
					b0.setIcon(icon);
					
			}
		});
		f.getContentPane().add(b1);
		
		
		
		
		JButton b2 = new JButton("오른쪽으로");
		b2.setFont(new Font("굴림", Font.PLAIN, 20));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
						ImageIcon icon = new ImageIcon(img[0+1]);
						b0.setIcon(icon);
						
			}
		});
		f.getContentPane().add(b2);
		
		
		
		
		
		
		f.getContentPane().add(b0);
		b0.setIcon(icon);
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}

}
