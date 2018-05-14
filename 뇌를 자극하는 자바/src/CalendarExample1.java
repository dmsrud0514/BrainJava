/**
 * 2018. 5. 14. Dev by Sim.E.K
   
   CalendarExample1.java
 */

import java.util.GregorianCalendar;
import java.util.concurrent.SynchronousQueue;
import java.util.Calendar;
/**
 * @author Administrator
 *
 */
public class CalendarExample1 {
	
	public static void main(String[] args) {
		
		GregorianCalendar calendar = new GregorianCalendar ();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1; //월은 +1을 더해준다.
		int date = calendar.get(Calendar.DATE);
		int amPm = calendar.get(Calendar.AM_PM);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		//int hour = calendar.get(Calendar.HOUR);
		int min = calendar.get(Calendar.MINUTE);
		int sec = calendar.get(Calendar.SECOND);
		
		String sAmPm = (amPm == Calendar.AM) ? "오전" : "오후";
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초", year, month, date, sAmPm, hour, min, sec);

	}

}
