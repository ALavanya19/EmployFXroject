package com.Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Config.PropertiesClass;
import com.Log.Logs;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	//public static WebDriver driver;
	              String propFilePath="./src/resouces/java/com/PropertiesFile/propFile.properties"; 
	
	  public static WebDriver driver;
	  public ExtentSparkReporter spark;
	  public ExtentReports extent;
	  public ExtentTest logger;
	
	
	/*public void Intitition() throws IOException {
		
		PropertiesClass.loadPropeties(propFilePath);
		Logs.infoMessage("Properties File Loaded Successfully");
		
		/*extent=new ExtentReports();
		ExtentHtmlReporter htmlReport=new ExtentHtmlReporter("./src/resouces/java/ExtentReportsFolder/employFX.html");
		extent.attachReporter(htmlReport);
		Logs.infoMessage("Extent Reports loaded Successfully");
		
		
		
	
	}*/
	  @BeforeSuite
	public void startReport() throws IOException {
		  

		PropertiesClass.loadPropeties(propFilePath);
		Logs.infoMessage("Properties File Loaded Successfully");
			
        // Create an object of Extent Reports
		extent = new ExtentReports();

		spark = new ExtentSparkReporter("./src/resouces/java/ExtentReportsFolder/employFX.html");
		extent.attachReporter(spark);
		extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
       extent.setSystemInfo("Environment", "Production");
       extent.setSystemInfo("User Name", "Rajkumar SM");
       spark.config().setDocumentTitle("Title of the Report Comes here ");
               // Name of the report
       spark.config().setReportName("Name of the Report Comes here ");
               // Dark Theme
       spark.config().setTheme(Theme.STANDARD);
	  }
	
	public static void setUp() {
		
		String browserName=PropertiesClass.getProperties("browserName");
		if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			Logs.infoMessage("Edge Browser Launched Successfully");
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			Logs.infoMessage("Chrome Browser Launched Successfully");
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			Logs.infoMessage("Firefox Browser Launched Successfully");
		}
		else {
			Logs.warnMessage("Please select valid browser for Testing");
		}
		
		
		driver.get(PropertiesClass.getProperties("applicationURL"));
		Logs.infoMessage("Application Launched Successfully");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
}
