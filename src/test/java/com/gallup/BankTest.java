package com.gallup;

import static org.junit.Assert.*;

import org.junit.Test;

public class BankTest {
	Bank h = new Bank();

	@Test
	public void test() {
		assertEquals("Hello Scott", h.createMsg("Scott"));
	}

}
