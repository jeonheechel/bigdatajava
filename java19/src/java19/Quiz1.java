package java19;

import java.util.HashMap;

public class Quiz1 {
	
	public static void main(String[] args) {
		HashMap list = new HashMap();
		QuizMember m1 = new QuizMember("해적", "난 해적왕이 된다", "루피", "123456");
		QuizMember m2 = new QuizMember("검사", "난 검호다!", "조로", "123456");
		QuizMember m3 = new QuizMember("의사", "난 의사다!", "쵸파", "123456");
		list.put(100, m1);
		list.put(200, m2);
		list.put(300, m3);
		
		System.out.println(list.get(100));
		System.out.println(list.get(200));
		System.out.println(list.get(300));
		
		
		
	}

}
