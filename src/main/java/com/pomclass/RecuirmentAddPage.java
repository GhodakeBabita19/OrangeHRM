package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class RecuirmentAddPage extends BaseClass {

	public RecuirmentAddPage() {
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstName']")
	private WebElement firstNameInput;
	

	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement middleNameInput;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lastNameInput;

	@FindBy(xpath = "//div[@class='oxd-select-text-input']")
	private WebElement vacancyDropDown;

	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement emailInput;

	@FindBy(xpath = "(//input[@placeholder=\"Type here\"])[2]")
	private WebElement contactNumberInput;

	@FindBy(xpath = "//div[text()='Browse']")
	private WebElement browserButton;

	@FindBy(xpath = "//i[@class='oxd-icon bi-upload oxd-file-input-icon']")
	private WebElement fileUpload;

	@FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active\"])[4]")
	private WebElement keywordsInput;

	@FindBy(xpath = "//input[@class=\"oxd-input oxd-input--active\"])[5]")
	private WebElement dateofAppliactionCalender;

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	private WebElement notesInput;

	@FindBy(xpath = "//label[text()='Consent to keep data']")
	private WebElement contextToKeepDataCheckbox;

	@FindBy(xpath = "//button[@type='button'])[3]")
	private WebElement cancelButton;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveButton;

}
