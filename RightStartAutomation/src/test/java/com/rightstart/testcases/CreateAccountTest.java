package com.rightstart.testcases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rightstart.pages.CreateAccountPage;
import com.rightstart.pages.LandingPage;
import com.rightstart.utility.TestBase;

public class CreateAccountTest extends TestBase{

	LandingPage landingpage;
	CreateAccountPage createaccountpage;
	@BeforeMethod
	public void setUp() {
		driver=launchBrowser();
		enterURL(automationURl);
		landingpage=new LandingPage(driver); 
		createaccountpage=new CreateAccountPage(driver);

	}


	@Test(description="Verify create account functionality")
	public void At_Verify_createaccount() {


		//CLose WelComePopup
		landingpage.closeWelcomePopup();
		//Click Register
		landingpage.clickRegister();
		//Create An Account
		createaccountpage.enterFirstName(RandomStringUtils.randomAlphabetic(5));
		createaccountpage.enterLastName(RandomStringUtils.randomAlphabetic(5));
		String email=RandomStringUtils.randomAlphabetic(5)+"@mailinator.com";
		createaccountpage.enterEmail(email);
		createaccountpage.enterConfirmEmail(email);
		
		String password="Password@123";
		createaccountpage.enterPassword(password);
		createaccountpage.enterConfirmPassword(password);
		createaccountpage.clickSubmit();
		
	}
	
	
	@AfterMethod
	public void browserClose(){
		closeBrowser();
	}
}
