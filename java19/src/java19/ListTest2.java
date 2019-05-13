package java19;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
     ArrayList list = new ArrayList();
     //String (작,자식) => Object(부,크다)
     //자동형변환, 업캐스팅
     list.add("나는 스트링");
     list.add(100);
     list.add(11.11);
     System.out.println(list.get(0));
     System.out.println(list.get(1));
     System.out.println(list.get(2));
     System.out.println(list);
     
     //Object(부,크다) => String (작,자식) 
     //강제형변환, 다운캐스팅
     String name =  (String)list.get(0);
     System.out.println(name);
     int num = (int)list.get(1);
     System.out.println(num);
     double dou = (double)list.get(2);
     System.out.println(dou);
		
     
     
	}

}
