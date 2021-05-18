package interviewPrograms;

import java.util.Scanner;

public class NONonDecreasingSubArraysLengthLessEqualK {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int n = arraylength1.nextInt();

				if (n > 0) {
					int[] arr = new int[n];
					System.out.println("input values to the array");

					for (int a = 0; a < n; a++) {
						Scanner numsinarray = new Scanner(System.in);
						arr[a] = numsinarray.nextInt();
					}

					Scanner subarray = new Scanner(System.in);
					System.out.print("Input array length of 1st array : ");
					int k = subarray.nextInt();

					int ret = 0;

					int i = 0;
					while (i < n) {

						int j = i + 1;

						while (j < n && arr[j] >= arr[j - 1])
							j++;
						int x = Math.max(0, j - i - k);

						ret += ((j - i) * (j - i + 1)) / 2 - (x * (x + 1)) / 2;

						i = j;
					}

					System.out.println(ret);

					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
