package interviewPrograms;

import java.util.Scanner;

public class BalancedBracketSequenceChangeOneBracket {
	public static void main(String[] arg) {

		System.out.println("string with bracket");
		Scanner numsinarray = new Scanner(System.in);
		String str = numsinarray.nextLine();
		int l = str.length();
		int count = 0;
		boolean countneg = true;
		for (int i = 0; i < l; i++) {
			
			if (str.charAt(i) == '(') {
				count++;
			} 
			if (str.charAt(i) == ')') {
				count--;
			}

			if (count < -1) {
				countneg = false;
			}
			System.out.println(count);
			System.out.println("neg" + countneg);
		}
		if (countneg  && count == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}