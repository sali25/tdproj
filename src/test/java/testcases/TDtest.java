package testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;


import pageObjects.TDhome;
import resources.BaseClass;

public class TDtest extends BaseClass{
	@Test
	public void BaseNavigation() throws IOException
	{
		driver=initializeBrowser();
		prop=propertriesClass();
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));

		
		TDhome th =new TDhome(driver);
		Assert.assertTrue(th.logo().isDisplayed());
		
	}
	
}
