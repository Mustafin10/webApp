package asser;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import laba4.Rasschet;

public class TestRasschet {

	@Test
	public void test() {
		assertNotNull(Rasschet.c); //проверка на не путстоту переменной с
		assertNotNull(Rasschet.cdu);//проверка на не путстоту переменной cdu
	}

}
