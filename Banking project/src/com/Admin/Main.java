package com.Admin;

import java.util.Scanner;

import com.operation.Operation;

public class Main {
	public static void main(String[] args) {
		Operation op = new Operation();
		op.setAccountTypes("Saving");
		op.setAccountTypes("Regular");
		op.setAccountTypes("Temp");
		
		while (true) {
			System.out.println("Select The Option");
			System.out.println("1)Creat Account \n2) Show Acccount Details \n3)DepositeMoney \n4)WithdrawMoney");
			System.out.println(" ");

			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();

			switch (a) {
			case 1:
				op.accountNo();
				break;

			case 2:
				op.showAccDetail();
				break;

			case 3:

				op.depositeMoney();
				break;
			case 4:
				op.withdrawMoney();
				break;
			case 5:
				

			}
		}
	}
}
