package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TDhome {
	public WebDriver driver;
	public TDhome(WebDriver driver) {
		this.driver=driver;
	}
	By logo=By.xpath("//*[@id=\"container-12ee37eb01\"]/div[2]/div/div/div[1]/div/a/img");
	
	
	public WebElement logo() {
		return driver.findElement(logo);
	}
	
}
