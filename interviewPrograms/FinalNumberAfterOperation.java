package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class FinalNumberAfterOperation {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int x = arraylength1.nextInt();
				if (x > 0) {
					int[] nums = new int[x];

					System.out.println("input values to the array");
					for (int a = 0; a < x; a++) {
						Scanner numsinarray = new Scanner(System.in);
						nums[a] = numsinarray.nextInt();
					}
					int a = 0;
					int b = 0;
					int res = 0;
					for (int i = 0; i < x; i++) {
						b = nums[i];
						while (i > 0) {
							if (a == 0) {
								nums[i] = b;
								break;
							} else {
								res = a;
								a = b % a;
								b = res;
							}
						}
						a = b;
					}

					System.out.println(Arrays.toString(nums));
					System.out.println(nums[x - 1]);

					continueLoop = false;
				}
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
