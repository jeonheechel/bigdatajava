package control;

import java.util.Date;

public class 계절판별 {

	public static void main(String[] args) {
		Date date =new Date();
		int month =date.getMonth()+1;
		
		String result = null;
		
		if(month>=3 && 5>=month) {
			result ="봄";
		}else if(month>=6 && 8>=month) {
			result ="여름";
		}else if(month>=9 && 11>=month) {
			result ="가을";
		}else {
			result ="겨울";
		}
		
		
		System.out.println("지금은 "+month+"월,"+result+"입니다");
	}

}
