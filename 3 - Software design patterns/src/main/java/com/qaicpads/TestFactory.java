package com.qaicpads;

public class TestFactory {
	
	public static void main(String[] args) {
		Account current = AccountFactory.getAccount("current",250,"My Current Account",100);
		Account savings = AccountFactory.getAccount("SAVINGS",300,"My Savings Account", 0);
		
		// Initial values
		System.out.println("Factory Current Account Details::"+current);
		System.out.println("Factory Savings Account Details::"+savings);
		
		// Try to withdraw within Current account limit
		current.withdraw(300);
		System.out.println("Factory Current Account Details::"+current);
		
		// Try to go over Current overdraft limit
		current.withdraw(300);
		System.out.println("Factory Current Account Details::"+current);
		
		// Try to withdraw more than balance
		savings.withdraw(350);
		System.out.println("Factory Savings Account Details::"+savings);
		
		
		// Try to withdraw less than balance
		savings.withdraw(200);
		System.out.println("Factory Savings Account Details::"+savings);
		
	}

}
