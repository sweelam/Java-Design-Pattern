package com.sweelam.design.pattern.abstractFactory.concrets;

import com.sweelam.design.pattern.abstractFactory.SciencePaper;

public class Paper implements SciencePaper {

	@Override
	public void readPaper() {
		System.out.println("I'm reading data analysis paper");
	}

}
