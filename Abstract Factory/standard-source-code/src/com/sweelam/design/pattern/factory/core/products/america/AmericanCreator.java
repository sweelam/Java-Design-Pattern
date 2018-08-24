package com.sweelam.design.pattern.factory.core.products.america;

import com.sweelam.design.pattern.factory.core.Creator;
import com.sweelam.design.pattern.factory.core.products.Product;

/**
 * American Creator is at the end is just a creator which defines the mechanics of creation
 * @author sweelam
 *
 */
public class AmericanCreator extends Creator {

	@Override
	public Product productFactory(String type) {
		Product product = null;
		switch (type) {
		case "FL":
			product = new FloridaProduct();
			break;
		case "TX":
			product = new TexasProduct();
			break;
		default:
			return new FloridaProduct();
		}
		return product;
	}

}
