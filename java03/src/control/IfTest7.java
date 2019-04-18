package control;

import java.util.Scanner;

public class IfTest7 {
	//선생님코드 넣기
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("당신의 점수 입력: ");
			int jumsu = sc.nextInt();
			
			/* 입력값을 받아서, 학점 계산
				90점이상 A
				80점이상 B
				70점이상 C
				60점이상 D
				아니면 F
			 */
			String result;
			if(jumsu >= 90) {
				result = "A";
			}else if(jumsu >= 80) {
				result = "B";
			}else if(jumsu >= 70) {
				result = "C";
			}else if(jumsu >= 60) {
				result = "D";
			}else {
				result = "F";
			}
			
			System.out.println("당신의 학점은 " + result + "입니다.");
			System.out.println(result + "학점의 학생은 이번 학기에 80%입니다.");
		} //main end.
}//class end.
	


