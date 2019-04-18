package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		System.out.println("나와 동생의 나이를 적어서 비교하겟습니다");
		Scanner sc = new Scanner(System.in);
		int one1 = sc.nextInt();
		int one2 = sc.nextInt();
		if(one1>one2){
			System.out.println("내가 2개 먹어요!!");
		}else{
			System.out.println("동생이 2개먹어요 ㅠ");
		}
		
		
		
		
	}

}
