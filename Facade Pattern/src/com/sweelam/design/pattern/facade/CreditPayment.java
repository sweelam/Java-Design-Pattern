package com.design.pattern.facade;

public class CreditPayment extends Payment {

	@Override
	public void doPay() {
		System.out.println("I will pay using my Credit card");
	}

}
