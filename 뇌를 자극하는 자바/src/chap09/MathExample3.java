/**
 * 2018. 5. 15. Dev by Sim.E.K
   chap09
   MathExample3.java
 */
package chap09;

/**
 * @author Administrator
 *
 */
public class MathExample3 {

	public static void main(String[] args) {
		
	for(int i=1; i<=6; i++) {
		double randomValue = Math.random();
		int value = (int)(randomValue * 10)+1;
		System.out.println(i + "번째 난수:" + value);

	}
//		System.out.println(Math.random());
//		System.out.println(Math.random());
//		System.out.println(Math.random());
		
	}

}
