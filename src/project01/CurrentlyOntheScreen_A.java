package project01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.TextArea;
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.Point;

public class CurrentlyOntheScreen_A extends JPanel {
	static ArrayList list = new ArrayList();
	static int count;
	static int yAxis;
	static int size; // 영화제목 데이터들만 가져온 코드

	JScrollPane scroll;
	CollectingImage img;
	JPanel p1, p2, panel;
	JLabel titleLabel;
	JButton exitBtn, backwardBtn;
	JButton Alignment1Btn, Alignment2Btn, Alignment3Btn;
	FlowLayout flow;
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	BorderLayout bor = new BorderLayout();
	JScrollPane sp;
	static int dataSize;
	static String[] saveFileName;

	public CurrentlyOntheScreen_A() {
		img = new CollectingImage();

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18 ,18, 18));
		setLayout(null);

		p1 = new JPanel();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18 ,18, 18));
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);

		p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		
		titleLabel = new JLabel("현재상영영화");
		titleLabel.setBounds(270, 10, 500, 70);
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		p1.add(titleLabel);

		backwardBtn = new JButton();
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
		backwardBtn.setBounds(10, 10, 200, 45);
		p1.add(backwardBtn);
		backwardBtn.setIcon(img.backwardBtn);
		backwardBtn.setRolloverIcon(img.backwardBtn1);
		backwardBtn.setPressedIcon(img.backwardBtn2);
		
		exitBtn = new JButton();
		exitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int result = JOptionPane.showConfirmDialog(null, "프로그램을 종료 하시겠습니까?", "Exit", JOptionPane.YES_NO_OPTION);
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
		exitBtn.setBounds(690, 10, 200, 45);
		p1.add(exitBtn);
		exitBtn.setIcon(img.exit2Btn);
		exitBtn.setRolloverIcon(img.exit2Btn1);
		exitBtn.setPressedIcon(img.exit2Btn2);

		
		
		Alignment1Btn = new JButton();
		Alignment1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SortByPreorderOrder_A next = new SortByPreorderOrder_A();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		Alignment1Btn.setBounds(10, 100, 290, 30);
		p1.add(Alignment1Btn);
		Alignment1Btn.setIcon(img.preorderOrderBtn);
		Alignment1Btn.setRolloverIcon(img.preorderOrderBtn1);
		Alignment1Btn.setPressedIcon(img.preorderOrderBtn2);

		Alignment2Btn = new JButton();
		Alignment2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SortByOpenOrder_A nextOpen = new SortByOpenOrder_A();
				p2.add(nextOpen);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		Alignment2Btn.setBounds(310, 100, 290, 30);
		p1.add(Alignment2Btn);
		Alignment2Btn.setIcon(img.openOrderBtn);
		Alignment2Btn.setRolloverIcon(img.openOrderBtn1);
		Alignment2Btn.setPressedIcon(img.openOrderBtn2);

		Alignment3Btn = new JButton();
		Alignment3Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SortByRatingOrder_A next = new SortByRatingOrder_A();
				p2.add(next);
				p2.setVisible(true);
				p1.setVisible(false);
			}
		});
		Alignment3Btn.setBounds(610, 100, 280, 30);
		p1.add(Alignment3Btn);
		Alignment3Btn.setIcon(img.ratingOrderBtn);
		Alignment3Btn.setRolloverIcon(img.ratingOrderBtn1);
		Alignment3Btn.setPressedIcon(img.ratingOrderBtn2);
	}

}
