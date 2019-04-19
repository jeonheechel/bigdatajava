package control;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 가위바위보퀴즈1 {
	//가위 바위 보 
	public static void main(String[] args) {
		
		JButton button = new JButton("");
		Random random = new Random();
		System.out.println(random.nextInt(3));
		int you = random.nextInt();
		
		
		
		JFrame f = new JFrame("가위 바위보 프로그램");
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton b1 = new JButton("가위");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(you==0) {
					System.out.println("비겻습니다");
				}else if(you==1) {
					System.out.println("컴퓨터가 이겻습니다");
				}else {
					System.out.println("내가 이겻습니다");
				}
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("바위");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(you==0) {
					System.out.println("내가 이겻습니다");
				}else if(you==1) {
					System.out.println("비겻습니다");
				}else {
					System.out.println("컴퓨터가 이겻습니다");
				}
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("보");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(you==0) {
					System.out.println("컴퓨터가 이겻습니다");
				}else if(you==1) {
					System.out.println("내가이겻습니다");
				}else {
					System.out.println("비겻습니다");
				}
			}
		});
		b3.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b3);
		
		JButton b4 = new JButton("가위바위보 승부");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		b4.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b4);
		
		
	
		
		
		
	}


}
