package 배열;

public class 복사연습 {

	public static void main(String[] args) {
//기본형 변수 복사 했기때문에 '값'이 그대로 복사가 되었다
		int num1=300;
		int num2=100;

		
	int num3=num1;
	
	//num3에 num1값복사
	System.out.println(num1);
	System.out.println(num3);
	
	//num2에 num1값복사
		num2=num1;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
	}

}
