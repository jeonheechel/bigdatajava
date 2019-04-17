package cal;

import java.util.Scanner;

public class Me2 {
//문제5
	/*
	 * 
	 당신의 취미는
	평소 tv시청 시간은 얼마인가요?
	봄여행을 다녀왔나요?
	
	-----출력-----
	네 취미는 여행이고 평소에 tv를 두시간도 보지않습니다
	봄여행은 true예요
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 취미는?");
		String hobby = sc.next();
		System.out.print("당신의 tv시청 시간은?");
		int tv = sc.nextInt();
		System.out.print("봄여행을 다녀왔나요?");
		Boolean homeout = sc.nextBoolean();
		
		System.out.println("-----출력-----");
		System.out.println("네 취미는 "+hobby+"이고 "
		+"평소에 tv를 "+tv+"시간도 보지않습니다 "
				+"봄여행은"+homeout+"예요");
	}

}
