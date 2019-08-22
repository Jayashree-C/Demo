package org.india;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@Suite.SuiteClasses({A.class,B.class})
public class ExecuteAll {



	public static void main(String[] args) {
		

		Result rs=JUnitCore.runClasses(A.class,B.class)
	

	}

}
