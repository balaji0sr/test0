package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class GenerateArrayBFromArrayAWithConditions {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int n = arraylength1.nextInt();

				if (n > 0) {
					int[] a = new int[n];
					System.out.println("input values to the array");

					for (int i = 0; i < n; i++) {
						Scanner numsinarray = new Scanner(System.in);
						a[i] = numsinarray.nextInt();
					}

					int[] b = new int[n];
					int negcount = 0;
					int poscount = 0;
					for (int i = 0; i < n; i++) {
						if (a[i] % 2 != 0) {
							if (a[i] < 0) {
								if (negcount % 2 == 1) {
									b[i] = (a[i] / 2) - 1;
								} else {
									b[i] = a[i] / 2;
								}
								negcount++;
							} else if (a[i] > 0) {
								if (poscount % 2 == 1) {
									b[i] = (a[i] / 2) + 1;
								} else {
									b[i] = a[i] / 2;
								}
								poscount++;
							}
						} else {
							b[i] = a[i] / 2;
						}
					}

					System.out.println(Arrays.toString(b));
					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
