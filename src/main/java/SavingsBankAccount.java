
public final class SavingsBankAccount extends Account {
	private final double interest_rate = 0.04;
	private final double minimum_balance = 10000;

	public SavingsBankAccount(int account_number, String account_name, double amount) {
		super(account_number, account_name, amount);
	}

	@Override
	public void deposit(double deposit_amount) {
		// TODO Auto-generated method stub
		double new_amount = getAmount() + deposit_amount;
		System.out.println("Deposit successful and the new balance is: =" + setAmount(new_amount));

	}

	@Override
	public void withdraw(double withdraw_amount) {
		// TODO Auto-generated method stub
		if (getAmount() - withdraw_amount >= minimum_balance) {
			double new_amount = getAmount() - withdraw_amount;
			System.out.println("Withdrawal successful and the new balance is: =" + setAmount(new_amount));
		} else {
			System.out.println("Insufficient balance amount so withdrwal is not allowed.");
		}
	}

	public void calculateInterest() {
		double interest = getAmount() * interest_rate;
		System.out.println("Interest calculated and is added to the savings bank account. Now the new balance is: ="
				+ setAmount(getAmount() + interest));
	}

}
