package w3d5;

import java.util.Scanner;

public class Driver {
	
	public static void printAccountInformation(BankAccount tempAccount){
		System.out.println("AccountNumber : " + tempAccount.getAccountNumber() +
							"\n Full name : " + tempAccount.getCustomerName() +
							"\n Balance : $ " + tempAccount.getBalance() +
							"\n Created date " + tempAccount.getYearCreated() + "-" + tempAccount.getMonthCreated());
	}
	
	public static void makeTransition(BankAccount first, BankAccount second) {
		Scanner input = new Scanner(System.in);
		System.out.println("If you are the first user please enter 1 else please enter 2");
		int numEntered = input.nextInt();
		System.out.println("for deposit please enter d and for withdraw pelase enter w");
		String stringEntered = input.next();
		System.out.println("please enter the amount that you want to make transition");
		double amountEntered = input.nextDouble();
		
		if(numEntered == 1) {
			switch(stringEntered) {
			case "d" :
				first.deposit(amountEntered);
				printAccountInformation(first);
			case "w" :
				first.withdraw(amountEntered);
				printAccountInformation(first);
			default :
				System.err.println("Wrong Input");
			}
			
		} else if(numEntered == 2){
			switch(stringEntered) {
			case "d" :
				second.deposit(amountEntered);
				printAccountInformation(second);
			case "w" :
				second.withdraw(amountEntered);
				printAccountInformation(second);
			default :
				System.err.println("Wrong Input");
			}
			
		} else { 
			System.err.println("Wrong Input");
		}
		
		
		
		
	}
	
	public static int findIndexOfAccounts(BankAccount[] accounts, String cName) {
		
		for(int i = 0; i < accounts.length; i++) {
			if(accounts[i].getCustomerName().equalsIgnoreCase(cName)) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		BankAccount b1 = new BankAccount("John Doe", 500.0, 2019, 13);
		BankAccount b2 = new BankAccount("John Doe", 1000, 2020, 3);
		BankAccount b3 = new BankAccount("John Doe", 876.56, 2018, 2);
		
		BankAccount[] accounts = new BankAccount[3];
		accounts[0] = b1;
		accounts[1] = b2;
		accounts[2] = b3;
		
		System.out.println("please Enter your name: ");
		String customerName = input.nextLine();
		
		int index = findIndexOfAccounts(accounts,customerName);
		System.out.println(index);
		
		if(index == -1) {
			System.err.println("we don't have" + customerName);
		} else {
			System.out.println("please Enter w for withdraw and d for deposit");
			String s = input.nextLine();
			System.out.println("please enter the amount ");
			double amount = input.nextDouble();
			switch(s.toLowerCase()) {
			case "w": 
				accounts[index].withdraw(amount);
				printAccountInformation(accounts[index]);
				break;
			case "d":
				accounts[index].deposit(amount);
				printAccountInformation(accounts[index]);
				break;
			default:
				System.out.println("wrong input");
			}
		}
		
	}

}
