package control;

import java.util.Date;

public class Quiz1 {

	public static void main(String[] args) {
		Date date =new Date();
		int day = date.getDay();
		int day1 = day+1;
		System.out.println(day1);
		
		switch(day1) {
		case 1: System.out.println("일요일입니다~ 집에서 쉬는날");break;
		case 2: System.out.println("월요일입니다~ 학원 가는날");break;
		case 3: System.out.println("화요일입니다~ 학원 가는날");break;
		case 4: System.out.println("수요일입니다~ 학원 가는날");break;
		case 5: System.out.println("목요일입니다~ 학원 가는날");break;
		case 6: System.out.println("금요일입니다~ 학원 가는날");break;
		default : System.out.println("토요일입니다~ 외출 하는날");break;
		}
	}

}
