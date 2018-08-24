package com.sweelam.design.pattern.factory.test;

import com.sweelam.design.pattern.factory.core.Creator;
import com.sweelam.design.pattern.factory.core.products.america.AmericanCreator;
import com.sweelam.design.pattern.factory.core.products.japan.JapanCreator;

public class Test {

	public static void main(String[] args) {
		Creator creator = new AmericanCreator();
		creator.doOperation("FL");
		System.out.println("\n");
		creator.doOperation("TX");

		System.out.println("\n");

		Creator creator2 = new JapanCreator();
		creator2.doOperation("TKYO");
		System.out.println("\n");
		creator2.doOperation("KYTO");
	}
}
