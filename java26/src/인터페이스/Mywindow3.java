package 인터페이스;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Mywindow3 extends JFrame {
	JButton b, b2;// 전역변수 선언

	public Mywindow3() {
		setSize(300, 300);
		b = new JButton("나를 눌러요");
		b2 = new JButton("나를 눌러요2");
		add(b);
		add(b2);
		setLayout(new FlowLayout());
		ActionListener action = new ActionListener() {//익명클래스 눈에안보이는 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼을 눌럿군요");
				
			}//익명클래스
		};
		b.addActionListener(action);
		b2.addActionListener(new ActionListener() {//자동으로 업캐스팅 됨
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("2번째 버튼을 누르셧군요");
			}
		});

		
		setVisible(true);
	}

	public static void main(String[] args) {
		Mywindow3 name = new Mywindow3();

	}

}
