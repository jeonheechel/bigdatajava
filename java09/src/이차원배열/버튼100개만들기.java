package 이차원배열;

import javax.swing.JButton;

public class 버튼100개만들기 {

	public static void main(String[] args) {
		//버튼이 들어갈 자리를 100개 만들어 준거다
		JButton[] buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
		 buttons[i]	= new JButton("난버튼 ~");
		}
		//버튼 100개를 자동으로 만들게 돌린거다

	}

}
