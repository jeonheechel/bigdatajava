package java19;

import java.util.ArrayList;

public class ListQuiz1 {
	
	public static void main(String[] args) {
		ArrayList list =  new ArrayList();
		
		list.add("박소정");
		list.add("김정민");
		list.add("소지현");
		list.add("김개념");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"등은 : "+list.get(i)+" 입니다");
			
		}
		System.out.println("2등 탈락!");
		System.out.println();
		list.remove(1);
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+1+"등은 : "+list.get(i)+" 입니다");
			
		}
		
		
		
	}

}


