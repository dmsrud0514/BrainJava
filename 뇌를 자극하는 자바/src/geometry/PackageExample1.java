/**
 * 2018. 5. 11. Dev by Sim.E.K
   geometry
   PackageExample1.java
 */
package geometry;

/**
 * @author Administrator
 *
 */
public class PackageExample1 {

	
	public static void main(String[] args) {
	Circle obj = new Circle(5);
	System.out.println("반지름 = " + obj.radius);
	System.out.println("면적 = " + obj.getArea());

	}

}
