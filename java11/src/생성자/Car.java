package 생성자;

public class Car {
	//정적속성
	String color;
	boolean convertible;
	
	
	
	//생성자 단축키:  알트+쉬프트+s+o
	//기본 생성자
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	public Car(String color, boolean convertible) {
		this.color = color;
		this.convertible = convertible;
	}
	//생성자 메소드는 가장 위쪽에 만든다
	//객체생성시마다 자동호출하게 만든것
//	public Car() {
//		System.out.println("객체 생성시 초기화할 처리를 실행.");
//	}
//	//생성자는 여러개를 만든다
//	public Car(String color) {
//		this.color = color;
//	}
//	
//	//				   로컬변수(지역변수)
//	public Car(String color ,boolean convertible ) {
//		//해당(현재) 클래스의 전역변수 써야하는 경우 (this.)이라고 쓴다
//		this.color = color;
//		this.convertible = convertible;
//	}
	

	//동적속성
	public void change() {
		System.out.println("기어 변속!");
	}					   //매개변수라고한다
	public int speedUp(int nowSpeed) {
		return nowSpeed + 30;
	}
	
	// 윈도우=> 프리퍼런스 =>제너럴 키 클릭=> tos 검색 => 에디팅소스자바확인후 원하는 단축키 클릭
	//컨트롤+쉬프트+z
	@Override
	public String toString() {
		return "Car [color=" + color + ", convertible=" + convertible + "]";
	}
	
	
	
	

	
	
	
}

