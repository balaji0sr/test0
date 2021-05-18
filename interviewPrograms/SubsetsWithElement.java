package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetsWithElement {
	public static void main(String args[]) {
		Scanner arraylength = new Scanner(System.in);
		System.out.print("Input array length ");
		int x = arraylength.nextInt();

		if (x > 0) {
			int[] nums = new int[x];
			int y = 0;
			System.out.println("input values to array");
			while (y < x) {
				Scanner numsinarray1 = new Scanner(System.in);
				nums[y] = numsinarray1.nextInt();
				y = y + 1;
			}

			Scanner element = new Scanner(System.in);
			System.out.print("Input element ");
			int k = element.nextInt();

			int N = (int) Math.pow(2, x);
			int count = 0;

			for (int i = 0; i < N; i++) {

				for (int j = 0; j < x; j++) {
					System.out.println("i & (1 << j) = " + (i & (1 << j)));
					System.out.println(1 << j);

					if ((i & (1 << j)) != 0) {
						if (nums[j] == k) {
							count += 1;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
