package com.sweelam.design.pattern.adapter;

/**
 * To sounds simple think of Adapter as the electrical adapter , which takes
 * input in form and gives output in another form
 * 
 * @author sweelam
 *
 */
public class Adapter implements Target {

	private Adaptee adptee;

	public Adapter(Adaptee adaptee) {
		this.adptee = adaptee;
	}

	/**
	 * Here request method call another method which will be in the adapted class
	 */
	@Override
	public void request() {
		// TODO you can do whatever logic you want here .

		this.adptee.doSomethingElse();
	}

}
