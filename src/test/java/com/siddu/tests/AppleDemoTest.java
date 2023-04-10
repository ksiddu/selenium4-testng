package com.siddu.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.siddu.utils.Log;

public class AppleDemoTest extends BaseTest {

	@Test
	public void appleTitle() {

		System.out.println("======================================================");
		System.out.println("appleTitle Thread ID: " + Thread.currentThread().getId());
		System.out.println("======================================================");

		Log.info("appleTitle test" );
		
		driver.get("https://www.apple.com/");

		System.out.println("Page title is : " + driver.getTitle());
		Log.info("Page title is : " + driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Apple");

	}

}
