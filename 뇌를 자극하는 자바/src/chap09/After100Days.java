/**
 * 2018. 5. 15. Dev by Sim.E.K
   chap09
   Calendar cal = Calendar.getInstance();
   cal.setTime(new Date()); // ����ð� ����
   cal.add(Calendar.DATE, 2);
   cal.add(Calendar.MONTH, 2);
 
 */
package chap09;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class After100Days {

	/**
	 * @���ú��� 100������ ��¥.
	 *
	 */
	public static void main(String[] args) {
	
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(new Date()); // ����ð� ����
	calendar.add(Calendar.DATE,100);
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
	String date = dateFormat.format(calendar.getTime());
	
	System.out.println(date);
	
/*
 * GregorianCalendar gcalendar = new GregorianCalendar(); 
 * gcalendar.add(gcalendar.DATE, 5); 
 * System.out.println(gcalendar.getTime()); 
 */
	}

}
