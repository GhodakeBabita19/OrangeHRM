package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class VacancyAddPagePom extends BaseClass{
	
	public VacancyAddPagePom() {
		
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addButton;
	
	@FindBy(xpath="(//input[@class=\"oxd-input oxd-input--active\"]//parent::div)[2]")
	private WebElement vacancyNameInput;
	
	@FindBy(xpath="//div[@class='oxd-select-text-input']")
	private WebElement jobTitleDropDown;
	
	@FindBy(xpath="//textarea[@placeholder='Type description here']")
    private WebElement descriptionInput;
	
	@FindBy(xpath="//input[@placeholder='Type for hints...']")
	private WebElement hiringManagerInput;
	
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[3]")
	private WebElement numbersOfPositionsInput;
	
	@FindBy(xpath="(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[1]")
	private WebElement activeSwitch;
	
	@FindBy(xpath="(//span[@class='oxd-switch-input oxd-switch-input--active --label-right'])[2]")
	private WebElement	publishSwitch;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	private WebElement cancelButton;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement saveButton;
	
	
	

}
