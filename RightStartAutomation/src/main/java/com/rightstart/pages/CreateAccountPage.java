package com.rightstart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.CreateAccountPageProperty;
import com.rightstart.utility.WebElements;

public class CreateAccountPage extends WebElements implements CreateAccountPageProperty{

	WebDriver driver;
	
	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	public void enterFirstName(String testData) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Create Account driver "+driver);
		enterText(FirstName,testData);
	
		
	}
	
	public void enterLastName(String testData) {
		enterText(LastName,testData);
	}
	
	public void enterEmail(String testData) {
		enterText(Email, testData);
	}
	
	public void enterConfirmEmail(String testData) {
		enterText(ConfirmEmail, testData);
	}
	
	public void enterPassword(String testData) {
		enterText(Password, testData);
	}
	public void enterConfirmPassword(String testData) {
		enterText(confirmPassword, testData);
	}
	
	public void clickSubmit() {
		click(submitButton);
	}
}
