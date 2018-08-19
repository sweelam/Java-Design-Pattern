package com.sweelam.design.pattern.observer.core;

import com.sweelam.design.pattern.observer.subscribers.SubscriptionInfo;

/**
 * 
 * @author sweelam
 *
 */
public interface Observer {
	
	/**
	 * Each observer should be notified accoring to its business
	 * @param subscriptionInfo
	 */
	public void update(SubscriptionInfo subscriptionInfo);
}
