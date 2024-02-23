package com.CommonActions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseClass;

public class CommonActionsClass extends BaseClass{

	
	public static void screenShotsMethod(String testName) throws IOException {
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./src/resouces/java/com/ScreenShots/"+testName+".png"));
	}
	
	public static void  actionsMathod() {
		
	}
	
	public static WebDriverWait webDriverWaitMathod() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		return wait;
	}

	
	//This method is to capture the screenshot and return the path of the screenshot.
	public static String getScreenShot(WebDriver driver, String screenshotName) throws IOException {
	String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	// after execution, you could see a folder "FailedTestsScreenshots" under src folder
	String destination = ("./src/resouces/java/com/ScreenShots/" + screenshotName + dateName + ".png");
	//File finalDestination = new File(destination);
	FileUtils.copyFile(source, new File(destination));
	String finalPath=(new File(destination).getAbsolutePath());
	return finalPath;
	}
	 
	
	
}
