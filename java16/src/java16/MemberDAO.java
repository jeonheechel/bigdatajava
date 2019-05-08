package java16;

import java.util.ArrayList;

public class MemberDAO {
	public ArrayList selectAll() {
		
		//dto 3개를 만들어서 list 로묶으세요
		//그 리스트를 리턴
		MemberDTO m1 = new MemberDTO("홍길동","123456","java","010-123-456");
		MemberDTO m2 = new MemberDTO("김길동","456798","jsp","010-789-456");
		MemberDTO m3 = new MemberDTO("이길동","789456","spring","010-852-456");
		
		
		ArrayList list = new ArrayList();
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		
		
		return list;
		
		
	}

}
