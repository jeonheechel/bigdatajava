package java20;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarTest {
	
	public static void main(String[] args) {
        Calendar cal = Calendar.getInstance(); //static메소드를 통해 Calendar 객체 획득.
        System.out.println(cal.get(Calendar.YEAR)); //연도
        System.out.println(cal.get(Calendar.MONTH)+1); //달
        System.out.println(cal.get(Calendar.DATE)); //날(일)
        System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //요일
        System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //올해 몇일 째
        System.out.println(cal.get(Calendar.WEEK_OF_YEAR)); //올해 몇주째
        System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //이번주 중 몇일째
        System.out.println(cal.get(Calendar.HOUR)); //시각
        System.out.println(cal.get(Calendar.MINUTE)); //분
        System.out.println(cal.get(Calendar.SECOND)); //초
    }
//	public static Calendar getInstance()
//    {
//        return createCalendar(TimeZone.getDefault(), Locale.getDefault(Locale.Category.FORMAT));
//    }

}
