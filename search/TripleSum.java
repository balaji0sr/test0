package search;

import java.util.Arrays;
import java.util.Scanner;

public class TripleSum {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int x = arraylength1.nextInt();
				if (x > 0) {
					int[] nums1 = new int[x];

					System.out.println("input values to the array");
					for (int a = 0; a < x; a++) {
						Scanner numsinarray = new Scanner(System.in);
						nums1[a] = numsinarray.nextInt();
					}

					Scanner arraylength2 = new Scanner(System.in);
					System.out.print("Input array length of 2nd array : ");
					int y = arraylength2.nextInt();
					if (y > 0) {
						int[] nums2 = new int[y];
						System.out.println("input values to the array");
						for (int b = 0; b < y; b++) {
							Scanner numsinarray2 = new Scanner(System.in);
							nums2[b] = numsinarray2.nextInt();
						}

						Scanner arraylength3 = new Scanner(System.in);
						System.out.print("Input array length of 3rd array : ");
						int z = arraylength3.nextInt();
						if (z > 0) {
							int[] nums3 = new int[z];
							System.out.println("input values to the array");
							for (int c = 0; c < z; c++) {
								Scanner numsinarray3 = new Scanner(System.in);
								nums3[c] = numsinarray3.nextInt();
							}

							int count = 0;

							for (int a = 0; a < x; a++) {
								for (int b = 0; b < y; b++) {
									for (int c = 0; c < z; c++) {
										if (nums1[a] <= nums2[b] && nums3[c] <= nums2[b]) {
											System.out.println(nums1[a] + " " + nums2[b] + " " + nums3[c]);
											count++;
										}
									}
								}
							}

							System.out.println(count);

							continueLoop = false;
						}
					}
				}
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
