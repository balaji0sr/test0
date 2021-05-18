package inheritance;

/**
 * TODO Put here a description of what this class does.
 *
 * @author sathish kumar.
 *         Created Oct 16, 2020.
 */
public class TestPolymorphism3 {
	 public static void main(String[] args) 
	    { 
	  
	        Parent a; 
	  	  int i = 1 , j = 2;
	        a = new Subclass1(); 
	        a.Print(); 
	        
	        a = new Subclass2(); 
	        a.Print(i , j); 
	    } 
}
