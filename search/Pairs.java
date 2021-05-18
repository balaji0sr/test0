package search;

import java.util.Scanner;

public class Pairs {
	public static void main(String[] arg) {
		
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				System.out.println("main " + 1/0);
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

					Scanner testvalue = new Scanner(System.in);
					System.out.print(" summed value for pairs: ");
					int w = testvalue.nextInt();

					System.out.println(" pairs of elements in an array whose sum is equal to " + w);
					int count = 0 ;
					for (y = 0; x > y ; y++) {
						for (int z = 0;z < x;z++) {
							if (nums[y] - nums[z] == w && y != z) {
								count ++ ;
							}
						}
					}
					System.out.println(count);

					continueLoop = false;
				} else {
					System.out.println("array length should be positive");
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}