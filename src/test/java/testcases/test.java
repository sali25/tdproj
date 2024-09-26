package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.TDhome;

public class test {
	@Test
	public void BaseNav()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/?client=safari");
		
		driver.getTitle();
		System.out.println(driver.getTitle());
		
	}
}
