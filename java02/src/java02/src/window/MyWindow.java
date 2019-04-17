package window;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;//이곳에 들어있다는 뜻 cpu,ram,hdd,외장하드

public class MyWindow {
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(500,500);
		f.setTitle("나의 첫번째 그래픽 프로그램");
		
		//버튼 만들기
		JButton button = new JButton("나를 눌러주세요!!!!");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("나를 눌럿군요!!!!");
			}
		});
		f.getContentPane().add(button);
		//버튼을 넣은것
		
		f.setVisible(true);
		
		
		
	}

}
