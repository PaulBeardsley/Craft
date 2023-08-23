package com.qaicpads;

public class Savings extends Account {

	public Savings(int balance, String name) {
		this.balance = balance;
		this.name = name;
	}

	@Override
	public boolean withdraw(int amt) {
		if(amt < this.balance) {
			this.balance -= amt;
			return true;
		}
		return false;
	}

}
