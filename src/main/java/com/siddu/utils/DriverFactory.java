package com.siddu.utils;

import org.openqa.selenium.WebDriver;

public class DriverFactory {

	private static DriverFactory instance = null;

	private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<WebDriver>();

	private DriverFactory() {

	}

	public static DriverFactory getInstance() {

		if (instance == null) {
			instance = new DriverFactory();
		}

		return instance;

	}

	public void setDriver(WebDriver driver) {
		threadLocalDriver.set(driver);
	}

	public WebDriver getDriver() {

		System.out.println("getDriver Thread ID: " + Thread.currentThread().getId());
		return threadLocalDriver.get();
	}

	public void quitDriver() {

		System.out.println("closeDriver Thread ID: " + Thread.currentThread().getId());
		threadLocalDriver.get().close();
		threadLocalDriver.remove();
	}

}
