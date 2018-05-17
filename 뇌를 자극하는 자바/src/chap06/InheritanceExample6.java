/**
 * 2018. 5. 17. Dev by Sim.E.K
   chap06
   InheritanceExample6.java
 */
package chap06;

abstract class MessageSender {
	
	String title;
	String senderName;
	
	public MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient);
	
}

class EmailSender extends MessageSender {
	String senderAddr;
	String emailBody;
	
public EmailSender(String title, String senderName, String senderAddr, String emailBody) {
		super(title, senderName);
		this.senderAddr = senderAddr;
		this.emailBody = emailBody;
	}

@Override
void sendMessage(String recipient) {	


		System.out.println("-----------------------------------------------");
		System.out.println("����: " + title);
		System.out.println("������ ���: " + senderName +
							" " + senderAddr);
		System.out.println("�޴� ���: " + recipient);
		System.out.println("����: " + emailBody);
	}

}
	class SMSSender extends MessageSender {
		String returnPhoneNo;
		String message;
		SMSSender(String title, String senderName,
				  String returnPhoneNo, String message) {
			super(title, senderName);
			this.returnPhoneNo = returnPhoneNo;
			this.message = message;
		}
		void sendMessage (String recipient) {
			System.out.println("-----------------------------------------------");
			System.out.println("����: " + title);
			System.out.println("������ ���: " + senderName);
			System.out.println("��ȭ��ȣ: " + recipient);
			System.out.println("ȸ�� ��ȭ��ȣ: " + returnPhoneNo);
			System.out.println("�޽��� ����: " + message);
			}
	}
	

public class InheritanceExample6 {

	public static void main(String[] args) {
		
//		EmailSender emailSender = new EmailSender("������ �����մϴ�", "������", "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
//		emailSender.sendMessage("hatman@yeyeye.com");
//		emailSender.sendMessage("stickman@hahaha.com");
		
		MessageSender messageSender = new EmailSender("������ �����մϴ�", "������", "admin@dukeeshop.co.kr", "10% ���������� ����Ǿ����ϴ�.");
		messageSender.sendMessage("gkdldks12345@naver.com");
	}
	

}
