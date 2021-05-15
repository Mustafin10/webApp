package asser;

import static org.junit.Assert.*;

import org.junit.Test;

import laba4.Calc;

public class TestCalc {

	@Test
	public void test() {
		assertNotNull("class Calc not null", Calc.class);
	}

}
