package interviewPrograms;

import java.util.Scanner;

public class MaxSumWithCondition {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner line = new Scanner(System.in);
				System.out.print("input no of rows : ");
				int r = line.nextInt();
				System.out.print("input no of colums in multiples of 3 : ");
				int c = line.nextInt();
				c = c * 3 ;
				
				int[][] mat = new int[r][c];
				if (r > 0 && c > 0) {
					System.out.println("input matrix value : ");
					for (int i = 0; i < r; i++) {
						for (int j = 0; j < c; j++) {
							Scanner input = new Scanner(System.in);
							mat[i][j] = input.nextInt();
						}
					}

				long[][] dp = new long[r + 1][3];

				for (int i = 0; i < r; i++) {

					long m1 = 0, m2 = 0, m3 = 0;

					for (int j = 0; j < c; j++) {

						if ((j / (c / 3)) == 0) {
							m1 = Math.max(m1, mat[i][j]);
						}

						else if ((j / (c / 3)) == 1) {
							m2 = Math.max(m2, mat[i][j]);
						}

						else if ((j / (c / 3)) == 2) {
							m3 = Math.max(m3, mat[i][j]);
						}

					}

					dp[i + 1][0] = Math.max(dp[i][1], dp[i][2]) + m1;
					dp[i + 1][1] = Math.max(dp[i][0], dp[i][2]) + m2;
					dp[i + 1][2] = Math.max(dp[i][1], dp[i][0]) + m3;
				}

				System.out.print(Math.max(Math.max(dp[r][0], dp[r][1]),dp[r][2]) + "\n");

				continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
