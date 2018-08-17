package com.sweelam.design.pattern.facade;

import java.util.Optional;

/**
 * The Facade class is the interface for clients to minimize the coupling 
 * between the them and the subsystems (Cash , Credit , etc.)
 * @author sweelam
 *
 */
public class PayFacade {
	
	private static Payment pay;
	
	/**
	 * For simplicity the type will be passed in string format , you can use it using class type 
	 * and to avoid multiple conditions it can be applied using reflection based on class type .
	 * @param type
	 */
	public static void doPayByType(String type) {
		Optional.ofNullable(type).ifPresent((t) -> {
			pay = t.equals("Cash") ? new CashPayment() : 
				  t.equals("Credit") ? new CreditPayment() :
				  t.equals("Installment") ? new InstallmentPayment() : 
				  new CashPayment();	// Assuming the cash is the default method 	
				  
			pay.doPay();
		});
		
	}
}
