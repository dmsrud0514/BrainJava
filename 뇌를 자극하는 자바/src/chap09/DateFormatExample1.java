/**
 * 2018. 5. 14. Dev by Sim.E.K
   chap09
   DateFormatExample1.java
 */
package chap09;

import java.util.*;
import java.text.*;

/**
 * @author Administrator
 *
 */
public class DateFormatExample1 {
	public static void main(String[] args) {
		
		GregorianCalendar calendar = new GregorianCalendar ();
		//SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy�� MM�� dd�� EEEE aa hh�� mm�� ss��");
		SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MMM-dd a hh:mm:ss");
		String str = dateFormat.format(calendar.getTime());
		System.out.println(str);
	}

}
