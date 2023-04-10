package com.siddu.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.siddu.pages.AmazonPage;
import com.siddu.pages.GooglePage;
import com.siddu.utils.BroswerFactory;
import com.siddu.utils.DriverFactory;
import com.siddu.utils.Log;

public class BaseTest {

	protected WebDriver driver;
	BroswerFactory bf = new BroswerFactory();
	String browser = "firefox";
	AmazonPage amazonPage;
	GooglePage googlePage;

	@BeforeTest
	public void setup() {
		System.out.println("with in setup() method - @BeforeTest");
		Log.info("Tests are starting!");

		DriverFactory.getInstance().setDriver(bf.createBrowserInstance(browser));
		driver = DriverFactory.getInstance().getDriver();
		amazonPage = new AmazonPage(driver);
		googlePage = new GooglePage(driver);
	}

	@AfterTest
	public void tearDown() {

		System.out.println("with in tearDown() method - @AfterTest");
		Log.info("Tests are ending!");
		DriverFactory.getInstance().quitDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

}
