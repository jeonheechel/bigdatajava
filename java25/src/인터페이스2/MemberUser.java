package 인터페이스2;

public class MemberUser {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		MemberDTO dto = new MemberDTO("kim","kim","kim","kim");
		dao.insert(dto);
		dao.update(dto);
		dao.delete("kim");
		MemberDTO dto2 = dao.select("kim");
	}

}
