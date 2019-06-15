package com.sweelam.design.pattern.proxy.core;

import java.util.Iterator;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sweelam.design.pattern.proxy.data.DataHolder;

public class LookupLoaderService implements LookupLib {
	private JsonParser parser = new JsonParser();

	public String loadLookups() {
		JsonArray lookupsArray = new JsonArray();
		lookupsArray.add(DataHolder.DATA);
		return lookupsArray.getAsString();
	}

	public String loadLookupById(long lookupId) {
		JsonArray lookupsArray = parser.parse(loadLookups()).getAsJsonArray();
		Iterator<JsonElement> it = lookupsArray.iterator();
		while(it.hasNext()) {
			JsonObject lookup = it.next().getAsJsonObject();
			if(lookup.has("id") && lookup.get("id").getAsLong() == lookupId)
				return lookup.toString();
		}
		return new String();
	}

	public String loadLookupByName(String lookupName) {
		JsonArray lookupsArray = parser.parse(loadLookups()).getAsJsonArray();
		Iterator<JsonElement> it = lookupsArray.iterator();
		while(it.hasNext()) {
			JsonObject lookup = it.next().getAsJsonObject();
			if(lookup.has("name") && lookup.get("name").getAsString().equals(lookupName))
				return lookup.toString();
		}
		return new String();
	}

}
