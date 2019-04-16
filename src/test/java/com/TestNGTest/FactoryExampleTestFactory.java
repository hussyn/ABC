package com.TestNGTest;

import org.testng.annotations.Factory;

public class FactoryExampleTestFactory {
	 @Factory
	    public Object[] factoryMethod() {
	        return new Object[] {
	                                new FactoryExampleTest("one"),
	                                new FactoryExampleTest("two")
	                            };
	    }
}
