package com.operation;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.model.Account;

public class Operation {

	Account ac = new Account();
	private List AccountTypes = new ArrayList();

	public void setAccountTypes(String accountTypes) {
		AccountTypes.add(accountTypes);
	}

	Scanner sc = new Scanner(System.in);

	public void accountNo() 
	{

		while (true) {
			while (true) {
				while (true) {

					System.out.println("Enter account number");
					try {
						Scanner sc1 = new Scanner(System.in);

						ac.setCustomerAccountNo(sc1.nextInt());
						break;
					} catch (InputMismatchException e) {
						System.out.println("Enter Integer type Account number");
					}
				}

				Iterator i = AccountTypes.iterator();

				System.out.println("\nAvailable account types : ");
				while (i.hasNext()) {
					System.out.println(i.next());
				}

				System.out.println("\nEnter Account Type");

				 Scanner sc = new Scanner(System.in);
			ac.setAccountType(sc.next());

				if (AccountTypes.contains(ac.getAccountType())) {
					break;
				}

				else {
					System.out.println("Please enter valid account type");
				}
			}
			System.out.println("Enter customer name");
			ac.setCustomerName(sc.next());

			System.out.println("Enter customer address");
			ac.setCustomerAddress(sc.next());

			System.out.println("Enter customer id");
			ac.setId(sc.nextInt());

			System.out.println("Enter password");
			ac	.setPassword(sc.next());
			while(true)
			{
			System.out.println("Enter Deposited money");
			double Money=sc.nextDouble();
			
			
			if(Money<=1000)
			{
				ac.setMoney(Money);
			System.out.println("Account created as a saving");	
			break;
			}else if(Money<=2000)
			{
				
				System.out.println("Account Created as regular");
				
				
			}else 
			{
				System.out.println("Account created as Temporary");

			}
			
			}
			break;

		}
	}
		
	
	
	
	
	
//			}else
//			{
//				System.out.println("Deposited Ammount should be greater than1000");
//			}
//			break;
			
					
//			while (true) {
//				try {
//					// Scanner sc2 = new Scanner(System.in);
//
//					System.out.println("Enter Deposited Money");
//					double money = sc.nextDouble();
//					if (money >= 1000) {
//						ac.setMoney(money);
//						System.out.println("Money has been Deposited Successfully");
//						break;
//					} else {
//						System.out.println("amount should be greater than 1000");
//					}
//				} catch (Exception e) {
//					System.out.println("Amount should be digits only");
//				}
//			}
//			break;
//}
//}

	public void showAccDetail() 
	{
		while (true) {
			System.out.println("Enter Account number");
			try {

				// Scanner sc3 = new Scanner(System.in);
				int x = sc.nextInt();

				if (ac.getCustomerAccountNo() == x) {
					System.out.println("Customer name :" + ac.getCustomerName());

					System.out.println("Customer address :" + ac.getCustomerAddress());

					System.out.println("Custmoer id :" + ac.getId());

					System.out.println("Password :" + ac.getPassword());

					System.out.println("Money :" + ac.getMoney());
					break;
				} else {
					System.out.println("Account number does not match");
				}
			} catch (Exception a) {
				System.out.println("Account number should be digits only");
			}
		}
	}

	public void depositeMoney() 
	{
		System.out.println("Enter Account number");
		int y = sc.nextInt();

		if (ac.getCustomerAccountNo() == y) {
			System.out.println("Enter the Amount you want to Deposite");
			double depositedmoney = sc.nextDouble();

			if (depositedmoney > 0) {
				double totalmoney = ac.getMoney() + depositedmoney;
				System.out.println("total amount is :" + totalmoney);
			} else {
				System.out.println("Amount should be in double type");
			}
		}
	}

	public void withdrawMoney() 
	{

		System.out.println("Enter Account number");
		int z = sc.nextInt();

		if (ac.getCustomerAccountNo() == z) {
			System.out.println("Enter the Amount you want to withdraw");
		}
		double cashwithdrawal = sc.nextDouble();
		if (ac.getMoney() >= cashwithdrawal) {
			double BalanceAfterWithdrawal = ac.getMoney() - cashwithdrawal;
			System.out.println("Bance After Withdrawal" + BalanceAfterWithdrawal);
		} else {
			System.out.println("Your Balance is less than withdrawal Amount ");
		}

	}
}
