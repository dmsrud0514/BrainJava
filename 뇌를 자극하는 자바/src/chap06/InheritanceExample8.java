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
		EmailSender obj1 = new EmailSender("생일을 축하합니다", "고객센터", 
				"admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		
		SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터", 
				"admin@dukeeshop.co.kr", "10% 할인쿠폰이 발행되었습니다.");
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-000-0000");

	}

}
