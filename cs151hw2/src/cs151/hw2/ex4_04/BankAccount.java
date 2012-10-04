package cs151.hw2.ex4_04;

//test

/**
 * A bank account with holder name, account #, and balance
 */
public class BankAccount implements Comparable<BankAccount> {
	private String hName;
	private String accNo;
	private double bal;
	
	/**
	 * Constructor to initialize holder name, account #, and balance
	 * @param name holder name
	 * @param num account number
	 * @param bal balance
	 */
	public BankAccount(String name, String num, double bal) {
		hName = name;
		accNo = num;
		this.bal = bal;
	}
	
	/**
	 * Get the bank account holder name
	 * @return holder name
	 */
	public String getName() {
		return hName;
	}
	
	/**
	 * Get the account number
	 * @return account number
	 */
	public String getAccNo() {
		return accNo;
	}
	
	/**
	 * Get the balance
	 * @return balance
	 */
	public double getBalance() {
		return bal;
	}
	
	/**
	 * Compares 2 bank account by balance
	 * @param other another bank account
	 * @return a negative number if the balance is less than the balance in other account
	 * a positive number if the balance is greater than the balance in other account
	 * return 0 if the balance is the same
	 */
	@Override
	public int compareTo(BankAccount other) {
		if (bal < other.getBalance()) {
			return -1;
		} else if (bal > other.getBalance())
			return 1;
		return 0;
	}
}
