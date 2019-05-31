package project01;

import java.awt.Color;

import java.awt.Component;

import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MyPage  extends JPanel{
	MainPage m = new MainPage(); 
	public MyPage() {
		CollectingImage img = new CollectingImage();

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
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);
		
		JLabel l1 = new JLabel();
		l1.setBounds(67, 142, 350, 350);
		p1.add(l1);
		l1.setIcon(img.insideMen1);
		JLabel l2 = new JLabel();
		l2.setBounds(471, 142, 350, 350);
		p1.add(l2);
		l2.setIcon(img.insideMen2);
		JLabel l3 = new JLabel();
		l3.setBounds(101, 515, 345, 350);
		p1.add(l3);
		l3.setIcon(img.insideMen3);
		JLabel l4 = new JLabel();
		l4.setBounds(472, 520, 345, 350);
		p1.add(l4);
		l4.setIcon(img.insideMen4);
		
		
		
		JButton b1 = new JButton("자유게시판");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				BoardPage next = new BoardPage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
				
			}
		});
		b1.setBounds(37, 142, 350, 363);
		b1.setForeground(new Color(255,250,205));
		b1.setVerticalAlignment(SwingConstants.BOTTOM); // Text Bottom Alignment
		b1.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		b1.setBackground(new Color(255, 255, 255));
		b1.setFocusPainted(false); // a border in the text
		b1.setOpaque(false);
		p1.add(b1);
		
		JButton b2 = new JButton("찜해 둔 영화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MovieStorage next = new MovieStorage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
				
			}
		});
		b2.setBounds(469, 142, 353, 363);
		b2.setForeground(new Color(255,250,205));
		b2.setVerticalAlignment(SwingConstants.BOTTOM);
		b2.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		b2.setBackground(new Color(255, 255, 255));
		b2.setFocusPainted(false);
		b2.setOpaque(false);
		p1.add(b2);
		
		JButton b3 = new JButton("회원정보 수정 및 탈퇴");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ModifyAndWithdrawal next = new ModifyAndWithdrawal();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
				
				
			}
		});
		b3.setBounds(37, 527, 350, 364);
		b3.setForeground(new Color(255,250,205));
		b3.setVerticalAlignment(SwingConstants.BOTTOM);
		b3.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		b3.setBackground(new Color(255, 255, 255));
		b3.setFocusPainted(false);
		b3.setOpaque(false);
		p1.add(b3);
		
		JButton b4 = new JButton("나의 현재 등급 확인");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MyGradePage next = new MyGradePage();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
				
				
			}
		});
		b4.setForeground(new Color(255,250,205));
		b4.setBounds(469, 527, 353, 363);
		b4.setVerticalAlignment(SwingConstants.BOTTOM);
		b4.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		b4.setBackground(new Color(255, 255, 255));
		b4.setFocusPainted(false);
		b4.setOpaque(false);
		p1.add(b4);
		
		JButton backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?" + 
						"", "뒤로가기", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MainMenuPage back = new MainMenuPage();
					p2.add(back);
					p2.setVisible(true);
					p1.setVisible(false);
				}
				else {
					// If you selected No.
				}
				
			}
		});
		backwardBtn.setBounds(140, 10, 200, 45);
		p1.add(backwardBtn);
		backwardBtn.setIcon(img.backwardBtn);
		backwardBtn.setRolloverIcon(img.backwardBtn1);
		backwardBtn.setPressedIcon(img.backwardBtn2);
		
		
		JButton logoutBtn = new JButton();
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					m.id = null;
					// If Yes is selected
					MainPage logout = new MainPage();
					p2.add(logout);
					p2.setVisible(true);
					p1.setVisible(false);
					
					
					
				}
				else {
					// If you selected No.
				}
				
			}
		});
		logoutBtn.setBounds(350, 10, 200, 45);
		p1.add(logoutBtn);
		logoutBtn.setIcon(img.logoutBtn);
		logoutBtn.setRolloverIcon(img.logoutBtn1);
		logoutBtn.setPressedIcon(img.logoutBtn2);
		
		JButton exitBtn = new JButton();
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", "종료", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				}
				else if(result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					System.exit(0);
					
				}
				else {
					// If you selected No.
				}
			}
		});
		exitBtn.setBounds(560, 10, 200, 45);
		p1.add(exitBtn);
		exitBtn.setIcon(img.exit2Btn);
		exitBtn.setRolloverIcon(img.exit2Btn1);
		exitBtn.setPressedIcon(img.exit2Btn2);
		
		
	}
}
