package 배열까지정리문제;

import java.util.Scanner;

public class 수강신청Quiz1 {

	public static void main(String[] args) {
		int[] sub = new  int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수강신청을 진행합니다.");
		System.out.println("원하는 과목을 신청해주세요.");
		
		
		while(true) {
		System.out.println("------------------------------------------");
		System.out.println(" 1)자바   2)스프링   3)안드로이드   4)파이썬   5)제이쿼리");
		System.out.println("------------------------------------------");
		for (int i = 0; i < sub.length; i++) {
			System.out.print(sub[i]+"        ");
		}
		System.out.println();
		System.out.println("==========================================");
		System.out.print("원하는 과목코드를 입력하세요   (종료 0) ==>");
		int end = sc.nextInt();
			if(end==0) {
				System.out.println("수강신청을  종료합니다 ");
				System.out.print("안녕히가세요.");
					break;
			}
			 if(sub[end]>=5) {//좌석에 벗어나는 위치를 체크하는 조건문 하나 더 들어가야 함.
				System.out.println("좌석에 벗어나는 값입니다 ");
			}else if(sub[end-1]==0) { //입력한 자리가 0번일 때, 수강신청
					System.out.println("수강신청 되었습니다");
					sub[end-1]=1; //해당 자리를 수강신청 표시를 하기 위해 수강 신청 표시 값이 1을 배열에 넣는다.
				}else  { //입력한 자리가 0번이 아닐때(1번일 때)
					System.out.println("신청 불가능합니다");
					System.out.println("다른 코드를 입력하세요");
				}
			
		
	
			
		
		
		
		
		}//while end

	}
}
		
		
		
		
	//main end
//class end
