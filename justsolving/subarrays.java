//$Id$
package justsolving;

import java.util.Scanner;

public class subarrays {
	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		System.out.print("input array length : ");
		int r = line.nextInt();

		System.out.println("input array number : ");
		int[] a = new int[r];

		for (int j = 0; j < r; j++) {
			Scanner input = new Scanner(System.in);
			a[j] = input.nextInt();
		}

		int min = 0;
		int sum = 0;

		for (int i = r; i > 0; i--) {
			for (int j = 0; j < r; j++) {
				min = a[j];
				boolean throughloop = false;
				for (int k = j; k < j + i; k++) {
					if (j + i > r) {
						break;
					}

					if (a[k] < min) {
						min = a[k];

					}
					throughloop = true;

				}

				if (throughloop) {
					sum = sum + min;
				}
			}
		}
		System.out.println(sum);
	}
}
