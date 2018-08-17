package com.sweelam.design.pattern.strategy.client;

import com.sweelam.design.pattern.strategy.core.ArmyHero;
import com.sweelam.design.pattern.strategy.core.GovernHero;
import com.sweelam.design.pattern.strategy.core.Hero;
import com.sweelam.design.pattern.strategy.core.officer.GovernFireBehavior;
import com.sweelam.design.pattern.strategy.soldier.ArmyFireBehavior;

public class Test {

	public static void main(String[] args) {

		Hero officer = new GovernHero();
		officer.setGovernStrategy(new GovernFireBehavior());
		officer.performGovernShotting();
		
		Hero soldier = new ArmyHero();
		soldier.setArmyStrategy(new ArmyFireBehavior());
		soldier.performArmyShotting();
	}

}
