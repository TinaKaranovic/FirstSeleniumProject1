package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","/Users/monikakaranovic/Documents/selenium dependencies/drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.etsy.com/search?q=wooden%20spoon&ref=auto2&as_prefix=wooden%20s");
	}

}
