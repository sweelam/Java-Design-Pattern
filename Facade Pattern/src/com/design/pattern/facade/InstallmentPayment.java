package com.design.pattern.facade;

public class InstallmentPayment extends Payment {

	@Override
	public void doPay() {
		System.out.println("I will pay later each month");
	}

}
