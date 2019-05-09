package java17;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel extends JPanel{//나는 제이패널이다

	
	public MyPanel() {
		
		JButton b = new JButton("나는 패널의 버튼입니다");
		add(b);
		
	}
}
