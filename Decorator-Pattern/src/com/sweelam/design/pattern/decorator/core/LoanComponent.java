package com.sweelam.design.pattern.decorator.core;

/**
 * This abstract class will be the wrapper point to extend the functionality for the system ,
 * if it is not presented the system will be under two big bug possibilities :#1 Class explosion , or #2 If Else branch explosion  
 * @author sweelam
 *
 */
public abstract class LoanComponent {
	String loanDesc = "We offer ";
	
	/**
	 * Initial description method 
	 * @return
	 */
	public String getLoanDesc() {
		return this.loanDesc;
	}
	
	
	/**
	 * This is the target method, which needs to be implemented in runtime 
	 * @return
	 */
	public abstract double fees();
	
}
