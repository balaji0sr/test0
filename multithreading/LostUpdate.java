package multithreading;

public class LostUpdate {

	public static void main(String[] args) {
		LostUpdateRunnable job = new LostUpdateRunnable();
		Thread a = new Thread(job);
		Thread b = new Thread(job);
		a.setName("a");
		b.setName("b");
		a.start();
		b.start();
	}
}
