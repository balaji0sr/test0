package interviewPrograms;

import java.util.Scanner;

public class MaxCountDivisibleElementsOnLeftOfAnyelement {
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

					int count = 0;
					for (int i = x - 1; i > 0; i--) {
						int newcount = 0;
						for (int j = i - 1; j >= 0; j--) {

							if (nums[j] % nums[i] == 0) {
								newcount++;
							}
						}
						if (newcount > count) {
							count = newcount;
			 			}
					}

					System.out.println(count);

					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
