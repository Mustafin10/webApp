package asser;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import laba4.SelectionCity;

public class TestSelectionCity {
	
	String expectedString;
	boolean expectedBoolean;
	
	@Before
	public void pretest() {
		assertNotNull(SelectionCity.s);
	}

	@Test
	public void test() {
		
		assertNotSame(SelectionCity.s, expectedString);
		assertNotSame(SelectionCity.s, expectedBoolean);
	}

}
