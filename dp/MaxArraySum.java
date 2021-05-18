package dp;

import java.util.Scanner;

public class MaxArraySum {

	static int maxLen;
	static {
		
	}

	static int dp[] = new int[maxLen];

	static boolean v[] = new boolean[maxLen];
	static boolean continueLoop = true;

	public static void main(String[] arg) {

		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.print("Input array length: ");
				int x = arraylength.nextInt();
				int[] nums = new int[x];
				if (x > 0) {
					int y = 0;
					System.out.println("input values to the array");
					while (y < x) {
						Scanner numsinarray = new Scanner(System.in);
						nums[y] = numsinarray.nextInt();
						y = y + 1;
					}
				}
				System.out.println("max sum " + maxSum(nums, 0, x));

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}

	static int maxSum(int nums[], int i, int x) {
		System.out.println("i " + i);
		System.out.println("dp[i] a " + dp[i]);

		if (i >= x)
			return 0;

		if (v[i])
			return dp[i];
		v[i] = true;

		dp[i] = Math.max(maxSum(nums, i + 1, x), nums[i] + maxSum(nums, i + 2, x));
		System.out.println("dp[i] b " + dp[i]);

		return dp[i];
	}

}
