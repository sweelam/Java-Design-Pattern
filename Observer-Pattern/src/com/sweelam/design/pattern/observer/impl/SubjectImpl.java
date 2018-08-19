package com.sweelam.design.pattern.observer.impl;

import java.util.ArrayList;

import com.sweelam.design.pattern.observer.core.Observer;
import com.sweelam.design.pattern.observer.core.Subject;
import com.sweelam.design.pattern.observer.subscribers.SubscriptionInfo;

/**
 * The actual mechanism for observing .
 * @author sweelam
 *
 */
public class SubjectImpl implements Subject {
	private ArrayList<Observer> observers;
	
	private SubscriptionInfo subscriptionInfo;

	/**
	 * Initialize observer list
	 */
	public SubjectImpl() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = this.observers.indexOf(observer);
		if (index > 0)
			this.observers.remove(index);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers)
			observer.update(this.subscriptionInfo);
	}
	
	/**
	 * Self pointer function
	 * @param subscriptionInfo
	 * @return
	 */
	public void setCommingWeatherData(SubscriptionInfo subscriptionInfo) {
		this.subscriptionInfo = subscriptionInfo;
		this.notifyObservers();
	}

}
