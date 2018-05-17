package com.qa.mathsoperations;

import org.junit.Assert;
import org.junit.Test;

public class adderTest {

	@Test
	public void test() {
		Adder adder = new Adder();
		int actual = adder.add(2,2);
		Assert.assertEquals(4, actual);
	}

}
