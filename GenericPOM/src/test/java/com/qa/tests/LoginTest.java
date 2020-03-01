package com.qa.tests;

import org.testng.annotations.Test;

import com.qa.pages.LandingPage;
import com.qa.pages.*;


public class LoginTest extends TestBase {

	@Test (priority = 0)
	public void CreateAccount() {
		//HomePage hm = new HomePage(driver);
		LandingPage lp = new LandingPage(driver);
		lp.CreatAccount();
	}
	
	@Test (priority = 1)
	public void EnterRegistrationData() {
		CreateAccount ca = new CreateAccount(driver);
		ca.EnterRegistrationData();
		
	}
	
	@Test (priority = 2)
	public void AddTwoWomensItems() {
		WomensPage wp = new WomensPage(driver);
		wp.AddFirstItemOnWomensList();
	}
	
	@Test(priority = 3)
	public void ConfirmOrder() {
		CheckoutPage cp = new CheckoutPage(driver);
		cp.CheckOutAndVerify();
	}
}
