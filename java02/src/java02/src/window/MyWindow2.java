package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class MyWindow2 {
	//1.프레임 만들기 (300*300)
	//2.자바 프로젝트 버튼을 만들기
	//3.누르면 다음주부터 자바프로젝트가 시작됩니다
	public static void main(String[] args) {
	
		JFrame f = new JFrame();
		f.setSize(300,300);
		f.setTitle("MyWindow2.java");
		
		JButton button = new JButton("자바 프로젝트!!!!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("다음주부터 자바프로젝트가 시작됩니다 !!!!");
			}
		});
		
		
		f.getContentPane().add(button, BorderLayout.NORTH);
		
		
		f.setVisible(true);
	}

}
