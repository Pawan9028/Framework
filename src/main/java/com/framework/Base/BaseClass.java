package com.framework.Base;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


public class BaseClass {
	public WebDriver driver;

	@BeforeMethod
	public WebDriver openBrowser() {
		driver = new ChromeDriver();
		driver.get("https://haloluxe.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		return driver;
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
}
