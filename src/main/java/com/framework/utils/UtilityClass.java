package com.framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UtilityClass {
	WebDriver driver;

	public UtilityClass(WebDriver driver) {
      this.driver=driver;
	}

	public void eraseAndType(WebElement ele, String str) {
		try {
			ele.clear();
		} catch (Exception e) {
			ele.sendKeys(str);
		}

	}

	public void clickIfAvailable(WebElement ele) {
		if (ele.isDisplayed()) {
			ele.click();
		} else {
			System.out.println("button is not present");
		}
	}
}
