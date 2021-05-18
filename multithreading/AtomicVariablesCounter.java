package multithreading;
import java.util.concurrent.atomic.AtomicInteger; 

public class AtomicVariablesCounter extends Thread {
	
	 AtomicInteger count; 
	  
	 AtomicVariablesCounter() 
	    { 
	        count = new AtomicInteger(); 
	    } 
	  
	    public void  run() 
	    { 
	        int max = 10; 
	  
	        for (int i = 0; i < max; i++) { 
	       	 System.out.println(Thread.currentThread().getName());

	            count.addAndGet(1);  
		       	 System.out.println(count);

        } 
    } 

}
