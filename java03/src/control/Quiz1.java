package control;

import javax.swing.JOptionPane;
/*
 * 다이얼 로그에서 먹고싶은음식을 입력받으세요
 * 다이얼 로그에서 먹기 싫은음식을 입력받으세요
 * 콘솔에 출력
 * 
 */
public class Quiz1 {
	public static void main(String[] args) {
		
		String food1 = JOptionPane.showInputDialog("먹고싶은 음식을 입력하세요");
		System.out.println("먹고싶은 음식  :"+food1);
		
		
		String food2 = JOptionPane.showInputDialog("먹기싫은 음식을  입력하세요");
		System.out.println("먹고싶은 음식  :"+food2);
	
	}

}
