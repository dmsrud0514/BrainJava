package chap09;

public class StringExample1 {

	public static void main(String[] args) {
		
		String str = "�ڹ� Ŀ��";
		int len = str.length();
		
		for(int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt); // 0, 1, 2, 3, 4
			System.out.println(ch);
		}
		
		String str1 = new String("Hello, Jvaa");
		String str2 = new String("Hello, Jvaa");
		String str3 = new String("Hello, Jvaa");
		
/*		String str1 = "Hello Java";
		String str2 = "Hello Java";
		*/
		if(str1.equals(str2))
			System.out.println("����");
		else
			System.out.println("�ٸ���");
	}

}
