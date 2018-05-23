package com.test;

class BounsPointAccount extends Account {
	int bounsPoint;
	 BounsPointAccount (String accountNo, String ownerName, int balance, int bounsPoint) {
		 super (accountNo, ownerName, balance);
		 this.bounsPoint = bounsPoint;
	 }
	@Override
	void deposit(int amount) {
		// TODO Auto-generated method stub
		balance += amount; //super.deposit(amount);
		bounsPoint += (int) (amount * 0.001);
		
	}
}
public class InheritanceExample4 {
	
	public static void main(String[] args) {
		BounsPointAccount obj = new BounsPointAccount("333-33-333333", "김미영", 0, 0);
		obj.deposit(1000000);
		System.out.println("잔액:" + obj.balance);
		System.out.println("누적 포인트:" + obj.bounsPoint);
	}

}
