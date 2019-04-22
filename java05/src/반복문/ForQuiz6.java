package 반복문;

import java.util.Scanner;

public class ForQuiz6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("계절을 입력하시오[1~4]");
			int wea = sc.nextInt();
			if(wea>=1 && wea<=4) {//이조건을 만족하지 못하면 계속 무한루프만 하게된다
				
				if(wea==1) {
					System.out.println("봄");
				}else if(wea==2) {
					System.out.println("여름");
				}else if(wea==3) {
					System.out.println("가을");
				}else {
					System.out.println("겨울");
					
				}break;//조건문 을 만족해야지만 조건안으로 들어올수 있다
			}
			
			
		}
		sc.close();//메모리를 이통로가 차지한다 사용하면 꼭 닫아줘라 반드시
		
	}
			
		
		
		
		
		
		
		
}
	

