package com.WebPages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class DashboardPage extends Base{

	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
		
	}

	//Object Repository
	
	//Menu Icon r Button
	@FindBy(xpath="//*[@class='mat-focus-indicator main-menu-icon mat-icon-button mat-button-base']")
	WebElement menuIconE;
	
	//EmployFX Management Heading Label text
	@FindBy(xpath="//div[text()='EmployFX - Employee Management']")
	WebElement employFXManagementHeadingLabelText;
	
	//Greeting message element
	@FindBy(xpath="//*[@class='greetings']//div")
	WebElement greetingE;
	
	//User Drop Down
	@FindBy(xpath="//*[@class='user-name']")
	WebElement userDropDownE;
	
	//Preferences
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/button[1]")
	WebElement preferencesE;
	
	//Help & Support Element
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/button[2]")
	WebElement helpAndSupportE;
	
	//Logout Element
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/button[3]")
	WebElement logoutE;
	
	//User Profile Image
	@FindBy(xpath="//*[@title='User Image']")
	WebElement userProfileE;
	
	//Business Category Element with Icon
	@FindBy(xpath="//*[@class='route-name user' and text()='Business Categories']")
	WebElement businessCategoriesE;
	
	//Companies Element with icon
	@FindBy(xpath="//*[@class='route-name user' and text()='Companies']")
	WebElement companiesE;
	
	//Chat Window element with icon
	@FindBy(xpath="//*[@class='route-name user' and text()='Chat Window']")
	WebElement chatWindowE;
	
	
	//Business Logic
	
	//Validating Current Url
	public String validating_DashboardPage_CurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	//validating dashboardPage Title
	public String validating_DashboardPage_Title() {
		return driver.getTitle();
	}
	
	
	//validating dashboardpage heading
	public String validating_DashboardPage_HeaadingLabelText() {
		return employFXManagementHeadingLabelText.getText();
	}
	
	
	//Greetings Validation
	public String validating_Greetings() {
		return greetingE.getText();
	}
	
	
	//User Drop Down
	public void validating_UserDropDown() {
		userDropDownE.click();
	}
	
	
	//Preferences 
	public PreferencesPage validating_Preferences() {
		
		preferencesE.click();
		return new PreferencesPage();
	}
	
	//Help & Support
	public HelpAndSupportPage validating_HelpAndSupport() {
		
		helpAndSupportE.click();
		return new HelpAndSupportPage();
	}
	
	//LogOut 
	public LoginPage validating_LogOut() {
		
		logoutE.click();
		return new LoginPage();
	}
	
	
	//User Profile
	public Boolean validating_UserProfile() {
		return userProfileE.isDisplayed();
	}
	
	//Business Categories
	public BusinessCategoriesPage validating_BusinessCategories() {
		businessCategoriesE.click();
		return new BusinessCategoriesPage();
		
	}
	
	//Companiesx
	public CompanyListPage validating_CompaniesOption() {
		companiesE.click();
		return new CompanyListPage();
	}
	
	//Chat Window
	public ChatWindowPage validating_ChatWindowOption() {
		chatWindowE.click();
		return new ChatWindowPage();
	}
	

}
