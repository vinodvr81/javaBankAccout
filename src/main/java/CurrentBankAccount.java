
public final class CurrentBankAccount extends Account {
	private final double minimum_balance = 5000;

	public CurrentBankAccount(int account_number, String account_name, double deposit_amount) {
		super(account_number, account_name, deposit_amount);
	}

	@Override
	public void deposit(double deposit_amount) {
		double new_amount = getAmount() + deposit_amount;
		System.out.println("Deposit successful and the new balance is: =" + setAmount(new_amount));
	}

	@Override
	public void withdraw(double withdraw_amount) {
		if (getAmount() - withdraw_amount >= minimum_balance) {
			double new_amount = getAmount() - withdraw_amount;
			System.out.println("Withdrawal successful and the new balance is: =" + setAmount(new_amount));
		} else {
			System.out.println("Insufficient balance amount so withdrwal is not allowed.");
		}
	}
}
