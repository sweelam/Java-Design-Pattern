package com.sweelam.design.pattern.proxy.core;

import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class LookupProxy implements LookupLib {
	private LookupLoaderService loaderService;
	private JsonArray lookups;
	private JsonParser parser;

	public LookupProxy() {
		this.loaderService = new LookupLoaderService();
		this.parser = new JsonParser();
	}

	public String loadLookups() {
		if (null == lookups) {
			lookups = parser.parse(loaderService.loadLookups()).getAsJsonArray();
		}
		return lookups.toString();
	}

	public String loadLookupById(long lookupId) {
		if (null == lookups)
			loadLookups();

		Iterator<JsonElement> it = lookups.getAsJsonArray().iterator();
		while (it.hasNext()) {
			JsonObject lookup = it.next().getAsJsonObject();
			if (lookup.has("id") && lookup.get("id").getAsLong() == lookupId)
				return lookup.toString();
		}

		return new String();
	}

	public String loadLookupByName(String lookupName) {
		if (null == lookups)
			loadLookups();

		Iterator<JsonElement> it = lookups.getAsJsonArray().iterator();
		while (it.hasNext()) {
			JsonObject lookup = it.next().getAsJsonObject();
			if (lookup.has("name") && lookup.get("name").getAsString().equals(lookupName))
				return lookup.toString();
		}

		return new String();
	}

}
