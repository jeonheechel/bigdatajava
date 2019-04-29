package 부품만들기;

public class Phone {
//	전화기=> class (phone)클래스가 가지고 있는것
//	-특징(attribute,property)특징,특성,속성
//	두가지 특성을 가지고 있다
//	- (정적특성): 모양,크기,제조회사 => 많은 변수중에서 속성에 값을 나타내는 멤버변수 라고부른다 
	String shape;
	int size;
	String company;
	
//	- (동적특성): 전화하다,문자보내다,알람을맞추다 => 멤버메소드
	public String call() {//이메서드를 쓰면 전화하다가 나온다
		//System.out.println("전화하다!!!");
		return "친구님";
	}
	public void text() {//이메서드를 쓰면 문자하다가 나온다
		System.out.println("문자하다!!!");
	}
	public int alarm() {//이메서드를 쓰면 알람을하다가 나온다
		return 1;
	}
	//자동생성법  소스=> 제너레이트 투스트링
	@Override//재정의
	public String toString() {
		return " [shape=" + shape + ", size=" + size + ", company=" + company + "]";
	}
	
	//자동생성법 
	
	

}
