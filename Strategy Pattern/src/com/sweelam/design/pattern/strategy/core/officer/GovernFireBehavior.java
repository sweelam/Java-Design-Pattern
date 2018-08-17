package com.sweelam.design.pattern.strategy.core.officer;

public class GovernFireBehavior implements GovernStrategy {

	@Override
	public void fireWithBerretta() {
		System.out.println("We are using Berretta");
	}

}
