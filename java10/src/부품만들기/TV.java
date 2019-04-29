package 부품만들기;

public class TV {
//	TV => class
//	- (정적특성): 전원버튼유무, 사이즈, 색깔 => 멤버변수 
	boolean power;
	int size;
	String color;
//	- (동적특성): 채널변경하다., 소리를조절하다., 잭연결하다. => 멤버메소드메소드
	//public 전부 공용으로 쓸수있다, private 클래스 이내에서만 쓸수있다
	public void changeCh() {
		System.out.println("채널변경하다!");
	}
	public void sound() {
		System.out.println("소리를 조절하다!");
	}
	public void connect() {
		System.out.println("잭을 연결하다!");
	}
	
	@Override//재정의
		public String toString() {//스트링으로 바꿔줘 라는것이다
			return power + " " + size + " " + color;
		}
	
}
