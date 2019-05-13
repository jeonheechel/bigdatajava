package java19;

import java.util.HashSet;

public class SetTest {

	public static void main(String[] args) {
		HashSet bag = new HashSet();
		bag.add("휴지");
		bag.add("핸드폰");
		bag.add("지갑");
		
		System.out.println("내가방속에 물건 개수 :"+bag.size()+"개");
		System.out.println(bag);
		
		bag.add("지갑");//자기가 알아서 중복된 값을 정리한다
		System.out.println(bag);
		
		System.out.println("가방에 지갑이 있나요");bag.contains("지갑 ");
		
		
	}

}
