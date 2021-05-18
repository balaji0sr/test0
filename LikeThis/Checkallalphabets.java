//$Id$
package LikeThis;

import java.util.Scanner;

public class Checkallalphabets {
	public static void string(String Str) {
		char ch[] = Str.toCharArray();
		int x = Str.length();
		
		boolean boolarr[] = new boolean[26];
		
		int AsciiOfa = (int) 'a';
		int AsciiOfA = (int) 'A';
		
		int index = 0;
		
		for (int i = 0; i < x; i++) {
			int tmpAscii = (int) ch[i];
			
			if (ch[i]>='a'&&ch[i]<='z'){
				 index = tmpAscii - AsciiOfa;
				 boolarr[index] = true;
			}
			else if (ch[i]>='A'&&ch[i]<='Z'){
			index = tmpAscii - AsciiOfA;
			boolarr[index] = true;
			}
			
		}
		boolean contains = true;
		 for (int id = 0; id < 26; id++) {
	            if (boolarr[id] == false) {
	                contains =  false;
	                break;
	            }
	        }
	        if (contains)
	        	System.out.println("string contains all alphabets");
	        else System.out.println("string dosn't contains all alphabets");
	}

	public static void main(String[] arg) {
		Scanner string = new Scanner(System.in);
		System.out.print("string : ");
		String str = string.nextLine();
		string(str);
	}
}

