package com.siddu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage extends BasePage {

	public AmazonPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void goToUrl() {
		driver.get("https://www.amazon.com/");
	}

	public String getTitle() {
		return driver.getTitle();
	}

}
