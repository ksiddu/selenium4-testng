package com.siddu.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
	//public final WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		//wait = new WebDriverWait(driver, Duration.ofSeconds(100));
	}

}
