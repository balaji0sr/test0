//$Id$
package LikeThis;

import java.util.Scanner;

public class StringToInt {
	public static void StringToNumber(String Str) {
		char ch[] = Str.toCharArray();
		int x = Str.length();
		int num = 0;
		int zeroAscii = (int) '0';
		int nineAscii = (int) '9';
		boolean nonumber = true;
		for (int i = 0; i < x; i++) {
			int tmpAscii = (int) ch[i];
			if (tmpAscii >= zeroAscii & tmpAscii <= nineAscii) {

				num = (num * 10) + (tmpAscii - zeroAscii);
				if (i < x) {
					if (ch[i + 1] < zeroAscii || ch[i + 1] > nineAscii || i == x - 1) {
						System.out.println(num);
						num = 0;
					}
				}
				nonumber = false;
			}
		}
		if(nonumber)
			System.out.println("there is no integer in the string");
	}

	public static void main(String[] arg) {
		Scanner string = new Scanner(System.in);
		System.out.print("string : ");
		String str = string.nextLine();
		StringToNumber(str);
	}
}