package com.WebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class AdminMyDetailsGeneralPage extends Base{

	AdminMyDetailsGeneralPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//Heading Label Text
	@FindBy(xpath="//*[text()='General Details']")
	WebElement headingLabelText;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[1]/div[1]/div/p")
	WebElement fullName;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[1]/div[2]/div/p")
	WebElement dob;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[1]/div[3]/div/p")
	WebElement gender;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[2]/div[1]/div/p")
	WebElement email;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[2]/div[2]/div/p")
	WebElement phoneNumber;
	
	@FindBy(xpath="")
	WebElement companyName;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[3]/div[1]/div/p")
	WebElement employeeID;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[3]/div[2]/div/p")
	WebElement socialSecurityNumber;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[3]/div[3]/div/p")
	WebElement createdDate;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[4]/div[1]/div/p")
	WebElement department;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[4]/div[2]/div/p")
	WebElement ethnicity;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[4]/div[3]/div/p")
	WebElement hrManager;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[5]/div[1]/div/p")
	WebElement country;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[5]/div[2]/div/p")
	WebElement state;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[5]/div[3]/div/p")
	WebElement workAuthorization;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[6]/div[1]/div/p")
	WebElement reportingManager;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[6]/div[2]/div/p")
	WebElement veteranStatus;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[6]/div[3]/div/p")
	WebElement employementType;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[7]/div[1]/div/p")
	WebElement classification;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[7]/div[2]/div/p")
	WebElement DOJ;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[7]/div[3]/div/p")
	WebElement grade;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[8]/div[1]/div/p")
	WebElement workingCountry;
	
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-general/div/div/div[2]/div/div[8]/div[2]/div/p")
	WebElement workingState;
	
	
	
	
	//Business Logic
	//Current URL
	public String myDetailsGeneralPage_CurrentURL_Validation() {
		return driver.getCurrentUrl();
	}
	
	//Title
	public String myDetailsGeneralPage_Title_Validation() {
		return driver.getTitle();
	}
	
	//Heading Validation
	public String myDetailsGeneralPage_Heading_Validation() {
		return headingLabelText.getText();
		
	}
	
	//full name validation
	public String myDetailsGeneralPage_FullName_Validation() {
		return fullName.getText();
	}
	
	//DOB Validation
	public String myDetailsGeneralPage_DOB_Validation() {
		return dob.getText();
	}
	
	//Gender Validation
	public String myDetailsGeneralPage_Gender_Validation() {
		return gender.getText();
	}
	
	//email validation
	public String myDetailsGeneralPage_Email_Validation() {
		return email.getText();
	}
	
	//Phone Number
	public String myDetailsGeneralPage_PhoneNumber_Validation() {
		return phoneNumber.getText();
	}
	
	//Company Name
	public String myDetailsGeneralPage_CompanyName_Valiadtion() {
		return companyName.getText();
	}
	
	//Employee ID
	public String myDetailsGeneralPage_EmployeeID_Validation() {
		return employeeID.getText();
	}
	
	//Social Security Number
	public String myDetailsGeneralPage_SocialSecurityNumber_Validation() {
		return socialSecurityNumber.getText();
	}
	
	//created Date
	public String myDetailsGeneralPage_CreatedDate_Validation() {
		return createdDate.getText();
	}
	
	//department
	public String myDetailsGeneralPage_Department_Validation() {
		return department.getText();
	}
	
	//ethnicity
	public String myDetailsGeneralPage_Ethnicity_Validation() {
		return ethnicity.getText();
	}
	
	//HR Manager
	public String myDetailsGeneralPage_HRManager_Validation() {
		return hrManager.getText();
	}
	
	//Country
	public String myDetailsGeneralPage_Country_Validation() {
		return country.getText();
	}
	
	//State
	public String myDetailsGeneralPage_State_Validation() {
		return state.getText();
	}
	
	//Work Authorization
	public String myDetailsGeneralPage_WorkAuthorization_Validation() {
		return workAuthorization.getText();
	}
	
	//reporting manager
	public String myDetailsGeneralPage_ReportingManager_Validation() {
		return reportingManager.getText();
	}
	
	//veteran Status
	public String myDetailsGeneralPage_VeteranStatus_Validation() {
		return veteranStatus.getText();
	}
	
	//employee Type
	public String myDetailsGeneralPage_EmployeeType_Validation() {
		return employementType.getText();
	}
	
	//classification
	public String myDetailsGeneralPage_Classification_Validation() {
		return classification.getText();
	}
	
	//DOJ 
	public String myDetailsGeneralPage_DOJ_Validation() {
		return DOJ.getText();
	}
	
	//grade
	public String myDetailsGeneralPage_Grade_Validation() {
		return grade.getText();
	}
	
	//working Country
	public String myDetailsGeneralPage_WorkingCountry_Validation() {
		return workingCountry.getText();
	}
	
	//Working State
	public String myDetailsGeneralPage_WorkingState_Validation() {
		return workingState.getText();
	}

	
}
