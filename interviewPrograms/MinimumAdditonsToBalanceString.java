package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAdditonsToBalanceString {
	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input string No " + " : ");
		String string = input.nextLine();
		int x = string.length();
		char[] str = string.toCharArray();

		Arrays.sort(str);
		int noofelement = 1;
		int elementcount = 1;
		int maxelementcount = 0;

		for (int k = 0; k < x - 1; k++) {

			if (elementcount > maxelementcount) {
				maxelementcount = elementcount;
			}
			if (str[k] != str[k + 1]) {
				noofelement++;
				elementcount = 1;
			}
			elementcount++;
		}

		int stringstoadd = (maxelementcount * noofelement) - x;
		System.out.println(stringstoadd);

	}
}
