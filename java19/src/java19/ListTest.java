package java19;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		
		list.add("나는 스트링");
		list.add(100);
//		int <---> Integer 자동으로 변환된다
		//int --> Integer --> Object
		// (boxing)     (upcasting)
		
		//int --> Integer (auto-boxing)
		// int <-- Integer (auto-unboxing)
		//박싱은 기초형이 클래스로 되는것
		//언박싱을 클래스를 기초형으로 변환
		
		int num = (int)list.get(1);
		//다운 캐스팅,언박싱
		
		list.add(11.22);
		list.add(true);
		
		
		MemberDTO dto = new MemberDTO("java","java","java","java");
		list.add(dto);
		
		list.remove(3);
		System.out.println(list);
		
	}

}
