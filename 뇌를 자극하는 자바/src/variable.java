
public class variable {

	public static void main(String[] args) {
		
		int number1 = 30, number2 = 120;
		int total = plus(number1, number2);
		
		System.out.println("total:" + total); System.exit(0);
	}
	
	static int plus(int a, int b)
	{
		return a + b;
	}

}
