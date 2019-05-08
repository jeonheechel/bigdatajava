package java15;

import java.util.Vector;

public class CollectionTest {

	public static void main(String[] args) {
		Vector datalist = new Vector();
		//아무타입이나 다집어 넣을수 있다
		datalist.add("hello");
		datalist.add(100);
		datalist.add(11.22);
		datalist.add(true);
		datalist.add('a');
	
		
		System.out.println(datalist.size() +"개");//몇개인지 알려주는애이다
		System.out.println(datalist);//toString() 이 오버라이딩 되어있다
		
		datalist.remove(0);
		
		
		System.out.println(datalist.size() +"개");//몇개인지 알려주는애이다
		System.out.println(datalist);//toString() 이 오버라이딩 되어있다
	}

}
