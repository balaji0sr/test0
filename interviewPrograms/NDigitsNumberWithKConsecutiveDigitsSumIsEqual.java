package interviewPrograms;

import java.util.Scanner;

public class NDigitsNumberWithKConsecutiveDigitsSumIsEqual {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner noofdigits = new Scanner(System.in);
				System.out.print("no of digits : ");
				int n = noofdigits.nextInt();

				Scanner noofconsecutivedigits = new Scanner(System.in);
				System.out.print("no of consecutive digit sum : ");
				int k = noofconsecutivedigits.nextInt();

				int a = (int) Math.pow(10, n - 1), b = (int) Math.pow(10, n) - 1;

				int count = 0;

				for (int i = a; i <= b; i++) {
					int num = i;

					
					int digits[] = new int[n];
					for (int j = n - 1; j >= 0; j--) {
						digits[j] = num % 10;
						num /= 10;
					}
					int sum = 0, flag = 0;

					
					for (int j = 0; j < k; j++)
						sum += digits[j];

					
					for (int j = k; j < n; j++) {

						if (sum - digits[j - k] + digits[j] != sum) {
							flag = 1;
							break;
						}
					}
					if (flag == 0) {
						count++;
					}
				}
				System.out.println(count);
				continueLoop = false ; 
			}

			catch (Exception string) {
				System.out.println("can't process the given input");

			}
		}
	}
}
