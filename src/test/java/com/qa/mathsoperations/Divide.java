package com.qa.mathsoperations;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Divide {

	@Test
	public void test() {
		DivideOp divide = new DivideOp();
		int actual = divide.divide(4,2);
		Assert.assertEquals(2, actual);

}
}