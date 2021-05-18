package interviewPrograms;

import java.util.Scanner;

public class MaxSumSubarrayEvenLength {
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

					int maxsum = nums[0] + nums[1];
					
					for (int q = x; q > 0; q--) {
						
						if (q % 2 == 0) {
							
							for (int j = 0; q <= x; j++) {

								int p = j + q;
								if (p > x) {
									break;
								}
								int sum = 0;
								
								for (int i = j; i < p; i++) {
									sum = sum + nums[i];
								}
								if (sum > maxsum) {
									maxsum = sum;
								}
							}
						}
					}
					System.out.println(maxsum);
					
					continueLoop = false;
				}
				
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
