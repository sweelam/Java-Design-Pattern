package com.sweelam.design.pattern.adapter;

/**
 * Interface terget define the domain-specific that user needs.
 * @author sweelam
 * 
 */
public interface Target {
	/**
	 * request method is what user can call and has all inputs to it .
	 * for simplicity we are using request without parameters , however it backs to business case. 
	 */
	public void request();
}
