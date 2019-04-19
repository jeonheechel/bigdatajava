package control;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		char total = name.charAt(0);
		switch(total) {
		case 'A': System.out.println("당신은 최우수 등급");break;
		case 'B': System.out.println("당신은 우수 등급");break;
		case 'C': System.out.println("당신은 보통 등급");break;
		default : System.out.println("해당하지 못했습니다");
		}
		
		
		
	}
}
