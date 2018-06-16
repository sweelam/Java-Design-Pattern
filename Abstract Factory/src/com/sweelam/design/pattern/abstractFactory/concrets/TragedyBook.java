package com.sweelam.design.pattern.abstractFactory.concrets;

import com.sweelam.design.pattern.abstractFactory.GenBook;

public class TragedyBook implements GenBook {

	@Override
	public void readBook() {
		System.out.println("I'm reading Tragedy book");
	}

}
