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

public class SortByPreorderOrder_A extends JPanel {

	static int dataSize;
	static String[] urlDataGet;
	static ArrayList urlData = new ArrayList();
	CollectingImage img;
	JPanel buttonPanel, p1, p2;
	JLabel titleLabel;
	JButton Alignment1Btn, Alignment2Btn, Alignment3Btn, backwardBtn, exitBtn;

	public SortByPreorderOrder_A() {

		img = new CollectingImage();

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);

		p1 = SortByPreoderClass();
		p1.setBounds(0, 0, 900, 1000);
		p1.setBackground(new Color(18, 18, 18));
		add(p1);
		p1.setLayout(null);
		p1.setVisible(true);
		
		JScrollPane sp = new JScrollPane();
		sp.setLocation(0, 0);
		sp.setSize(900, 1000);
		sp.setViewportView(p1);
		sp.getVerticalScrollBar().setUnitIncrement(16);
		setLayout(new BorderLayout());
		add(sp, BorderLayout.CENTER); 

		p2 = new JPanel();
		p2.setBounds(0, 0, 900, 1000);
		add(p2);
		p2.setLayout(null);
		p2.setVisible(false);

		titleLabel = new JLabel("예매순 정렬");
		titleLabel.setBounds(270, 10, 500, 70);
		titleLabel.setForeground(new Color(255, 250, 205));
		titleLabel.setFont(new Font("맑은 고딕", Font.BOLD, 60));
		p1.add(titleLabel);

		
		
		Alignment1Btn = new JButton();
		Alignment1Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "현재 보고있는 페이지 입니다.");
			}
		});
		Alignment1Btn.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		Alignment1Btn.setBounds(10, 100, 285, 30);
		p1.add(Alignment1Btn);
		Alignment1Btn.setBackground(new Color(18, 18, 18));
		Alignment1Btn.setForeground(new Color(255, 250, 205));
		Alignment1Btn.setIcon(img.preorderOrderBtn);
		Alignment1Btn.setRolloverIcon(img.preorderOrderBtn1);
		Alignment1Btn.setPressedIcon(img.preorderOrderBtn2);

		Alignment2Btn = new JButton();
		Alignment2Btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SortByOpenOrder_A next = new SortByOpenOrder_A();
				p2.add(next);
				p2.setVisible(true);
				sp.setVisible(false);
				p1.setVisible(false);
			}
		});
		Alignment2Btn.setBounds(300, 100, 285, 30);
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
			    sp.setVisible(false);
			    p1.setVisible(false);
			}
		});
		Alignment3Btn.setBounds(590, 100, 285, 30);
		p1.add(Alignment3Btn);
		Alignment3Btn.setIcon(img.ratingOrderBtn);
		Alignment3Btn.setRolloverIcon(img.ratingOrderBtn1);
		Alignment3Btn.setPressedIcon(img.ratingOrderBtn2);
		
		
		
		
		
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
					sp.setVisible(false);
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
		exitBtn.setBounds(670, 10, 200, 45);
		p1.add(exitBtn);
		exitBtn.setIcon(img.exit2Btn);
		exitBtn.setRolloverIcon(img.exit2Btn1);
		exitBtn.setPressedIcon(img.exit2Btn2);
	}

	public JPanel SortByPreoderClass() {

		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setVisible(true);
		

		String url = "https://movie.naver.com/movie/running/current.nhn?view=list&tab=normal&order=reserve";
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Elements element = doc.select("div.obj_section");
		int size = 0;
		for (Element el : element.select("div.thumb img")) {
			String nextUrl = el.absUrl("src");
			size++;
		}
		dataSize = size;
		int aaa = 0;
		String[] saveFileName = new String[getDataSize()];
		for (Element el : element.select("div.thumb img")) {
			saveFileName[aaa] = "test" + aaa + ".png";
			aaa++;
		}
		int bbb = 0;
		ImageIcon[] movieMainIcon = new ImageIcon[getDataSize()];
		for (Element el : element.select("div.thumb img")) {
			String nextUrl = el.absUrl("src");

			
			String savePath = ".\\SortByPreorderOrderImage_A\\";

			String fileFormat = "png";
			System.out.println(" IMAGE URL ::: " + nextUrl);
			System.out.println(" SAVE PATH ::: " + savePath);
			System.out.println(" SAVE FILE NAME ::: " + saveFileName[bbb]);
			System.out.println(" FILE FORMAT ::: " + fileFormat);

			File saveFile = new File(savePath + saveFileName[bbb]);
			movieMainIcon[bbb] = new ImageIcon(".\\SortByPreorderOrderImage_A\\test" + bbb + ".png");
			URL inputUrl = null;
			BufferedImage bi = null;

			try {
				inputUrl = new URL(nextUrl); // 다운로드 할 이미지 URL
				bi = ImageIO.read(inputUrl);
				ImageIO.write(bi, fileFormat, saveFile); // 저장할 파일 형식, 저장할 파일명
				System.out.println(" ### 리스트 개수 ### >>> " + bbb);
				bbb++;

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		for (Element el : element.select("div.thumb a")) {
			String nextUrl = el.absUrl("href");
			urlData.add(nextUrl);
		}

		JButton[] b = new JButton[dataSize];
		int yAxis = 0;
		urlDataGet = new String[dataSize];
		for (int i = 0; i < dataSize; i++) {
			final int indexNum = i;
			b[i] = new JButton();
			urlDataGet[i] = (String)urlData.get(i);
			b[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						DetailsPage next = new DetailsPage(urlDataGet[indexNum]);
					} catch (Exception e) {
						e.printStackTrace();
					}

				}
			});
			b[i].setIcon(movieMainIcon[i]);
			buttonPanel.add(b[i]);
			b[i].setBounds(0, yAxis, 880, 140);
			yAxis += 140;
		}

		System.out.println();

		// 버튼에 영화제목 입력하기
		int ccc = 0;
		for (Element el : element.select("dt.tit a")) {
			b[ccc].setText(el.text());
			EtchedBorder b3 = new EtchedBorder();
			LineBorder b4 = new LineBorder(new Color(255, 200, 200), 3);
			if (ccc >= 0 && ccc <= 2) {
				b[ccc].setFont(new Font("맑은 고딕", Font.BOLD, 25));
				CompoundBorder b10 = new CompoundBorder(b3, b4);
				b[ccc].setBorder(b10);

			} else {
				b[ccc].setFont(new Font("맑은 고딕", Font.BOLD, 14));
			}

			b[ccc].setHorizontalAlignment(SwingConstants.LEFT);
			b[ccc].setBackground(new Color(18, 18, 18));
			b[ccc].setForeground(new Color(255, 250, 205));
			b[ccc].setFocusPainted(false);

			ccc++;
		}

		final JScrollPane scrollPane = new JScrollPane(buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(buttonPanel);
		buttonPanel.setBounds(0, 165, 880, yAxis);

		panel.setPreferredSize(new Dimension(880, yAxis + 160));
		panel.setBackground(new Color(18, 18, 18));
		return panel;

	}

	public static int getDataSize() {
		return dataSize;
	}

}
