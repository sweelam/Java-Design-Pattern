package com.design.pattern.facade;

/**
 * Payment abstract class is the class which will have the common function exists in the subsystem.
 * @author sweelam
 *
 */
public abstract class Payment {
	
	/**
	 * doPay will simulate payment different way based on type.
	 * @param type
	 */
	public abstract void doPay();
}
