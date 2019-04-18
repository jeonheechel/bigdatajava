package control;

import java.util.Random;
import java.util.Scanner;

/*
 * 숫자 추측 게임
 */
public class IfTest8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int target = random.nextInt(100);
		int count=0;
		while(true){
			//int count=0;//while를 시작할때마다 카운트를 0으로 만든다
			 count+=1;//한바퀴돌때마다 카운트 값을 더해준다
			System.out.print("당신이 생각한 숫자를 입력하세요>>");
			int guess = sc.nextInt();
			if(target==guess){
				System.out.println("정답입니다!");
				System.out.println("당신이 시도한 횟수는?"+count);
				break;//정답일경우 while문을 끝내줘라는 뜻이다
			}else{
				System.out.println("정답이 아닙니다");
				System.out.println("다시 입력해주세요");
				if(target < guess){
					System.out.println("정답보다 너무큽니다");
					
				}else{
					System.out.println("정답보다 너무작아요");
				}
			}
			
		}//while end
		//System.out.println(count);//while안에 만들었기때문에 안에서만 쓸수있다
	   
	   
		
	}

}
