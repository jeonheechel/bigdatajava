package 인터페이스;

public class CarUser1 {

	public static void main(String[] args) {
		//이렇게 편리하게 가능한 이유는 업캐스팅이기 때문이다!! 중요!(다형성 폴리모피즘) 
		Car car = new MelonCar();//인터페이스로  맞춰놓은것이 굉장히 많다 앞에는 맞춰놓으면 뒤에는 아무렇게나 해도 상관없다 
		//업캐스팅,다형성
		//Car라는 인터페이스로 앞을 맞추어놓고 
		//이것을 구현한 클래스는 다양하게 사용할수 있다
		car.start();
		car.speedUp();
		car.speedDown();
		
	}

}
