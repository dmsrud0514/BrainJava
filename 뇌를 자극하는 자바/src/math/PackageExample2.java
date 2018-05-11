/**
 * 2018. 5. 11. Dev by Sim.E.K
   math
   PackageExample2.java
 */
package math;

import geometry.polygon.Rectangle;
// import geometry.polygon.*;

/**
 * @author Administrator
 *
 */
public class PackageExample2 {


	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle(2, 3);
		System.out.println("≥–¿Ã : " + rectangle.width);
		System.out.println("≥–¿Ã : " + rectangle.height);
		System.out.println("≥–¿Ã : " + rectangle.getArea());
	
	}

}
