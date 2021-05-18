package interviewPrograms;

import java.util.Scanner;

public class CountIntegersPrimeDigitSumAndDivisibleByK {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("no of intervels : ");
				int x = arraylength1.nextInt();
				if (x > 0) {
					int[][] nums = new int[x][2];
					for (int a = 0; a < x; a++) {
						System.out.println("intervel no " + (a + 1) + " : ");

						Scanner numsinarray = new Scanner(System.in);
						nums[a][0] = numsinarray.nextInt();

						nums[a][1] = numsinarray.nextInt();
					}
					Scanner valueK = new Scanner(System.in);
					System.out.print("k value : ");
					int k = valueK.nextInt();

					for (int a = 0; a < x; a++) {

						int count = 0;
						for (int b = nums[a][0]; b <= nums[a][1]; b++) {

							int digisum = 0;
							int c = b;

							while (c > 0) {
								digisum = digisum + (c % 10);
								c = c / 10;
							}

							System.out.println(digisum);
							if (digisum % k == 0) {
								System.out.println(digisum);

								boolean prime = true;

								for (int d = 2; d <= digisum / d; d++) {
									if (digisum % d == 0) {
										prime = false;
										break;
									}
								}
								if (prime) {
									count++;
								}

							}
						}
						System.out.println(count);
					}

					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
