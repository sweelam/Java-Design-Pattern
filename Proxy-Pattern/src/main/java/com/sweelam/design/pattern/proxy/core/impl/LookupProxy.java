package com.sweelam.design.pattern.proxy.core.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sweelam.design.pattern.proxy.core.LookupLib;

/**
 * 
 * @author Sweelam
 * This class is virtual proxy, it can also protect and restrict 
 * Proxy Types:
 * 1. Virtual
 * 2. Protection
 * 3. Remote  
 */
public class LookupProxy implements LookupLib {
	private LookupLoaderService loaderService;
	private JsonParser parser;
	private JsonArray lookups;
	private Map<Long, String> lookupIds;
	private Map<String, String> lookupNames;

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

	/**
	 * Cach Lookup IDs
	 * @param lookupId
	 * @return
	 */
	public String loadLookupById(long lookupId) {
		if (null == lookups)
			loadLookups();
		if (null == lookupIds)
			lookupIds = new HashMap<Long, String>();

		if (!lookupIds.containsKey(lookupId)) {
			Iterator<JsonElement> it = lookups.getAsJsonArray().iterator();
			while (it.hasNext()) {
				JsonObject lookup = it.next().getAsJsonObject();
				if (lookup.has("id") && lookup.get("id").getAsLong() == lookupId) {
					lookupIds.put(lookup.get("id").getAsLong(), lookup.toString());
					return lookup.toString();
				}
			}
		} else
			return lookupIds.get(lookupId);

		return new String();
	}

	/**
	 * Cach Lookup Names
	 * @param lookupName
	 * @return
	 */
	public String loadLookupByName(String lookupName) {
		if (null == lookups)
			loadLookups();

		if (null == lookupNames)
			lookupNames = new HashMap<String, String>();

		if (!lookupNames.containsKey(lookupName)) {
			Iterator<JsonElement> it = lookups.getAsJsonArray().iterator();
			while (it.hasNext()) {
				JsonObject lookup = it.next().getAsJsonObject();
				if (lookup.has("name") && lookup.get("name").getAsString().equals(lookupName))
					return lookup.toString();
			}
		} else
			return lookupNames.get(lookupName);

		return new String();
	}

}
