package array;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumSwaps {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.println("Input array length: ");
				int x = arraylength.nextInt();

				int array[] = new int[x];
				System.out.println("Input array value: ");

				Scanner arrayvalues = new Scanner(System.in);
				for (int i = 0; i < x; i++) {
					array[i] = arrayvalues.nextInt();
				}
				int index = 0 ;
				int count = 0 ;

				for (int j = 0; j < x - 1; j++) {
					int temp = array[j];
					System.out.println("temp " + temp);

					
					for (int i = j + 1; i < x; i++) {
						if (array[i] < temp) {

							temp = array[i];
							index = i;
						}
					}
					if (temp != array[j]) {
						array[index] = array[j];
						array[j] = temp;
						count++;
					}
				}

				System.out.println("result Array is " + Arrays.toString(array));
				System.out.println("count " + count );

				continueLoop = false;

			}

			catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
