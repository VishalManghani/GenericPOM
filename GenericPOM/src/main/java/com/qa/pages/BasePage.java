package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasePage {

	public WebDriver driver;
	public WebDriverWait wait;
	
	//Constructor
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(driver, 15);
	}
	
	//Wait Wrapper method
	public void waitVisibility(By elementBy) {
		wait.until(ExpectedConditions.elementToBeClickable(elementBy));
	}
	
	//Click Method
	public void Click(By elementBy) {
		//waitVisibility(elementBy);
		driver.findElement(elementBy).click();
	}
	
	//Sendkeys Method
	public void EnterText(By elementBy, String text) {
		waitVisibility(elementBy);
		driver.findElement(elementBy).sendKeys(text);
	}
	
	//Retrieve text of element
	public String Text(By elementBy) {
		waitVisibility(elementBy);
		return driver.findElement(elementBy).getText();
	}
	
	//Assert
	public void AssertEquals(By elementBy, String ExpectedText) {
		waitVisibility(elementBy);
		Assert.assertEquals(Text(elementBy), ExpectedText);
	}
	
	public void SelectByIndex(By elementBy, int Index) {
		//waitVisibility(elementBy);
		 Select sel = new Select(driver.findElement(elementBy));
		 sel.selectByIndex(Index);
	}
	
	public void SelectByValue(By elementBy, String Value) {
		//waitVisibility(elementBy);
		Select sel = new Select(driver.findElement(elementBy));
		sel.selectByValue(Value);
	}
	
	public void SelectByVisibleText(By elementBy, String VisibleText) {
		//waitVisibility(elementBy);
		Select sel = new Select(driver.findElement(elementBy));
		sel.selectByVisibleText(VisibleText);
	}
	
	public void ScrollToElement(By elementBy) {
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true);", elementBy);
	}
	
	public void HoverOnElement(WebElement ele) {
		Actions ac = new Actions(driver);
		ac.moveToElement(ele).perform();
	}
	
	public void SwitchFrameByElement(By elementBy) {
		driver.switchTo().frame((WebElement) elementBy);
	}
	
	public void SwitchToFrame() {
		driver.switchTo().frame(1);
	}
}
