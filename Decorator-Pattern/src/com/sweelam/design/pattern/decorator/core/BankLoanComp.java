package com.sweelam.design.pattern.decorator.core;

/**
 * 
 * @author sweelam
 *
 */
public class BankLoanComp extends LoanComponent{

	@Override
	public double fees() {
		return 220;
	}

}
