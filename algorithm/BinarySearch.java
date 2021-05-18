//$Id$
package algorithm;

public class BinarySearch {
	public static void main(String args[]) {

		int searchnumber = 8;
		int[] arr = { 1, 2,  4, 5 , 6 , 7 , 8 };

		int start = 0;
		int end = arr.length-1;
		int mid = 0 ;

		for (int i = 0; i < arr.length; i++) {

			mid = start + ((end - start) / 2);
			System.out.println(start + " " + mid + " " + end);

			
			if (arr[mid] == searchnumber || start > end) {
				break;
			} else if (arr[mid] > searchnumber) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}

		}
		if (end>=start)
System.out.println(mid);
		else
			System.out.println("element not found");
	}
}
