package com.sweelam.design.pattern.observer.core;

import com.sweelam.design.pattern.observer.subscribers.SubscriptionInfo;

/**
 * 
 * @author sweelam
 *
 */
public interface Observer {
	public void update(SubscriptionInfo subscriptionInfo);
}
