package cal;

import java.util.Scanner;


/*------------------------
문제

당신의 이름은 
당신의 나이는
당신의 관심과목은
-----------
xxx님은 ??살이고 ??에 관심있습니다
-------------------------------
 */
public class Test4 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("당신의이름은?");
	String name = sc.next();
	
	System.out.print("당신의태어난 연도는?");
	//String age = sc.next();이렇게 되면 모두다 스트링으로 취급해준다
	
	//이렇게하면 이숫자를 숫자형 변수로 받아온다
	int year = sc.nextInt();
	int age = 2019- year + 1;
	
	
	System.out.print("당신의관심과목은?");
	String cs =sc.next();
	
	System.out.println("----------출력------------");
	System.out.println("당신은"+name+"님이고 "
	+age+"살이고 "+cs+"에 관심있습니다!");
	
	System.out.println("정확한 나이는"+age);
	
	}
}
