package control;

import java.util.Scanner;

/*
 * 입력값을 받아서 학점 
 * 계산90이상은 A
 * 80이상 B
 * 70이상 C
 * 60이상 D
 * 그이하는 F
 * 
 */
public class IfTest6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요!!");
	   int grade = sc.nextInt();
	   System.out.println("당신이 입력한 점수는 "+grade);
	   if(grade<=100 && grade>=90){
		   System.out.println("당신의 학점 A입니다 축하해요!!");
	   }else if(grade<90 && grade>=80){
		   System.out.println("당신의 학점 B입니다 축하해요!!");
	   }else if(grade<80 && grade>=70){
		   System.out.println("당신의 학점 C입니다 축하해요!!");
	   }else if(grade<70 && grade>=60){
		   System.out.println("당신의 학점 D입니다 축하해요!!");
	   }else{
		   System.out.println("당신의 학점 F 입니다 공부하세요!");
	   }
	   
		
	}

}
