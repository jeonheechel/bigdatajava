package 생성자;

public class Tour {
		 //객체생성하지않아도 그냥호출가능
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.color = "검정색";
		car1.convertible = true;
		System.out.println(car1);
		
		
		car1.change();
		int exSpeed = car1.speedUp(100);
		System.out.println(exSpeed+"로 달려요!");
		
		//객체생성시마다 자동호출하게 만든것
		System.out.println();
		Car car2 = new Car("빨강색", false );
		System.out.println(car2);
		
		System.out.println();
		Car car3 = new Car("노랑");
		System.out.println(car3);
	}
}
