package com.sweelam.design.pattern.proxy.client;

import com.sweelam.design.pattern.proxy.core.impl.LookupProxy;

public class App {
	public static void main(String[] args) {
		LookupProxy proxy = new LookupProxy();
		System.out.println(proxy.loadLookupById(110));
		System.out.println(proxy.loadLookupById(120));
	}
}
