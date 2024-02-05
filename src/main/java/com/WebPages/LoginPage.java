package com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.Base.Base;
import com.CommonActions.CommonActions;

public class LoginPage extends Base {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Objects Repository
	//Login Heading Label
	@FindBy(xpath="//h2")
	WebElement loginHeadingLabelText;
	
	//employFx label text
	@FindBy(xpath="//*[@class='mt-b-0']")
	WebElement employFxLabelText;
	
	//Employee Management Text
	@FindBy(xpath="//*[@class='mt-b-0 efx-points']")
	WebElement employeeManagementLabelText;
	
	//email element
	@FindBy(xpath="//*[@type='email']")
	WebElement emailE;
	
	//email label
	@FindBy(xpath="//*[text()='Email*']")
	WebElement emailLabelText;
	
	
	//invalid email error Label
	@FindBy(xpath="//*[@class='invalid-feedback ng-star-inserted']")
	WebElement invalidEmailErrorMessage;
	
	
	//Password element
	@FindBy(xpath="//*[@type='password']")
	WebElement passwordE;
	
	//Password label text
	@FindBy(xpath="//*[text()='Password*']")
	WebElement passwordLabelText;
	
	//Login Button
	@FindBy(xpath="//*[@class='btn btn-primary btn-login']")
	WebElement loginButtonE;
	
	//Forgot Password link
	@FindBy(xpath="//*[@class='create-login-btn']")
	WebElement forgotPasswordE;
	
	
	
	//Business Logic
	//validating URL
	public String validatingUrl() {
		
		return driver.getCurrentUrl();
	}
	
	//Validating Title
	public String validatingTitle() {
		return driver.getTitle();
	}
	
	//validating Heading
	public String validatingHeadingLabelText() {
		return loginHeadingLabelText.getText();
	}
	
	//validating employFX
	public String validatingEmployFXLabel() {
		return employFxLabelText.getText();
	}
	
	//Validating EmployFX Management
	public String validatingEmployFXManagement() {
		return employeeManagementLabelText.getText();
	}
	
	//Validating Valid email & Valid Password
	public DashboardPage superAdminLogin(String email, String password){
		emailE.sendKeys(email);
		passwordE.sendKeys(password);
		loginButtonE.click();
		CommonActions.webDriverWaitMethod().until(ExpectedConditions.urlContains("em-new-staging.employfx.com/#/superAdmin"));
		return new DashboardPage();
	}
	
	//Admin Validating Valid email & Valid Password
		public AdminHomePage adminLogin(String email, String password){
			emailE.sendKeys(email);
			passwordE.sendKeys(password);
			loginButtonE.click();
			CommonActions.webDriverWaitMethod().until(ExpectedConditions.urlContains("em-new-staging.employfx.com/#/dashboard"));
			return new AdminHomePage();
		}
	
	//Validating Forgot Password link
	public ForgotPasswordPage validatingForgotPasswordLink() {
		forgotPasswordE.click();
		return new ForgotPasswordPage();
	}
	
	//Validating forgot password link text
	public String validtingForgotPasswordText() {
		return forgotPasswordE.getText();
	}
	
	//Validating Email Label text
	public String validatingEmailLabelText() {
		return emailLabelText.getText();
	}
	
	//Validating Password Label Text
	public String validatingPasswordLabelText() {
		return passwordLabelText.getText();
	}
	
	//Validating email field is preset or not
	public boolean validatingEmailFieldAvailability() {
		return emailE.isDisplayed();
	}
	
	//Validating password field present or not
	public boolean validatingPasswordFieldAvailability() {
		return passwordE.isDisplayed();
	}
	
	//Validating forgot password link is available or not
	public boolean validatingForgotPasswordFieldAvailability() {
		return forgotPasswordE.isDisplayed();
	}
	
	//Validating login button field availability
	public boolean validatingLoginButtonFieldAvailability() {
		return loginButtonE.isDisplayed();
	}
	
}


