package stacksandqueues;

import java.util.ArrayList;
import java.util.Scanner;

public class PoisonousPlants {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {

				Scanner arraylength = new Scanner(System.in);
				System.out.print("lenth of array : ");
				int al = arraylength.nextInt();
				ArrayList<Integer> list = new ArrayList<Integer>(al);

				System.out.print("element of array : ");
				int x = 0;
				for (int y = 0; y < al; y++) {
					Scanner numsinarray = new Scanner(System.in);
					x = numsinarray.nextInt();
					list.add(x);
				}
				System.out.println(list);

				int days = 0;
				boolean loop = true;

				while (loop) {
					loop = false;
					int prv = list.get(0);

					for (int y = 1; y < al; y++) {

						if (list.get(y) > prv) {
							prv = list.get(y);
							list.remove(y);
							al--;
							y--;
							loop = true;
						} else {
							prv = list.get(y);
						}

					}
					days++;

				}

				System.out.println(list);

				System.out.println("days " + (days - 1));

				continueLoop = false;

			} catch (Exception string) {
				System.out.println("Can't process the given input ");
			}
		}
	}
}
