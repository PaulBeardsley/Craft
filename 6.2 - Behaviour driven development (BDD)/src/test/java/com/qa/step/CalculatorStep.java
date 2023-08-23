package com.qa.step;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

import com.qa.core.Calculator;

public class CalculatorStep {
	private Calculator myCal;
	
	@Given("a calculator")
	public void setCal() {
		myCal=new Calculator();
		System.out.println("Created");
	}
		
	@When("I add $number1 and $number2")
	public void AddCal(int x,int y) {
		myCal.addTwoNumber(x, y);
	}

	@Then("the outcome should be $result")
	public void testResult(int output) {
		 Assert.assertEquals(output, myCal.getresult());
	}
}