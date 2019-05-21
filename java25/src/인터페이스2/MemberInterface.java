package 인터페이스2;

public interface MemberInterface {
	//강제성있는 기능정의를 추상 메소드로 정의
	//구현하지 않고 기능만 정의한다
	//일반 변수 사용 불가,일반 메소드 사용불가
	//상수(final)은 사용가능하다. 권장사양은 아니다
	// 추상 <-->구체
	//추상 : 불완전하다라는 의미가 있다
	//인터페이스는 객체를 생성하여 쓸수없다
	//public abstract(추상)  디폴트 값이다
	//인터페이스는 무조건 public 이다!
	public abstract void insert(MemberDTO dto);
	public abstract void delete(String id);
	public abstract void update(MemberDTO dto);
	public abstract MemberDTO select(String id);
		
	
}
