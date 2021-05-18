package interviewPrograms;

import java.util.Scanner;

public class ExtraElementInSecondArray {
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
					System.out.print("Input array length of 1st array : ");
					int y = arraylength2.nextInt();

					if (x > 0) {
						int[] nums2 = new int[y];
						System.out.println("input values to the array");

						for (int a = 0; a < y; a++) {
							Scanner numsinarray = new Scanner(System.in);
							nums2[a] = numsinarray.nextInt();
						}

						int ans = 0;

						for (int i = 0; i < x; i++) {

							ans ^= nums1[i];
							System.out.println(ans);


						}
						for (int i = 0; i < y; i++) {
							ans ^= nums2[i];
							System.out.println(ans);

						}

						System.out.println("ans " + ans);

						continueLoop = false;
					}
				}
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
