/**
 * 2018. 5. 18. Dev by Sim.E.K
   chap06
   InterfaceExample2.java
 */
package com.test;

/**
 * @author Administrator
 *
 */
public class InterfaceExample2 {
	public static void main(String[] args) {
		Lendable arr [] = new Lendable[3];
		arr[0] = new SeparateVolume("883��326��2", "Ǫ���� ����", "����");
		arr[1] = new SeparateVolume("609.2��428��", "����̼���", "���긮ġ");
		arr[2] = new AppCDInfo ("2002-1742", "XML�� ���� �ڹ� ���α׷���");
		checkOutAll (arr, "������", "20060315");
		}
	static void checkOutAll (Lendable arr[], String borrower, String date) {
		for (int cnt = 0; cnt < arr.length; cnt++)
			arr[cnt].checkOut(borrower, date);
	}
}
