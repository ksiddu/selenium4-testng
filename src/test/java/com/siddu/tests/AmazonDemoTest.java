package com.siddu.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.siddu.utils.Log;

public class AmazonDemoTest extends BaseTest {

	@Test
	public void amazonTitle() {

		System.out.println("======================================================");
		System.out.println("amazonTitle Thread ID: " + Thread.currentThread().getId());
		System.out.println("======================================================");

		Log.info("amazonTitle test" );
		//driver.get("https://www.amazon.com/");
		amazonPage.goToUrl();

		System.out.println("Page title is : " + amazonPage.getTitle());
		Log.info("Page title is : " + amazonPage.getTitle());

		Assert.assertEquals(amazonPage.getTitle(), "Amazon.com. Spend less. Smile more.");

	}

}
