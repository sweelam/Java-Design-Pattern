package com.design.pattern.facade;

public class CashPayment extends Payment {

	@Override
	public void doPay() {
		System.out.println("I will pay cash");
	}

}
