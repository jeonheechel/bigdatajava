package 인터페이스2;

public class MelonCar implements Car {

	@Override
	public void start() {
		System.out.println("메론카 겁나게 빨름!!!");
	}

	@Override
	public void speedUp() {
		System.out.println("메론카 순간가속빠름!!!");

	}

	@Override
	public void speedDown() {
		System.out.println("메론카 순간감속빠름!!!");

	}

	@Override
	public void Eat() {
		
	}
	

}
