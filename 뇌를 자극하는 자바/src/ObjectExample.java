/**
 * 2018. 5. 2. Dev by Sim.E.K
   
   ObjectExample.java
 */

/**
 * @author Administrator
 *
 */
public class ObjectExample {

	public static void main(String[] args) {
	
		StringBuffer obj = new StringBuffer("Hey, Java"); // 매개변수가 있는 생성자 호출
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1, 'i');
		
		System.out.println(obj);
		int length = obj.length();
		System.out.println("문자열"+obj+"의 길이는:"+length);
		
		// replace 메소드를 사용하여 Hi, Java -> Hello, Java로 치환 해 보세요.
		
		obj.replace(0, 2, "Hello");
		System.out.println(obj);
	}

}
