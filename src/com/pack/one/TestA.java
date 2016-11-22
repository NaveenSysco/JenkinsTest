package com.pack.one;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestA {
	
	@BeforeClass
	public void setUp() {
		System.out.println("*** In class - Test A ***");
	}

	@Test
	public void testOne() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hello");
	}
	
	@Test
	public void testTwo() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("hello");
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("*** End of class***");
	}
}