package control;

import java.util.Date;

public class 월별날짜판별3 {

	public static void main(String[] args) {
		Date date =new Date();
		int month =date.getMonth()+1;
		
		//String result = null;
		String result = "";
		
		switch(month) {
		case 2:
		System.out.println("28일까지 있어요");
		break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까지 있어요");
			break;
		default:
		System.out.println("31일까지 있습니다");
		}
		
//		if(month == 2) {
//			result = "28일 까지있는 달입니다"; 
//		}else if(month ==4 || month ==6 || month ==9 || month==11) {
//			result = "30일 까지있는 달입니다";
//		}else {
//			result = "31일 까지있는 달입니다";
//		}
		
		
		
		System.out.println("지금은 "+month+"월,"+result+"입니다");
	}

}
