package hard;

import java.util.Arrays;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test. Created Dec 25, 2020.
 */
public class EfficientlyMerging {
	/*
	 * public static void main (String args[] ) { int[] a1 = {10}; int[] a2 = {2,3};
	 * Arrays.sort(a1); Arrays.sort(a2);
	 * 
	 * EfficientlyMerging m = new EfficientlyMerging(); m.merge(a1 , a2 , a1.length
	 * , a2.length); }
	 * 
	 * void merge (int[] a1, int[] a2 , int m ,int n ) {
	 * 
	 * for (int i = 0 ; i < m+n ; i++) { if (i<m) {
	 * 
	 * } } }
	 */

	private static int nextGap(int gap) {
		if (gap <= 1)
			return 0;
		return (gap / 2) + (gap % 2);
	}

	private static void merge(int[] arr1, int[] arr2, int n, int m) {

		// gap betwen the values at index of two arrays

		int i, j, gap = n + m;
		gap = m + n;
		for (gap = nextGap(gap); gap > 0; gap = nextGap(gap)) {
			// comparing elements in the first
			// array.
			for (i = 0; i + gap < n; i++)
				if (arr1[i] > arr1[i + gap]) {

					int temp = arr1[i];
					arr1[i] = arr1[i + gap];
					arr1[i + gap] = temp;
				}

			// comparing elements in both arrays.
			for (j = gap > n ? gap - n : 0; i < n && j < m; i++, j++)
				if (arr1[i] > arr2[j]) {
					int temp = arr1[i];
					arr1[i] = arr2[j];
					arr2[j] = temp;
				}

			if (j < m) {
				// comparing elements in the
				// second array.
				for (j = 0; j + gap < m; j++)
					if (arr2[j] > arr2[j + gap]) {
						int temp = arr2[j];
						arr2[j] = arr2[j + gap];
						arr2[j + gap] = temp;
					}
			}
		}
	}

	// Driver Code
	public static void main(String[] args) {
		int[] a1 = { 10, 27, 38, 43, 82 };
		int[] a2 = { 3, 9 };

		System.out.print("First Array: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println();

		System.out.print("Second Array: ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.println();
		// Function Call
		merge(a1, a2, a1.length, a2.length);

		System.out.print("First Array: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println();

		System.out.print("Second Array: ");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
	}
}
