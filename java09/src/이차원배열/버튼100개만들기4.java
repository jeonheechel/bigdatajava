package 이차원배열;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;

public class 버튼100개만들기4 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setTitle("나의 버튼 200개들");
		f.setSize(1000,1000);
		//FlowLayout flow = new FlowLayout();
		//f.getContentPane().setLayout(flow);
		
		f.getContentPane().setLayout(null);//배치부품들 안쓸거야 라는 뜻이다
		
		
		//버튼이 들어갈 자리를 100개 만들어 준거다
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
		 buttons[i]	= new JButton("난버튼 ~"+i );
		}
		
		Random random = new Random();
		for (int i = 0; i < buttons.length; i++) {
			int x = random.nextInt(800);
			int y = random.nextInt(800);
			buttons[i].setBounds(x,y,100,50);
			f.getContentPane().add(buttons[i]);
		}
		

		//인식하는지 찍어본거다(버튼위 올라간 글자나,입력한값을 가지고 올때 한다)
		System.out.println(buttons[4].getText());
		
		
		
		f.setVisible(true);
	}

}
