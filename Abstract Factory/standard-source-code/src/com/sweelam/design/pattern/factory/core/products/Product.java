package com.sweelam.design.pattern.factory.core.products;

/**
 * This abstract class can be also Interface , I used it as abstract here to define some default functions
 * @author sweelam
 *
 */
public abstract class Product {
	private String name;
	private String version;

	public void designProduct() {
		System.out.println("Designing Product -> " + this.getName());
	}
	
	public void buildTheProduct() {
		System.out.println("Building Product  -> " + this.getName() + " , version " + this.getVersion());
	}
	
	public void testProduct() {
		System.out.println("Testing Product   -> " + this.getName() + " , version " + this.getVersion());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}
