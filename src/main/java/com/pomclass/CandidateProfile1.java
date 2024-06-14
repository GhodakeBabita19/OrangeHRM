package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class CandidateProfile1 extends BaseClass{
	
	public CandidateProfile1() {
		
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//i[@class='oxd-icon bi-eye-fill']//parent::button)[1]")
	private WebElement button;
	
	@FindBy(xpath="//span[@class='oxd-switch-input oxd-switch-input--active --label-left']")
    private WebElement editSwitch;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNameInputText;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleNameInputText;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNameInputText;
	
	@FindBy(xpath="//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement jobVacancyDropDown;
	
	@FindBy(xpath="//input[@class='oxd-input oxd-input--active oxd-input--error']")
	private WebElement emailInputText;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement contactNumberInputText;
	
	@FindBy(xpath="//div[text()='Browse']")
	private WebElement browserButton;
	
	@FindBy (xpath="//input[@placeholder='Enter comma seperated words...']")
    private WebElement keywordsInputText;
	
	@FindBy(xpath="//textarea[@placeholder='Type here']")
	private WebElement notesInputText;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
    private WebElement	consentToKeepDataCheckBox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	}
