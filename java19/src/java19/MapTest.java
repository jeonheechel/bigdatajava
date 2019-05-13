package java19;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {

		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "동생");
		phone.put(4, "친구");
		System.out.println(phone);
		
		System.out.println(phone.get(1));
		System.out.println(phone.get(2));
		System.out.println(phone.get(3));
		System.out.println(phone.get(4));
		
		
	}

}
