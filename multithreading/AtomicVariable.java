package multithreading;

public class AtomicVariable {
	public static void main(String[] args) 
	        throws InterruptedException 
	    { 
	       
		AtomicVariablesCounter c = new AtomicVariablesCounter(); 
		  
	        Thread first = new Thread(c , "one"); 
	        Thread second = new Thread(c , "two"); 
	  
	        first.start(); 
	        second.start(); 
	        //first.setName("first");
	        //second.setName("second");
	        first.join(); 
	        second.join(); 
	  
	        System.out.println(c.count); 
	    } 
	} 

