package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class PermuteArrayGivenOrder {
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

					boolean noindex = false;

					if (x > 0) {
						int[] p = new int[x];

						System.out.println("input location of element");
						for (int a = 0; a < x; a++) {
							Scanner numsinarray = new Scanner(System.in);
							p[a] = numsinarray.nextInt();
							if (p[a] < 0 || p[a] > x) {
								noindex = true;
								break;
							}
						}

						if (noindex) {
							System.out.println("given index do not contain in the array");
						} else {
							int temp = 0;
							for (int a = 0; a < x - 1; a++) {
								System.out.println(Arrays.toString(nums));

								if (p[p[a]] >= 0) {

									temp = nums[a];
									nums[a] = nums[p[a]];
									nums[p[a]] = temp;

									p[a] = -1;
								}

							}
							System.out.println(Arrays.toString(nums));
						}

						continueLoop = false;
					}
				}
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
