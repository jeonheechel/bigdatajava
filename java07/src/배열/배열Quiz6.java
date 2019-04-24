package 배열;

import java.util.Scanner;

public class 배열Quiz6 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int[] num =  new int[4];
//		for (int i = 0; i < num.length; i++) {
//			System.out.println("4가지수입력>>");
//			num[i] = sc.nextInt();
//				
//		}
//		int su = 0;
//		for (int i : num) {
//			su =i; 
//			System.out.println(su);
//			if(su>=99) {
//				System.out.println("최대값은 "+su+"입니다");
//			}else {
//				System.out.println("최대값이 없습니다");
//			}
//		}
		
		int[] num = {66,77,88,99};
		
		//최소값 구하기
		int min=num[0];//첫번째값 넣고 for문안에서 if문으로 비교
		for (int i = 0; i < num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
			
			//최대값 구하기
//			int min=num[0];//첫번째값 넣고 for문안에서 if문으로 비교
//			for (int i = 0; i < num.length; i++) {
//				if(num[i]>min) {
//					min=num[i];
//				}
//		}
//		System.out.println(min);
		
		
		}
		System.out.println(min);

	}
}
