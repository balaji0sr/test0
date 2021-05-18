package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.println("Input array length: ");
				int x = arraylength.nextInt();
				int array[] = new int[x];


				Scanner arraylength2 = new Scanner(System.in);
				System.out.println("no of operation ");
				int o = arraylength2.nextInt();

				int operation[][] = new int[o][3];
				boolean ifpresent = false;
				boolean greater = false ;
				Scanner operations = new Scanner(System.in);

				for (int i = 0; i < o; i++) {
					System.out.println("operation " + (i + 1) + " starting index ");
					operation[i][0] = operations.nextInt();

					System.out.println("operation " + (i + 1) + " ending index ");
					operation[i][1] = operations.nextInt();

					System.out.println("number to be added in " + "operation " + (i + 1) );
					operation[i][2] = operations.nextInt();

					if (operation[i][0] >= x || operation[i][1] >= x || operation[i][1] < 0 || operation[i][0] < 0) {
						ifpresent = true;
						break;
					}
					if (operation[i][0] > operation[i][1] ) {
						greater = true;
						break;
					}
					
				}
				
				for (int i = 0; i < o; i++) {
					System.out.print(operation[i][0]);
					System.out.print(operation[i][1]);
					System.out.print(operation[i][2]);
					System.out.println(" ");

					}
				
				if (ifpresent || greater) {
					if (ifpresent){
					System.out.println("given index number did not present in the array ");
					}if (greater){
						System.out.println("starting index is greater than ending index ");
					}

				} else {
					for (int i = 0; i < x; i++) {
						array[i] = 0;
					}

					for (int j = 0; j < o; j++) {

						for (int i = operation[j][0]; i <= operation[j][1]; i++) {

							array[i] = array[i] + operation[j][2];
						}
					}
					System.out.println("result Array is"+ Arrays.toString(array));
					continueLoop = true;

				}

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}
}
