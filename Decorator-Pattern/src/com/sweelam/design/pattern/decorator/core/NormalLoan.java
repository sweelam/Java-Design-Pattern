package com.sweelam.design.pattern.decorator.core;

public class NormalLoan extends BankDecorator {
	private LoanComponent loanComp;
	
	public NormalLoan(LoanComponent loanComp) {
		this.loanComp = loanComp;
	}
	
	@Override
	public String getLoanDesc() {
		return this.loanComp.getLoanDesc() + " this loan for normal customers with higher loan fees";
	}

	@Override
	public double fees() {
		return this.loanComp.fees() + 1000;
	}

}
