/**
 * 2018. 5. 10. Dev by Sim.E.K
   
   FormatSpecifierEx1.java
 */

/**
 * @author Administrator
 *
 */
import java.util.*;
public class FormatSpecifierEx1 {	
	public static void main(String[] args) {
			System.out.printf("%+d%n", 10);
			System.out.printf("%+d%n", -10);
			System.out.printf("����:%,d��%n", 10000000);
			Calendar now = new GregorianCalendar ();
			System.out.printf(
			"%1$tY/%1$tm/%1$td %1$tH:%1$tM:%1$tS %n", now);
			System.out.printf(
			"%1$tY��%1$tm��%1$td�� %1$tp %1$tH��%1$tM��%1$tS�� %n", now);
			System.out.printf(Locale.US, "%tc %n", now);
	}

}
