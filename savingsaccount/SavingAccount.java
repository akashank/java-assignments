package in.co.savingsaccount;

public class SavingAccount {

	private double AccountNumber;
	private double AccountId;
	private double AccountBalance;
	private String AccountHolderName;
	boolean isSalaryAccount;

	
   
	

	public SavingAccount(double accountNumber, double accountId, double accountBalance, String accountHolderName,
			boolean isSalaryAccount) {
		super();
		AccountNumber = accountNumber;
		AccountId = accountId;
		AccountBalance = accountBalance;
		AccountHolderName = accountHolderName;
		this.isSalaryAccount = isSalaryAccount;
	}

	public double getAccountNumber() {
		return AccountNumber;
	}

	public void setAccountNumber(double accountNumber) {
		AccountNumber = accountNumber;
	}

	public SavingAccount(String accountHolderName) {
		super();
		AccountHolderName = accountHolderName;
	}

	public String getAccountHolderName() {
		return AccountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		AccountHolderName = accountHolderName;
	}

	public double getAccountId() {
		return AccountId;
	}

	public void setAccountId(double accountId) {
		AccountId = accountId;
	}

	public double getAccountBalance() {
		return AccountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		AccountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [AccountNumber=" + AccountNumber + ", AccountId=" + AccountId + ", AccountBalance="
				+ AccountBalance + ", AccountHolderName=" + AccountHolderName + "]";
	}
	public void withdraw(double withdraw) {
		if(isSalaryAccount == true)
		{
			if(withdraw<AccountBalance)
			{
				this.AccountBalance -= withdraw;
			}
		}
	
		 
		
	}
	public void deposit(double deposit) {
		
		
		this.AccountBalance += deposit;
	}

}
