package 이차원배열;

public class 배열의복사 {

	public static void main(String[] args) {
		int[] num = {1,2,3};//배열(참조형=> 주소값)
		int num2 = 100;//정수(기본형=> 값)
		
		
		
		//변수의 복사(기본형)
		int num3 = num2;
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		num2 = 555;
		System.out.println("num2:"+num2);
		System.out.println("num3:"+num3);
		
		
		
		//배열의 복사(참조,참조형변수)
		//얇은 복사 라고한다 
		int[] num4 = num;
		System.out.println("num[0]:"+num[0]);
		System.out.println("num4[0]:"+num4[0]);
		
		
		num[0] =555;
		System.out.println("num[0]:"+num[0]);
		System.out.println("num4[0]:"+num4[0]);
		
		
		
		
		System.out.println("--------------------");
		//깊은 복사
		int[] num5 = num.clone();
		num[0] = 999;
		System.out.println("num[0]:"+num[0]);
		System.out.println("num5[0]:"+num5[0]);
		
	}

}
