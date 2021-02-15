package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("Before executing any methods in the class");
	}
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute last");
	}
	@Test(groups= {"Smoke"})
	public void Demo()
	{

		System.out.println("hello");
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("I am no 1 from the last");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye");
		Assert.assertTrue(false);
	}

}
