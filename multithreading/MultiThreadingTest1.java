package multithreading;

public class MultiThreadingTest1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Runnable threadJob = new RunnableTest1();
			Thread myThread = new Thread(threadJob);
			myThread.start();
			System.out.println("back to main " + i);
		}
	}
}
