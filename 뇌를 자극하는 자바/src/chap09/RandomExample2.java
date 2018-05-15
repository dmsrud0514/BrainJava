/**
 * 2018. 5. 15. Dev by Sim.E.K
   chap09
   RandomExample2.java
 */
package chap09;

import java.util.*;

/**
 * @author Administrator
 *
 */
public class RandomExample2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date.getTime());
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		System.out.println(gcalendar.getTimeInMillis());
		
		Random random = new Random(gcalendar.getTimeInMillis());
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
		System.out.println(random.nextInt(100));
	}

}
