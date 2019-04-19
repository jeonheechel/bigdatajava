package control;

import java.util.Random;
import java.util.Scanner;

public class 랜덤테스트 {
	//가위 바위 보 텍스트 버젼
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int me = sc.nextInt();
		String me1=null;
		
		Random random = new Random();
		System.out.println(random.nextInt(3));
		  int you = random.nextInt(3);
		  String you1=null;
		  
		  switch(me) {
		  case 0 : me1="가위"; break;
		  case 1 : me1="바위"; break;
		  case 2 : me1="보"; break;
		  default : System.out.println("0~2사이이의 숫자만 넣어주세요");
		  }
		  
		  System.out.println("나"+me1);
		  
		  switch(you) {
		  case 0 : you1="가위"; break;
		  case 1 : you1="바위"; break;
		  case 2 : you1="보"; break;
		  }
		  
		  System.out.println("컴퓨터"+you1);
		  
		  if(me1.equals("가위") && you1.equals("바위") || me1.equals("바위") && you1.equals("보") || me1.equals("보") && you1.equals("가위")) {
			  System.out.println("컴퓨터가 이겻습니다");
		  }else if(me1.equals("바위") && you1.equals("가위") || me1.equals("보") && you1.equals("바위") || me1.equals("가위") && you1.equals("보")) {
			  System.out.println("내가 이겻습니다");
		  }else {
			  System.out.println("비겻습니다!!!");
		  }
		
		
		
		
	}


}
