package interviewPrograms;

import java.util.Scanner;

public class SquareSubmatrixSumElements {

	public static void main(String args[]) {
		Scanner line = new Scanner(System.in);
		System.out.print("input no of rows (N) : ");
		int r = line.nextInt();
		System.out.print("input no of colums (M) : ");
		int c = line.nextInt();
		int[][] a = new int[r][c];

		if (r > 0 && c > 0) {
			System.out.println("input matrix value : ");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					Scanner input = new Scanner(System.in);
					a[i][j] = input.nextInt();
				}
			}

			Scanner element = new Scanner(System.in);
			System.out.print("input element : ");
			int e = element.nextInt();

			int count = 0;
			if (a[0][0] <= e) {
				count = 1;
			}
			int sum = 0;
			int k = 2;
			int l = 2;

			for (int i = 0; i < l; i++) {
				if (l == c){
					break;
				}
				for (int j = 0; j < k ; j++) {

					sum = sum + a[i][j];

				}
				
				if (i == l - 1) {
					if (sum <= e){
						count++;
					}
					sum = 0;
					l++ ; 
					k++ ;
				}
			}
			
			System.out.print("count : " + count);
		}
	}
}
