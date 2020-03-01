package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccount extends BasePage {

	public CreateAccount(WebDriver driver) {
		super(driver);
	}

	//Locators
	By rbGenderMr = By.xpath("//input[contains(@id,'id_gender1')]");
	By rbGenderMrs = By.xpath("//input[contains(@id,'id_gender2')]");
	By txtCustomerFirstName = By.xpath("//input[contains(@id,'customer_firstname')]");
	By txtCustomerLastName = By.xpath("//input[contains(@id,'customer_lastname')]");
	By txtPassword = By.xpath("//input[contains(@id,'passwd')]");
	By ddDays = By.xpath("//select[contains(@id,'days')]");
	By ddMonths = By.xpath("//select[contains(@id,'months')]");
	By ddYears = By.xpath("//select[contains(@id,'years')]");
	By chkNewsLetters = By.xpath("//input[contains(@id,'newsletter')]");
	By txtAddressFirstName = By.xpath("//*[@id=\"firstname\"]");
	By txtAddressLastName = By.xpath("//*[@id=\"lastname\"]");
	By txtAddress = By.xpath("//input[contains(@name,'address1')]");
	By txtAddress2 = By.xpath("//input[contains(@name,'address2')]");
	By txtCity = By.xpath("//input[contains(@name,'city')]");
	By ddState = By.xpath("//select[contains(@id,'state')]");
	By txtPostCode = By.xpath("//input[contains(@id,'postcode')]");
	By ddCountry = By.xpath("//select[contains(@id,'country')]");
	By txtAdditionalInfo = By.xpath("//textarea[contains(@id,'other')]");
	By txtHomePhone = By.xpath("//input[@id = 'phone']");
	By txtMobilePhone = By.xpath("//input[@id = 'phone_mobile']");
	By txtAliasAddress = By.xpath("//input[@id = 'alias']");
	By btnRegister = By.xpath("//span[contains(text(),'Register')]");
	
	
	//Methods
	public void EnterRegistrationData() {
		Click(rbGenderMr);
		EnterText(txtCustomerFirstName, "TestFirst");
		EnterText(txtCustomerLastName, "Test Last");
		EnterText(txtPassword, "Test@123");
		SelectByIndex(ddDays, 9);
		SelectByIndex(ddMonths, 3);
		SelectByIndex(ddYears, 20);
		EnterText(txtAddressFirstName, "Test First");
		EnterText(txtAddressLastName, "Test Last");
		EnterText(txtAddress, "404");
		EnterText(txtAddress2, "Baker Street");
		EnterText(txtCity, "Alaska");
		SelectByIndex(ddState, 3);
		EnterText(txtPostCode, "45458");
		SelectByIndex(ddCountry, 1);
		EnterText(txtAdditionalInfo, "Test Additional Info");
		EnterText(txtHomePhone, "1212121212");
		EnterText(txtMobilePhone, "8787878787");
		EnterText(txtAliasAddress, "Test Alias");
		Click(btnRegister);
	}
}
