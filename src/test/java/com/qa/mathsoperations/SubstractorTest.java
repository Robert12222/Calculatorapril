package com.qa.mathsoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SubstractorTest {

	@Test
	public void test() {
		substractor substractor = new substractor();
		int actual = substractor.substract(4,1);
		Assert.assertEquals(3, actual);
	}

}
