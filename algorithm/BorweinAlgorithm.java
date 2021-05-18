package algorithm;

/**
 * TODO Put here a description of what this class does.
 *
 * @author test.
 *         Created Dec 25, 2020.
 */
public class BorweinAlgorithm {
	public double Borwein(int noOfIter) 
    { 
        // Calculating initial value of 1/pi 
        double oneByPi = 6.0 - 4 * Math.sqrt(2); 
  
        // Calculating the constant value y 
        // used in Borwein Algorithm 
        double y = Math.sqrt(2) - 1.0; 
  
        double oneByPiAfterIter; 
        double yAfterIter; 
  
        // It calculates an estimation 
        // of 1/pi that increases in accurary 
        // the more iterations you use 
        for (int i = 0; i < noOfIter; i++) { 
  
            // Based on Algorithm formulas are used 
            yAfterIter= (1 - Math.pow((1 - y * y * y * y), (0.25))) / 
                          (1+ Math.pow((1 - y * y * y * y), (0.25))); 
                            
            oneByPiAfterIter = oneByPi * Math.pow((1 + yAfterIter), 4) -  
            Math.pow(2, 2 * i + 3) * yAfterIter * (1 + yAfterIter +  
                                           yAfterIter * yAfterIter); 
                                             
            y = yAfterIter; 
              
            oneByPi = oneByPiAfterIter; 
        } 
        return oneByPi; 
    } 
  
    // Main driver method 
    public static void main(String[] args) 
    { 
        // Object of above class in main 
    	BorweinAlgorithm ob = new BorweinAlgorithm(); 
  
        // Number of Iteration 
        int noOfIter = 10; 
  
        // Printing value of 1/pi 
        System.out.println("Value of 1/pi : "
                        + ob.Borwein(noOfIter)); 
    } 
}
