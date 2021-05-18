package interviewPrograms;

import java.util.Scanner;

//incomplete
public class SumGCDallSubarrays {
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
					int b = 0;
					int res = 0;
					int sum = 0;
					
					int sumvalue = 0;
					for (int q = x; q > 0; q--) {

						for (int j = 0; q <= x ; j++) {

							int p = j + q;
							if (p > x) {
								break;
							}
							int a = 0;
							for (int i = j; i < p; i++) {
System.out.print(i);
								b = nums[i];
								while (i > -1) {
									if (a == 0) {
										sumvalue = b;
										break;
									} else {
										res = a;
										a = b % a;
										b = res;
									}
								}
								a = b;
							}
							System.out.println(" ");

							sum = sum + sumvalue;
						}
					}

					System.out.println(sum);

					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}