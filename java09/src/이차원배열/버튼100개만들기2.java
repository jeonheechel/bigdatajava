package 이차원배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 버튼 100개들");
		f.setSize(1000,1000);
		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		
		
		//버튼이 들어갈 자리를 100개 만들어 준거다
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
		 buttons[i]	= new JButton("난버튼 ~");
		}
		//버튼 100개를 자동으로 만들게 돌린거다

		for (int i = 0; i < buttons.length; i++) {
			f.add(buttons[i]);
		}
		
		
		
		
		f.setVisible(true);
	}

}
