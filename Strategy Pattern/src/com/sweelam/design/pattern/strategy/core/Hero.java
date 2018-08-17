package com.sweelam.design.pattern.strategy.core;

import com.sweelam.design.pattern.strategy.core.officer.GovernStrategy;
import com.sweelam.design.pattern.strategy.soldier.ArmyStrategy;

/**
 * 
 * @author sweelam
 * @desc The context class which is responsible for choosing strategy
 * Super class which save separation of concern with interface, 
 * which is called Programming to Interface not implementation  
 */
public abstract class Hero {
	protected ArmyStrategy armyStrategy;
	protected GovernStrategy governStrategy;
	
	public abstract void doYourBest();
	
	public void performArmyShotting() {
		this.armyStrategy.fireWithKlashnekoff();
	}

	public void performGovernShotting() {
		this.governStrategy.fireWithBerretta();
	}
	
	public void setArmyStrategy(ArmyStrategy armyStrategy) {
		this.armyStrategy = armyStrategy;
	}

	public void setGovernStrategy(GovernStrategy governStrategy) {
		this.governStrategy = governStrategy;
	}

}
