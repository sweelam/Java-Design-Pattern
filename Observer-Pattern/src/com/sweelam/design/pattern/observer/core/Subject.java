package com.sweelam.design.pattern.observer.core;

/**
 * 
 * @author sweelam
 *
 */
public interface Subject {
	/**
	 * 
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * 
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * The automatic notification method to notify all observers
	 */
	public void notifyObservers();
}
