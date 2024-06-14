package com.tests;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.baseclass.BaseClass;
import com.pomclass.LoginPagePOM;

public class LoginPageTest extends BaseClass {

	@BeforeClass

	public void setup() {

	}

	
	public void teardown() {
		driver.close();
	}

	@Test
	public void pageUrl() {

		Assert.assertEquals(getWebDriver().getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@Test
	public void loginTest() {
		LoginPagePOM loginpagepom = new LoginPagePOM();
		Assert.assertEquals(loginpagepom.getUsername(), "Admin");
		Assert.assertEquals(loginpagepom.getPassword(), "admin123");

		loginpagepom.login(loginpagepom.getUsername(), loginpagepom.getPassword());
	}

	@Test
	public void unvalidLoginTest() {
		LoginPagePOM loginPagePom = new LoginPagePOM();
		Assert.assertEquals(loginPagePom.getUnvalidUsername(), "Username");
		Assert.assertEquals(loginPagePom.getUnvalidPassword(), "Password");

		loginPagePom.unvalidLogin(loginPagePom.getUnvalidUsername(), loginPagePom.getUnvalidPassword());

		Assert.assertEquals(loginPagePom.getErrorMessage(), "Invalid credentials");
	}

	@Test

	public void forgotPasswordTest() {
		LoginPagePOM loginPagePom = new LoginPagePOM();
		Assert.assertEquals(loginPagePom.getUsername(), "Admin");
		
		SoftAssert assertion = new SoftAssert();
		assertion.assertFalse(false, loginPagePom.getPassword());
		
        loginPagePom.forgotPassword(loginPagePom.getUsername(), loginPagePom.getPassword());

	}
}
