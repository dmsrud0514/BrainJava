package chap06;

public class SeparateVolume implements Lendable {

	String requestNo; 	 // û����ȣ
	String bookTitle; 	 // ����
	String writer; 	  	 // ����
	String borrower;     // ������
	String checkOutDate; // ������
	byte state;			 // �������

								//"863?774��", 		"����", 			"��������"
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		//super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	@Override
	public void checkOut(String borrower, String date) throw Exception {
		System.out.println();
		//if (state != STATE_NORMAL)	// state 0�� �ƴҶ�
		// 	  return; 	// ����	
		
		if (state == STATE_BORROWED)
			return;
		//super();
		 this.borrower = borrower;
		 this.checkOutDate = date;
		 this.state = STATE_BORROWED; // ����� 1�� ����
		 System.out.println("*" + bookTitle + "��(��) ����Ǿ����ϴ�.");
		 System.out.println("������:" + borrower);
		 System.out.println("������:" + date + "\n");
	}

	@Override
	public void checkIn() {
		//super();
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;// �ݳ��� 0���� ����
		System.out.println("*" + bookTitle + "��(��) �ݳ��Ǿ����ϴ�.");
	}
	
}	
	

