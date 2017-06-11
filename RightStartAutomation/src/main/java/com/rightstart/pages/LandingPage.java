package com.rightstart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.rightstart.objrepo.LandingPageProperty;
import com.rightstart.utility.WebElements;



public class LandingPage extends WebElements implements LandingPageProperty{

	WebDriver driver;
	 
	public LandingPage(WebDriver driver){
		super(driver);
		this.driver=driver;
	}
	
	public void closeWelcomePopup() {
		System.out.println("LandingPage driver  "+driver );
		click(welcomepopplocator);
	}
	
	public void clickRegister() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			click(RegisterLink);
	}
}
