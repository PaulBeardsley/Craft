package com.qaicpads;

public class AccountFactory {
	
	public static Account getAccount(String type, int balance, String name, int overdraftLimit){
		if("Current".equalsIgnoreCase(type)) {
			return new Current(balance, name, overdraftLimit);			
		}
		else if("Savings".equalsIgnoreCase(type)) {
			return new Savings(balance, name);
		}
		
		return null;
	}

}
