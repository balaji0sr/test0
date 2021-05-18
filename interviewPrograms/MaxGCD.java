package interviewPrograms;

import java.util.Scanner;

public class MaxGCD {
	public static void main(String args[]) {
		Scanner integer = new Scanner(System.in);
		System.out.print("Input integer ");
		int x = integer.nextInt();

		Scanner valuetopower = new Scanner(System.in);
		System.out.print("no of unique parts ");
		int a = valuetopower.nextInt();

		int minSum = (a * (a + 1)) / 2;

		if (x < minSum) {
			System.out.println("no");
		} else {

			int i = (int) Math.sqrt(a);
			int res = 1;
			while (i >= 1) {

				if (x % i == 0) {
					if (i >= minSum)
						res = Math.max(res, a / i);

					if (x / i >= minSum)
						res = Math.max(res, i);
				}
				i--;
			}
			System.out.println(res);
		}
	}
}
