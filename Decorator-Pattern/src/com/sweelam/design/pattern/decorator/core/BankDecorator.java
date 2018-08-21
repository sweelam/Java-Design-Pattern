package com.sweelam.design.pattern.decorator.core;

/**
 * This class attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality, NOT for adding new functionality
 * @author sweelam
 *
 */
public abstract class BankDecorator extends LoanComponent{
	public abstract String getLoanDesc();
}
