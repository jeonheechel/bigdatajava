package 배열까지정리문제;

import java.util.Scanner;

public class 동아리Quiz1 {

	public static void main(String[] args) {
			
			
			
			
			
			
			
			Scanner sc = new Scanner(System.in);
				
		System.out.println("동아리 명단의 이번학기 성적입니다");
		System.out.println();
		System.out.println("이름          학년        학점");
		String[] names= {"김아무개","박아무개","송아무개","정아무개","장아무개"}; 
		char[] grade= {65,66,67,65,66};
		int[] level= {1,2,3,1,1};
		
		System.out.println("------------------------------------");
		//명단 프린트
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름:   "+names[i]+"   학년:     "+level[i]+"    학점:       "+grade[i]);
		}
		
		//학년별 인원수
		int[] a1 =  new int[4];
		for (int i = 0; i < level.length; i++) {
			if(level[i]==1) {
				 a1[0]=level[i];
			}else if(level[i]==2) {
				 a1[1]=level[i];
			}else {
				a1[2]=level[i];
			}
		}
		System.out.println("1학년:"+a1[0]+"명");
		System.out.println("2학년:"+a1[1]+"명");
		System.out.println("3학년:"+a1[2]+"명");
		System.out.println("4학년:"+a1[3]+"명");
		
		System.out.println();
		
		//학점별 인원수 프린트
		int[] b1 = new int[4];
		for (int i = 0; i < grade.length; i++) {
			if(grade[i]==65) {
				b1[0]++;
			}else if(grade[i]==66) {
				b1[1]++;
			}else {
				b1[2]++;
			}
		}
		for (int i = 0; i < b1.length; i++) {
			
			System.out.println((char)(65+i)+"학점"+b1[i]+"명");
		
			
		}
		
		//위치를 찾아 출력
		System.out.print("위치를 찾고 싶은 이름 입력>>");
		String names2 = sc.next();
		
		int idx = -1;
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(names2)) {
				idx = i;
				System.out.println(idx);
			}
		}
		
		
		
			
		//위치를 찾아  모든정보 출력
		System.out.print("정보를 찾고 싶은 이름 입력>>");
		String names3 = sc.next();
		//int idxname = -1;
		for (int i = 0; i < names.length; i++) {
			if(names[i].equals(names3)) {
				//아예 2번이 된거다
				idx = i;
				
				
				System.out.println(idx);
				System.out.println("학년은?"+level[idx]);
				System.out.println("성적은?"+grade[idx]);
			}
			
			
		}
		
		
		
		
		
	}

}
