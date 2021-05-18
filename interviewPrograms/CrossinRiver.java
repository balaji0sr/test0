package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CrossinRiver {
	public static void main(String[] arg) {
		Scanner arraylength = new Scanner(System.in);
		System.out.print("no of people : ");
		int x = arraylength.nextInt();

		int[] nums = new int[x];
		int y = 0;
		System.out.println("cost for the people to cross the river  : ");
		while (y < x) {
			Scanner numsinarray = new Scanner(System.in);
			nums[y] = numsinarray.nextInt();
			y = y + 1;
		}

		Arrays.sort(nums);
		int totalCost = 0;

		for (int i = x - 1; i > 1; i -= 2) {
			if (i == 2) {
				totalCost += nums[2] + nums[0];
			} else {

				int price_first = nums[i] + nums[0] + 2 * nums[1];
				System.out.println("totalCost : " + price_first);

				int price_second = nums[i] + nums[i - 1] + 2 * nums[0];
				totalCost += Math.min(price_first, price_second);
			}
		}

		if (x == 1) {
			totalCost += nums[0];
		} else {
			totalCost += nums[1];
		}
		System.out.println("totalCost : " + totalCost);
	}
}
