package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}

	//Locators
	By lblTotalPriceAtCheckout = By.xpath("//span[contains(@id,'total_price')]");
	By btnCheckOut = By.xpath("//a[contains(@class,'standard-checkout')]");
	By btnAddressCheckout = By.xpath("//button[contains(@name,'processAddress')]");
	By chkTermsAndConditions = By.xpath("//input[contains(@id,'cgv')]");
	By btnShippingCheckout = By.xpath("//button[contains(@name,'processCarrier')]");
	By btnPayByWire = By.xpath("//a[contains(@title,'Pay by bank wire')]");
	By btnConfirmOrder = By.xpath("//span[contains(text(),'I confirm my order')]");
	By txtOrderCompleted = By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]");
	By lnkBackToOrders = By.xpath("//a[contains(@title,'Back to orders')]");
	By lblTotalPrice = By.xpath("//td[contains(@class,'history_price')]");
	
	//Methods
	public void CheckOutAndVerify() {
		String TotalAtCheckOut = Text(lblTotalPriceAtCheckout);
		System.out.println("Total Price of Order is: " + TotalAtCheckOut);
		Click(btnCheckOut);
		Click(btnAddressCheckout);
		Click(chkTermsAndConditions);
		Click(btnShippingCheckout);
		Click(btnPayByWire);
		Click(btnConfirmOrder);
		String OrderConfirmation = Text(txtOrderCompleted);
		if(OrderConfirmation.equalsIgnoreCase("Your order on My Store is complete."))
		{
			System.out.println("Order has been placed successfully!!!");
		}
			Click(lnkBackToOrders);
			String PriceOnHistoryPage = Text(lblTotalPrice);
			System.out.println("Total Price of Order is: " + PriceOnHistoryPage);
			if(TotalAtCheckOut.equals(PriceOnHistoryPage))
			{
				System.out.println("Total Price of order at checkout and in order summary is same.");
			}
	}
}
