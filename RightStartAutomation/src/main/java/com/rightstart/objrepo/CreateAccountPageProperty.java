package com.rightstart.objrepo;

import org.openqa.selenium.By;

public interface CreateAccountPageProperty {

	
	By  FirstName=By.id("dwfrm_profile_customer_firstname");
	By LastName=By.id("dwfrm_profile_customer_lastname");
	By Email=By.id("dwfrm_profile_customer_email");
	By ConfirmEmail=By.id("dwfrm_profile_customer_emailconfirm");
	
	By Password=By.id("dwfrm_profile_login_password");
	By confirmPassword=By.id("dwfrm_profile_login_passwordconfirm");
	
	By submitButton=By.name("dwfrm_profile_confirm");
}
