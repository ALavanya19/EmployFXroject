package com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;
import com.CommonActions.CommonActions;

public class PreferencesPage extends Base{

	PreferencesPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Object Repository
	//Preferences Page Heading Label Text
	@FindBy(xpath="//h1[text()='Preferences']")
	WebElement preferencesHeadingLabelText;
	
	//Change Password Option Element
	@FindBy(xpath="//*[@class='mat-list-item-content' and text()=' Change Password ']")
	WebElement changePasswordE;
	
	//Change Password Heading Label Text
	@FindBy(xpath="//h3[text()='Change Password ']")
	WebElement changePasswordHeadingLabelText;
	
	//Old Password Element
	@FindBy(xpath="//*[@formcontrolname='old_password']")
	WebElement oldPasswordE;
	
	//New Password Element
	@FindBy(xpath="//*[@formcontrolname='password']")
	WebElement newPasswordE;
	
	//Confirm Password Element
	@FindBy(xpath="//*[@formcontrolname='confirm_password']")
	WebElement confirmPasswordE;
	
	//Reset Button Element
	@FindBy(xpath="//*[@class='btn-secondary']")
	WebElement resetButton;
	
	//Submit Button Element
	@FindBy(xpath="btn-primary mt-l-12")
	WebElement submitButton;
	
	
	
	//Business Logic
	//Current URL Validation
	public String currentURL_Validation() {
		return driver.getCurrentUrl();
	}
	
	//Title Validation
	public String title_Validation() {
		return driver.getTitle();
	}
	
	//PreferencesPage Heading Label Text
	public String preferencesPage_PreferencesHeadingLabelText() {
		return preferencesHeadingLabelText.getText();
	}
	
	//Change Password Heading Label Text Validation
	public String preferencesPage_ChangePasswordHeadingLabelText() {
		return changePasswordHeadingLabelText.getText();
	}
	
	public void changePasswordFieldsData_Validation(String oldPassword,String newPassword) {
		oldPasswordE.sendKeys(oldPassword);
		CommonActions.checkMandatoryFieldValidation(oldPasswordE);
		newPasswordE.sendKeys(newPassword);
		CommonActions.checkMandatoryFieldValidation(newPasswordE);
		confirmPasswordE.sendKeys(newPassword);
		CommonActions.checkMandatoryFieldValidation(confirmPasswordE);
	}
	
	public String resetButton_Validation(String oldPassword,String newPassword) {
		changePasswordFieldsData_Validation(oldPassword,newPassword);
		resetButton.click();
		return oldPasswordE.getAttribute("value");
	}
	
	public void submitButtonWithValidData_Validation(String oldPassword,String newPassword) {
		changePasswordFieldsData_Validation(oldPassword,newPassword);
		submitButton.click();
	}
	
	
}
