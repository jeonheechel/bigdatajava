package java16;

import java.util.ArrayList;

public class MemberDAOUser {

	public static void main(String[] args) {
		MemberDAO dao = new MemberDAO();
		ArrayList list = dao.selectAll();
		System.out.println(list);
		//멤버리스트를 입력받아 
		//전체 출력
		
		
		for (int i = 0; i < list.size(); i++) {//전체 출력하기
			MemberDTO dto = (MemberDTO)list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getPw());
			System.out.println(dto.getName());
			System.out.println(dto.getTel());
			System.out.println();
			
		}
		
		
	}

}
