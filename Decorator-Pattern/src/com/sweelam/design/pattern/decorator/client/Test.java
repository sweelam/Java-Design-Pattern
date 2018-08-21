package com.sweelam.design.pattern.decorator.client;

import com.sweelam.design.pattern.decorator.core.BankLoanComp;
import com.sweelam.design.pattern.decorator.core.FacilityLoan;
import com.sweelam.design.pattern.decorator.core.LoanComponent;
import com.sweelam.design.pattern.decorator.core.NormalLoan;

public class Test {

	public static void main(String[] args) {
		// Here the magic goes
		LoanComponent loanComponent = new BankLoanComp();
		loanComponent = new FacilityLoan(loanComponent);
		System.out.println(loanComponent.getLoanDesc());
		System.out.println(loanComponent.fees());
		
		System.out.println();
		
		LoanComponent loanComponent2 = new BankLoanComp();
		loanComponent2 = new NormalLoan(loanComponent2);
		System.out.println(loanComponent2.getLoanDesc());
		System.out.println(loanComponent2.fees());
	}

}
