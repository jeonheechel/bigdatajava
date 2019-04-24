package 배열;

import javax.swing.JButton;

public class 스트링배열 {

	public static void main(String[] args) {
System.out.println("foreach문");
		//int배열이다
		int[] ages = {50,100,10};
		for (int i : ages) {
			System.out.println(i);
		}
		
		System.out.println("==========================");
		//names에는{"홍길동","박길동","김길동"} 가르키는 주소값이 들어가있다
		String[] names = {"홍길동","박길동","김길동"};
		names[2] = "김동길";
		names[names.length-1] = "김동순"; 
		//names[0],names[1],names[2],에 케릭터 배열을 가르키는 주소값이 들어가 있다
		 
		
		 for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
		}
		 for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		 
		 System.out.println("========================");
		 System.out.println("foreach문");
		 //foreach문 하나씩에 해당한다
		 //0부터시작해서 1씩증가한다 임시변수에 하나씩넣고 순서대로 출력한다
		
			
		
		 
		 for (String imsi : names) {
			System.out.println(imsi);
		}
		 
		 
		
		
		//제이버튼을 100개를 만들것 배열로
		//JButton[] buttons = new JButton();
		
		
		
	}

}







