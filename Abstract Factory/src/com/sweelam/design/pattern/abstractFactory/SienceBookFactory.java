package com.sweelam.design.pattern.abstractFactory;

import com.sweelam.design.pattern.abstractFactory.concrets.Paper;
import com.sweelam.design.pattern.abstractFactory.concrets.ScientificBook;

/**
 * SienceBookFactory is exactly as Factory method ,
 * @author sweelam
 *
 */
public class SienceBookFactory extends BookFactory {

	@Override
	public SciencePaper getScientificBook(String book) {
		if (null == book)
			return null;

		if (book.equals(BookClassifier.GANG_OF_FOUR.toString()))
			return new ScientificBook();
		else if (book.equals(BookClassifier.PAPAER.toString()))
			return new Paper();

		return null;
	}

	@Override
	public GenBook getGeneralBook(String book) {
		return null;
	}

}
