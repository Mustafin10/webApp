package asser;

import static org.junit.Assert.*;

import org.junit.Test;

import laba4.UserForm;

public class TestUserForm {

	int testint;
	String teststring;
	
	@Test
	public void test() {
		int results = UserForm.results;
		
		String p21 = UserForm.p21;
		String gorod = UserForm.gorod;
		
		assertSame(testint,results); //проверка переменной results, что она является типом int
		
		assertSame(teststring,p21,gorod); //проверка переменных p21 и gorod на принадлежность к типу String
	}

}
