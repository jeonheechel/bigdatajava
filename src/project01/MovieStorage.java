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
import java.util.HashSet;

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

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class MovieStorage extends JPanel{
	
	StorageDAO daoS;
	StorageDTO dtoS;
	
	MainPage m = new MainPage();
	
	static int dataSize;
	CollectingImage img;
	JPanel buttonPanel, p1, p2;
	JLabel titleLabel;
	JButton Alignment1Btn, Alignment2Btn, Alignment3Btn, backwardBtn, exitBtn;
	
	
	ArrayList list, idList, movieNameList;
	
	public MovieStorage() {
		img = new CollectingImage();

		setBounds(0, 0, 900, 1000);
		setBackground(new Color(18, 18, 18));
		setLayout(null);

		p1 = movieStorageClass();
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

		
		titleLabel = new JLabel("찜해 둔 영화");
		titleLabel.setBounds(280, 10, 500, 70);
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
					MyPage back = new MyPage();
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
		
		
	}
	
	public JPanel movieStorageClass() {
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setBackground(new Color(18, 18, 18));
		buttonPanel.setVisible(true);
		
		daoS = new StorageDAO();
		dtoS = new StorageDTO();
		String path = ".\\StorageImg\\" + m.getId() + "\\";
		list = daoS.select(m.getId());
		ArrayList imgList = new ArrayList();
		ArrayList urlData = new ArrayList();
		for (int i = 0; i < list.size(); i++) {
			dtoS = (StorageDTO) list.get(i);
			imgList.add(dtoS.getToday());
			urlData.add(dtoS.getMovieUrl());
			System.out.println(dtoS.getMovieName());
			System.out.println(dtoS.getToday());
		}
		ImageIcon[] movieMainIcon = new ImageIcon[list.size()];

		for (int i = 0; i < list.size(); i++) {
			movieMainIcon[i] = new ImageIcon(path + imgList.get(i) + ".png");
			
		}
		JButton[] b = new JButton[list.size()];
		int yAxis = 0;
		int xAxis = 0;
		for (int i = 0; i < list.size(); i++) {
			final int indexNum = i;
			b[i] = new JButton();
			b[i].addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						DetailsPage2 next = new DetailsPage2((String)urlData.get(indexNum));
					} catch (Exception e) {
						e.printStackTrace();
					}
					
				}
			});
			buttonPanel.add(b[i]);
			
			b[i].setBounds(xAxis, yAxis, 203, 290);
			b[i].setIcon(movieMainIcon[i]);
			xAxis += 203;
			if((i+1) % 4 == 0) {
				yAxis+=290;
				xAxis = 0;
			}
			
			System.out.println(yAxis);
			System.out.println("x : " + xAxis);
		}
		
		
		
		
		
		final JScrollPane scrollPane = new JScrollPane(buttonPanel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.add(buttonPanel);
		
		buttonPanel.setBounds(35, 165, 880, yAxis + 480);

		panel.setPreferredSize(new Dimension(880, yAxis + 480));
		panel.setBackground(new Color(18, 18, 18));
		return panel;
		
	}
	
	
	

}
