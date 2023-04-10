package com.siddu.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.siddu.utils.Log;

public class GoogleDemoTest extends BaseTest {

	@Test
	public void googleTitle() {

		System.out.println("======================================================");
		System.out.println("googleTitle Thread ID: " + Thread.currentThread().getId());
		System.out.println("======================================================");

		Log.info("googleTitle test" );
		// driver.get("https://www.google.com/");
		googlePage.goToUrl();

		System.out.println("Page title is : " + googlePage.getTitle());
		Log.info("Page title is : " + googlePage.getTitle());

		Assert.assertEquals(googlePage.getTitle(), "Google");

	}

}
