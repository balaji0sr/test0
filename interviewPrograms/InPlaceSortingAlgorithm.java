package interviewPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class InPlaceSortingAlgorithm {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength1 = new Scanner(System.in);
				System.out.print("Input array length of 1st array : ");
				int n = arraylength1.nextInt();

				if (n > 0) {
					String[] list = new String[n];
					// ArrayList <String> list = new ArrayList<String>();
					System.out.println("input values to the array");

					for (int a = 0; a < n; a++) {
						Scanner numsinarray = new Scanner(System.in);
						list[a] = numsinarray.nextLine();
						// list.add(b);
					}

					for (int a = 0; a < n - 1; a++) {

						int asciia = list[a].charAt(0);
						System.out.println(asciia);
						int index = a;
						String temp = list[a];
						boolean shift = false;

						for (int b = a + 1; b < n; b++) {

							int asciib = list[b].charAt(0);
							System.out.println(asciib);
							if (asciia > asciib) {
								System.out.println(list[b]);
								temp = list[b];
								index = b;
								shift = true;

							}
						}
						if (shift) {
							list[index] = list[a];
							list[a] = temp;
						}/*
						 * else{ break; }
						 */

					}

					System.out.println(Arrays.toString(list));

					continueLoop = false;
				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
