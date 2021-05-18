package firstinterview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author sathish kumar. Created Oct 23, 2020.
 */
public class Carrace {
	public static void main(String[] arg) {
		Scanner arraylength = new Scanner(System.in);
		System.out.print("array length : ");
		int al = arraylength.nextInt();

		Scanner arrayvalue = new Scanner(System.in);
		System.out.print("array values : ");
		int[] arr = new int[al];

		for (int i = 0; i < al; i++) {
			arr[i] = arrayvalue.nextInt();
		}

		int carsatmaxspeed = 1;
		for (int i = 1; i < al; i++) {
			if (arr[i] < arr[i - 1]) {
				carsatmaxspeed++;
			} else {
				arr[i] = arr[i - 1];
			}
		}
		System.out.println(carsatmaxspeed);
	}
}
