package multithreading;

public class BankAccount {
	private int balance = 100;

	public int getBalance() {
		//System.out.println("balance amount " + balance);
		return balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
}
