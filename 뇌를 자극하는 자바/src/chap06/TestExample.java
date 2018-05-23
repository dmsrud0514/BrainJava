package chap06;

public class TestExample {

	public static void main(String[] args) {
		Lendable arr [] = {
			new AppCDInfo ("2005-7001", "Redhat Fedora"),
			new SeparateVolume ("859��986��", "å���� å���̴�", "��")
		};
		checkOutAll (arr, "�����", "20060318");
	}
	
	static void checkOutAll (Lendable arr [], String borrower, String date) {
		for (Lendable obj : arr) {
			
			try {
				obj.checkOut(borrower, date);
				System.out.println("������: " + borrower);
				System.out.println("������: " + date);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
