package com.sweelam.design.pattern.factory.core;

import com.sweelam.design.pattern.factory.core.products.Product;

/**
 * This is the client call class which abstracts all the job, 
 * Creator is totally decoupled from all other Creators 
 * @author sweelam
 *
 */
public abstract class Creator {
	
	/**
	 * This is the gear method to create objects
	 * @param type
	 * @return
	 */
	public abstract Product productFactory(String type);

	/**
	 * 
	 * @param type
	 * @return
	 */
	public Product doOperation(String type) {
		Product product = null;

		// Build the product using product type
		product = productFactory(type);
		
		// This is process is standard among all products 
		product.designProduct();
		product.buildTheProduct();
		product.testProduct();
		
		return product;
	}
}
