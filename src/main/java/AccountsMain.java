import java.util.Scanner;

public class AccountsMain {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter account number:");
	        int account_number = scanner.nextInt();

	        System.out.println("Enter account holder name:");
	        String account_name = scanner.next();

	        System.out.println("Enter initial amount:");
	        double initial_amount = scanner.nextDouble();

	        System.out.println("Enter account type (Savings/Current):");
	        String accountType = scanner.next();

	        Account account;

	        if (accountType.equalsIgnoreCase("Savings")) {
	            account = new SavingsBankAccount(account_number, account_name, initial_amount);
	        } else if (accountType.equalsIgnoreCase("Current")) {
	            account = new CurrentBankAccount(account_number, account_name, initial_amount);
	        } else {
	            System.out.println("Invalid account type!");
	            return;
	        }

	        System.out.println("Account created successfully!");

	        System.out.println("Account Number: " + account.getAccountNumber());
	        System.out.println("Account Holder: " + account.getAccountName());
	        System.out.println("Account Type: " + accountType);

	        // deposit and withdrawal
	        System.out.println("Enter deposit amount:");
	        double depositAmount = scanner.nextDouble();
	        account.deposit(depositAmount);

	        System.out.println("Enter withdrawal amount:");
	        double withdrawAmount = scanner.nextDouble();
	        account.withdraw(withdrawAmount);

	        // runtime polymorphism
	        if (account instanceof SavingsBankAccount) {
	        	SavingsBankAccount sbAccount = (SavingsBankAccount) account;
	        	sbAccount.calculateInterest();
	        }

	        scanner.close();
	    }

}
