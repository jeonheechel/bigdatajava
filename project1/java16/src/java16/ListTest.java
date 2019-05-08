package java16;

import java.util.ArrayList;

public class ListTest {

	public static void main(String[] args) {
		//순서가 중요
		
		ArrayList list =  new ArrayList();
		list.add("박스키");
		list.add("송스키");
		list.add("김스키");
		list.add("정스키");
		
		int size = list.size();
		System.out.println("리스트의 개수는 : "+size+"개");
		System.out.println(list);//to String 오버라이딩 되어있다
		
		list.remove(1);
		System.out.println(list);//to String 오버라이딩 되어있다 박스키 지운것
		
		list.add(1,"뉴인물");
		System.out.println(list);//to String 오버라이딩 되어있다 1번 인덱스에 중간에 삽입하라
		
		list.set(1, "올드인물");//업데이트의 개념이다
		System.out.println(list);//to String 오버라이딩 되어있다 값을 바꿀때에는 set를 쓴다
		
		for (int i = 0; i < list.size(); i++) {//리스트의 사이즈보다 작을때까지 돌겟다
			System.out.println(i+1+"등"+": "+list.get(i));
		}
		
		
//		list.remove(0);
//		System.out.println(list);//to String 오버라이딩 되어있다 박스키 지운것
//		
//		list.remove(1);
//		System.out.println(list);//to String 오버라이딩 되어있다 김스키 지운것
//		
//		list.remove("정스키");
//		System.out.println(list);//to String 오버라이딩 되어있다 김스키 지운것
		
		
		
	}

}
