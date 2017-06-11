package com.rightstart.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements SetUp{

	public WebDriver driver;
	
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.gecko.driver","D:\\JARS\\geckodriver.exe");
		 driver=new FirefoxDriver();
		 System.out.println("TestBase Driver :: "+driver);
		 return driver;
	}
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
	
	public void closeBrowser() {
		driver.quit();
	}
		
}
