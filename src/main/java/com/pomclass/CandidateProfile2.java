package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class CandidateProfile2 extends BaseClass {
	
	CandidateProfile2(){
		
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//i[@class='oxd-icon bi-eye-fill'])[2]")
	private WebElement button;

	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstNameInput;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middleNameInput;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastNameInput;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	private WebElement jobVacancySelect;
	
	@FindBy(xpath="(//input[@placeholder='Type here'])[1]")
	private WebElement emailInput;
	
	@FindBy(xpath="(//input[@placeholder='Type here'])[2]")
	private WebElement contactNumberInput;

	@FindBy(xpath="//div[text()='Browse']")
	private WebElement browserButton;
	
	@FindBy(xpath="//input[@placeholder='Enter comma seperated words...']")
	private WebElement KeywordsInput;
	 
	@FindBy(xpath="//input[@placeholder='dd-mm-yyyy']")
	private WebElement dateOfApplicationInput;
	
	@FindBy(xpath="//textarea[@placeholder='Type here']")
	private WebElement notesTextarea;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	private WebElement ConsentToKeepDataCheckbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	}
