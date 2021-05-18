package multithreading;

public class RunnableTest1 implements Runnable {
	public void run() {
		System.out.println("print");
		/*try {
			Thread.sleep(10000);
		}
		catch (InterruptedException ex) {
			ex.printStackTrace();
		}*/
		
		go();
	}
	public void main() {
		
	}
	public void go() {
		doMore();
	}

	public void doMore() {
		System.out.println("top 0' the stack");
	}
}
