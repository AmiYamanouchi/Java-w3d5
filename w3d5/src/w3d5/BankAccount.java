package w3d5;


public class BankAccount {
	
	private int accountNumber;
	private String customeName;
	private double balance;
	private int yearCreated;
	private int monthCreated;
	
	//constructor (名前一緒でなければいけない)
	public BankAccount(String customerName, double balance, int yearCreated, int monthCreated) {
		setAccountNumber();
		setCustomerName(customerName);
		setBalance(balance);
		setYearCreated(yearCreated);
		
//		this.accountNumber = accountNumber;
		
		if(customeName == "" || customeName == null) {
			this.customeName = "Unknown";
		} else {
			this.customeName = customerName;
		}
		
		
		this.balance = balance;
		this.yearCreated = yearCreated;
		this.monthCreated = monthCreated;
		
		
	}
	
	//getters
	public int getAccountNumber() {	
		return accountNumber;
	}
	
	public String getCustomerName() {
		return customeName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public int getYearCreated() {
		return yearCreated;
	}
	
	public String getMonthCreated() {
		if(monthCreated < 10) {
			return "0" + monthCreated;
		} else {
			//to convert the data type of int to String
			//we should use valueOf
			return String.valueOf(monthCreated);
		}
	}
	
	
	//setters
	
	public void setAccountNumber() {
		//random number between 1000 to 10000
		//(Math.random() * (Max-Min+1)) + min
		this.accountNumber = (int)(Math.random() * (10000 - 1000 + 1) + 1000);
		
	}
	
	public void setCustomerName(String customerName) {
		if(!customeName.isEmpty() || !customeName.equalsIgnoreCase(null)) {
			this.customeName = customerName;
		}
	}
	
	public void setBalance(double balance) {
		if(balance > 0) {
			this.balance = balance;
		}
	}
	
	public void setYearCreated(int yearCreated) {
		if(yearCreated < 1900) {
			this.yearCreated = 1900;
		} else {
			this.yearCreated = yearCreated;
		}
	}
	
	public void setMonthCreated(int monthCreated) {
		if(monthCreated >= 1 && monthCreated <= 12) {
			this.monthCreated = monthCreated;
		}
	}
	
	
	//deposit(double moneyAcount) --> money which customer wants to deposit should be more then zero
	
	public void  deposit(double depositAmount) {
		if(depositAmount > 0) {
			System.out.println("\n$" + depositAmount + " deposit to the account: " + accountNumber);
			balance += depositAmount;
		} else {
			System.err.println("Deposit Amount should be more than zero.");
		}
	}
	
	//withdraw(double moneyAmount) -->money which customer wants to withdraw should be less then his balance
	
	public void  withdraw(double withdrawAmount) {
		if(withdrawAmount > 0 && withdrawAmount <= balance) {
			System.out.println("\n$" + withdrawAmount + " withdraws from the account: " + accountNumber);
			balance -= withdrawAmount;
		} else if (withdrawAmount < 0) {
			System.err.println("withdraw Amount should be more than zero.");
		} else if (withdrawAmount > balance) {
			System.err.println("withdraw Amount should be less than your balance.");
		}
	}


}
