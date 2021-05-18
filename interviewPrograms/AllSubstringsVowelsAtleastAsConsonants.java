package interviewPrograms;

import java.util.Scanner;

public class AllSubstringsVowelsAtleastAsConsonants {
	public static void main(String[] arg) {

		Scanner string = new Scanner(System.in);
		System.out.print("string : ");
		String str = string.nextLine();
		int x = str.length();

		boolean notalphabets = true ;
		boolean lessvowels = false;
		for (int i = 0; i < x - 1; i++) {
			char a = str.charAt(i);
			int ascii = a; 
			if (ascii > 64 && ascii < 91 && ascii > 96 && ascii < 123){
				
			}
			
			if (a != 'a' && a != 'e' && a != 'i' && a != 'o' && a != 'u'
					&& a != 'A' && a != 'E' && a != 'I' && a != 'O' && a != 'U') {
				char b = str.charAt(i + 1);
				if (b != 'a' && b != 'e' && b != 'i' && b != 'o' && b != 'u'
						&& b != 'A' && b != 'E' && b != 'I' && b != 'O'
						&& b != 'U') {
					lessvowels = true;
					break;
				} else {
					if (i == x - 1) {
						break;
					}
					char c = str.charAt(i + 2);
					if (c != 'a' && c != 'e' && c != 'i' && c != 'o'
							&& c != 'u' && c != 'A' && c != 'E' && c != 'I'
							&& c != 'O' && c != 'U') {
						lessvowels = true;
						break;
					}

				}
			}
		}
		if (lessvowels) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

	}
}
