package com.sweelam.design.pattern.command.core.devices;

/**
 * Air Condition which should do a task requested from invoker to get command
 * @author sweelam
 *
 */
public class TV extends DeviceOperator {
	public void on() {
		System.out.println("TV is now on");
	}
	
	public void off() {
		System.out.println("TV is now off");
	}
	
	public void setupChannel() {
		System.out.println("TV is now loading channel ...");
	}
	
	public void setVolume() {
		System.out.println("TV volume is up");
	}
}
