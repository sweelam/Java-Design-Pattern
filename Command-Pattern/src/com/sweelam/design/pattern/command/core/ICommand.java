package com.sweelam.design.pattern.command.core;

/**
 * ICommand interface handles the mechanism interfaces which will be applied by each command.
 * @author sweelam
 *
 */
public interface ICommand {
	public void execute();
	public void unExecute();
}
