/**
 * 2018. 5. 17. Dev by Sim.E.K
   chap06
   InheritanceExample8.java
 */
package chap06;

/**
 * @author Administrator
 *
 */
public class InheritanceExample8 {
	public static void main(String[] args) {
		EmailSender obj1 = new EmailSender("������ �����մϴ�", "������", 
				"admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		
		SMSSender obj2 = new SMSSender("������ �����մϴ�", "������", 
				"admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");

	}

}
