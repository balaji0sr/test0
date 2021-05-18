package interviewPrograms;

import java.util.Scanner;

public class PrimeCountOfDivisors {
	public static void main(String args[]) {
		Scanner arraylength = new Scanner(System.in);
		System.out.print("Input array length ");
		int x = arraylength.nextInt();

		if (x < 0) {
			x = x * -1;
		}

		if (x == 1) {
			System.out.println("yes");
		} else if (x == 0) {
			System.out.println("no");
		} else {
			int count = 2;
			for (int y = 2; y < x; y++) {
				if (x / y < y) {
					break;
				}

				if (x % y == 0) {
					if (x / y == y) {
						count = count + 1;
						break;
					} else {
						count = count + 2;
					}
				}
			}
			System.out.println(count);

			boolean prime = true; 
			
			for (int y = 2; y < count; y++) {
				if (count / y < y) {
					break;
				}

				if (count % y == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		}
	}
}
