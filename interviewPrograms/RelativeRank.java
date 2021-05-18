package interviewPrograms;

import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Aug 17, 2020.
 */
public class RelativeRank {
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

					relativerank(arr , x);
					
					continueLoop = false;
				}

				catch (Exception string) {
					System.out.println("Can't process the given input ");
				}
			}
		}
		static void  relativerank(final int[] arr , final int x){
			for (int i = 0; i < x; i++) {
				int temp = 0;
				for (int j = i+1 ; j < x; j++) {

					if (arr[j] > arr[i] && arr[j] > arr[j-1]) {
						temp++;					}
				}
				System.out.print(temp + " ");
			}
		}
}
