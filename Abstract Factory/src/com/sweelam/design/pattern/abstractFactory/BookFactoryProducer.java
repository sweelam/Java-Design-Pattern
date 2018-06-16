package com.sweelam.design.pattern.abstractFactory;

/**
 * 
 * @author sweelam
 *
 */
public class BookFactoryProducer {
	
	/**
	 * To get the factory you need , note the families the system has must be declared here .
	 * @param factory
	 * @return
	 */
	public static BookFactory getFactory(String factory) {
		if (null == factory)
			return null;

		if (factory.equals(BookClassifier.GENERAL_BOOK.toString()))
			return new GeneralBookFactory();
		else if (factory.equals(BookClassifier.SCIENTIFIC_BOOK.toString()))
			return new SienceBookFactory();

		return null;
	}
	
}
