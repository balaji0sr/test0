package firstinterview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Oct 7, 2020.
 */
public class FirstQus {
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
				int max , min , maxindex, minindex;
				for(int i = 0 ; i < al ; i = i +2){

					max = arr[i] ;
					min = arr[i] ;
					maxindex = i;
					minindex = i;
					for(int j = i+1 ; j < al ; j++){

						if(max < arr[j]){

							max = arr[j];
							maxindex = j;
						}else if(min > arr[j]){
							min = arr[j];
							minindex = j;
						} 
					}
					System.out.println(maxindex);
					System.out.println(minindex);
					
					arr[minindex] = arr[i+1]; 
					arr[i+1] = min ;
					
					arr[maxindex] = arr[i]; 
					arr[i] = max ;
					
					
					System.out.println(Arrays.toString(arr));

				}
				
				/*for(int i = 0 ; i < al ; i++){

					max = arr[i] ;
					min = arr[i] ;
					maxindex = i;
					minindex = i;
					for(int j = i+1 ; j < al ; j++){
						if (i%2 == 0){
							max = arr[j];
							maxindex = j;
						}else
					}*/

				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				System.out.println(Arrays.toString(arr));
				
				
	}		
}
