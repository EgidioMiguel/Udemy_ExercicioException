package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			int number;
			double intBalance, wdLimit, amount;
			String holder;
	
	
			System.out.println("Enter account data");
			System.out.print("Number: ");
			number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			holder = sc.nextLine();
			System.out.print("Initial balance: ");
			intBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			wdLimit = sc.nextDouble();		
			Account acc = new Account(number, holder, intBalance, wdLimit);
	
			System.out.print("\nEnter amount for withdraw: ");
			amount = sc.nextDouble();
			acc.withdraw(amount);
	
			System.out.println(acc);
		}
		catch(WithdrawException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}

sc.close();	}

}
