package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {

	
	@Test
	public void ploan() {
		System.out.println("good");
	}
	@BeforeTest
	public void prerequesite() {
		System.out.println("I will execute first");
	}
}
