package com.sweelam.design.pattern.observer.client;

import com.sweelam.design.pattern.observer.core.ForcastingDevice;
import com.sweelam.design.pattern.observer.impl.SubjectImpl;
import com.sweelam.design.pattern.observer.subscribers.SubscriptionInfo;
import com.sweelam.design.pattern.observer.weather.engine.WeatherConsumer;

public class Test {

	public static void main(String[] args) {

		// Getting data from weather engine
		SubscriptionInfo subscriptionInfo = new SubscriptionInfo();
		subscriptionInfo.setContent(WeatherConsumer.getWeatherData().get("query").toString());

		SubjectImpl subjectImpl = new SubjectImpl();
		new ForcastingDevice(subjectImpl);					// Do observer work
		subjectImpl.setCommingWeatherData(subscriptionInfo);
	}

}
