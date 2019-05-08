package java16;

import java.util.ArrayList;

public class BbsDAO {

	public ArrayList selectAll() {

		BbsDTO b1 = new BbsDTO("100","java","fun java","fun");
		BbsDTO b2 = new BbsDTO("200","jsp","fun java","fun");
		BbsDTO b3 = new BbsDTO("300","spring","fun java","fun");
		BbsDTO b4 = new BbsDTO("400","android","fun java","fun");
		
		ArrayList list = new ArrayList();
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		return list;
		
//		System.out.println(list);
//		
//		System.out.println(list.get(0));
//		BbsDTO dto = (BbsDTO)list.get(0);//이렇게 해야 에러가 발생하지 않는다.   업캐스팅 다운캐스팅 개념이다
//		System.out.println(dto.getId());
//		System.out.println(dto.getTitle());
//		System.out.println(dto.getContent());
//		System.out.println(dto.getEtc());
//		
//		
//		System.out.println();
//		
//		//마지막거 꺼내기
//		BbsDTO dto4 = (BbsDTO)list.get(3);
//		System.out.println(dto4.getId());
//		System.out.println(dto4.getTitle());
//		System.out.println(dto4.getContent());
//		System.out.println(dto4.getEtc());
		
	}

}
