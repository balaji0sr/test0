package multithreading;

public class RunnableTest2 implements Runnable {
	public static void main(String[] args) {
		RunnableTest2 threadJob = new RunnableTest2();
		Thread a = new Thread(threadJob);
		Thread b = new Thread(threadJob);
		a.setName("a thread");
		b.setName("b thread");
		a.start();
		b.start();
		//System.out.println("back to main ");
	}

	public void run() {

		//if (Thread.currentThread().getName() == "a"){
		try {
		Thread.sleep(10000);
	}
	catch (InterruptedException ex) {
		ex.printStackTrace();
	}
		
		for (int i = 0; i < 25; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " is running");

		}
	}
}
