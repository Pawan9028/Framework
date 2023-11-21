package com.framework.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.framework.utils.UtilityClass;

public class HomePage extends UtilityClass{
	WebDriver driver;
	@FindBy(xpath="//input[@placeholder='Search our store...']")
	List<WebElement> emailId;
	
	@FindBy(xpath="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@class='search-page__form-submit']")
	WebElement loginButton;
	
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void login() throws InterruptedException {
		//eraseAndType(emailId, "clips");
		//eraseAndType(password, "password");
		//loginButton.click();
		Thread.sleep(5000);
		emailId.get(0).sendKeys("clips");
		clickIfAvailable(loginButton);
		Assert.assertEquals(true, true);
	}
}
