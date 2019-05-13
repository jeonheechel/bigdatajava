package java19;

import java.util.HashMap;

public class MapQuiz1 {

	public static void main(String[] args) {
		
		
		HashMap hm = new HashMap();
		
		hm.put(100, "김데이");
		hm.put(200, "김사전");
		hm.put(300, "김구조");
		hm.put(400, "김자료");
		
		System.out.println("고객: "+hm.get(100));
		System.out.println("고객: "+hm.get(200));
		System.out.println("고객: "+hm.get(300));
		System.out.println("고객: "+hm.get(400));
		
		
		
		hm.remove(200);
		hm.put(300, "김충성");
		System.out.println("고객: "+hm.get(100));
		System.out.println("고객: "+hm.get(300));
		System.out.println("고객: "+hm.get(400));
		
		
		
	}

}
