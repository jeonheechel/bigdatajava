package control;

import java.util.Date;

public class 계절판별2 {

	public static void main(String[] args) {
		Date date =new Date();
		int month =date.getMonth()+1;
		
		//String result = null;
		String result = "";
		
		switch(month) {
		case 3 : case 4 :case 5 :
			result ="봄입니다~"; break;
		case 6 : case 7 :case 8 :
			result ="여름입니다~"; break;
		case 9 : case 10 :case 11 :
			result ="가을입니다~"; break;
//		case 12 : case 1 :case 2 :
//			result ="겨울입니다~"; break;
		default:
			result ="겨울입니다~"; break;
		}
		
		
		System.out.println("지금은 "+month+"월,"+result+"입니다");
	}

}
