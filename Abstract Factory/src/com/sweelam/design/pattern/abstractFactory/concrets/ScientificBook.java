package com.sweelam.design.pattern.abstractFactory.concrets;

import com.sweelam.design.pattern.abstractFactory.SciencePaper;

public class ScientificBook implements SciencePaper {

	@Override
	public void readPaper() {
		System.out.println("I'm reading GoF book");
	}

}
