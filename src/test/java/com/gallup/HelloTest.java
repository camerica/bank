package com.gallup;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloTest extends Hello {
	Hello h = new Hello();
	
	@Test
	public void test() {
		assertEquals("Hello Scott", h.createMsg("Scott"));
	}

}
