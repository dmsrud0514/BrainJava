package chap09;

import java.util.StringTokenizer;
public class StringTokenizerExample2 {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer ("����ġ, �޹��� | �䳢",",|)");

 while(token.hasMoreTokens()) {
			 
			 String str = token.nextToken();
			 System.out.println(str);
 		}	

	}
}
