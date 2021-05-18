package string;

import java.util.Scanner;

public class CommonChild {
	public static void main(String[] arg) {

		Scanner input1 = new Scanner(System.in);
		System.out.print("Input string: ");
		String str1 = input1.nextLine();

		Scanner input2 = new Scanner(System.in);
		System.out.print("Input string: ");
		String str2 = input2.nextLine();

		String child1 = "";
		String child2 = "";
		
		
		int after = -1;
		int index = 0;
		
		
		for (int x = 0; x < str1.length(); x++) {
			index = str2.indexOf(str1.charAt(x));

			if (index > after) {
				if (x == str1.length() - 1) {

					child1 = child1.concat(str1.substring(x));

				} else {

					child1 = child1.concat(str1.substring(x, x + 1));

				}
				after = index;
			}
		} 
		index = 0;
		after = -1;

		for (int x = 0; x < str2.length(); x++) {

			index = str1.indexOf(str2.charAt(x));

			if (index > after) {
				if (x == str2.length() - 1) {

					child2 = child2.concat(str2.substring(x));

				} else {		

					child2 = child2.concat(str2.substring(x, x + 1));

				}
				after = index;
			}
		}

		if (child1.length() < child2.length()) {
			System.out.println(child2);
		} else {
			System.out.println(child1);
		}

	}
}
