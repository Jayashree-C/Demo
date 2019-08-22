package org.india.TestNG2;

import org.testng.annotations.Test;

public class B {
	@Test(enabled=false)
	private void tc3() {
	System.out.println("1234");

	}
	@Test(invocationCount=3)
	private void tc4() {
	System.out.println("abcd");

	}
	

}
