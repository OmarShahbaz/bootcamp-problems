package practice;

import java.util.Scanner;

public class Bank {
	String bankName;
	int id;
	double balance;

	Bank(){}
	
	public Bank(String bankName, int id, double balance) {
		
		this.bankName = bankName;
		this.id = id;
		this.balance = balance;
	}
	void details() {
		System.out.println("Bank Name: "+bankName);
		System.out.println("id: "+id);
		System.out.println("Balance: "+balance);
	}
	void withdraw(int moneyRemaining) {
		System.out.println(balance-moneyRemaining);
	}
	void deposit(int depositMoney) {
		System.out.println("New Balance: "+balance+depositMoney);
	}
	
	public static void main(String[] args) {
		Bank bank = new Bank("BOP",1,10_000);
		boolean check = true;
		
		do {
			System.out.println("1. View Details");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Deposit Money");
			System.out.println("Choose Operation: ");
			Scanner operation = new Scanner(System.in);
			int choice = operation.nextInt();
			switch(choice) {
			
			case 1:
				bank.details();
				break;
			case 2:
				bank.withdraw(3_000);
				break;
			case 3: 
				bank.deposit(4_000);
				break;
			default: {
				System.out.println("Wrong Operation");
				check=false;
			}	
		}
		}while(check);
		
	}

}

