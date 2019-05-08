package java16;

import java.util.ArrayList;

public class BbsDAOUser2 {

	public static void main(String[] args) {
		BbsDAO2 dao = new BbsDAO2();
		ArrayList list = dao.selectAll();
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {//전체 출력하기
			BbsDTO dto = (BbsDTO)list.get(i);
			System.out.println(dto.getId());
			System.out.println(dto.getTitle());
			System.out.println(dto.getContent());
			System.out.println(dto.getEtc());
			System.out.println();
			
		}
		
		
		
		
	}

}
