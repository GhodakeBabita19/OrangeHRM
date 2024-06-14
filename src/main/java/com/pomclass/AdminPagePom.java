package com.pomclass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;
import com.utility.Utility;

public class AdminPagePom extends BaseClass{
	
	AdminPagePom(){
		
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);
		
	
	Alert alert = driver.switchTo().alert();
	alert.accept();
	}
	@FindBy(xpath="//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement username;

	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[1]")
	private WebElement userroleselect;

	@FindBy(xpath = "//div[contains(@class,'oxd-autocomplete-text-input')]//input")
	private WebElement employeename;

	@FindBy(xpath = "(//div[contains(text(),'-- Select --')])[2]")
	private WebElement statusselect;

	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement reset;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement search;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement adduserpage;

	public void admin() {
		
		Utility.webelementClick(admin);
		
	
	}

}
