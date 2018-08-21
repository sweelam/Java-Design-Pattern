package com.sweelam.design.pattern.decorator.core;

public class FacilityLoan extends BankDecorator{
	private LoanComponent loanComp;
	
	public FacilityLoan(LoanComponent loanComponent) {
		this.loanComp = loanComponent;
	}
	
	@Override
	public String getLoanDesc() {
		return this.loanComp.getLoanDesc() + " Facility for special customers";
	}

	@Override
	public double fees() {
		return this.loanComp.fees() + 100;
	}

}
