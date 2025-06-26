package com.Vcube;

public class ATMWorking implements ATM {
     AccountDetails a;
     ATMWorking(AccountDetails a){
    	 this.a=a;
     }
     
	@Override
	public void Balance() {
		System.out.println("Your Balance in the Account is:"+a.getBal());
	}

	@Override
	public void cashDeposit(double amount) {
		if(amount>0)
		{
			a.setBal(amount+a.getBal());
			System.out.println("Amount is successfully Deposited");
			Balance();
		}
		else {
			System.out.println("sorry ! plzz enter 200 or 500");
		}
	}

	@Override
	public void cashWithdraw(double amount) {
		if(amount>0 && amount<(a.getBal()))
		{
			a.setBal(a.getBal()-amount);
			System.out.println("Amount is successfully Withdrawn");
			Balance();
		}
		else {
			System.out.println("Inavlid Amount entered");
		}
	}

}
