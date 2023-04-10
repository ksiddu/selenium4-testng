package com.siddu.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.siddu.utils.Log;

public class YahooDemoTest extends BaseTest {

	@Test
	public void yahooTitle() {

		System.out.println("======================================================");
		System.out.println("yahooTitle Thread ID: " + Thread.currentThread().getId());
		System.out.println("======================================================");

		Log.info("yahooTitle test" );
		
		driver.get("https://sg.yahoo.com/");

		System.out.println("Page title is : " + driver.getTitle());
		Log.info("Page title is : " + driver.getTitle());

		Assert.assertEquals(driver.getTitle(), "Yahoo Singapore | News, Finance and Lifestyle");

	}

}
