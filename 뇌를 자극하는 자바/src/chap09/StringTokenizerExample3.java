package chap09;

import java.util.*;
public class StringTokenizerExample3 {
	public static void main(String[] args) {
		StringTokenizer stok = new StringTokenizer("���=10|���ݷ�=3|������=1", "=|", true);
		
		while(stok.hasMoreTokens()) {
			String token = stok.nextToken();
			
			//System.out.println(token);
		
			if (token.equals("="))
				System.out.println("\t");
			else if (token.equals("|"))
				System.out.println("\n");
			else
				System.out.println(token);
		}
				

	}

}
