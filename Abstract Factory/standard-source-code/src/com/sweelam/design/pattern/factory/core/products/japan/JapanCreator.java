package com.sweelam.design.pattern.factory.core.products.japan;

import com.sweelam.design.pattern.factory.core.Creator;
import com.sweelam.design.pattern.factory.core.products.Product;

/**
 * Japanese Creator is at the end is just a creator which defines the mechanics of creation
 * @author sweelam
 *
 */
public class JapanCreator extends Creator {

	@Override
	public Product productFactory(String type) {
		Product product = null;
		switch (type) {
		case "TKO":
			product = new TokyoProduct();
			break;
		case "KYTO":
			product = new KyotoProduct();
			break;
		default:
			return new TokyoProduct();
		}
		return product;
	}

}
