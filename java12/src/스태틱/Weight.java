package 스태틱;

public class Weight {

	public static void main(String[] args) {
		Person wei1 = new Person(160,62,"홍길동1","구로");
		Person wei2 = new Person(170,72,"홍길동2","강남");
		System.out.println(wei1);
		System.out.println(wei2);
		
		System.out.println("당신의 몸무게는 홀길동1 : "+wei1.weight);
		System.out.println("당신의 몸무게는 홍길동2 : "+wei2.weight);
		
		System.out.println("홍길동1의 적정 몸무게는 : "+(wei1.height-100)*0.9+"입니다");
		System.out.println("홍길동2의 적정 몸무게는 : "+(wei2.height-100)*0.9+"입니다");
	}

}
