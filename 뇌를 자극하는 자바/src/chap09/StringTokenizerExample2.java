package chap09;

import java.util.StringTokenizer;
public class StringTokenizerExample2 {
	public static void main(String[] args) {
		StringTokenizer token = new StringTokenizer ("°í½¿µµÄ¡, ¾Þ¹«»õ | Åä³¢",",|)");

 while(token.hasMoreTokens()) {
			 
			 String str = token.nextToken();
			 System.out.println(str);
 		}	

	}
}
