package interviewPrograms;

import java.util.Scanner;

public class SumOfPreviousNumbersGreaterThanNumber {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.print("array length : ");
				int x = arraylength.nextInt();

				Scanner arrayvalue = new Scanner(System.in);
				System.out.print("array values : ");
				int[] arr = new int[x];

				for (int i = 0; i < x; i++) {
					arr[i] = arrayvalue.nextInt();
				}

				sumlargnumbers(arr , x);
				
				continueLoop = false;
			}

			catch (Exception string) {
				System.out.println("Can't process the given input ");
			}
		}
	}
	static void  sumlargnumbers(final int[] arr , final int x){
		for (int i = 0; i < x; i++) {
			int temp = 0;
			for (int j = 0; j < i; j++) {

				if (arr[j] > arr[i]) {
					temp = temp + arr[j];
				}

			}
			System.out.print(temp + " ");
		}
	}
}
