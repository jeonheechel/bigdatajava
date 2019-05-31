package project01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BoardPage extends JPanel {
	MainPage m = new MainPage();
	userDAO dao;
	userDTO dto;

	BoardDTO dtoB1;
	BoardDAO daoB1;

	JPanel buttonPanel, p1, p2;

	JLabel titleLabel;
	JButton exitBtn, backwardBtn, Alignment1Btn, Alignment2Btn, Alignment3Btn;
	ArrayList numList = new ArrayList();
	JScrollPane sp;
	int[] numCount;
	String[] nicNameArr;
	String[] titleArr;
	String[] contentArr;
	String[] todayArr;

	public BoardPage() {
		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);

		p1 = BoardPageClass();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);

		sp = new JScrollPane();
		sp.setLocation(0, 0);
		sp.setSize(900, 1000);
		sp.setViewportView(p1);
		sp.getVerticalScrollBar().setUnitIncrement(16);
		setLayout(new BorderLayout());
		add(sp, BorderLayout.CENTER);

		p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		p2.setBackground(new Color(18, 18, 18));
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		titleLabel = new JLabel("자유게시판");
		titleLabel.setBounds(300, 10, 500, 70);
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		p1.add(titleLabel);


		for (int i = 0; i < numList.size(); i++) {

			dtoB1 = (BoardDTO) numList.get(i);
			numCount[i] = dtoB1.getNumber();
			titleArr[i] = dtoB1.getTitle();
			nicNameArr[i] = dtoB1.getNicName();
			contentArr[i] = dtoB1.getContent();
			todayArr[i] = dtoB1.getToday();
		}

		Alignment1Btn = new JButton("전체 글 보기");
		Alignment1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "현재 보고있는 페이지 입니다.");
			}
		});
		Alignment1Btn.setBounds(10, 100, 285, 30);
		Alignment1Btn.setBackground(new Color(18,18,18));
		Alignment1Btn.setForeground(new Color(255, 250, 205));
		Alignment1Btn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(Alignment1Btn);

		Alignment2Btn = new JButton("내가 쓴 글 확인");
		Alignment2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BoardPage2 next = new BoardPage2();
				p2.add(next);
				p2.setVisible(true);
				sp.setVisible(false);
				p1.setVisible(false);
			}
		});
		Alignment2Btn.setBounds(300, 100, 285, 30);
		Alignment2Btn.setBackground(new Color(18,18,18));
		Alignment2Btn.setForeground(new Color(255, 250, 205));
		Alignment2Btn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(Alignment2Btn);

		Alignment3Btn = new JButton("글 작성하기");
		Alignment3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WritePage next = new WritePage();
				p2.add(next);
				p2.setVisible(true);
				sp.setVisible(false);
				p1.setVisible(false);
			}
		});
		Alignment3Btn.setBounds(590, 100, 285, 30);
		Alignment3Btn.setBackground(new Color(18,18,18));
		Alignment3Btn.setForeground(new Color(255, 250, 205));
		Alignment3Btn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(Alignment3Btn);
		
		
		JLabel l1 = new JLabel("번호");
		l1.setBounds(10, 135, 50, 50);
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(l1);
		
		JLabel l2 = new JLabel("제목");
		l2.setBounds(320, 135, 50, 50);
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(l2);
		
		JLabel l3 = new JLabel("작성자");
		l3.setBounds(620, 135, 100, 50);
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(l3);
		
		JLabel l4 = new JLabel("작성시간");
		l4.setBounds(740, 135, 100, 50);
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		p1.add(l4);
		

		backwardBtn = new JButton();
		backwardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "이전 페이지로 돌아가시겠습니까?" + "", "뒤로가기",
						JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					MyPage back = new MyPage();
					p2.add(back);
					p2.setVisible(true);
					sp.setVisible(false);
					p1.setVisible(false);
				} else {
					// If you selected No.
				}

			}
		});
		backwardBtn.setBounds(10, 10, 200, 45);
		p1.add(backwardBtn);
		backwardBtn.setIcon(img.backwardBtn);
		backwardBtn.setRolloverIcon(img.backwardBtn1);
		backwardBtn.setPressedIcon(img.backwardBtn2);

		exitBtn = new JButton();
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", "Exit", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// If you have closed the dialog without selecting.
				} else if (result == JOptionPane.YES_OPTION) {
					// If Yes is selected
					System.exit(0);

				} else {
					// If you selected No.
				}
			}
		});
		exitBtn.setBounds(670, 10, 200, 45);
		p1.add(exitBtn);
		exitBtn.setIcon(img.exit2Btn);
		exitBtn.setRolloverIcon(img.exit2Btn1);
		exitBtn.setPressedIcon(img.exit2Btn2);

	}

	public JPanel BoardPageClass() {

		buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(18, 18, 18));
		buttonPanel.setLayout(null);
		buttonPanel.setVisible(true);
		
		
		

		daoB1 = new BoardDAO();
		dtoB1 = new BoardDTO();

		numList = daoB1.selectAll();
		numCount = new int[numList.size()];
		nicNameArr = new String[numList.size()];
		titleArr = new String[numList.size()];
		contentArr = new String[numList.size()];
		todayArr = new String[numList.size()];

		for (int i = 0; i < numList.size(); i++) {

			dtoB1 = (BoardDTO) numList.get(i);
			numCount[i] = dtoB1.getNumber();
			titleArr[i] = dtoB1.getTitle();
			nicNameArr[i] = dtoB1.getNicName();
			contentArr[i] = dtoB1.getContent();
			todayArr[i] = dtoB1.getToday();
		}

		JLabel[] b1 = new JLabel[numList.size()];
		JButton[] b2 = new JButton[numList.size()];
		JLabel[] b3 = new JLabel[numList.size()];
		JLabel[] b4 = new JLabel[numList.size()];
		int yAxis = 0;
		for (int i = 0; i < numList.size(); i++) {
			final int aaa = i;
			b1[i] = new JLabel(Integer.toString(numCount[i]));
			buttonPanel.add(b1[i]);
			b1[i].setBounds(20, yAxis, 50, 50);
			b1[i].setForeground(new Color(255, 255, 255));
			b1[i].setFont(new Font("맑은 고딕", Font.BOLD, 20));

			b2[i] = new JButton(titleArr[i]);
			b2[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					BoardOutput next = new BoardOutput(titleArr[aaa], nicNameArr[aaa], contentArr[aaa], todayArr[aaa]);
					p2.add(next);
					p2.setVisible(true);
					sp.setVisible(false);
					p1.setVisible(false);
					
				}
			});
			b2[i].setHorizontalAlignment(SwingConstants.LEFT);
			b2[i].setFont(new Font("맑은 고딕", Font.BOLD, 20));
			buttonPanel.add(b2[i]);
			b2[i].setBounds(80, yAxis, 520, 50);
			b2[i].setBackground(new Color(18, 18, 18));
			b2[i].setForeground(new Color(255, 255, 255));

			b3[i] = new JLabel(nicNameArr[i]);
			buttonPanel.add(b3[i]);
			b3[i].setFont(new Font("맑은 고딕", Font.BOLD, 20));
			b3[i].setBounds(620, yAxis, 100, 50);
			b3[i].setForeground(new Color(255, 255, 255));
			
			b4[i] = new JLabel(todayArr[i]);
			buttonPanel.add(b4[i]);
			b4[i].setBounds(740, yAxis, 130, 50);
			b4[i].setForeground(new Color(255, 255, 255));
			b4[i].setFont(new Font("맑은 고딕", Font.BOLD, 14));

			yAxis += 75;
		}

		System.out.println();
		System.out.println();

		final JScrollPane scrollPane = new JScrollPane(buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(buttonPanel);
		buttonPanel.setBounds(0, 185, 880, yAxis);
		panel.setPreferredSize(new Dimension(880, yAxis + 200));
		panel.setBackground(new Color(18, 18, 18));
		return panel;

	}

}
