package interviewPrograms;

import java.util.Scanner;
import java.util.*;
//once more
public class MinIncrementOrDecrementToSortArray {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int n = arraylength1.nextInt();

				if (n > 0) {
					System.out.println("input values to the array");
					Vector<Integer> ar = new Vector<>();

					for (int i = 0; i < n; i++) {
						Scanner numsinarray = new Scanner(System.in);
						ar.add(numsinarray.nextInt());
					}

					int small = Collections.min(ar);

					int large = Collections.max(ar);

					int[][] dp = new int[n][large + 1];

					for (int j = small; j <= large; j++) {
						dp[0][j] = Math.abs(ar.get(0) - j);
					}

					for (int i = 1; i < n; i++) {
						int minimum = Integer.MAX_VALUE;
						for (int j = small; j <= large; j++) {

							minimum = Math.min(minimum, dp[i - 1][j]);
							dp[i][j] = minimum + Math.abs(ar.get(i) - j);
							System.out.println(dp[i][j]);

						}
					}
					System.out.println(" ");
					int ans = Integer.MAX_VALUE;
					for (int j = small; j <= large; j++) {
						ans = Math.min(ans, dp[n - 1][j]);
						System.out.println(ans);

					}
					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}