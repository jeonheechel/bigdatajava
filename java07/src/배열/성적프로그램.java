package 배열;

import java.util.Scanner;

public class 성적프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] names = new String[3];
		int[] java = new int[3]; 
		int[] spring = new int[3]; 
//		int minja=java[0];
//		int minsp=spring[0];
//		String name1="";
//		String name2="";
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("학생이름>>");
			names[i]= sc.next();
			System.out.print("학생점수(자바)>>");
			java[i]= sc.nextInt();
			System.out.print("학생점수(스프링)>>");
			spring[i]= sc.nextInt();
			//int minsp=spring[0];
		}
		System.out.println();
		System.out.println("============================");
		
		for (String i : names) {
			System.out.print(" 학생의 이름은 "+i+"  ");
		}
		System.out.println();
		
		int minja=java[0];
		for (int  i= 0; i < java.length; i++) {
			if(java[i]>minja) {
				minja=java[i];
			}
		}
		
		int minsp=spring[0];
		for (int i = 0; i < spring.length; i++) {
			if(minsp>spring[i]) {
				minsp=spring[i];
			}
		}
		for (int j = 0; j < java.length; j++) {
			
			if(java[j]==minja) {
				//name1=names[j];
				System.out.println("학생들중 가장높은 자바점수는"+minja+names[j]+"입니다");
			}
		}
		for (int j = 0; j < spring.length; j++) {
			
			if(spring[j]==minsp) {
				//name2=names[j];
				System.out.println("학생들중 가장낮은 스프링점수는"+minsp+names[j]+"입니다");
			}
		}
			
		
		//System.out.println("학생들중 가장 높은 자바 점수는 "+minja+"("+name1+")");
		//System.out.println("학생들중 가장 낮은 스프링 점수는 "+minsp+"("+name2+")");
		
		
	}

}
