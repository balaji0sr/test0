package greedyAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class GreedyFlorist {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner value = new Scanner(System.in);
				System.out.print("input no of friends : ");
				int friends = value.nextInt();

				Scanner value2 = new Scanner(System.in);
				System.out.print("no of flower : ");
				int noofF = value2.nextInt();
				int[] f = new int[noofF];

				if (noofF > 0) {
					for (int i = 0; i < noofF; i++) {

						Scanner value3 = new Scanner(System.in);
						f[i] = value3.nextInt();

					}
					int multi = 1;

					int i = noofF - 1;
					Arrays.sort(f);
					int sum = 0;
					while (i >= 0) {

						int j = 0;
						while (j < friends) {
							if (i < 0) {
								break;
							}
							sum = sum + (f[i] * multi);
							j++;
							i--;

						}
						multi++;
					}

					System.out.println(sum);

				}
				continueLoop = false;
			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}