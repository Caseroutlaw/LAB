public class SavingsAccount extends BankAccount {
	
	// Declaring instance variables
	private double rate = 2.5;
	private static int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}

	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		this.rate = oldAccount.getInterestRate();
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}
	public double getInterestRate() {
		return rate;
	}
	// This will calculate the Interest
	public void postInterest() {
		deposit((getBalance() * (getInterestRate() / 1200)));

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		System.out.printf("AccountNumber %s has been created for %s \nInitial balance = $%.2f", accountNumber,
				getOwner(), getBalance());
		return "";
	}

}