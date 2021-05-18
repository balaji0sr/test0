//$Id$
package LikeThis;

import java.util.Scanner;

public class Matrix {
	static void printSpiral(int[][] mat, int n) {
		// starting point of spiral
		int a = n / 2, b = n / 2;
		int i;

		int low_row = (0 > a) ? 0 : a;
		int low_column = (0 > b) ? 0 : b - 1;
		int high_row = ((a + 1) >= n) ? n - 1 : a + 1;
		int high_column = ((b + 1) >= n) ? n - 1 : b + 1;

		int x = 1;
		while ((low_row > 0 - n && low_column > 0 - n)) {
			for (i = low_column + 1; i <= high_column && i < n && low_row >= 0; ++i){
				mat[low_row][i] = x;
			x++;}
			low_row -= 1;

			for (i = low_row + 2; i <= high_row && i < n && high_column < n; ++i){
				mat[i][high_column] = x;
			x++;}
			high_column += 1;

			for (i = high_column - 2; i >= low_column && i >= 0 && high_row < n; --i){
				mat[high_row][i] = x;
			x++;}
			high_row += 1;

			for (i = high_row - 2; i > low_row && i >= 0 && low_column >= 0; --i){
				mat[i][low_column] = x;
			x++;}
			low_column -= 1;
		}
		for (int k = 0; k < n; k++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mat[k][j]);
			}
			System.out.println(" ");
		}
	}

	static public void main(String[] args) {
		int n = 5;
		int[][] mat = new int[n][n];
		

		printSpiral(mat, n);
	}
}
