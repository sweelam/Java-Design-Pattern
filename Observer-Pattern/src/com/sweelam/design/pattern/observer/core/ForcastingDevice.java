package com.sweelam.design.pattern.observer.core;

import com.sweelam.design.pattern.observer.subscribers.SubscriptionInfo;

public class ForcastingDevice implements Observer {
	private Subject subject;
	
	public ForcastingDevice(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	
	private String content;
	
	@Override
	public void update(SubscriptionInfo subscriptionInfo) {
		this.content = subscriptionInfo.getContent();
		this.display();
	}
	
	private void display() {
		System.out.println("Comming data \n" + this.content);
	}
}
