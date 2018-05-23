/**
 * 2018. 5. 23. Dev by Sim.E.K
   chap06
   Rectangle.java
 */
package chap06;

/**
 * @author Administrator
 *
 */
public class Rectangle implements Transformable {
	int x, y, width, height;
	Rcetangle (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void resize (int width, int height){
		this.width = width;
		this.height = height;
	}
	public void moveTo (int x, int y){
		this.x = x;
		this.y = y;
	}
	public void moveTo (int xOffset, int yOffset){
		this.x += xOffset;
		this.y += yOffset;
	}
}
