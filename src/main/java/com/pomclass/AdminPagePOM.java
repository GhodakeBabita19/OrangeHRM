package com.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AdminPagePOM extends BaseClass{
	
	AdminPagePOM(){
		
		WebDriver driver = super.driver;
		PageFactory.initElements(driver, this);
	}

}
