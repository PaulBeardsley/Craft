package com.qaicpads;

public abstract class Account {
	
	protected int balance;
	protected String name;

	public abstract boolean withdraw(int amt);
	
	public int getBalance() {
		return this.balance;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	@Override
	public String toString(){
		return "BALANCE="+this.getBalance()+", NAME="+this.getName();
	}
	
	public boolean deposit(int amt) {
		this.balance += amt;
		return true;
	}

}
