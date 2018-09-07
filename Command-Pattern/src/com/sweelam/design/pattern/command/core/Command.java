package com.sweelam.design.pattern.command.core;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.sweelam.design.pattern.command.core.devices.DeviceOperator;

/**
 * Command class is the carrier concrete class.
 * 
 * @author sweelam
 *
 */
public class Command implements ICommand {
	Queue<DeviceOperator> devices = new LinkedList<DeviceOperator>();

	public Command(Queue<DeviceOperator> devices) {
		this.devices = devices;
	}

	@Override
	public void execute() {
		for (Iterator<DeviceOperator> iterator = (Iterator<DeviceOperator>) devices.iterator(); iterator.hasNext();)
			iterator.next().on();
	}

	@Override
	public void unExecute() {
		for (Iterator<DeviceOperator> iterator = (Iterator<DeviceOperator>) devices.iterator(); iterator.hasNext();)
			iterator.next().off();
	}

}
