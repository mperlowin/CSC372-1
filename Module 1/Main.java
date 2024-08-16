public class Main {

	public static void main(String[] args) {
		
        // Create a BankAccount instance
        BankAccount bankAccount = new BankAccount("John", "Doe", 12345);
        bankAccount.deposit(500.0);
        bankAccount.withdrawal(150.0);
        bankAccount.accountSummary();
        
        // Create a CheckingAccount instance
        CheckingAccount checkingAccount = new CheckingAccount("Jane", "Smith", 67890, 1.5);
        checkingAccount.deposit(1000.0);
        checkingAccount.processWithdrawal(1200.0);
        checkingAccount.displayAccount();

	}

}