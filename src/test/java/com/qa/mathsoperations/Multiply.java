package com.qa.mathsoperations;

import org.junit.Assert;
import org.junit.Test;

public class Multiply {

	@Test
	public void test() {
		MultiplyOp ref = new MultiplyOp();
		int actual = ref.Multiply(2,2);
		Assert.assertEquals(4, actual);
	}

}
