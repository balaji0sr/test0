import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] arg) {
		boolean continueLoop = true;
		while (continueLoop) {
			try {
				Scanner arraylength = new Scanner(System.in);
				System.out.print("Input array length: ");
				int x = arraylength.nextInt();
				
				int[] nums = new int[x];
				int y = 0;
				System.out.println("input values to the array : ");
				while (y < x) {
					Scanner numsinarray = new Scanner(System.in);
					nums[y] = numsinarray.nextInt();
					y = y + 1;
				}
				
				 Scanner resultvalue = new Scanner(System.in);
					System.out.print("Input result amount: ");
					int n = resultvalue.nextInt();
				
				
				
				int arr[] = new int[n]; 
				
				findCombinationsUtil(arr, 0, n, n);

				 continueLoop = true;

			} catch (Exception string) {
				System.out.println("can't process the given input");
			}
		}
	}

private static void findCombinationsUtil(int arr[], int index, int num, int reducedNum) {

		if (reducedNum < 0)
			return;
	

		if (reducedNum == 0)
		{
			if ()
			for (int i = 0; i < index; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}

		int prev = (index == 0) ? 1 : arr[index - 1];
		for (int k = prev; k <= num; k++)
		{
			arr[index] = k;
			findCombinationsUtil(arr, index + 1, num, reducedNum - k);
		}
	}
}

	/*public static void main(String[] arg) {
		Scanner arraylength = new Scanner(System.in);
					System.out.print("Input array length: ");
					int x = arraylength.nextInt();
	            
					int[] nums = new int[x];
					if (x >0){
					int y = 0;
					System.out.println("input values to the array : ");
					while (y < x) {
						Scanner numsinarray = new Scanner(System.in);
						nums[y] = numsinarray.nextInt();
						y = y + 1;
					}
	               		Arrays.sort(nums);

	                    Scanner resultvalue = new Scanner(System.in);
					System.out.print("Input result amount: ");
					int result = resultvalue.nextInt();
					
					 int count = 0 ;
					 

	               for (y = x - 1; y >= 0 ; y--) { 
	            if (result >= nums[y]) { 
	                count = count + (result / nums[y]); 
	                result = result % nums[y];

	            } 
	            else {
	            	x = x - 1;
                    y = x - 1 ;
                    count = 0 ;
	            }
	               }
	               System.out.println(count);
					}
	}
}*/
