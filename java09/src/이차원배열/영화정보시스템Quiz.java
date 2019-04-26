package 이차원배열;

import java.awt.FlowLayout;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 영화정보시스템Quiz {

	public static void main(String[] args) {
		String[] movies = {"m1.png","m2.png","m3.png","m4.png","m5.png"};
		//String[] movies2 = new String[5] ;
		
		
		//JButton[] buttons = new JButton[100];//버튼이 들어갈 자리를 100개 만들어 준거다
		//자바는 필요한 부분의 부품을 (class)를 복사해서
		//조립해서 코딩하는 방식
		//부품(객체,대상)조립식프로그램
		//객체지향형 프로그램(Object-oriented Program, OOP )
		
		//Color.red :static(정적)=>원본그래도
		//new Button :instance(동적)=>카피해서 사용
		
		
		JFrame f = new JFrame();
		f.setTitle("나의 영화정보 시스템");
		f.setSize(300,595);
		//물흐르듯이 하니씩 순서대로 붙여주는 클래스
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		JButton b0 = new JButton();
		f.getContentPane().add(b0);
		
		//버튼에 끼운다
	    ImageIcon icon = new ImageIcon("m1.png");
	    b0.setIcon(icon);
	    
	    
	    JButton b1 = new JButton("<<생일>>");
	    b1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//이미지 아이콘 넣기
	    		ImageIcon icon = new ImageIcon(movies[0]);
	    		b0.setIcon(icon);
	    	}
	    });
	    b1.setFont(new Font("굴림", Font.PLAIN, 20));
	    b1.setForeground(Color.RED);
	    f.getContentPane().add(b1);
	    
	    JButton b2 = new JButton("<<헬보이>>");
	    b2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//이미지 아이콘 넣기
	    		ImageIcon icon = new ImageIcon(movies[1]);
	    		b0.setIcon(icon);
	    	}
	    });
	    b2.setFont(new Font("굴림", Font.PLAIN, 20));
	    b2.setForeground(Color.RED);
	    f.getContentPane().add(b2);
	    
	    JButton b3 = new JButton("<<돈(money)>>");
	    b3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//이미지 아이콘 넣기
	    		ImageIcon icon = new ImageIcon(movies[2]);
	    		b0.setIcon(icon);
	    	}
	    });
	    b3.setFont(new Font("굴림", Font.PLAIN, 20));
	    b3.setForeground(Color.RED);
	    f.getContentPane().add(b3);
	    
	    JButton b4 = new JButton("<<파이브피트>>");
	    b4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//이미지 아이콘 넣기
	    		ImageIcon icon = new ImageIcon(movies[3]);
	    		b0.setIcon(icon);
	    	}
	    });
	    b4.setFont(new Font("굴림", Font.PLAIN, 20));
	    b4.setForeground(Color.RED);
	    f.getContentPane().add(b4);
	    
	    JButton b5 = new JButton("<<이스>>");
	    b5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		//이미지 아이콘 넣기
	    		ImageIcon icon = new ImageIcon(movies[4]);
	    		b0.setIcon(icon);
	    	}
	    });
	    b5.setFont(new Font("굴림", Font.PLAIN, 22));
	    b5.setForeground(Color.RED);
	    f.getContentPane().add(b5);
		
		
		
		
		
	    //직접 알려줘야 한다 
	    //객체화를 해주어야 string을 의미있게 인식한다
//		URL url = new URL("http://www.naver.com");
//		File file = new File("c:/temp/test.txt");
//		(PreparedStatement)SQL sql = new SQL("select * from member");
		
		
		f.setVisible(true);//마지막에 둬야한다 꼭!
	}

}
