package chap09;

import java.util.concurrent.SynchronousQueue;

public class StringBuilderExample1 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder ("���縦 �ϳ��� �Ƕ��� �Ĵٰ� ");
		//StringBuilder sb = new StringBuilder ("���縦");
		//sb.ensureCapacity(50);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb);
		System.out.println(sb.append("Ŀ�ٶ� ���ε��� ������ ������� ����"));
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.insert(26, "�ϳ�"));
		System.out.println(sb.delete(21,23)); //21��° �ε������� 23��° �ε��� -1����
		System.out.println(sb.deleteCharAt(9));
		
		System.out.println(sb.capacity());
		
		sb.replace(20, 22, "���ε�");
		System.out.println(sb);
		
		sb.trimToSize();
		System.out.println(sb.capacity());
		
	/*	 sb.reverse();
		 System.out.println(sb);
		 
		 sb.reverse();
		 System.out.println(sb);*/
		 
		 
	}
}
