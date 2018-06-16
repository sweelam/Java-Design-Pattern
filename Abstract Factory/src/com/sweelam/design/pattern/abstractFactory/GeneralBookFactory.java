package com.sweelam.design.pattern.abstractFactory;

import com.sweelam.design.pattern.abstractFactory.concrets.ComicBook;
import com.sweelam.design.pattern.abstractFactory.concrets.TragedyBook;

/**
 * GeneralBookFactory is exactly as Factory method ,
 * @author sweelam
 *
 */
public class GeneralBookFactory extends BookFactory {

	@Override
	public SciencePaper getScientificBook(String book) {
		return null;
	}

	@Override
	public GenBook getGeneralBook(String book) {
		if (null == book)
			return null;

		if (book.equals(BookClassifier.TRAGEDY.toString()))
			return new TragedyBook();
		else if (book.equals(BookClassifier.COMIC.toString()))
			return new ComicBook();

		return null;
	}

}
