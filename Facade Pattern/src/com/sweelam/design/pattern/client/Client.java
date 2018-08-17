package com.sweelam.design.pattern.client;

import com.sweelam.design.pattern.facade.PayFacade;

/**
 * 
 * @author sweelam
 *	The client class which will use Facade Pattern .
 */
public class Client {

	public static void main(String[] args) {
		
		PayFacade.doPayByType("Credit");
		
		PayFacade.doPayByType("Installment");
		
		PayFacade.doPayByType("");
	}

}
