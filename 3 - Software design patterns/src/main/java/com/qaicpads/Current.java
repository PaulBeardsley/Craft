package com.qaicpads;

public class Current extends Account {
	
	private int overdraftLimit;

	public Current(int balance, String name, int overdraftLimit) {
		this.balance = balance;
		this.name = name;
		this.overdraftLimit = overdraftLimit;
	}
	
	private int getOverdraftLimit() {
		// TODO Auto-generated method stub
		return this.overdraftLimit;
	}

	@Override
	public boolean withdraw(int amt) {
		// TODO Auto-generated method stub
		if(amt < this.balance + this.overdraftLimit) {
			this.balance -= amt;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString(){
		return "BALANCE="+this.getBalance()+", NAME="+this.getName()+", OVERDRAFT LIMIT ="+this.getOverdraftLimit();
	}

}
