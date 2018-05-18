package chap06;

public interface Lendable {

	// ����ʵ�
	final static byte STATE_BORROWED = 1; // ���� ��
				 byte STATE_NORMAL = 0;	  // ������� ���� ����
	
	// �߻�޼ҵ�
	abstract void checkOut (String borrower, String date); throws Exception; // �����ϴ� ��� 
	abstract void checkIn ();							   // �ݳ��ϴ� ���
}
