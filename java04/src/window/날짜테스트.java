package window;

import java.util.Date;

public class 날짜테스트 {
	
	public static void main(String[] args) {
	
		Date date =new Date();
		int hour = date.getHours();
		System.out.println("현재몇시"+hour);
		int min = date.getMinutes();
		System.out.println("현재몇분"+min);
		int sec = date.getSeconds();
		System.out.println("현재몇초"+sec);
				
	}


}
