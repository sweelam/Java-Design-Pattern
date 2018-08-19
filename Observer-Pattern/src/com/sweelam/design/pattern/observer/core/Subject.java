package com.sweelam.design.pattern.observer.core;

/**
 * 
 * @author sweelam
 * This interface can be normal concrete class, 
 * but as OO principles advise :
 * (Programming to interface not to implementation)
 */
public interface Subject {
	
	/**
	 * Each Observer should register itself as observer.
	 * @param observer
	 */
	public void registerObserver(Observer observer);
	
	/**
	 * Observer removal
	 * @param observer
	 */
	public void removeObserver(Observer observer);
	
	/**
	 * The automatic notification method to notify all observers
	 */
	public void notifyObservers();
}
