package 이차원배열;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼100개만들기3 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 버튼 200개들");
		f.setSize(1000,1000);
		//FlowLayout flow = new FlowLayout();
		//f.getContentPane().setLayout(flow);
		
		f.setLayout(null);//배치부품들 안쓸거야 라는 뜻이다
		
		
		//버튼이 들어갈 자리를 100개 만들어 준거다
		JButton[] buttons = new JButton[200];
		for (int i = 0; i < buttons.length; i++) {
		 buttons[i]	= new JButton("난버튼 ~"+i );
		}
		
		buttons[0].setBounds(50, 50, 150, 100);
		f.add(buttons[0]);
		buttons[1].setBounds(200, 50, 150, 100);
		f.add(buttons[1]);
		buttons[2].setBounds(350, 50, 150, 100);
		f.add(buttons[2]);
		buttons[3].setBounds(500, 50, 150, 100);
		f.add(buttons[3]);
		buttons[4].setBounds(650, 50, 150, 100);
		f.add(buttons[4]);

		//인식하는지 찍어본거다(버튼위 올라간 글자나,입력한값을 가지고 올때 한다)
		System.out.println(buttons[4].getText());
		
		
		
		f.setVisible(true);
	}

}
