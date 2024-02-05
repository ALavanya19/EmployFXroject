package com.Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.BeforeSuite;

import com.Config.PropertiesClass;
import com.Log.Log;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
				  String propFilePath="./src/resources/java/com/PropertiesFile/employFXProperties.properties";
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@BeforeSuite
	public void extentReportsInititation() {
		PropertiesClass.loadProperties(propFilePath);
		Log.info("Property File Loaded Successfully");
		
		extent=new ExtentReports();
		ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("./ExtentReports/ohrmreports.html");
		extent.attachReporter(htmlReporter);
		Log.info("Extent Report Loaded successfully");
		
	}
	
	
	public static void setUp() {

	 String browserName=PropertiesClass.getProperties("browserName");
	 if(browserName.equalsIgnoreCase("chrome")) {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 Log.info("Chrome Driver Launched Successfully");
	 }
	 else if(browserName.equalsIgnoreCase("edge")) {
		 WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		 Log.info("Edge Driver Launched Successfully");
	 } 
	 else if(browserName.equalsIgnoreCase("opera")) {
		 WebDriverManager.operadriver().setup();
		 driver=new OperaDriver();
		 Log.info("Opera Driver Launched Successfully");
	 }
	 else if(browserName.equalsIgnoreCase("firefox")) {
		 WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		 Log.info("Firefox Driver Launched Successfully");
	 }
	 else 
	 {
		 Log.error("Please select browser for testing");
	 }
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.get(PropertiesClass.getProperties("url"));
	 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	 Log.info("Application Luanched Successfully");
	
	}
	
	
	public static void tearDown() {
		driver.quit();
		Log.info("Application closed successfully");
	}
	
	
}
