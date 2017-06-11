package com.rightstart.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rightstart.utility.TestBase;

public class EditAccountTest extends TestBase {

	
	@BeforeMethod
	public void setUp() {
		launchBrowser();
	}
	
	
	@Test(description="Edit Account Test Case")
	public void AT_verify_EditAccounttest() {
		
	}
}
