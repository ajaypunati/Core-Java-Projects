package com.Vcube;

import java.util.Scanner;

public class TestAccount extends AccountDetails{
	TestAccount(String Accname, String AccNum, int apin,double bal)
	{
		super(AccNum, AccNum, apin,bal);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestAccount[] t = new TestAccount[3];
		String AccName;
		String AccNumber;
		int Apin;
		double bal;
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Account Holder Name:");
		    AccName=sc.next();
		    System.out.println("Enter Account Number:");
		    AccNumber=sc.next();
		    System.out.println("Enter Your PIN Number:");
		    Apin=sc.nextInt();
		    System.out.println("Enter your Initial Number:");
		    bal=sc.nextDouble();
		    t[i] =new TestAccount(AccName,AccNumber,Apin,bal);//0 1 2
		}
		System.out.println("Enter the Account holder Number:");
		String accnum=sc.next();
		System.out.println("Enrer Your PIN Number:");
		int apin=sc.nextInt();
		for(TestAccount user:t)
		{
			if(accnum.equals(user.getAccName()) && apin == (user.getApin()))
			{
				String s;
				ATMWorking a= new ATMWorking(user);
				do {
					System.out.println("Press 1 to check Balance");
					System.out.println("Press 2 to Deposit Amount");
					System.out.println("Press 3 to Withdraw Amount");
					char c=sc.next().charAt(0);
					switch(c) {
					case '1':
						a.Balance();
						break;
					case '2' :
						System.out.println("Enter the amount to deposit:");
						double amount=sc.nextDouble();
						a.cashDeposit(amount);
						break;
					case '3':
						System.out.println("Enter the amount to be withdraw:");
						double amount1=sc.nextDouble();
						a.cashWithdraw(amount1);
						break;
					default:
						System.out.println("Invalid operation");
					}
					System.out.println("Do you want to continue again: Yes or No");
					s=sc.next();
				}while(s.equalsIgnoreCase("yes"));
				System.out.println("thank u for visiting ATM");
			}
		}
		System.out.println("Invalid credentials Entered plzz check ..!");
		sc.close();
	}

}
