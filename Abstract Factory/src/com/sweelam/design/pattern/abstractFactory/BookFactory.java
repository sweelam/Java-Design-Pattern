package com.sweelam.design.pattern.abstractFactory;

/**
 * BookFactory is the big father for this patter where you define your factory types
 * @author sweelam
 *
 */
public abstract class BookFactory {
	public abstract SciencePaper getScientificBook(String book);
	public abstract GenBook getGeneralBook(String book);
}
