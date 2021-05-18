package multithreading;

/**
 * TODO Put here a description of what this class does.
 * 
 * @author sathish kumar. Created Oct 30, 2020.
 */
public class MultiThreadingPriorityThread {

	public static void main(String[] args) {
		RunnableTestPriority t1 = new RunnableTestPriority();
		RunnableTestPriority t2 = new RunnableTestPriority();
		RunnableTestPriority t3 = new RunnableTestPriority();

		System.out.println("t1 thread priority : " + t1.getPriority()); // Default
																		// 5
		System.out.println("t2 thread priority : " + t2.getPriority()); // Default
																		// 5
		System.out.println("t3 thread priority : " + t3.getPriority()); // Default
																		// 5
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);

		System.out.println("t1 thread priority : " + t1.getPriority()); // 2
		System.out.println("t2 thread priority : " + t2.getPriority()); // 5
		System.out.println("t3 thread priority : " + t3.getPriority());// 8

		System.out.println(Thread.currentThread().getName());
		System.out.println("Main thread priority : "
				+ Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main thread priority : "
				+ Thread.currentThread().getPriority());
	}
}
