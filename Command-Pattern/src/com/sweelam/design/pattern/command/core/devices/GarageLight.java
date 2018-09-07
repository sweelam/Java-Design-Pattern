package com.sweelam.design.pattern.command.core.devices;

public class GarageLight extends DeviceOperator {
	public void on() {
		System.out.println("Garage light is now on");
	}
	
	public void off() {
		System.out.println("Garage light is now off");
	}
}
