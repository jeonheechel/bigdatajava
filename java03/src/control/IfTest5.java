package control;

import java.util.Scanner;

public class IfTest5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("두수를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("입력한수는 "+a+"과"+b+"이고 사칙연산을 선택하세요");
		System.out.println("1은 더하기 , 2는빼기 , 3은곱하기 ,4는나누기 ");
		int c = sc.nextInt();
		if(c==1) {
			System.out.println(a+b+"<=a+b더하기의 결과");
		}else if(c==2){
			System.out.println(a-b+"<=a-b빼기의 결과");
		}else if(c==3){
			System.out.println(a*b+"<=a*b곱하기의 결과");
		}else if(c==4){
			System.out.println(a/b+"<=a/b나누기의 결과");
		}else{
			System.out.println("그런 연산자는 보기에 없습니다");
		}
		
	}

}
