package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WomensPage extends BasePage {

	public WomensPage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	By lnkWomens = By.xpath("//a[contains(text(),'Women')]");
	By lnkFirstItemOnPage = By.xpath("//li[contains(@class,'first-item-of-mobile-line')][1]");
	By lnkQuickView = By.xpath("//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[2]/span");
	By frameQuickView = By.className("fancybox-iframe");
	By txtQuantity = By.xpath("//input[contains(@name,'qty')]");
	By btnAddToCart = By.xpath("//span[contains(text(),'Add to cart')]");
	By btnChkOut = By.xpath("//a[contains(@title,'Proceed to checkout')]");
	
	//Methods
	public void AddFirstItemOnWomensList() {
		System.out.println("Entered into add items to cart method");
		Click(lnkWomens);
		System.out.println("Clicked on Womens link");
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//li[contains(@class,'first-item-of-mobile-line')][1]"))).build().perform();
		Click(lnkQuickView);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@class,'fancybox-iframe')]")));
		EnterText(txtQuantity, "2");
		Click(btnAddToCart);
		driver.switchTo().parentFrame();
		Click(btnChkOut);
		System.out.println("Clicked on Checkout button on Popuup");
	}
}
