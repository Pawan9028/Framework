package com.framework.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.framework.Base.BaseClass;
import com.framework.pages.HomePage;

public class TestClass extends BaseClass {

	
	@Test
	public void verify() throws InterruptedException {
		System.out.println("Hello");
		Assert.assertTrue(true);
	}
	@Test
	public void verifyLoginWithValidCredential() throws InterruptedException {
		HomePage hm=new HomePage(driver);
		hm.login();
	}

}
