package com.sweelam.design.pattern.strategy.soldier;

public class ArmyFireBehavior implements ArmyStrategy {

	@Override
	public void fireWithKlashnekoff() {
		System.out.println("We are using Klashnekoff");
	}

}
