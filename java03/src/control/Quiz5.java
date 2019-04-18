package control;

import java.util.Scanner;

public class Quiz5 {
	public static void main(String[] args) {
		
		/*
		 * 자동차 성능테스트를 실시하세요
		 * 각 점수는 만점 100점
		 * 평점:속도 50% ,안정성 30% ,연비 20%
		 * 평점 80점 이상 우수,
		 * 평점 70정이상 보통
		 * 나머지 불량
		 * 모든 점수가 80점 이상인 경우 베스트!
		 */
		System.out.println("자동차의 성능을 속도,안정성,연비순으로 입력하세요"); 
		Scanner sc = new Scanner(System.in);
		int speed = sc.nextInt();
		int stability = sc.nextInt();
		int oil = sc.nextInt();
		
		double speed1= speed*0.5;
		double stability1= stability*0.3;
		double oil1= oil*0.2;
		
		double total = speed1+stability1+oil1;
		System.out.println(total);
		if(total>=80) {
			System.out.println("이차는 매우 우수합니다!");
		}else if(total>=70) {
			System.out.println("이차는 보통입니다!");
		}else {
			System.out.println("이차는 매우 불량합니다!");
		}
	}
}
