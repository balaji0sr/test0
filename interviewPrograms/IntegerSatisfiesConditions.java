package interviewPrograms;

import java.util.Scanner;

public class IntegerSatisfiesConditions {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner integer1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int x = integer1.nextInt();

				Scanner integer2 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int y = integer2.nextInt();
				int a;
				int b;
				if (x < y) {
					a = x + 1;
					b = y;
				} else {
					a = y + 1;
					b = x;
				}
				int newa;
				int digit;
				int newres;
				int k = a;
				int res = (x - a) * (a - y);
				
				while (a < b) {
					newa = a;
					boolean degitrepeat = false;
					boolean[] present = new boolean[10];

					while (newa > 0) {
						digit = newa % 10;
						if (present[digit]) {
							degitrepeat = true;
							break;
						}
						present[digit] = true;
						newa = newa / 10;
					}
					if (degitrepeat == false) {

						newres = a;
						newres = (x - newres) * (newres - y);

						if (newres >= res) {
							k = a;
							res = newres;
						}
					}

					a++;
				}

				System.out.println(k);

				continueLoop = false;

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
