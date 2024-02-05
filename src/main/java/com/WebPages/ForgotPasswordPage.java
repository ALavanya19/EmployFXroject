package com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;


public class ForgotPasswordPage extends Base {

	public ForgotPasswordPage() {
	    PageFactory.initElements(driver, this);	
	}
	
	
	//Object Repository
	//Forgot Password Label Text
	@FindBy(xpath="//*[@class='efx-login-form']//preceding::h2")
	WebElement forgotPasswordLabelText;
	
	//Email Label Text
	@FindBy(xpath="//*[text()='Email*']")
	WebElement emailLabelText;
	
	//Email Field
	@FindBy(xpath="//*[@type='email']")
	WebElement emailE;
	
	//Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement cancelButtonE;
	
	//Submit Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement submitButtonE;
	
	//Login Link
	@FindBy(xpath="//*[text()='Login']")
	WebElement loginLinkE;
	
	//EmployFx Label Text
	@FindBy(xpath="//*[@class='mt-b-0']")
	WebElement employFXLabelText;
	
	//Employee Maagement Label Text
	@FindBy(xpath="//*[text()='Employee Management']")
	WebElement employeeManagementLabelText;
	
	//Invalid email error message
	@FindBy(xpath="//*[text()='Email must be a valid email address ']")
	WebElement invalidEmailErrorMsgE;
	
	
	
	
	//Business Login for Elements
	//Forgot Password Page Current URL
	public String validating_ForgotPasswordPage_CurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	//Forgot Password Page Title
	public String validating_ForgotPasswordPage_Title() {
		return driver.getTitle();
	}
	
	//forgot password Page Heading 
	public String validating_ForgotPasswordPage_Heading() {
		return forgotPasswordLabelText.getText();
	}
	
	
	//forgot Password Page Email Label text validation 
	public String validating_ForgotPasswordPage_EmailLabelText() {
		return emailLabelText.getText();
	}
	
	//ForgotPassword Page EmployFx Label Text Validation
	public String validating_ForgotPasswordPage_EmployFXLabelText() {
		
		return employFXLabelText.getText();
	}
	
	//ForgotPassword Page Employee Management Validation
	public String validating_ForgotPasswordPage_EmployeeManagementLabelText() {
		return employeeManagementLabelText.getText();
	}
	
	//Forgot Password Page Existing User email with submit button Validation
	public void validating_ForgotPasswordPage_ExistingUserEmailWithSubmit(String email) {
		
		emailE.sendKeys(email);
		validating_ForgotPasswordPage_SubmitButton();
	}
	
	
	//Forgot Password Page Existing User email with Cancel Button Validation
	public void validating_ForgotPasswordPage_ExistingUserWithCancel(String email) {
		emailE.sendKeys(email);
		validating_ForgotPasswordPage_CancelButton();
	}

	//Forgot Password Page Submit Button Validation
	public LoginPage validating_ForgotPasswordPage_SubmitButton() {
		
		submitButtonE.click();
		return new LoginPage();
		
	}
	
	//Forgot Password Page Cancel button Validation
	public LoginPage validating_ForgotPasswordPage_CancelButton() {
		cancelButtonE.click();
		return new LoginPage();
	}
	
	//Forgot Password Page Login link validation
	public LoginPage validating_ForgotPasswordPage_LoginLink() {
		loginLinkE.click();
		return new LoginPage();
	}
	
	//Email Field Avalability
	public boolean emailFieldAvalability() {
		return emailE.isDisplayed();
	}
	
	//Cancel Buttton Field Availability
	public boolean cancelButtonAvailability() {
		return cancelButtonE.isDisplayed();
	}
	
	//Submit Button Field Availability
	public boolean submitButtonAvailability() {
		return submitButtonE.isDisplayed();
	}
	
	//Login Link Field Availability
	public boolean loginLinkAvailability() {
		return loginLinkE.isDisplayed();
	}
	
	//Invalid Email
	public void validaing_InvalidEmail(String email) {
		emailE.sendKeys(email);
		submitButtonE.click();
	
	}	
	
}
