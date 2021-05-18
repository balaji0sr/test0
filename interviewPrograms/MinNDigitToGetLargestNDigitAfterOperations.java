package interviewPrograms;

import java.util.Scanner;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Oct 14, 2020.
 */
public class MinNDigitToGetLargestNDigitAfterOperations {
public static void main (String args[]){
	Scanner line = new Scanner(System.in);
	System.out.print("input no of rows : ");
	int n = line.nextInt(); 
	
	int count0s, count9s;  
    
    if (n % 4 == 0) 
    {  
        count0s = n / 4;  
        count9s = n - n / 4;  
    }  
  
    else
    {  
        count0s = n / 4 + 1;  
        count9s = n - count0s;  
        count0s--;  
    }  
  
    while (count9s != 0) 
    { 
        count9s--; 
        System.out.print('9');  
    } 
  
    if (n % 4 != 0)  
        System.out.print('8');  
  
    while (count0s != 0)  
    { 
        count0s--; 
        System.out.print('0'); 
    } 
      
    System.out.println(); 
}
}
