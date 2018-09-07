package com.sweelam.design.pattern.command.core;

/**
 * Invoker represents the terse device which will ask for specific command
 * @author sweelam
 *
 */
public class Invoker {
	private ICommand command;
	
	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressExecuteButton() {
		this.command.execute();
	}
	
	public void pressUNExecuteButton() {
		this.command.unExecute();
	}
}
