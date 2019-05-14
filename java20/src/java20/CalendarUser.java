package java20;

import java.util.Calendar;

public class CalendarUser {
	static String month;
	static String ampm;
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		
		
		
		// 기본적으로 현재날짜와 시간으로 설정된다.
        System.out.print( today.get(Calendar.YEAR)+"년 ");
        System.out.print( today.get(Calendar.MONTH)+1+"월");
        System.out.println(  today.get(Calendar.DATE)+"일");
        switch (today.get(Calendar.DAY_OF_WEEK)) {
        case 1: month = "일"; break;
        case 2: month = "월"; break;
        case 3: month = "화"; break;
        case 4: month = "수"; break;
        case 5: month = "목"; break;
        case 6: month = "금"; break;
        case 7: month = "토"; break;
        }
        System.out.println(month +"요일입니다");

       if(today.get(Calendar.AM_PM)==0) {
    	   System.out.println("오전!");
       }else {
    	   System.out.println("오후");
       }
       System.out.print( today.get(Calendar.HOUR_OF_DAY)+"시");
       System.out.print( today.get(Calendar.MINUTE)+"분");
       System.out.print(today.get(Calendar.SECOND)+"초");


       
        


     


		
		
	}
	
	

}
