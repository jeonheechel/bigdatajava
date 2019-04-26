package 이차원배열;

import java.util.Scanner;

public class 영화예매프로그램 {
	
	/*
	    1.좌석번호(열)를 1번부터 표시
		2. 행/열을 입력을 1번부터 입력
		3. 행을 1번부터 표시 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] seat = new int[3][10];
		
		while(true) {
			System.out.println("--------------------------------");
			//1~10까지 출력
			System.out.print("  ");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + 1 + "  ");
			}
			System.out.println();
			System.out.println("--------------------------------");
			
			
			//30개 좌석만들기
			for (int i = 0; i < seat.length; i++) {
				//좌석행 보여주는 코드
				System.out.print(i + 1 +"  ");
				for (int j = 0; j < seat[i].length; j++) {
					//0 0 0 0 0 0 0 0 0 0 을 3줄 출력하는 코드
					System.out.print(seat[i][j]+"  ");
				}
				System.out.println();
			}
			//종료시스템부터시작
			System.out.print("종료0,예약1>>");
			int end = sc.nextInt();
			if(end ==0) {
				System.out.println("시스템을 종료합니다");
				break;
			}else {
				System.out.print("행입력(1~3):");//1
				int row = sc.nextInt();
				System.out.print("열입력(1~10):");//1
				int col = sc.nextInt();
				
				//에약이 되었는 확인 
				//예약 가능하면 , 예약처리
				if(seat[row-1][col-1] == 0) {
					seat[row-1][col-1] = 1;
					System.out.println("예약완료!");
					//예약 불가능하면, 재입력 요구
				}else {
					System.out.println("예약이 이미완료되었습니다");
					System.out.println("좌석을 다시입력하세요");
				}
				
				
			}
		}
		
		
		
		
	}
	
}
