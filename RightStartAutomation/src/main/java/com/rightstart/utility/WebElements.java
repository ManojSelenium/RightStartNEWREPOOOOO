package com.rightstart.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElements {

	WebDriver driver;
	
	public WebElements(WebDriver driver) {
		this.driver=driver;
	}
	
	public void click(By prop) {
		
		driver.findElement(prop).click();
	}
	
	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}
}
