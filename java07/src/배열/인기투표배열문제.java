package 배열;

import java.util.Scanner;

public class 인기투표배열문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sing= new String[3];
		int[] num = new int[5]; 
		
		
		for (int i = 0; i < sing.length; i++) {
			System.out.print("가수 이름 입력>>");
			sing[i]= sc.next();
			
		}
		System.out.println();
		for (int j = 0; j < sing.length; j++) {
			System.out.print(j+1+")"+sing[j]+" ");
			
		}
		System.out.println();		
		for (int i = 0; i < num.length; i++) {
			System.out.print("투표번호 >>");
			int abc= sc.nextInt();
			if(abc==1) {
				num[0]++;
				
			}else if(abc==2) {
				num[1]++;
			}else {
				num[2]++;
			}
			
			
		}
		System.out.println(sing[0]+":"+num[0]);
		System.out.println(sing[1]+":"+num[1]);
		System.out.println(sing[2]+":"+num[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
