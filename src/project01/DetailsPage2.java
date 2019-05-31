package project01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JPanel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Whitelist;
import org.jsoup.select.Elements;

import com.sun.media.jfxmedia.events.NewFrameEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class DetailsPage2 {
	MainPage m = new MainPage();
	userDAO dao;
	userDTO dto;

	MovieDAO daoM;
	MovieDTO dtoM;
	MovieDAO daoM1;
	MovieDTO dtoM1;

	StorageDAO daoS;
	StorageDTO dtoS;
	StorageDAO daoS1;
	StorageDTO dtoS1;
	StorageDAO daoS2;
	StorageDTO dtoS2;
	StorageDAO daoS3;
	StorageDTO dtoS3;
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	static String str, today;
	static int dataSize;

	String movieName;
	ArrayList list, name;

	JButton b1, b2, b3;
	

	

	public DetailsPage2() {

	}

	public DetailsPage2(String urlDataGet) throws Exception {

		CollectingImage img = new CollectingImage();
		dao = new userDAO();
		dto = dao.select(m.getId());
		str = urlDataGet;
		JFrame f = new JFrame();

		f.setLayout(null);
		f.setResizable(false); // Unable to change frame size
		f.setPreferredSize(new Dimension(screenSize.width, screenSize.height));
		f.pack();

		final JFXPanel fxPanel = new JFXPanel();
		fxPanel.setSize(new Dimension(screenSize.width, screenSize.height));
		f.add(fxPanel);
		fxPanel.setBounds(-15, 45, screenSize.width, screenSize.height);
		JPanel p = new JPanel();
		p.setBounds(0, 0, screenSize.width, 45);
		p.setBackground(new Color(0, 0, 100));
		p.setLayout(null);

		b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "영화 관람을 완료 하셨습니까?", "평가하기", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// 예, 아니오 선택하지 않고 X눌러서 종료한 경우
				} else if (result == JOptionPane.YES_OPTION) {
					movieName = getMovieName(urlDataGet);
					// 이미 평가 했는지 확인 할 때
					daoM1 = new MovieDAO();
					dtoM1 = new MovieDTO();

					dtoM1 = daoM1.movieSelect((String)m.getId(), movieName);

					// 이미 평가했다면
					if (dtoM1 != null) {
						JOptionPane.showMessageDialog(null, "이미 평가 한 영화입니다.");
					} else {
						Rating rating = new Rating(str);
					}
				}
			}
		});
		b1.setBounds((screenSize.width / 2) - 100, 0, 100, 45);
		b1.setIcon(img.detailPageBtn1);
		b1.setBackground(new Color(0, 0, 100));
		p.add(b1);
		b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.setBorderPainted(false);
		b1.setRolloverIcon(img.detailPageBtn1_1);

		b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "목록에서 삭제하시겠습니까?", "삭제", JOptionPane.YES_NO_OPTION);
				if (result == JOptionPane.CLOSED_OPTION) {
					// 예, 아니오 선택하지 않고 X눌러서 종료한 경우
				} else if (result == JOptionPane.YES_OPTION) {
					daoS3 = new StorageDAO();
					dtoS3 = new StorageDTO();
					
					
					daoS3.delete(m.getId(), urlDataGet);

					JOptionPane.showMessageDialog(null, "목록에서 삭제 되었습니다.");
					f.setVisible(false);

				}
			}
		});
		b2.setBounds(screenSize.width / 2, 0, 100, 45);
		b2.setIcon(img.detailPageBtn3);
		b2.setBackground(new Color(0, 0, 100));
		p.add(b2);
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setBorderPainted(false);
		b2.setRolloverIcon(img.detailPageBtn3_1);

		f.add(p);

		Platform.runLater(new Runnable() {
			public void run() {
				initAndLoadWebView(fxPanel, str);
			}
		});

		f.setVisible(true);
	}

	private static void initAndLoadWebView(final JFXPanel fxPanel, String finStr) {
		Group group = new Group();
		Scene scene = new Scene(group);
		fxPanel.setScene(scene);
		WebView webView = new WebView();
		group.getChildren().add(webView);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		webView.setMinSize(screenSize.width, screenSize.height);
		webView.setMaxSize(800, 800);
		WebEngine webEngine = webView.getEngine();
		webEngine.load(finStr);
	}

	public String getMovieName(String urlDataGet) {

		String url = urlDataGet;

		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}

		Elements element = doc.select("div.mv_info_area");

		list = new ArrayList();
		for (Element el : element.select("h3.h_movie a")) {
			list.add(el.text());
			movieName = (String) list.get(0);

		}
		return movieName;
	}
	
	public void setMovieImg(String urlDataGet) {


		
		String url = urlDataGet;
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (Exception e) {
			e.printStackTrace();
		}
		Elements element = doc.select("div.mv_info_area");
		int size = 0;
		for (Element el : element.select("div.poster a img")) {
			String nextUrl = el.absUrl("src");
			System.out.println(nextUrl);

			size++;
		}
		dataSize = size;
		int aaa = 0;
		String[] saveFileName = new String[getDataSize()];
		for (Element el : element.select("div.poster a img")) {
			saveFileName[aaa] = today + ".png";
			System.out.println(" ### aaa 의 값 ### >>> " + aaa);
			aaa++;
		}
		int bbb = 0;
		ImageIcon[] movieMainIcon = new ImageIcon[getDataSize()];
		for (Element el : element.select("div.poster a img")) {
			String nextUrl = el.absUrl("src");

			
			String savePath = ".\\StorageImg\\" + m.getId() + "\\";
			File Folder = new File(savePath);

			// 해당 디렉토리가 없을경우 디렉토리를 생성합니다.
			if (!Folder.exists()) {
				try{
				    Folder.mkdir(); //폴더 생성합니다.
				    System.out.println("폴더가 생성되었습니다.");
			        } 
			        catch(Exception e){
				    e.getStackTrace();
				}        
		         }else {
				System.out.println("이미 폴더가 생성되어 있습니다.");
			}

			String fileFormat = "png";
			System.out.println(" IMAGE URL ::: " + nextUrl);
			System.out.println(" SAVE PATH ::: " + savePath);
			System.out.println(" SAVE FILE NAME ::: " + saveFileName[bbb]);
			System.out.println(" FILE FORMAT ::: " + fileFormat);

			File saveFile = new File(savePath + saveFileName[bbb]);
			
			movieMainIcon[bbb] = new ImageIcon(".\\StorageImg\\" + m.getId() + "\\" + today + ".png");
			URL inputUrl = null;
			BufferedImage bi = null;
			

			try {
				inputUrl = new URL(nextUrl); // 다운로드 할 이미지 URL
				bi = ImageIO.read(inputUrl);
				ImageIO.write(bi, fileFormat, saveFile); // 저장할 파일 형식, 저장할 파일명
				System.out.println(" ### bbb 의 값 ### >>> " + bbb);
				bbb++;

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static int getDataSize() {
		return dataSize;
	}

}
