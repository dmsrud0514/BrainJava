/**
 * 2018. 5. 2. Dev by Sim.E.K
   
   Circle.java
 */

 /** 
  * @author Administrator 
  * 
  */ 
public class Circle {
	public int radius;
	public String name;
	
	// �Ű����� ���� ������
	public Circle() {
			this.radius = 1;
			this.name = "";
	}
	
	// �Ű������� ���� ������
	public Circle(int radius, String name) {
		this.radius = radius;
		name = name;
	}
	
	// �޼ҵ�
 	public double getArea() {
 		return 3.14 * radius * radius;
 	}
 
 	// ���Ӹ޼ҵ�
	public static void main(String[] args) {
		
		Circle pizza = new Circle(10, "�ڹ�����");
		double pizza_area = pizza.getArea();
		System.out.println(pizza.name + "�� ������ " + pizza_area);
/*		
		Circle donut = new Cricel(); //�Ű����� ���� ������
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		
		double donut_area = donut.getArea();
		System.out.println(donut.name + "�� ������ " + donut_area);
		System.out.println(pizza.name + "�� ������ " + pizza_area);
		*/
	}
}

