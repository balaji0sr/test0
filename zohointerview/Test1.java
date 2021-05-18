package zohointerview;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test.
 *         Created Feb 12, 2021.
 */
public class Test1 {
/*public static void main(String[] arg) {

	
	
	int x = 2 , n = 8;
	int multi = 2;

	for (int i = 1 ; i < n ; i++) {
		x = x * multi ;
		multi = multi * multi ;
		i = i * 2  ;
		
		if(i > n ) {
			n = n - i/2;
			i = 1 ;
			multi = 2;
		}
	}
	 
	
	
	System.out.println(x);
	
	
	
	
	matrix =
[[1,4,7,11,15],
[2,5,8,12,19],
[3,6,9,16,22],
[10,13,14,17,24],
[18,21,23,26,30]
] 
	
	
	
}*/
	
	public static void main(String[] arg) {
	
	
	int [][] matrix = {{1,4,7,11,15},
	                    {2,5,8,12,19},
	                    {3,6,9,16,22},
	                    {10,13,14,17,24},
	                    {18,21,23,26,30}
	                    };
	int target = 26 ;
	
	int end = 4;
	for (int i = 0 ; i< 5 ; i++) {
		for (int j = end ; j >=0  ;j -- ) {
			if (matrix[i][j] == target) {
				System.out.println(i + " , " + j );
			}
			
			if (matrix[i][j] < target) {
				end = j;
				break;
			}
			
			if (i ==  4 && j == 0 && matrix[i][j] > target) {
				System.out.println("target not found");
			}
		}
	}
	}
}
