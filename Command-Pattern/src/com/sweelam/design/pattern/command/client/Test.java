package com.sweelam.design.pattern.command.client;

import java.util.LinkedList;
import java.util.Queue;

import com.sweelam.design.pattern.command.core.Command;
import com.sweelam.design.pattern.command.core.Invoker;
import com.sweelam.design.pattern.command.core.devices.DeviceOperator;
import com.sweelam.design.pattern.command.core.devices.GarageLight;
import com.sweelam.design.pattern.command.core.devices.TV;

public class Test {

	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		
		Queue<DeviceOperator> deviceOperators = new LinkedList<>();
		deviceOperators.add(new TV());
		deviceOperators.add(new GarageLight());
		
		invoker.setCommand(new Command(deviceOperators));
		invoker.pressExecuteButton();
		invoker.pressUNExecuteButton();
	}

}
