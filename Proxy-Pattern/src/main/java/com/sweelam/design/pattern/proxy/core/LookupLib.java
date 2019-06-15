package com.sweelam.design.pattern.proxy.core;

public interface LookupLib {
	String loadLookups();

	String loadLookupById(long lookupId);

	String loadLookupByName(String lookupName);
}
