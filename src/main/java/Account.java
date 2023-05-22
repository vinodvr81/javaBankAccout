
abstract class Account {
    private final int account_number;
    private final String account_name;
    private double amount;
    
    
    public Account(int account_number, String account_name, double amount) {
        this.account_number = account_number;
        this.account_name = account_name;
        this.amount = amount;
    }
    
    public int getAccountNumber() {
        return this.account_number;
    }
    
    public String getAccountName() {
        return this.account_name;
    }
    
    public double getAmount() {
        return this.amount;
    }
    
	protected double setAmount(double amount) {
		this.amount = amount;
		return this.amount;
		
	}
    public abstract void deposit(double deposit_amount);

    public abstract void withdraw(double withdraw_amount);

}

