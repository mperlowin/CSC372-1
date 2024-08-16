public class BankAccount {
	
	private String firstName;
	private String lastName;
	private int accountID;
	private double balance;
	
    // Constructor
    public BankAccount(String firstName, String lastName, int accountID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountID = accountID;
        this.balance = 0.0; // Initialize balance to zero
    }
    
	// Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    
    // Withdrawal method
    public void withdrawal(double amount) {
        if (amount > 0) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    
    // Setters and Getters
    public void setFirstName(String input) {
    	this.firstName = input;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public void setLastName(String input) {
    	this.lastName = input;
    }
    
    public String getLastName() {
    	return lastName;
    }
    
    public void setAccountID(String input) {
    	this.firstName = input;
    }
    
    public int getAccountID() {
    	return accountID;
    }
    
    // Get Balance Method
    public double getBalance() {
    	return balance;
    }
    
    // Account Summary
    public void accountSummary() {
    	System.out.println("Account Summary:");
    	System.out.println("First Name: " + this.firstName);
    	System.out.println("Last Name: " + this.lastName);
    	System.out.println("Account ID: " + this.accountID);
    	System.out.println("Balance: $" + this.balance);
    }

}