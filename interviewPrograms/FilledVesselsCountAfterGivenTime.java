package interviewPrograms;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Oct 14, 2020.
 */
public class FilledVesselsCountAfterGivenTime {
	static int n, t; 
	  
    // Function to find the number of 
    // completely filled vessels 
    public static int
    FindNoOfFullVessels(int n, int t) 
    { 
        // Store the vessels 
        double Matrix[][] 
            = new double[n][n]; 
  
        // Assuming all water is present 
        // in the vessel at the first level 
        Matrix[0][0] = t * 1.0; 
  
        // Store the number of vessel 
        // that are completely full 
        int ans = 0; 
  
        // Traverse all the levels 
        for (int i = 0; i < n; i++) { 
  
            // Number of vessel at each 
            // level is j 
            for (int j = 0; j <= i; j++) { 
  
                // Calculate the exceeded 
                // amount of water 
                double exceededwater 
                    = Matrix[i][j] - 1.0; 
  
                // If current vessel has 
                // less than 1 unit of 
                // water then continue 
                if (exceededwater < 0) 
                    continue; 
  
                // One more vessel is full 
                ans++; 
  
                // If left bottom vessel present 
                if (i + 1 < n) 
                    Matrix[i + 1][j] 
                        += exceededwater / 2; 
  
                // If right bottom vessel present 
                if (i + 1 < n && j + 1 < n) 
                    Matrix[i + 1][j + 1] 
                        += exceededwater / 2; 
            } 
        } 
  
        return ans; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        // Number of levels 
        int N = 611; 
  
        // Number of seconds 
        int T = 100; 
  
        // Function call 
        System.out.println( 
            FindNoOfFullVessels(N, T)); 
    } 

}
