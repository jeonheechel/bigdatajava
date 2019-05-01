package 스태틱;

public class 시계 {

	public static void main(String[] args) {
		Clock watch1 = new Clock(15000,"김시계",15,"삼성");
		Clock watch2 = new Clock(12000,16,"엘지");
		Clock watch3 = new Clock(16000,"현대");
		//문제1
		System.out.println(watch1);
		System.out.println(watch2);
		System.out.println(watch3);
		
		//문제2
		System.out.println("회사>"+watch1.company+" 가격>>"+watch1.price);
		System.out.println("회사>"+watch2.company+" 가격>>"+watch2.price);
		System.out.println("회사>"+watch3.company+" 가격>>"+watch3.price);
	}

}
