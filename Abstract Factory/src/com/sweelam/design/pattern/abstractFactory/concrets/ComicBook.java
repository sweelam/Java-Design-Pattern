package com.sweelam.design.pattern.abstractFactory.concrets;

import com.sweelam.design.pattern.abstractFactory.GenBook;

public class ComicBook implements GenBook {

	@Override
	public void readBook() {
		System.out.println("I'm reading a Comic book");
	}
	
}
