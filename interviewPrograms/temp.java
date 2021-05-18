package interviewPrograms;

import java.util.Scanner;

public class temp {
	public static void main(String[] args) {
		Scanner inputno = new Scanner(System.in);
		System.out.print("No of string:");
		int t = inputno.nextInt();

		Scanner input = new Scanner(System.in);
		String[] str = new String[t];
		for (int j = 0; j < t; j++) {
			System.out.print("Input string No " + (j + 1) + " : ");
			str[j] = input.nextLine();
		}

		for (int k = 0; k < t; k++) {
			int x = str[k].length();

			for (int i = x - 1; i >= 0; i--) {

				if (str[k].charAt(i) == '.') {
					for (int j = i + 1; j < x; j++) {
						System.out.print(str[k].charAt(j));
					}
					System.out.print(" ");
					x = i;
				} else if (i == 0) {
					for (int j = 0; j < x; j++) {
						System.out.print(str[k].charAt(j));
					}
				}
			}
			System.out.println("");
		}
	}
}
