/**
 * 2018. 5. 3. Dev by Sim.E.K
   
   personInfo.java
 */

/**
 * @author Administrator
 *
 */
public class personInfo {

	public static void main(String[] args) {
	
		// Ŭ���� ����
		Person obj;
		
		// �Ű����� ���� ����Ʈ ������ ȣ���Ͽ� ��ü����
		//person = new Person();
		
		// String �Ű����� 1�� �ִ�  ������ ȣ���Ͽ� ��ü����
		//person = new Person("ȫ�浿");
	
		// String �Ű����� int �Ű����� �ִ�  ������ ȣ���Ͽ� ��ü����
		//person = new Person("ȫ�浿", 20);
		
		// int �Ű����� String �Ű����� �ִ�  ������ ȣ���Ͽ� ��ü����
		obj = new Person(20, "ȫ�浿");
		
		//�޼ҵ� ȣ��
		obj.showPerson(obj);
		obj.showPerson();
		
		//System.out.println(obj);
	}

}
