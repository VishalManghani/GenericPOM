package com.qa.pages;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage{

	public LandingPage(WebDriver driver) {
		super(driver);		
	}

	//Locators
	By lnkSignIn = By.xpath("//a[contains(text(),'Sign in')]");
	By txtEmail = By.xpath("//input[contains(@id,'email_create')]");
	By btnCreateAccount = By.xpath("//button[contains(@id,'SubmitCreate')]");
	
	//Methods
	public void CreatAccount() {
		String timeStamp = new SimpleDateFormat("YYYY.MM.dd.HH.mm.ss").format(new Date());
		String email = "testorder" + timeStamp + "@yopmail.com";
		Click(lnkSignIn);
		EnterText(txtEmail, email);
		Click(btnCreateAccount);
	}
	
}
