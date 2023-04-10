package com.siddu.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GooglePage extends BasePage {

	public GooglePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void goToUrl() {
		driver.get("https://www.google.com/");
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
