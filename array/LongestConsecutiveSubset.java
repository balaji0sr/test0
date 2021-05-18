package array;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test. Created Jan 12, 2021.
 */
public class LongestConsecutiveSubset {
	public static void main(String[] arg) {
		int[] arr = {1, 2, 3, 4 , 4, 6, 7, 8 , 9 , 10 , 11 , 12};
		printsubset(arr, arr.length);
	}

	static void printsubset(int[] arr, int x) {
		int minindex = 0, maxindex = x - 1, tempminindex = 0, count = 0, maxcount = 0;
		for (int i = 0; i < x - 1; i++) {
			if(arr[i] == arr [i+1]) continue;
			count++;
			if (arr[i] + 1 != arr[i + 1] || i == x - 2) {
if (arr[x-2]+1==arr[x-1])count++;
				if (count > maxcount) {
					maxcount = count;
					minindex = tempminindex;
					maxindex = i;
				}
				tempminindex = i + 1;
				count = 0;
			} 
		}
		for (int i = minindex ; i <= maxindex ; i++) {
		
			if(arr[i] < arr[i+1])System.out.print(arr[i]);
		}
	}
}
