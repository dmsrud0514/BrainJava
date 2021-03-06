package chap06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class InterfaceExample3 {

	public static void main(String[] args) {
	
	SeparateVolume obj =  new SeparateVolume("863?774개", "개미", "베르베르"); // 객체생성시 멤버필드(변수) 값을 셋팅 
	
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	String strDate = sf.format(date);
	
	//System.out.println(strDate);
	
	try {
		obj.checkOut("홍길동", strDate);
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
	obj.checkOut("홍길동", strDate);
	
	printState(obj);
	
	
	obj.checkIn();
	
	printState(obj);
	
}

static void printState(SeparateVolume obj)  {
	if(obj.state == Lendable.STATE_NORMAL) { 
		System.out.println("=====================");
		System.out.println("대출상태 : 대출가능");
		System.out.println("=====================");
		}
	else {
		System.out.println("=====================");
		System.out.println("대출상태 : 대출중");
		System.out.println("대출인: " + obj.borrower);
		System.out.println("대출일: " + obj.checkOutDate);
		System.out.println("=====================");
		}
	}
}
