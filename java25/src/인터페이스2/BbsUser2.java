package 인터페이스2;

import java.util.Scanner;

public class BbsUser2 {

	public static void main(String[] args) {
		BbsDAO dao = new BbsDAO();
		BbsDTO dto = new BbsDTO("kim","kim","kim","kim");
		dao.insert(dto);
		dao.update(dto);
		dao.delete("kim");
		BbsDTO dto2 = dao.select("kim");
		
		
	
	}

}
