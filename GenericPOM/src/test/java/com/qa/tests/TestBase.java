package com.qa.tests;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

	public WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\GenericPOM\\src\\main\\java\\com\\qa\\configs\\config.properties");
			prop.load(fis);
		}
		catch(Exception e) {
			
		}
	}
	
	@BeforeClass
	public void Setup() {
		String Browser = prop.getProperty("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-workspace\\GenericPOM\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Launched Chrome successfully!!!");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
}
