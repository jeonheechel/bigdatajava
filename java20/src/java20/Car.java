package java20;

public class Car {
	String color;
	int speed;
	
	
	public Car() {//기본생성자와 같이 만들어야 한다
		System.out.println("카 객체생성");
		
	}
	
	public Car(String color, int speed) {//파라미터 생성자 자동호출되지않는다 내가불러줘야 한다
		super();
		this.color = color;
		this.speed = speed;
	}
	
	
	
	
	

}
