package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class BaseClass {
	public WebDriver driver;
	public Properties prop;
	public Properties propertriesClass() throws IOException {
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/Users/saminali/eclipse-workspace/TDFramework/src/main/java/resources/data.properties");
		
		prop.load(fis);
		return prop;
		}
	public WebDriver initializeBrowser() throws IOException {
		prop=propertriesClass();
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			 driver= new ChromeDriver();
			 System.out.println("chrome browser launced");
		 }
		else if(browsername.equals("firefox")) {
			driver=new FirefoxDriver();  
			System.out.println("Browser = Firefox"); 
		}
		else if(browsername.equals("edge")) {
			driver=new EdgeDriver();
			System.out.println("edge");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
		  
	}
}
