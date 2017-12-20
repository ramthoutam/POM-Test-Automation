package com.pack.base;

import org.openqa.selenium.WebDriver;

public class TestBaseSetup {
	
	private WebDriver driver;
	static String driverPath = "C:\\SeleniumDrivers\\chromedriver.exe";
	
	public WebDriver getDriver(){
		return driver;
	}
	
	
}