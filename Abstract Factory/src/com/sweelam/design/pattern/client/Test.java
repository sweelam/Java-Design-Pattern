package com.sweelam.design.pattern.client;

import com.sweelam.design.pattern.abstractFactory.BookClassifier;
import com.sweelam.design.pattern.abstractFactory.BookFactory;
import com.sweelam.design.pattern.abstractFactory.BookFactoryProducer;
import com.sweelam.design.pattern.abstractFactory.GenBook;
import com.sweelam.design.pattern.abstractFactory.SciencePaper;

/**
 * Client class 
 * @author sweelam
 *
 */
public class Test {

	public static void main(String[] args) {
		
		BookFactory book = null;
		book = BookFactoryProducer.getFactory(BookClassifier.SCIENTIFIC_BOOK.toString());
		SciencePaper paper = null;
		paper = book.getScientificBook(BookClassifier.PAPAER.toString());
		paper.readPaper();
		paper = book.getScientificBook(BookClassifier.GANG_OF_FOUR.toString());
		paper.readPaper();
		
		System.out.println("---------------------------------");
		
		
		book = BookFactoryProducer.getFactory(BookClassifier.GENERAL_BOOK.toString());
		GenBook genBook = null;
		genBook = book.getGeneralBook(BookClassifier.COMIC.toString());
		genBook.readBook();
		genBook = book.getGeneralBook(BookClassifier.TRAGEDY.toString());
		genBook.readBook();
	}

}
