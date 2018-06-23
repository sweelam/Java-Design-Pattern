package com.sweelam.design.pattern.test;

import com.sweelam.design.pattern.adapter.Adaptee;
import com.sweelam.design.pattern.adapter.Adapter;
import com.sweelam.design.pattern.adapter.Target;

public class Test {
	public static void main(String[] ag) {
		Target target = new Adapter(new Adaptee());
		target.request();
	}
}
