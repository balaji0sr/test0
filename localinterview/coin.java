package localinterview;

import java.util.Arrays;
import java.util.Scanner;

public class coin {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.print("no of coins : ");
				int x = arraylength.nextInt();

				int[] nums = new int[x];
				int y = 0;
				System.out.println("value of coins : ");
				while (y < x) {
					Scanner numsinarray = new Scanner(System.in);
					nums[y] = numsinarray.nextInt();
					y = y + 1;
				}
				Scanner resultvalue = new Scanner(System.in);
				System.out.print("Input result amount : ");
				int res = resultvalue.nextInt();

				int count = 0;
				Arrays.sort(nums);

				if (x > 1 && nums[0] != 0) {
					int result = res;

					for (y = x - 1; y >= 0; y--) {
						if (nums[0] > res) {
							System.out
									.println("cant make the amount with the given coins");
							break;
						} else if (y == 0 && result % nums[y] != 0) {
							count = count - 1;
							result = result + (nums[y + 1]);
							if (result > res) {
								System.out
										.println("cant make the amount with the given coins");
								break;
							}
							y++;
						} else if (result >= nums[y]) {
							count = count + (result / nums[y]);
							result = result % nums[y];
							if (result == 0) {
								break;
							} else if (y == 0 && result % nums[y] != 0) {
								count = count - 1;
								result = result + (nums[y + 1]);
								y++;
							}
						} else if (nums[y] > result) {
							count = count - 1;
							result = result + (nums[y + 1]);
							y++;
						}
					}
				} else {
					if (res % nums[0] == 0) {
						count = res / nums[0];
					} else {
						System.out
								.println("cant make the amount with the given coins");
					}
				}
				System.out.println(count);
				continueLoop = false;
			}

			catch (Exception string) {
				System.out.println("Can't process the given input ");
			}
		}
	}

}
