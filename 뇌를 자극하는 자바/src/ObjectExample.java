/**
 * 2018. 5. 2. Dev by Sim.E.K
   
   ObjectExample.java
 */

/**
 * @author Administrator
 *
 */
public class ObjectExample {

	public static void main(String[] args) {
	
		StringBuffer obj = new StringBuffer("Hey, Java"); // �Ű������� �ִ� ������ ȣ��
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1, 'i');
		
		System.out.println(obj);
		int length = obj.length();
		System.out.println("���ڿ�"+obj+"�� ���̴�:"+length);
		
		// replace �޼ҵ带 ����Ͽ� Hi, Java -> Hello, Java�� ġȯ �� ������.
		
		obj.replace(0, 2, "Hello");
		System.out.println(obj);
	}

}
