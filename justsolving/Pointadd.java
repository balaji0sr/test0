package justsolving;

import java.util.Arrays;
import java.util.Scanner;

public class Point{
	public static void main(String[] args) {

		Scanner line = new Scanner(System.in);
		System.out.print("input no players : ");
		int r = line.nextInt();

		System.out.println("input player number : ");
		int[] a = new int[r];

		int sum = 0;
		for (int j = 0; j < r; j++) {
			Scanner input = new Scanner(System.in);
			a[j] = input.nextInt();
			sum = sum + a[j];
		}

		int[] b = new int[r];
		for (int j = 0; j < r; j++) {
			b[j] = sum - a[j];
		}
		System.out.println(Arrays.toString(b));
	}
}

