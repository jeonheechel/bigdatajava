package 배열까지정리문제;

import java.util.Scanner;

public class 콘도예약문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		System.out.println("----------콘도 예약을 진행합니다----------");
		System.out.println();
		System.out.println();
		while(true) {
			System.out.println("원하는 지역을 신청해주세요(각 지역은 2명까지 신청가능)");
			System.out.println("------------------------------------------");
			System.out.println("1)강원도   2)전라도   3)파주   4)제주도   5)충청도");
			System.out.println("------------------------------------------");
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i]+"        ");
			}
			System.out.println();
			System.out.println("==========================================");
			System.out.print("원하시는 지역 코드를 입력하세요(종료는 0)>>");
			int end = sc.nextInt();
//			for (int i = 0; i < num.length; i++) {
//				if(end-1 == i) {
//					if(num[i] == 0 || num[i] == 1) {
//						System.out.println("신청이 가능합니다");
//						System.out.println("신청이 완료되었습니다");
//						num[i]++;
//						break;
//					}else {
//						System.out.println("이미 신청이 마감되었습니다");
//					}
//					
//				}if(end == 0) {
//					System.out.println("프로그램을 종료합니다");
//				}else if(num.length<end) {
//					System.out.println("입력값을 벗어났습니다 다시선택하세요!");
//				}
//					
//				
//			}
		
		
			
		//종료문	
		
				
				if(end == 0) {
					System.out.println("프로그램을 종료합니다");
					break;
					//입력값이 없는것을했을때
				}else if(num.length < end) {
					System.out.println(" 입력값을 초과합니다 다시 확인후 입력하세요! ");
					//입력값 넣기
				}else if(num[end-1] == 0) {
					System.out.println("신청이 가능합니다");
					System.out.println("신청이 완료 되었습니다");
					num[end-1]=1;
					//입력값2넣기
				}else if(num[end-1] == 1) {
					System.out.println("신청이 가능합니다");
					System.out.println("신청이 완료 되었습니다");
					num[end-1]=2;
					//정원이 다찻을때
				}else {
					System.out.println("이미 인원이 다찻습니다");
					System.out.println("다른지역을 선택하시던지 종료해주세요");
				}
					
				
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
