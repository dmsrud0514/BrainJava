/**
 * 2018. 5. 15. Dev by Sim.E.K
   chap09
   FiveNumbers.java
 */
package chap09;

import java.util.Random;

/**
 * @author Administrator
 *
 */
public class FiveNumbers {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5}; // 0 ~ 4
		Random random = new Random();
		int index = random.nextInt(5);
		System.out.println(arr[index]);
	}

}
