//$Id$
package LikeThis;

import java.util.Scanner;

public class Jewellery {
	public static void jewelleryString(String Str) {
		char ch[] = Str.toCharArray();
		int x = Str.length();
		boolean boolarr[] = new boolean[26];
		int AsciiOfa = (int) 'a';
		int AsciiOfA = (int) 'A';
		int dollers = 0;
		int index = 0;
		for (int i = 0; i < x; i++) {
			int tmpAscii = (int) ch[i];
			if (ch[i]>='a'&&ch[i]<='z'){
				 index = tmpAscii - AsciiOfa;
			}else if (ch[i]>='A'&&ch[i]<='Z'){
			index = tmpAscii - AsciiOfA;
			}
			if (boolarr[index]) {
				boolarr[index] = false;

			} else {
				boolarr[index] = true;
				dollers++;
			}
		}
		System.out.println("required dollers : " + dollers);
	}

	public static void main(String[] arg) {
		Scanner string = new Scanner(System.in);
		System.out.print("string : ");
		String str = string.nextLine();
		jewelleryString(str);
	}
}
