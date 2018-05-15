/**
 * 2018. 5. 15. Dev by Sim.E.K
   chap09
   RandomExample9_6.java
 */
package chap09;

import java.util.*;

/**
 * @author Administrator
 *
 */
public class RandomExample9_6 {
	public static void main(String[] args) {
		
		GregorianCalendar gcalendar = new GregorianCalendar();
		//System.out.println(gcalendar.getTimeInMillis());
		int frontCount = 0, backCount = 0;
		Random random = new Random(gcalendar.getTimeInMillis());
		
		for(int i=1; i<=10; i++) {
			
			int randomValue = random.nextInt(2);
			
			if(randomValue == 0) {
				frontCount++;
				System.out.println("¾Õ¸é     ");
			} else {
				backCount++;
				System.out.println("µÞ¸é      ");
			}
			System.out.println(randomValue);
			}
		System.out.println("µ¿Àü¾Õ¸é:"+ frontCount + "     " + "µ¿ÀüµÞ¸é:" + backCount);	
	}
}
