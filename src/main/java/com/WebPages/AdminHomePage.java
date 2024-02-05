package com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class AdminHomePage extends Base{

	AdminHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Object repository
	//menu List
	@FindBy(xpath="//*[text()='menu']")
	WebElement menuIconE;
	
	//Heading
	@FindBy(xpath="/html/body/app-root/div/mat-toolbar/div[1]/div")
	WebElement headingLabelText;
	
	//notification bell
	@FindBy(xpath="//*[@class='mat-menu-trigger notification-icon']")
	WebElement notificationBell;
	
	//Notification PopUp Heading
	@FindBy(xpath="//*[text()='Notifications']")
	WebElement notificationPopUpHeadingLabelText;
	
	//Greeting Message
	@FindBy(xpath="//*[@class='title']")
	WebElement greetingMessage;
	
	//Admin Logged in User Name
	@FindBy(xpath="//*[@class='user-name']")
	WebElement loggedInUserName;
	
	//Admin User DropDown
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-menu-trigger profile-menu mat-icon-button mat-button-base']")
	WebElement userDropDown;
	
	//Preferences Option
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/button[1]")
	WebElement preferencesOption;
	
	//Help & Support option
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/button[2]")
	WebElement helpAndSupportOption;
	
	//Logout option
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/button[3]")
	WebElement logOutOption;
	
	//User Profile
	@FindBy(xpath="//*[@class='profile_pic']//*[@title='User Image']")
	WebElement userProfilePhoto;
	
	//Dashboard Option
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement dashboardOption;
		
	//Chat Option
	@FindBy(xpath="//span[text()='Chat']")
	WebElement chatOption;
		
	//My Details
	@FindBy(xpath="//span[text()='My Details']")
	WebElement myDetailsOption;
		
	//Company Details
	@FindBy(xpath="//span[text()='Company Details']")
	WebElement companyDetailsOption;
		
	//Employee List
	@FindBy(xpath="//span[text()='Employees List']")
	WebElement employeesListOption;
		
	//Roles & Permissions
	@FindBy(xpath="//span[text()='Roles & Permissions']")
	WebElement rolesPermissionsOption;
		
	//Pending Approvals
	@FindBy(xpath="//span[text()='Pending Approvals']")
	WebElement pendingApprovalsOption;
		
	//Holiday Management
	@FindBy(xpath="//span[text()='Holiday Management']")
	WebElement holidayManagementOption;
		
	//Employee Static Fields option
	@FindBy(xpath="//span[text()='Employee Static Fields']")
	WebElement employeeStaticFieldsOption;
		
	
	//Business Logic
	//HomePage Current URL
	public String adminHomePage_CurrentURL_Validation() {
		return driver.getCurrentUrl();
	}
	
	//HomePage Title
	public String adminHomePage_Title_Validation() {
		return driver.getTitle();
	}
	
	//HomePage Heading
	public String adminHomePage_Heading_Validation() {
		return headingLabelText.getText();
	}
	
	//HomePage Notification Button
	public void adminHomePage_NotificationButton_Validation() {
		notificationBell.click();
	}
	
	//HomePage Notification Pop Up Heading Label Text
	public String adminHomePage_NotificationPopUpHeadingLabelText() {
		return notificationPopUpHeadingLabelText.getText();
	}
	
	//Greeting Message 
	public void adminHomePage_GreetingMessage_Validation() {
		greetingMessage.getText();
	}
	
	//User Name
	public String adminHomePage_UserName_Validation() {
		return loggedInUserName.getText();
	}
	
	//User Drop Down
	public void adminHomePage_UserDropDown_Validation() {
		userDropDown.click();
	}
	
	//Preferences Option
	public PreferencesPage adminHomePage_PreferencesOption_Validation() {
		adminHomePage_UserDropDown_Validation();
		preferencesOption.click();
		return new PreferencesPage();
	}
	
	//help&Support Option
	public HelpAndSupportPage adminHomePage_HelpSupportOption_Validation() {
		adminHomePage_UserDropDown_Validation();
		helpAndSupportOption.click();
		return new HelpAndSupportPage();
	}
	
	//Logout Option
	public LoginPage adminHomePage_LogoutOption_Validation() {
		adminHomePage_UserDropDown_Validation();
		logOutOption.click();
		return new LoginPage();
	}
	
	//User Profile Image Validation
	public boolean adminHomePage_UserProfileImage_Validation() {
		return userProfilePhoto.isDisplayed();
	}
	
	//Dashboard Option
	public AdminDashboardPage adminHomePage_DashboardOption_Validation() {
		dashboardOption.click();
		return new AdminDashboardPage();
	}
	
	//Chat Option
	public AdminChatPage adminHomePage_ChatOption_Validation() {
		chatOption.click();
		return new AdminChatPage();
	}
	
	//My Details Option
	public AdminMyDetailsPage adminHomePage_MyDetailsOption_Validation() {
		myDetailsOption.click();
		return new AdminMyDetailsPage();
	}
	
	//Company Details Option
	public AdminCompanyDetailsPage adminHomePage_CompanyDetailsOption_Validation() {
		companyDetailsOption.click();
		return new AdminCompanyDetailsPage();
	}
	
	//Employee List option
	public AdminEmployeeListPage adminHomePage_EmployeeListOption_Validation() {
		employeesListOption.click();
		return new AdminEmployeeListPage();
	}
	
	//Roles & Permissions Option
	public AdminRolesAndPermissionsPage adminHomePage_RolesAndPermissionsOption_Validation() {
		rolesPermissionsOption.click();
		return new AdminRolesAndPermissionsPage();
	}
	
	//Pending Approvals Option
	public AdminPendingApprovalsPage adminHomePage_PendingApprovalsOption_Validation() {
		pendingApprovalsOption.click();
		return new AdminPendingApprovalsPage();
	}
	
	//Holiday Management Option
	public AdminHolidayManagementPage adminHomePage_HolidayManagementOption_Validation() {
		holidayManagementOption.click();
		return new AdminHolidayManagementPage();
	}
	
	//Employee Static Fields Option
	public AdminEmployeeStaticFieldsPage adminHomePage_EmployeeStaticFieldsOption_Validation() {
		employeeStaticFieldsOption.click();
		return new AdminEmployeeStaticFieldsPage();
	}
	
	
}
