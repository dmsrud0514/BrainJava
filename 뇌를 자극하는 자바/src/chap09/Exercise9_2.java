package chap09;

import java.util.concurrent.SynchronousQueue;

public class Exercise9_2 {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		//int index = str1.indexOf("a"); //1���� �ε���
		int index = str1.lastIndexOf("a");
		
		if(index < 0)
			System.out.println("�˻� ����� �����ϴ�.");
		else
	    System.out.println(index + " �ε����� ��ġ�ϰ� �ֽ��ϴ�.");
		
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb);
		
		sb.replace(0, 4, "C#");
		System.out.println(sb);

	}

}
