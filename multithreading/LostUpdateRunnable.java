package multithreading;

public class LostUpdateRunnable implements Runnable {
	private int balance;

	public void run() {
		System.out.println(Thread.currentThread().getName() + " in run");
		for (int i = 0; i < 50; i++) {
			increment();
			System.out.println( Thread.currentThread().getName() + " balance is " + balance);
		}
	}

	public synchronized void increment() {
		System.out.println(Thread.currentThread().getName() + " in increment");
		int i = balance;
		balance = i + 1;
	}
}
