package com.utility;

import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class Utility extends BaseClass {

	public static String getWebElementText(WebElement ele) {

		return ele.getText();
	}

	public static void setText(WebElement ele, String text) {
		ele.sendKeys(text);

	}

	public static void webelementClick(WebElement ele) {
		ele.click();

	}
}
