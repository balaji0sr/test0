package interviewPrograms;

import java.util.Scanner;

public class MaxOfMinFromLayersOfSquareMatrix {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength = new Scanner(System.in);
				System.out.print("Input 2d array length : ");
				int x = arraylength.nextInt();

				int[][] arr = new int[x][x];

				Scanner arrayvalues = new Scanner(System.in);
				System.out.print("Input values : ");

				for (int i = 0; i < x; i++) {
					for (int j = 0; j < x; j++) {
						arr[i][j] = arrayvalues.nextInt();
					}
				}

				for (int i = 0; i < x; i++) {
					for (int j = 0; j < x; j++) {
						System.out.print(arr[i][j]);
					}
					System.out.println(" ");
				}

				int r = x - 1, c = x - 1, m = 0, n = 0, min = arr[0][0], maxofmin = 0;

				while (r >= m || c >= n) {

					min = arr[m][n];
					for (int i = n; i <= c; i++) {
						if (arr[m][i] < min) {
							min = arr[m][i];
						}
					}
					m++;

					for (int i = n; i <= c; i++) {
						if (arr[r][i] < min) {
							min = arr[r][i];
						}
					}
					r--;

					for (int i = m; i <= r; i++) {
						if (arr[i][n] < min) {
							min = arr[i][n];
						}
					}
					n++;

					for (int i = m; i <= r; i++) {
						if (arr[i][c] < min) {
							min = arr[i][c];
						}
					}
					c--;

					if (maxofmin == 0) {
						maxofmin = min;
					} else if (min > maxofmin) {
						maxofmin = min;
					}

				}
				System.out.println("maxofmin " + maxofmin);
				continueLoop = false;
			} catch (Exception e) {
				System.out.println("can't process the given input");
			}
		}
	}
}
