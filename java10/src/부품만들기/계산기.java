package 부품만들기;

public class 계산기 {

	
	//자바는 메소드 이름을 동일하게 할수 있다
	//하나의 이름으로 다양한 형태의 기능을 구현하게 하는 기능이다.
	//다형성(overloading, 오버로딩)=>하나의 이름으로 다양한 형태의 메소드를 여러개 만들수 있다
	
	//add(200, 100)
	public int add(int x, int y) {//인트값 두개만 들어오는 메소드(메소드엔 소괄호가 필수다)
		return x + y;
		
	}
	
	//add(200, 11.11)
	public void add(int x , double y) {
		System.out.println(x + y);
	}
	
	//add("홍길동", 1000): ok
	//add(1000,"홍길동") : not!
	//add("홍길동",) : not!
	//입력값의 개수, 타입, 순서가 중요!!!
	//입력값의 사용되는 변수를 매개변수(파라미터, parameter)
	public void add(String x , int y) {
		System.out.println(x + y);
	}
	
	
	
	
	
}
