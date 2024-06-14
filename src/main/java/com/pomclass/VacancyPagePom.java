package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class VacancyPagePom extends BaseClass {
	
	VacancyPagePom(){
		
		WebDriver driver = super.getWebDriver();
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Vacancies']")
	 private WebElement vacancy;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[1]")
	private WebElement jobTitleDropDown;
	
	@FindBy(xpath="(//div[@role='listbox']")
	private WebElement select;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement vacancyDropDown;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement hiringManagerDropDown;
	
	@FindBy(xpath="(//div[@class='oxd-select-text oxd-select-text--active'])[4]")
     private WebElement statusDropDown;
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")
	private WebElement resetButton;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement searchButton;
	

}
