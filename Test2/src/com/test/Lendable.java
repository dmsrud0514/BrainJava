package com.test;

public interface Lendable {

	// �߻�޼ҵ�
	abstract void checkOut (String borrower, String date); // �����ϴ� ��� 
	abstract void checkIn ();							   // �ݳ��ϴ� ���
}
