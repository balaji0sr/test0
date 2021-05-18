package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class MaxnCr {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int al = arraylength1.nextInt();

				if (al > 1) {
					int[] a = new int[al];
					System.out.println("input values to the array");

					for (int i = 0; i < al; i++) {
						Scanner numsinarray = new Scanner(System.in);
						a[i] = numsinarray.nextInt();
					}

					Arrays.sort(a);

					int n = a[al - 1];

					int i = 0;

					continueLoop = false;
				}

			} catch (Exception e) {
				System.out.println("can't process the given input");
			}
		}
	}
}