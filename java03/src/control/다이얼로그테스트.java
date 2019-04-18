package control;

import javax.swing.JOptionPane;

public class 다이얼로그테스트 {
/*
 *다이얼 로그
 * 
 *
 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "내가바로 다이얼 로그예요.");//입력값으로 두개를 넣어야한다
		//			출력용(보여주는) 입력용(스캐너) 다이얼 로그가 있다
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요");
		System.out.println("당신의 이름은  :"+name);
		
		String age = JOptionPane.showInputDialog("당신의 나이을 입력하세요");
		Integer.parseInt(age);//.nextInt와 같은 기능이다
		int data = Integer.parseInt(age);//변환한걸 정수형 변수에 담는다
		
		JOptionPane.showMessageDialog(null,"내년 내나이는"+(data+1)+"입니다");//괄호로 묶어서 스트링 아니라 따로 계산하라는 뜻이다
		
	}

}
