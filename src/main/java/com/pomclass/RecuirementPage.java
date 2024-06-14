package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class RecuirementPage extends BaseClass {

	public RecuirementPage() {
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Candidates']")
	private WebElement candidate;

	@FindBy(xpath = "//a[@class='oxd-topbar-body-nav-tab-item'])[1]")
	private WebElement jobTitleDropDown;

	@FindBy(xpath = "/div[@class='oxd-select-text-input'])[1]")
	private WebElement vacancyDropDown;

	@FindBy(xpath = "//div[@class='oxd-select-text-input'])[3]")
	private WebElement hiringManagerDropDown;

	@FindBy(xpath = "//div[@class='oxd-select-text-input'])[4]")
	private WebElement statusDropDown;

	@FindBy(xpath = "input[@placeholder='Type for hints...']")
	private WebElement candidateInput;

	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	private WebElement keywordsInput;

	@FindBy(xpath = "	//input[@placeholder='From']")
	private WebElement fromCalender;

	@FindBy(xpath = "//input[@placeholder='To']")
	private WebElement toCalender;

	@FindBy(xpath = "//div[@class='oxd-select-text-input'])[5]")
	private WebElement methodOfApplicationDropDown;

	@FindBy(xpath = "//button[@type='reset']")
	private WebElement resetButton;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement searchButton;

	@FindBy(xpath = "//button[@class='oxd-icon-button oxd-main-menu-button']")
	private WebElement addButton;

}
