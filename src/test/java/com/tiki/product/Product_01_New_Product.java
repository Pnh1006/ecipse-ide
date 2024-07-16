package com.tiki.product;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Product_01_New_Product {

	WebDriver driver;

	@Test
	public void TC_01_Chrome() {
		driver = WebDriverManager.chromedriver().create();
		driver.get("https://google.com");
		driver.quit();
	}

	@Test
	public void TC_01_Edge() {
		driver = WebDriverManager.edgedriver().create();
		driver.get("https://google.com");
		driver.quit();
	}
}
