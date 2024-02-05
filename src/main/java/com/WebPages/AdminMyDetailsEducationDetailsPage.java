 package com.WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.Base;
import com.CommonActions.CommonActions;

public class AdminMyDetailsEducationDetailsPage extends Base{

	AdminMyDetailsEducationDetailsPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//Header
	@FindBy(xpath="//*[@class='mt-b-0 icon-color-3' and text()='Education Details']")
	WebElement educationDetailsTableHeader;
	
	//Add Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mat-raised-button mat-button-base']")
	WebElement AddButton;
	
	//Education Records List
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-education-details/div/div/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]")
	List<WebElement>educationRecordsList;
	
	//Education Header
	@FindBy(xpath="//*[text()='Education']")
	WebElement educationHeader;
	
	//Field of Study Header
	@FindBy(xpath="//*[text()='Field of Study']")
	WebElement fieldOfStudyHeader;
	
	//Institute Header
	@FindBy(xpath="//*[text()='Institute']")
	WebElement institute;
	
	//GPA/Percentage HEader
	@FindBy(xpath="//*[text()='GPA/Percentage']")
	WebElement gpa;
	
	//Start Date HEader
	@FindBy(xpath="//*[text()='Start Date']")
	WebElement startDate;
	
	//End Date
	@FindBy(xpath="//*[text()='End Date']")
	WebElement endDate;
	
	//Country Header
	@FindBy(xpath="//*[text()='Country']")
	WebElement country;
	
	//State HEader
	@FindBy(xpath="//*[text()='State']")
	WebElement state;
	
	//City HEader
	@FindBy(xpath="//*[text()='City']")
	WebElement city;
	
	//Address HEader
	@FindBy(xpath="//*[text()='Address']")
	WebElement address;
	
	//Comments Header
	@FindBy(xpath="//*[text()='Comments']")
	WebElement comments;
	
	//Created At HEader
	@FindBy(xpath="//*[text()='Created At']")
	WebElement createdAt;
	
	//Updated At Header
	@FindBy(xpath="//*[text()='Updated At']")
	WebElement updatedAt;
	
	//Add Education Details PopUp Header
	@FindBy(xpath="//*[text()='Add Education Details']")
	WebElement addEducationDetailsPopUpHeader;
	
	//Add Education Details PopUp Education
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-details-form/div/div[2]/form/div[1]/div[1]/div[1]/div/mat-form-field/div/div[1]/div[3]/input")
	WebElement addEducationDetailsEducation;
	
	//Add Education Details PopUp Field of Study
	@FindBy(xpath="//*[@formcontrolname='field_of_study']")
	WebElement addEducationDetailsFieldOfStudy;
	
	//Add Education Details PopUp institute
	@FindBy(xpath="//*[@formcontrolname='institute']")
	WebElement addEducationDetailsInstitute;
	
	//Add Education Details PopUp GPa
	@FindBy(xpath="//*[@formcontrolname='gpa_percentage']")
	WebElement addEducationDetailsGPA;
	
	//Add Education Details PopUp Start Date
	@FindBy(xpath="//*[@formcontrolname='start_date']")
	WebElement addEducationDetailsStartDate;
	
	//Add Education Details PopUp Start Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-details-form/div/div[2]/form/div[1]/div[2]/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]/svg")
	WebElement addEducationDetailsStartDatePicker;
	
	//Add Education Details PopUp Start Date Picker Year & Month Selection
	@FindBy(xpath="//*[@aria-label='Choose month and year']")
	WebElement addEducationDetailsStartDateYearMonth;
	
	//Add Education Details PopUp Start Date Picker years
	@FindBy(xpath="//*[@class='mat-calendar-body']//td//div[1]")
	List<WebElement>addEducationDetailsStartDateYears;
	
	//Add Education Details PopUp Start Date Picker months
	@FindBy(xpath="//*[@class='mat-calendar-body']//td//div[1]")
	List<WebElement>addEducationDetailsStartDateMonths;
	
	//Add Education Details popup Start Date picker days
	@FindBy(xpath="//*[@class='ng-star-inserted']//td//div[1]")
	List<WebElement>addEducationDetailsStartDatedays;
	
	//ADd Education Details popUp Start Date backward arrow
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-calendar-previous-button mat-icon-button mat-button-base']")
	WebElement addEducationDetailsStartDateBackwardArrow;
	
	//Add Education Details PopUp Start Date backward Arrow
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-calendar-next-button mat-icon-button mat-button-base']")
	WebElement addEducationDetailsStartDateForwardArrow;
	
	//Add Education Details PopUp End Date 
	@FindBy(xpath="//*[@formcontrolname='end_date']")
	WebElement addEducationDetailsEndDate;
	
	//Add Education Details PopUp End Date picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-details-form/div/div[2]/form/div[1]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]/svg")
	WebElement addEducationDetailsEndDatePicker;
	
	//add Education Details PopUp Country
	@FindBy(xpath="//*[@aria-label='Country']")
	WebElement addEducationDetailsCountry;
	
	//Add Education DEtails PopUp Countries List
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option/span")
	List<WebElement>addEducationDetailsCountriesList;
	
	//Add Education Details PopUp State 
	@FindBy(xpath="//*[@placeholder='Select enter state']")
	WebElement addEducationDetailsState;
	
	//Add Education Details PopUp States List
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list mat-autocomplete-visible ng-star-inserted']//mat-option")
	List<WebElement>addEducationDetailsStatesList;
	
	//Add Education Details PopUp City 
	@FindBy(xpath="//*[@formcontrolname='city']")
	WebElement addEducationDetailsCity;
	
	//Add Education Details PopUp Address
	@FindBy(xpath="//*[@formcontrolname='address']")
	WebElement addEducationDetailsAddress;
	
	//Add Education Details PopUp comments
	@FindBy(xpath="//*[@data-placeholder='Please Enter Comments']")
	WebElement addEducationDetailsComments;
	
	//Add Education Details PopUp Attachment name
	@FindBy(xpath="//*[@formcontrolname='attachment_name']")
	List<WebElement>addEducationDetailsAttachmentName;
	
	//Add Education Details PopUp Attachment comments
	@FindBy(xpath="//input[@formcontrolname='comments']")
	List<WebElement>addEducationDetailsAttachmentComments;
	
	//Add Education Details PopUp Choose File
	@FindBy(xpath="//input[starts-with(@class,'attachment-file')]")
	List<WebElement>addEducationDetailsChooseFile;
	
	//Add Education Details Popup Add one more attachment + Button
	@FindBy(xpath="/html/body/div[3]/div[2]/div/mat-dialog-container/app-details-form/div/div[2]/form/div[1]/div[6]/span/mat-icon")
	List<WebElement>addEducationDetailsPlusButton;
	
	//Add Education Details PopUp remove minus Button
	@FindBy(xpath="//*[@class='remove']//mat-icon")
	List<WebElement>addEducationDetailsMinusButton;
	
	//Add Education Details PopUp Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement addEducationDetailsSaveButton;
	
	//Add Education Details PopUp Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement addEducationDetailsCancelButton;
	
	//Add Education Details Popup close Button
	@FindBy(xpath="//*[@class='close']")
	WebElement addEducationDetailsCloseButton;
	
	
	
	
	
	//Business Logic
	//Current URL Validation
	public String myDetails_EducationDetails_CurrentURL_Validation() {
		return driver.getCurrentUrl();
	}
	
	//Title validation
	public String myDetails_EducationDetails_Title_Validation() {
		return driver.getTitle();
	}
	
	//Header Validation
	public String myDetails_EducationDetails_Header_Validation() {
		return educationDetailsTableHeader.getText();
	}
	
	//Add Button
	public void myDetails_EducationDetails_AddButton_Validation_Test() {
		AddButton.click();
	}
	
	//Add Education PopUp Header Validation
	public String myDetails_EducationDetails_AddEducationDetailsPopUpHeader_Validation() {
		AddButton.click();
		return addEducationDetailsPopUpHeader.getText();
	}
	
	//All fields Data
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldsData_Validation(List<Object>allFieldsData) throws InterruptedException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		
		
		AddButton.click();
		//Education Field Data
		addEducationDetailsEducation.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(AddButton);
		
		//Field of Study Data
		addEducationDetailsFieldOfStudy.sendKeys(allFieldsData.get(1).toString());
		
		
		//Institute Field Data
		addEducationDetailsInstitute.sendKeys(allFieldsData.get(2).toString());
		
		//GPA/Percentage Field Data
		addEducationDetailsGPA.sendKeys(allFieldsData.get(3).toString().subSequence(0, 2));
		
		datePicker(allFieldsData.get(4).toString());
		act.sendKeys(Keys.ENTER).build().perform();
		
		datePicker(allFieldsData.get(5).toString());
	
		//Country field Data
		addEducationDetailsCountry.sendKeys(allFieldsData.get(6).toString());
		//addEducationDetailsCountry.clear();
		//addEducationDetailsCountry.sendKeys(allFieldsData.get(6).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsCountriesList));
		addEducationDetailsCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addEducationDetailsCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		
		//States Field Data
		addEducationDetailsState.sendKeys(allFieldsData.get(7).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsStatesList));
		addEducationDetailsStatesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addEducationDetailsState);
		
		//City Field Data
		addEducationDetailsCity.sendKeys(allFieldsData.get(8).toString());
		
		
		//Address Field Data
		addEducationDetailsAddress.sendKeys(allFieldsData.get(9).toString());
		
		//Comments Field Data
		addEducationDetailsComments.sendKeys(allFieldsData.get(10).toString());
			
		
		//Attachment Details
		//Attachment Name 
		attachments();
		
		
		//Save Button
		addEducationDetailsSaveButton.click();
		
		Thread.sleep(4000);
		
	}
	


	//Mandatory fields Data with save button
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_MandatoryFieldsDataWithSaveButton_Validation(List<Object>MandatoryFieldsData) throws InterruptedException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		
		
		AddButton.click();
		//Education Field Data
		addEducationDetailsEducation.sendKeys(MandatoryFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(AddButton);
		
		//Field of Study Data
		//addEducationDetailsFieldOfStudy.sendKeys("");
		
		
		//Institute Field Data
		//addEducationDetailsInstitute.sendKeys("");
		
		//GPA/Percentage Field Data
		//addEducationDetailsGPA.sendKeys("");
		
		//Start Date Field Data
		//datePicker();
		
		
		//End Date Field Data
		//datePicker();
		
		//Country field Data
		addEducationDetailsCountry.sendKeys(MandatoryFieldsData.get(1).toString());
		addEducationDetailsCountry.clear();
		addEducationDetailsCountry.sendKeys(MandatoryFieldsData.get(1).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsCountriesList));
		addEducationDetailsCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addEducationDetailsCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		
		//States Field Data
		addEducationDetailsState.sendKeys(MandatoryFieldsData.get(2).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsStatesList));
		addEducationDetailsStatesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addEducationDetailsState);
		
		//City Field Data
		//addEducationDetailsCity.sendKeys("");
		
		
		//Address Field Data
		//addEducationDetailsAddress.sendKeys("");
		
		//Comments Field Data
		//addEducationDetailsComments.sendKeys("");
		
		
		//Attachment Details
		//singleAndmultipleAttachment();
		
		//Save Button
		addEducationDetailsSaveButton.click();
		Thread.sleep(4000);
		
	}


	//All fields Data with Cancel Button
	public void myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldsDataWithCancelButton_Validation(List<Object>allFieldsData) throws InterruptedException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		
		
		AddButton.click();
		//Education Field Data
		addEducationDetailsEducation.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(AddButton);
		
		//Field of Study Data
		addEducationDetailsFieldOfStudy.sendKeys(allFieldsData.get(1).toString());
		
		
		//Institute Field Data
		addEducationDetailsInstitute.sendKeys(allFieldsData.get(2).toString());
		
		//GPA/Percentage Field Data
		addEducationDetailsGPA.sendKeys(allFieldsData.get(3).toString());
		
		datePicker(allFieldsData.get(4).toString());
		act.sendKeys(Keys.ENTER).build().perform();
		
		
		datePicker(allFieldsData.get(5).toString());
		
		//Country field Data
		addEducationDetailsCountry.sendKeys(allFieldsData.get(6).toString());
		addEducationDetailsCountry.clear();
		addEducationDetailsCountry.sendKeys(allFieldsData.get(6).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsCountriesList));
		addEducationDetailsCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addEducationDetailsCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2000);
		
		//States Field Data
		addEducationDetailsState.sendKeys(allFieldsData.get(7).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsStatesList));
		addEducationDetailsStatesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addEducationDetailsState);
		
		//City Field Data
		addEducationDetailsCity.sendKeys(allFieldsData.get(8).toString());
		
		
		//Address Field Data
		addEducationDetailsAddress.sendKeys(allFieldsData.get(9).toString());
		
		//Comments Field Data
		addEducationDetailsComments.sendKeys(allFieldsData.get(10).toString());
			
		
		//Attachment Details
		//Attachment Name 
		attachments();
		
		
		//Save Button
		addEducationDetailsCancelButton.click();
		Thread.sleep(4000);
	}
	
	//All fields Data with Close Button
		public void myDetails_EducationDetails_AddEducationDetailsPopUp_AllFieldsDataWithCloseButton_Validation(List<Object>allFieldsData) throws InterruptedException {
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			Actions act=new Actions(driver);
			
			
			AddButton.click();
			//Education Field Data
			addEducationDetailsEducation.sendKeys(allFieldsData.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(AddButton);
			
			//Field of Study Data
			addEducationDetailsFieldOfStudy.sendKeys(allFieldsData.get(1).toString());
			
			
			//Institute Field Data
			addEducationDetailsInstitute.sendKeys(allFieldsData.get(2).toString());
			
			//GPA/Percentage Field Data
			addEducationDetailsGPA.sendKeys(allFieldsData.get(3).toString());
			
			datePicker(allFieldsData.get(4).toString());
			act.sendKeys(Keys.ENTER).build().perform();
			
			
			datePicker(allFieldsData.get(5).toString());
			act.sendKeys(Keys.ESCAPE).build().perform();
		
			//Country field Data
			addEducationDetailsCountry.sendKeys(allFieldsData.get(6).toString());
			addEducationDetailsCountry.clear();
			addEducationDetailsCountry.sendKeys(allFieldsData.get(6).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsCountriesList));
			addEducationDetailsCountriesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(addEducationDetailsCountry);
			act.sendKeys(Keys.TAB).build().perform();
			
			Thread.sleep(2000);
			
			//States Field Data
			addEducationDetailsState.sendKeys(allFieldsData.get(7).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(addEducationDetailsStatesList));
			addEducationDetailsStatesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(addEducationDetailsState);
			
			//City Field Data
			addEducationDetailsCity.sendKeys(allFieldsData.get(8).toString());
			
			
			//Address Field Data
			addEducationDetailsAddress.sendKeys(allFieldsData.get(9).toString());
			
			//Comments Field Data
			addEducationDetailsComments.sendKeys(allFieldsData.get(10).toString());
				
			
			//Attachment Details
			//Attachment Name 
			attachments();
			
			
			//Save Button
			addEducationDetailsCloseButton.click();
			Thread.sleep(4000);
		}
	
		
		
		
		
		
		
		//Date Picking

	private void datePicker(String Date) {
		Actions act=new Actions(driver);
		

		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		

		String sliptter[]=Date.split("/");
		String month=sliptter[0];
		String date=sliptter[1];
		String year=sliptter[2];
		
		
		addEducationDetailsStartDateYearMonth.click();
		//Checking All Years with matching year
		for(int startYearRange=0;startYearRange<addEducationDetailsStartDateYears.size();startYearRange++) {
			
			if(addEducationDetailsStartDateYears.get(startYearRange).getText().equals(year)) {
				//Year matched & Selected
				addEducationDetailsStartDateYears.get(startYearRange).click();
				break;
			}
		}
		
		//Checking All Months with Matching month
		for(int startMonthRange=0;startMonthRange<addEducationDetailsStartDateMonths.size();startMonthRange++) {
			
			if(addEducationDetailsStartDateMonths.get(startMonthRange).getText().equals(month)) {
				//Month matched & Selected
				addEducationDetailsStartDateMonths.get(startMonthRange).click();
				break;
			}
		}
		
		//Checking All Dates with matching Date
		for(int startDateRange=0;startDateRange<addEducationDetailsStartDatedays.size();startDateRange++) {
			
			if(addEducationDetailsStartDatedays.get(startDateRange).getText().equals(date)) {
				//Date Matched & Selected
				addEducationDetailsStartDatedays.get(startDateRange).click();
				break;
			}
		}
		
		
	}
	
	
	private void attachments() {
		
		
	}
	
	
	//Education Records List
	public List educationRecordsList() {
		List<Object>recordsList=new ArrayList<Object>();
		for(int record=0;record<educationRecordsList.size();record++) {
			recordsList.add(record, educationRecordsList.get(record).getText());
		}
		return recordsList;
	}
	
	
	
	
	
	
	//All Elements Present or Not
	public List presencesOfElements_Validation() throws AWTException {
		Robot robot=new Robot();
		Actions act=new Actions(driver);
	
		List<Object>elementPresent=new ArrayList<Object>();
		
		elementPresent.add(0, educationDetailsTableHeader.isDisplayed());
		elementPresent.add(1, AddButton.isDisplayed());
		elementPresent.add(2, educationHeader.isDisplayed());
		elementPresent.add(3, fieldOfStudyHeader.isDisplayed());
		elementPresent.add(4, institute.isDisplayed());
		elementPresent.add(5, gpa.isDisplayed());
		gpa.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		elementPresent.add(6, startDate.isDisplayed());
		elementPresent.add(7, endDate.isDisplayed());
		elementPresent.add(8, country.isDisplayed());
		elementPresent.add(9, state.isDisplayed());
		state.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		elementPresent.add(10, city.isDisplayed());
		elementPresent.add(11, address.isDisplayed());
		elementPresent.add(12, comments.isDisplayed());
		elementPresent.add(13, createdAt.isDisplayed());
		createdAt.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		elementPresent.add(14, updatedAt.isDisplayed());
	
		return elementPresent;
	}
	
}
