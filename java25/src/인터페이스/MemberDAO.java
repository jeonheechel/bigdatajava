package 인터페이스;

public class MemberDAO implements MemberInterface {
	//문법적으로는 상속이 아니지만 그러나 상속으로 봐도 무리가 없다
	//업캐스팅과 다운캐스팅이 된다 오버라이드도 가능하다
	
	@Override
	public void insert(MemberDTO dto) {

		System.out.println("회원가입");
	}

	@Override
	public void delete(String id) {
		
		System.out.println("회원탈퇴");
	}

	@Override
	public void update(MemberDTO dto) {

		System.out.println("회원수정");
	}

	@Override
	public MemberDTO select(String id) {
		MemberDTO dto = new MemberDTO("park","park","park","park");
		System.out.println("회원검색");
		return dto;
	}
	//반드시 구현해줘야 한다 안그러면 에러가 뜬다
	
	

}
