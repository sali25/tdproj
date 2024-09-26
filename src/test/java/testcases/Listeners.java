package testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.BaseClass;
//step 10
public class Listeners extends BaseClass implements ITestListener{
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test case ailed");
		String TestmethodName=result.getMethod().getMethodName();
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		try {
			FileUtils.copyFile(src, new File("/Users/saminali/Desktop/screenshot/image.png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		}
}
