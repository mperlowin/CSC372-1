public class CheckingAccount extends BankAccount {
	
	private double interestRate;
	private final double OVERDRAFT_FEE = 30.0;

	// Constructor
    public CheckingAccount(String firstName, String lastName, int accountID, double interestRate) {
    	
        super(firstName, lastName, accountID);
        this.interestRate = interestRate;
        
    }
	
    // Process withdrawal method
	public void processWithdrawal(double amount) {
		
		if (amount > getBalance()) {
			
			System.out.println("Overdraft! charging a fee of $" + OVERDRAFT_FEE);
			double overdraftAmount = amount + OVERDRAFT_FEE;
			super.withdrawal(overdraftAmount);
			System.out.println("Account Balace (after fee): $" + getBalance());
			
		} else {
			
			super.withdrawal(amount);
			System.out.println("Account Balace: $" + getBalance());
			
		}
	}
	
	// Display account method
	public void displayAccount() {
		
		super.accountSummary();
		System.out.println("Interest Rate: " + this.interestRate);
		
	}

}