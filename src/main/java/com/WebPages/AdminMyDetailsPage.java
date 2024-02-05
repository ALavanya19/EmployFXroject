package com.WebPages;

import org.bouncycastle.util.Times;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class AdminMyDetailsPage extends Base {

	public AdminMyDetailsPage() {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	//Object Repository
	//Left Side Back arrow 
	@FindBy(xpath="//*[@class='far fa-arrow-alt-circle-left']")
	WebElement backArrow;
	
	//Logged in User Image
	@FindBy(xpath="//*[@class='emp-img']//*[@title='User Image']")
	WebElement loggedInUserImage;
	
	//Logged In UserName(FirstName+SecondName)
	@FindBy(xpath="//*[@class='no-mar emp-name']")
	WebElement loggedInUserName;
	
	//Logged In User position
	@FindBy(xpath="//*[@class='emp-type']//*[@class='ng-star-inserted']")
	WebElement loggedInUserPosition;
	
	//Logged In User Position
	@FindBy(xpath="//*[@class='emp-mail-info']//a")
	WebElement loggedInUserEmailId;
	
	//General Option
	@FindBy(xpath="//*[@mattooltip='General']")
	WebElement generalOption;
	
	//Contact Option
	@FindBy(xpath="//*[@mattooltip='Contact']")
	WebElement contactOption;
	
	//Education Details Option
	@FindBy(xpath="//*[@mattooltip='Education Details']")
	WebElement educationDetailsOption;
	
	//Work Authorization Option
	@FindBy(xpath="//*[@mattooltip='Work Authorizations']")
	WebElement workAuthorizationOption;
	
	//Employement History Option
	@FindBy(xpath="//*[@mattooltip='Employment history']")
	WebElement employeementHistoryOption;
	
	//Skills Option
	@FindBy(xpath="//*[@mattooltip='Skills']")
	WebElement skillsOption;
	
	//Dependents Option
	@FindBy(xpath="//*[@mattooltip='Dependents']")
	WebElement dependentsOption;
	
	//Assets Option
	@FindBy(xpath="//*[@mattooltip='Assets']")
	WebElement assetsOption;
	
	//Timesheet Option
	@FindBy(xpath="//*[@mattooltip='Timesheet']")
	WebElement timsheetOption;
	
	//Apply for leave
	@FindBy(xpath="//*[@mattooltip='Apply for leave']")
	WebElement applyForLeaveOption;
	
	//Holiday Calender
	@FindBy(xpath="//*[@mattooltip='Holiday calendar']")
	WebElement holidayCalenderOption;
	
	
	//Business Logic
	//Currenr URL Validation
	public String myDetailsPage_CurrentUrl_Validation() {
		return driver.getCurrentUrl();
	}
	
	//Title Validation
	public String myDetailsPage_Title_Validation() {
		return driver.getTitle();
	}
	
	//Back Arrow Button validation
	public AdminDashboardPage myDetails_BackArrowButton_Validation() {
		return new AdminDashboardPage();	
	}
	
	//User Image Validation
	public boolean myDetails_UserImage_Validation() {
		return loggedInUserImage.isDisplayed();
	}
	
	
	//User Name Validation
	public String myDetails_UserName_Validation() {
		return loggedInUserName.getText();
	}
	
	//User Designation
	public String myDetails_UserDesignation_Validation() {
		return loggedInUserPosition.getText();
	}
	
	//User Email Validation
	public String myDetails_UserEmail_Validation() {
		return loggedInUserEmailId.getText();
	}
	
	//General Option
	public AdminMyDetailsGeneralPage myDetails_GeneralOption_Validation() {
		generalOption.click();
		return new AdminMyDetailsGeneralPage();
	}
	
	//Contact Option
	public AdminMyDetailsContactPage myDetails_ContactOption_Validation() {
		contactOption.click();
		return new AdminMyDetailsContactPage();
	}
	
	//Education Details
	public AdminMyDetailsEducationDetailsPage myDetails_EducationDetailsOption_Validation() {
		educationDetailsOption.click();
		return new AdminMyDetailsEducationDetailsPage();
	}
	
	//Work Authorization
	public AdminMyDetailsWorkAuthorizationPage myDetails_WorkAuthorizationOption_Validation() {
		workAuthorizationOption.click();
		return new AdminMyDetailsWorkAuthorizationPage();
	}
	
	//Employment History
	public AdminMyDetailsEmploymentHistoryPage myDetails_EmploymentHistoryOption_Validation() {
		employeementHistoryOption.click();
		return new AdminMyDetailsEmploymentHistoryPage();
	}
	
	//Skills Option
	public AdminMyDetailsSkillsPage myDetails_SkillsOption_Validation() {
		skillsOption.click();
		return new AdminMyDetailsSkillsPage();
	}
	
	//Dependents Option
	public AdminMyDetailsDependentsPage myDetails_DependentsOption_Validation() {
		dependentsOption.click();
		return new AdminMyDetailsDependentsPage();
	}
	
	//Assets Option
	public AdminMyDetailsAssetsPage myDetails_AssetsOption_Validation() {
		assetsOption.click();
		return new AdminMyDetailsAssetsPage();
	}
	
	//Timesheet Option
	public AdminMyDetailsTimesheetPage myDetails_TimesheetOption_Validation() {
		timsheetOption.click();
		return new AdminMyDetailsTimesheetPage();
	}
	
	//Apply For Leave Option
	public AdminMyDetailsApplyForLeavePage myDetails_ApplyForLeaveOption_Validation() {
		applyForLeaveOption.click();
		return new AdminMyDetailsApplyForLeavePage();
	}
	
	//Holiday Calender Option
	public AdminMyDetailsHolidayCalenderPage myDetails_HolidayCalenderOption_Validation() {
		holidayCalenderOption.click();
		return new AdminMyDetailsHolidayCalenderPage();
	}
	
	
	
	
	
	
	
}
