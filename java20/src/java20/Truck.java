package java20;

public class Truck extends Car {
	int weight;
	int length;
	 
	public Truck() {
		System.out.println("트럭 객체 생성");
	}

	public Truck(int weight, int length) {
		//super(); 자식클래스 생성시  부모의 기본 생성자를 무조건 호출하게 되어있다 (자동이다)
		this.weight = weight;
		this.length = length;
		//자식 객체 생성시
		//무조건! 부모의 기본 생성자를 호출하게 되어있음
		//[묵시적 호출이다, 자동호출]
		
		
	}

	public Truck(String color, int speed, int weight, int length) {
		super(color, speed);//부모로 넘긴다
		this.weight = weight;
		this.length = length;
		//만약의 부모의 파라메터의 있는 생성자를 호출하고 싶으면
		//수동으로 해줘야 한다 
		//[명시적 호출, 수동호출]
	}
	
	
	
	

}
