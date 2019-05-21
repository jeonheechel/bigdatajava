package 인터페이스2;

public class WaterMelonCar implements Car {

	@Override
	public void start() {
		System.out.println("수박카 겁나게 빨름!!!");
	}

	@Override
	public void speedUp() {
		System.out.println("수박카 순간가속빠름!!!");

	}

	@Override
	public void speedDown() {
		System.out.println("수박카 순간감속빠름!!!");

	}

	@Override
	public void Eat() {
		System.out.println("수박 겁나게 맛잇음");		
	}

}
