package interviewPrograms;

import java.util.HashMap;
import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author sathish kumar. Created Oct 14, 2020.
 */
public class NoOfSubarraysSumEqualsLength {
	public static void main(String args[]) {

		System.out.print("Input array length of 1st array : ");
		Scanner arraylength = new Scanner(System.in);
		int x = arraylength.nextInt();

		System.out.print("Input array length of 1st array : ");
		Scanner arrayelement = new Scanner(System.in);
		int[] arr = new int[x];

		for (int i = 0; i < x; i++) {
			arr[i] = arrayelement.nextInt();
		}

		for (int i = 0; i < x; i++)
			arr[i]--;

		// Making prefix sum array
		int[] pref = new int[x];
		pref[0] = arr[0];

		for (int i = 1; i < x; i++)
			pref[i] = pref[i - 1] + arr[i];

		// Declare map to store count of
		// elements upto current element
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		int answer = 0;

		// To count all the subarrays
		// whose prefix sum is 0
		mp.put(0, 1);

		// Iterate the array
		for (int i = 0; i < x; i++) {

			// Increment answer by count of
			// current element of prefix array

			if (mp.containsKey(pref[i])) {
				answer += mp.get(pref[i]);
				mp.put(pref[i], mp.get(pref[i]) + 1);

			} else {
				mp.put(pref[i], 1);
			}
		}
		System.out.println(answer);

	}
}