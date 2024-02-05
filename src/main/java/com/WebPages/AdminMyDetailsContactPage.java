package com.WebPages;


import java.util.ArrayList;

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

public class AdminMyDetailsContactPage extends Base{

	AdminMyDetailsContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//Address HEading
	@FindBy(xpath="//*[text()='Address']")
	WebElement addressTableHeading;
	
	//Address Add Button
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[1]/button/span[1]")
	WebElement addressTableAddButton;
	
	//Address Table Total records
	@FindBy(xpath="//*[@col-id='address_line_1']")
	List<WebElement>addressTableRecordsList;
	
	//Address AddPresentAddressPopUp Heading
	@FindBy(xpath="//*[text()='Add Present Address']")
	WebElement addPresentAddressPopUpHeading;
	
	//Address AddPresentAddressPopUp Address Line1
	@FindBy(xpath="//*[@formcontrolname='address_line_1']")
	WebElement addPresentAddressPopUpAddressLine1;
	
	//Address AddPresentAddressPopUp Address Line2
	@FindBy(xpath="//*[@formcontrolname='address_line_2']")
	WebElement addPresentAddressPopUpAddressLine2;
	
	//Address AddPresentAddressPopUp Active CheckBox
	@FindBy(xpath="//*[@class='mat-checkbox-layout']")
	WebElement addPresentAddressPopUpActiveCheckBox;
	
	//Address AddPresentAddressPopUp Country Element
	@FindBy(xpath="//*[@aria-label='Country']")
	WebElement addPresentAddressPopUpCountry;
	
	//Address AddPresentAddressPopUp Countries List
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option")
	List<WebElement>addPresentAddressPopupCountriesList;
	
	//Address AddPresentAddressPopUp State Element
	@FindBy(xpath="//*[@placeholder='Select enter state']")
	WebElement addPresentAddressPopUpState;
	
	//Address AddPresentAddressPopUp States List
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option")
	List<WebElement>addPresentAddressPopUpStatesList;
	
	//Address AddPresentAddressPopup city
	@FindBy(xpath="//*[@formcontrolname='city']")
	WebElement addPresentAddressPopupCity;
	
	//Address AddPresentAddressPopUp ZipCode
	@FindBy(xpath="//*[@formcontrolname='zip_code']")
	WebElement addPresentAddressPopUpZipCode;
	
	//Address AddPresentAddressPopUp lived from
	@FindBy(xpath="//*[@formcontrolname='lived_form']")
	WebElement addPresentAddressPopUpLivedFrom;
	
	//Address AddPresentAddressPopUp Lived from Error message
	@FindBy(xpath="//*[text()=' Lived Until is required ']")
	WebElement addPresentAddressPopUpLivedFromErrorMessage;
	
	//Address AddPresentAddressPopUp Lived From Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-present-form/div/div[2]/form/div[1]/div[3]/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addPresentAddressPopUpLivedFromDatePicker;
	
	//Address AddPresentAddressPopUp Lived From Date Picker month Year DropDown
	@FindBy(xpath="//*[@aria-label='Choose month and year']")
	WebElement addPresentAddressPopUpLivedFromDatePickerMonthYear;
	
	//Address AddPresentAddressPopUp Lived from date picker years 
	@FindBy(xpath="//*[@class='mat-calendar-body']//td//div[1]")
	List<WebElement>addPresentAddressPopUpDatePickerYears;
	
	//Address AddPResentAddressPopUp Lived From date picker month
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addPresentAddressPopUpDatePickerMonth;
	
	//Address AddPresentAddressPopUp Lived From Date Picker backward years arrow 
	@FindBy(xpath="//*[@aria-label='Previous 24 years']")
	WebElement addPresentAddressPopUpDatePickerBackwardArrow;
	
	//Address addPresentAddressPopUp Lived From Date Picker forward years arrow
	@FindBy(xpath="//*[@aria-label='Next 24 years']")
	WebElement addPresentAddressPopUpDatePickerForwardArrow;
	
	//Address addPresentAddressPopup Lived From Date Picker current month & 1 to 31 dates
	@FindBy(xpath="//*[@class='mat-calendar-body']//td")
	List<WebElement>addPresentAddressPopUpDatePickerCurrentMonthWithDates;
	
	//Address AddPresentAddressPopUp Lived Until filter 
	@FindBy(xpath="//*[@formcontrolname='lived_until']")
	WebElement addPresentAddressPopUpLivedUntil;
	
	//Address AddPresentAddressPopUp Home phone Number
	@FindBy(xpath="//*[@formcontrolname='home_phone_number']")
	WebElement addPresentAddressPopUpHomePhoneNumber;
	
	//Address AddPresentAddressPopUp Office Phone Number
	@FindBy(xpath="//*[@formcontrolname='office_phone_number']")
	WebElement addPresentAddressPopUpOfficePhoneNumber;
	
	//Address AddPresentAddressPopUp Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-cncl btn-emp mat-stroked-button mat-button-base']")
	WebElement addPresentAddressPopUpCancelButton;
	
	//Address AddPresentAddressPopUp Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement addPresentAddressPopUpSaveButton;
	
	//Address AddPresentAddressPopUp close Button
	@FindBy(xpath="//*[@class='far fa-times-circle']")
	WebElement addPresentAddressPopUpCloseButton;
	
	//Address Table Address1 Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[1]/div[3]/div/span[1]")
	WebElement addressTableAddress1Header;
	
	//Address Table Address2 Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[7]/div[3]/div/span[1]")
	WebElement addressTableAddress2Header;
	
	//Address Table City Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div[3]/div/span[1]")
	WebElement addressTableCityHeader;
	
	//Address Table Country Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[3]/div/span[1]")
	WebElement addressTableCountryHeader;
	
	//Address Table State Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]/div[3]/div/span[1]")
	WebElement addressTableStateHeader;
	
	//Address Table ZipCode Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]/div[3]/div/span[1]")
	WebElement addressTableZipCodeHeader;
	
	//Address Table Lived From Header
	@FindBy(xpath="//*[text()='Lived From']")
	WebElement addressTableLivedFromHeader;
	
	//Address Table Lived Until Header
	@FindBy(xpath="//*[text()='Lived Untill']")
	WebElement addressTableLivedUntillHeader;
	
	//Address Table Home Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[5]/div[3]/div/span[1]")
	WebElement addressTableHomePhoneNumber;
	
	//Address Table office Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[6]/div[3]/div/span[1]")
	WebElement addressTableOfficePhoneNumber;
	
	//Address Table Active Header
	@FindBy(xpath="//*[text()='Active']")
	WebElement addressTableActive;
	
	//Address Table Created Date Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[7]/div[3]/div/span[1]")
	WebElement addressTableCreatedDate;
	
	//Address Table Updated Date Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[8]/div[3]")
	WebElement addressTableUpdatedDate;
	
	
	
	
	//Emergency Contact 
	
	
	//Emergency Contact Table Header
	@FindBy(xpath="//*[text()='Emergency Contact']")
	WebElement emergencyContactTableHeader;

	//Emergency Contact Table Emergency Conatcts List
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]")
	List<WebElement>emergencyContactTableEmergencyContactRecords;
	
	
	//Emergency Contact Table Add Button
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[1]/button")
	WebElement emergencyContactTableAddButton;
	
	//Emergency Contact AddEmergencyContactPopUp Header
	@FindBy(xpath="//*[text()=' Emergency Contact']")
	WebElement addEmergencyContactPopUpHeader;
	
	//Emergency Contact AddEmergencyContactPopUp Contact Name
	@FindBy(xpath="//*[@formcontrolname='name']")
	WebElement addEmergencyContactPopUpContactName;
	
	//Emergency Contact AddEmergencyContactPopUp relationship 
	@FindBy(xpath="//*[@formcontrolname='relationship']")
	WebElement addEmergencyContactPopUpRelationship;
	
	//Emergency Contact AddEmergencyContactPopUp Contact Number
	@FindBy(xpath="//*[@formcontrolname='number']")
	WebElement addEmergencyContactPopUpContactNumber;
	
	//Emergency Contact AddEmergencyContactPopUp Contact Email
	@FindBy(xpath="//*[@formcontrolname='email']")
	WebElement addEmergencyContactPopUpEmail;
	
	//Emergency Contact AddEmergencyContactPopUp Home Phone Number 
	@FindBy(xpath="//*[@formcontrolname='home_phone_number']")
	WebElement addEmergencyContactPopUpHomePhoneNumber;
	
	//Emergency Contact AddEmergencyContactPopUp Office Phone Number
	@FindBy(xpath="//*[@formcontrolname='office_phone_number']")
	WebElement addEmergencyContactPopUpOfficePhoneNumber;
	
	//Emergency Contact AddEmergencyContactPopUp Address Line1
	@FindBy(xpath="//*[@formcontrolname='address_line_1']")
	WebElement addEmergencyContactPopUpAddressLine1;
	
	//Emergency Contact AddEmergencyContactPopUp Address Line2
	@FindBy(xpath="//*[@formcontrolname='address_line_2']")
	WebElement addEmergencyContactPopUpAddressLine2;
	
	//Emergency Contact AddEmergencyContactPopUp City
	@FindBy(xpath="//*[@formcontrolname='city']")
	WebElement addEmergencyContactPopUpCity;
	
	//Emergency Contact addEmergencyContactPopUp Country filter
	@FindBy(xpath="//*[@aria-label='Country']")
	WebElement addEmergencyContactPopUpCountry;
	
	//Emergency Contact addEmergencyContactPopUp Countries List
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list ng-star-inserted mat-autocomplete-visible']//mat-option")
	List<WebElement>addEmergencyContactPopUpCountriesList;
	
	//Emergency Contact addEmergencyContactPopUp States Filter
	@FindBy(xpath="//*[@placeholder='Select enter state']")
	WebElement addEmergencyContactPopUpState;
	
	//Emergency Contact addEmergencyContactPopUp States List
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list mat-autocomplete-visible ng-star-inserted']//mat-option")
	WebElement addEmergencyContactPopUpStatesList;
	
	//Emergency Contact addEmergencyContactPopUp ZipCode
	@FindBy(xpath="//*[@formcontrolname='zip_code']")
	WebElement addEmergencyContactPopUpZipCode;
	
	//Emergency Contact addEmergencyContactPopUp Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement addEmergencyContactPopUpCancelButton;
	
	//Emergency Contact addEmergencyCotactPopUp Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement addEmergencyContactPopUpSaveButton;
	
	//Emergency Contact addEmergencyContactPopUp close button
	@FindBy(xpath="//*[@class='far fa-times-circle']")
	WebElement addEmergencyContactCloseButton;
	
	//Emergency Contact Table Contact Name Header
	@FindBy(xpath="//*[text()='Contact Name']")
	WebElement emergencyContactTableContactName;
	
	//Emergency Contact Table Relationship Header
	@FindBy(xpath="//*[text()='Relationship']")
	WebElement emergencyContactTableRelationship;
	
	//Emergency Contact Table Contact Number Header
	@FindBy(xpath="//*[text()='Contact Number']")
	WebElement emergencyContactTableContactNumber;
	
	//Emergency Contact Table Contact Email Header
	@FindBy(xpath="//*[text()='Contact Email']")
	WebElement emergencyContactTableContactEmail;
	
	//Emergency Contact Table Home Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[3]/div/span[1]")
	WebElement emergencyContactTableHomePhoneNumber;
	
	//Emergency Contact Table Office Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]/div[3]/div/span[1]")
	WebElement emergencyContactTableOfficePhoneNumber;
	
	//Emergency Contact Table Country Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[3]/div[3]/div/span[1]")
	WebElement emergencyContactTableCountry;
	
	//Emergency Contact Table State Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]/div[3]/div/span[1]")
	WebElement emergencyContactTableState;
	
	//Emergency Contact Table City Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]/div[3]/div/span[1]")
	WebElement emergencyContactTableCity;
	
	//Emergency Contact Table Address Line1 Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[4]/div[3]/div/span[1]")
	WebElement emergencyContactTableAddressLine1;
	
	//Emergency Contact Table Address Line2 Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[5]/div[3]/div/span[1]")
	WebElement emergencyContactTableAddressLine2;
	
	//Emergency Contact Table ZipCode header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[6]/div[3]/div/span[1]")
	WebElement emergencyContactTableZipCode;
	
	//Emegency Contact Table Created At header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[6]/div[3]/div/span[1]")
	WebElement emergencyContactTableCreatedAt;
	
	//Emergency Contact Table Updated At Header
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-contact/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[1]/div[2]/div/div/div[6]/div[3]/div/span[1]")
	WebElement emergencyContactTableUpdatedAt;


	//Business Logic
	//Current Url Validation
	public String myDetails_ContactPage_CurrentURl_Validation(){
		return driver.getCurrentUrl();
	}
	
	//Title Validation
	public String myDetails_ContactPage_Title_Validation() {
		return driver.getTitle();
	}
	
	//Address Table Header 
	public String myDetails_ContactPage_AddressTableHeader_Validation() {
		return addressTableHeading.getText();
	}
	
	//Address Table Add Button
	public void myDetails_ContactPage_AddessTableAddButton_Validation() {
		addressTableAddButton.click();
	}
	
	//Add Address Header Validation
	public String myDetails_ContactPage_AddAddressPopUp_Header_Validation() {
		addressTableAddButton.click();
		return addPresentAddressPopUpHeading.getText();
	}
	
	//Add Address with all fields data with save button
	public void myDetails_ContactPage_AddAddressPopUp_AllFieldsData_Validation(List<Object>AllfieldsData) throws InterruptedException {
		Actions act=new Actions(driver);
	
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		
		addressTableAddButton.click();
		addPresentAddressPopUpAddressLine1.sendKeys((CharSequence)AllfieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpAddressLine1);
		
		addPresentAddressPopUpAddressLine2.sendKeys(AllfieldsData.get(1).toString());
		
		
		addPresentAddressPopUpCountry.sendKeys(AllfieldsData.get(2).toString());
		addPresentAddressPopUpCountry.clear();
		addPresentAddressPopUpCountry.sendKeys(AllfieldsData.get(2).toString());
		
		wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopupCountriesList));
		addPresentAddressPopupCountriesList.get(0).click();
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(2200);
		
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpCountry);
	
		wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
		
		addPresentAddressPopUpState.sendKeys(AllfieldsData.get(3).toString());
		
		wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
		addPresentAddressPopUpStatesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpState);
		
		
		addPresentAddressPopupCity.sendKeys(AllfieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopupCity);
		
		String zipcode=(String)AllfieldsData.get(5).toString();
		
		addPresentAddressPopUpZipCode.sendKeys(zipcode.substring(0, 6));
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpZipCode);
		
		myDetails_ContactPage_DatePicker(AllfieldsData.get(6).toString());
		act.sendKeys(Keys.ENTER).build().perform();
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedFrom);
		
		myDetails_ContactPage_DatePicker(AllfieldsData.get(7).toString());

		act.sendKeys(Keys.ENTER).build().perform();
		CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedUntil);
		
		addPresentAddressPopUpHomePhoneNumber.sendKeys((CharSequence)AllfieldsData.get(8).toString());
		addPresentAddressPopUpOfficePhoneNumber.sendKeys((CharSequence)AllfieldsData.get(9).toString());
		addPresentAddressPopUpSaveButton.click();
		
		Thread.sleep(6000);
		
	}
	
	//Add Address with all fields data with save button
		public void myDetails_ContactPage_AddAddressPopUp_MandatoryFieldsData_Validation(List<Object>mandatoryFieldsData) throws InterruptedException {
			Actions act=new Actions(driver);
			
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			
			addressTableAddButton.click();
			addPresentAddressPopUpAddressLine1.sendKeys((CharSequence)mandatoryFieldsData.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpAddressLine1);
			
			
			addPresentAddressPopUpCountry.sendKeys(mandatoryFieldsData.get(1).toString());
			addPresentAddressPopUpCountry.clear();
			addPresentAddressPopUpCountry.sendKeys(mandatoryFieldsData.get(1).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopupCountriesList));
			addPresentAddressPopupCountriesList.get(0).click();
			act.sendKeys(Keys.TAB).build().perform();
			
			Thread.sleep(2200);
			
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpCountry);
		
			wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
			
			addPresentAddressPopUpState.sendKeys(mandatoryFieldsData.get(2).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
			addPresentAddressPopUpStatesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpState);
			
			
			addPresentAddressPopupCity.sendKeys(mandatoryFieldsData.get(3).toString());
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopupCity);
			
			String zipcode=(String)mandatoryFieldsData.get(4).toString();
			addPresentAddressPopUpZipCode.sendKeys(zipcode.substring(0, 6));
			
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpZipCode);
			
			
			myDetails_ContactPage_DatePicker(mandatoryFieldsData.get(5).toString());
			act.sendKeys(Keys.ENTER).build().perform();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedFrom);
			
			myDetails_ContactPage_DatePicker(mandatoryFieldsData.get(6).toString());

			act.sendKeys(Keys.ENTER).build().perform();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedUntil);
			
			addPresentAddressPopUpSaveButton.click();
			
			Thread.sleep(6000);
		}
		
		//Add Address with all fields data with save button
		public void myDetails_ContactPage_AddAddressPopUp_CancelButton_Validation(List<Object>allFieldsData) throws InterruptedException {
			Actions act=new Actions(driver);
			
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			
			addressTableAddButton.click();
			addPresentAddressPopUpAddressLine1.sendKeys((CharSequence)allFieldsData.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpAddressLine1);
			
			addPresentAddressPopUpAddressLine2.sendKeys(allFieldsData.get(1).toString());
			
			
			addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(2).toString());
			addPresentAddressPopUpCountry.clear();
			addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(2).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopupCountriesList));
			addPresentAddressPopupCountriesList.get(0).click();
			act.sendKeys(Keys.TAB).build().perform();
			
			Thread.sleep(2200);
			
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpCountry);
		
			wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
			
			addPresentAddressPopUpState.sendKeys(allFieldsData.get(3).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
			addPresentAddressPopUpStatesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpState);
			
			
			addPresentAddressPopupCity.sendKeys(allFieldsData.get(4).toString());
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopupCity);
			
			String zipcode=allFieldsData.get(5).toString();
			addPresentAddressPopUpZipCode.sendKeys(zipcode.subSequence(0, 6));
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpZipCode);
			
			myDetails_ContactPage_DatePicker(allFieldsData.get(6).toString());
			act.sendKeys(Keys.ENTER).build().perform();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedFrom);
			
			myDetails_ContactPage_DatePicker(allFieldsData.get(7).toString());

			act.sendKeys(Keys.ENTER).build().perform();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedUntil);
			
			addPresentAddressPopUpHomePhoneNumber.sendKeys((CharSequence)allFieldsData.get(8).toString());
			addPresentAddressPopUpOfficePhoneNumber.sendKeys((CharSequence)allFieldsData.get(9).toString());
			addPresentAddressPopUpSaveButton.click();
			
			Thread.sleep(6000);
		}

		//Add Address with all fields data with save button
		public void myDetails_ContactPage_AddAddressPopUp_CloseButton_Validation(List<Object>allFieldsData) throws InterruptedException {
			Actions act=new Actions(driver);
			
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			
			addressTableAddButton.click();
			addPresentAddressPopUpAddressLine1.sendKeys((CharSequence)allFieldsData.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpAddressLine1);
			
			addPresentAddressPopUpAddressLine2.sendKeys(allFieldsData.get(1).toString());
			
			
			addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(2).toString());
			addPresentAddressPopUpCountry.clear();
			addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(2).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopupCountriesList));
			addPresentAddressPopupCountriesList.get(0).click();
			act.sendKeys(Keys.TAB).build().perform();
			
			Thread.sleep(2200);
			
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpCountry);
		
			wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
			
			addPresentAddressPopUpState.sendKeys(allFieldsData.get(3).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
			addPresentAddressPopUpStatesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpState);
			
			
			addPresentAddressPopupCity.sendKeys(allFieldsData.get(4).toString());
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopupCity);
			
			
			addPresentAddressPopUpZipCode.sendKeys(allFieldsData.get(5).toString().substring(0, 6));
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpZipCode);
			
			myDetails_ContactPage_DatePicker(allFieldsData.get(6).toString());
			act.sendKeys(Keys.ENTER).build().perform();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedFrom);
			
			myDetails_ContactPage_DatePicker(allFieldsData.get(7).toString());

			act.sendKeys(Keys.ENTER).build().perform();
			CommonActions.checkMandatoryFieldValidation(addPresentAddressPopUpLivedUntil);
			
			addPresentAddressPopUpHomePhoneNumber.sendKeys((CharSequence)allFieldsData.get(8).toString());
			addPresentAddressPopUpOfficePhoneNumber.sendKeys((CharSequence)allFieldsData.get(9).toString());
			addPresentAddressPopUpSaveButton.click();
			
			Thread.sleep(6000);
		}

		
		
		
		
		
		
		
		
		
		
	
		
		//Emergency Contact Details
		//Emergency Contact Table Header 
		public String myDetails_ContactPage_EmergencyContactTableHeader_Validation() {
			return emergencyContactTableHeader.getText();
		}
		
		//Emergency Contact Table Add Button
		public void myDetails_ContactPage_EmergencyContactTableAddButton_Validation() {
			emergencyContactTableAddButton.click();
		}
		
		//Emergency Contact Header Validation
		public String myDetails_ContactPage_AddEmergencyContactPopUp_Header_Validation() {
			emergencyContactTableAddButton.click();
			return addEmergencyContactPopUpHeader.getText();
		}
		
		//Add Emergency Contact with all fields data with save button
		public void myDetails_ContactPage_AddEmergencyContactPopUp_AllFieldsData_Validation(List<Object>AllfieldsData) throws InterruptedException {
			Actions act=new Actions(driver);
		
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			
			emergencyContactTableAddButton.click();
			
			addEmergencyContactPopUpContactName.sendKeys(AllfieldsData.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactName);
			
			
			addEmergencyContactPopUpRelationship.sendKeys(AllfieldsData.get(1).toString());
			
			
			addEmergencyContactPopUpContactNumber.sendKeys(AllfieldsData.get(2).toString());
			CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactNumber);
			
			
			addEmergencyContactPopUpEmail.sendKeys(AllfieldsData.get(3).toString());
			CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpEmail);
			
			addEmergencyContactPopUpHomePhoneNumber.sendKeys(AllfieldsData.get(4).toString());
			
			
			addEmergencyContactPopUpOfficePhoneNumber.sendKeys(AllfieldsData.get(5).toString());
			
			
			addEmergencyContactPopUpAddressLine1.sendKeys(AllfieldsData.get(6).toString());
			
			
			addEmergencyContactPopUpAddressLine2.sendKeys(AllfieldsData.get(7).toString());
			
			
			addEmergencyContactPopUpCity.sendKeys(AllfieldsData.get(8).toString());
			
			
			addPresentAddressPopUpCountry.sendKeys(AllfieldsData.get(9).toString());
			addPresentAddressPopUpCountry.clear();
			addPresentAddressPopUpCountry.sendKeys(AllfieldsData.get(9).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addEmergencyContactPopUpCountriesList));
			addPresentAddressPopupCountriesList.get(0).click();
			act.sendKeys(Keys.TAB).build().perform();
			
			Thread.sleep(2000);
			
		
			wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
			
			addPresentAddressPopUpState.sendKeys(AllfieldsData.get(10).toString());
			
			wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
			addPresentAddressPopUpStatesList.get(0).click();
			
			
			addPresentAddressPopUpZipCode.sendKeys(AllfieldsData.get(11).toString().substring(0,6));
			
			
			addEmergencyContactPopUpSaveButton.click();
			
			Thread.sleep(6000);
			
		}
		
		//Add Address with all fields data with save button
			public void myDetails_ContactPage_AddEmergencyContactPopUp_MandatoryFieldsData_Validation(List<Object>mandatoryFieldsData) throws InterruptedException {
				Actions act=new Actions(driver);
				
				WebDriverWait wait=CommonActions.webDriverWaitMethod();
				
				emergencyContactTableAddButton.click();
				
				addEmergencyContactPopUpContactName.sendKeys();
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactName);
				
				
				//addEmergencyContactPopUpRelationship.sendKeys();
				
				
				addEmergencyContactPopUpContactNumber.sendKeys();
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactNumber);
				
				
				addEmergencyContactPopUpEmail.sendKeys();
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpEmail);
				
				/*addEmergencyContactPopUpHomePhoneNumber.sendKeys();
				
				
				addEmergencyContactPopUpOfficePhoneNumber.sendKeys();
				
				
				addEmergencyContactPopUpAddressLine1.sendKeys();
				
				
				addEmergencyContactPopUpAddressLine2.sendKeys();
				
				
				addEmergencyContactPopUpCity.sendKeys();
				
				
				addPresentAddressPopUpCountry.sendKeys();
				addPresentAddressPopUpCountry.clear();
				addPresentAddressPopUpCountry.sendKeys();
				
				wait.until(ExpectedConditions.visibilityOfAllElements(addEmergencyContactPopUpCountriesList));
				addPresentAddressPopupCountriesList.get(0).click();
				act.sendKeys(Keys.TAB).build().perform();
				
				Thread.sleep(2200);
				
			
				wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
				
				addPresentAddressPopUpState.sendKeys(AllfieldsData.get(3).toString());
				
				wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
				addPresentAddressPopUpStatesList.get(0).click();
				
				
				addPresentAddressPopUpZipCode.sendKeys((CharSequence)AllfieldsData.get(5).toString());
				*/
				
				addEmergencyContactPopUpSaveButton.click();
				
				Thread.sleep(6000);
				
			}
			
			//Add Address with all fields data with save button
			public void myDetails_ContactPage_AddEmergencyContactPopUp_CancelButton_Validation(List<Object>allFieldsData) throws InterruptedException {
				Actions act=new Actions(driver);
				
				WebDriverWait wait=CommonActions.webDriverWaitMethod();
				
				emergencyContactTableAddButton.click();
				
				addEmergencyContactPopUpContactName.sendKeys(allFieldsData.get(0).toString());
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactName);
				
				
				addEmergencyContactPopUpRelationship.sendKeys(allFieldsData.get(1).toString());
				
				
				addEmergencyContactPopUpContactNumber.sendKeys(allFieldsData.get(2).toString());
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactNumber);
				
				
				addEmergencyContactPopUpEmail.sendKeys(allFieldsData.get(3).toString());
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpEmail);
				
				addEmergencyContactPopUpHomePhoneNumber.sendKeys(allFieldsData.get(4).toString());
				
				
				addEmergencyContactPopUpOfficePhoneNumber.sendKeys(allFieldsData.get(5).toString());
				
				
				addEmergencyContactPopUpAddressLine1.sendKeys(allFieldsData.get(6).toString());
				
				
				addEmergencyContactPopUpAddressLine2.sendKeys(allFieldsData.get(7).toString());
				
				
				addEmergencyContactPopUpCity.sendKeys(allFieldsData.get(8).toString());
				
				
				addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(9).toString());
				addPresentAddressPopUpCountry.clear();
				addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(9).toString());
				
				wait.until(ExpectedConditions.visibilityOfAllElements(addEmergencyContactPopUpCountriesList));
				addPresentAddressPopupCountriesList.get(0).click();
				act.sendKeys(Keys.TAB).build().perform();
				
				Thread.sleep(2200);
				
			
				wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
				
				addPresentAddressPopUpState.sendKeys(allFieldsData.get(10).toString());
				
				wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
				addPresentAddressPopUpStatesList.get(0).click();
				
				
				addPresentAddressPopUpZipCode.sendKeys((CharSequence)allFieldsData.get(11).toString().substring(0, 6));
				
				
				addEmergencyContactPopUpSaveButton.click();
				
				Thread.sleep(6000);
						
			}

			//Add Address with all fields data with save button
			public void myDetails_ContactPage_AddEmergencyContactPopUp_CloseButton_Validation(List<Object>allFieldsData) throws InterruptedException {
				Actions act=new Actions(driver);
				
				WebDriverWait wait=CommonActions.webDriverWaitMethod();
				
				emergencyContactTableAddButton.click();
				
				addEmergencyContactPopUpContactName.sendKeys(allFieldsData.get(0).toString());
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactName);
				
				
				addEmergencyContactPopUpRelationship.sendKeys(allFieldsData.get(1).toString());
				
				
				addEmergencyContactPopUpContactNumber.sendKeys(allFieldsData.get(2).toString());
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpContactNumber);
				
				
				addEmergencyContactPopUpEmail.sendKeys(allFieldsData.get(3).toString());
				CommonActions.checkMandatoryFieldValidation(addEmergencyContactPopUpEmail);
				
				addEmergencyContactPopUpHomePhoneNumber.sendKeys(allFieldsData.get(4).toString());
				
				
				addEmergencyContactPopUpOfficePhoneNumber.sendKeys(allFieldsData.get(5).toString());
				
				
				addEmergencyContactPopUpAddressLine1.sendKeys(allFieldsData.get(6).toString());
				
				
				addEmergencyContactPopUpAddressLine2.sendKeys(allFieldsData.get(7).toString());
				
				
				addEmergencyContactPopUpCity.sendKeys(allFieldsData.get(8).toString());
				
				
				addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(9).toString());
				addPresentAddressPopUpCountry.clear();
				addPresentAddressPopUpCountry.sendKeys(allFieldsData.get(9).toString());
				
				wait.until(ExpectedConditions.visibilityOfAllElements(addEmergencyContactPopUpCountriesList));
				addPresentAddressPopupCountriesList.get(0).click();
				act.sendKeys(Keys.TAB).build().perform();
				
				Thread.sleep(2200);
				
			
				wait.until(ExpectedConditions.visibilityOf(addPresentAddressPopUpState));
				
				addPresentAddressPopUpState.sendKeys(allFieldsData.get(10).toString());
				
				wait.until(ExpectedConditions.visibilityOfAllElements(addPresentAddressPopUpStatesList));
				addPresentAddressPopUpStatesList.get(0).click();
				
				
				addPresentAddressPopUpZipCode.sendKeys((CharSequence)allFieldsData.get(11).toString().substring(0, 6));
				
				
				addEmergencyContactPopUpSaveButton.click();
				
				Thread.sleep(6000);
			}


		
		
				
				
		
		
				
		
		
		private void myDetails_ContactPage_DatePicker(String Date) {
			Actions act=new Actions(driver);
			
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			

			String sliptter[]=Date.split("/");
			String month=sliptter[0];
			String date=sliptter[1];
			String year=sliptter[2];
			
			addPresentAddressPopUpLivedFromDatePickerMonthYear.click();

			//Checking All Years with matching year
			for(int startDateRange=0;startDateRange<addPresentAddressPopUpDatePickerYears.size();startDateRange++) {
				
				if(addPresentAddressPopUpDatePickerYears.get(startDateRange).getText().equals(year)) {
					//Year matched & Selected
					addPresentAddressPopUpDatePickerYears.get(startDateRange).click();
					break;
				}
			}
			
			//Checking All Months with Mtaching month
			for(int startMonthRange=0;startMonthRange<addPresentAddressPopUpDatePickerMonth.size();startMonthRange++) {
				
				if(addPresentAddressPopUpDatePickerMonth.get(startMonthRange).getText().equals(month)) {
					//Month matched & Selected
					addPresentAddressPopUpDatePickerMonth.get(startMonthRange).click();
					break;
				}
			}
			
			//Checking All Dates with matching Date
			for(int startDateRange=0;startDateRange<addPresentAddressPopUpDatePickerCurrentMonthWithDates.size();startDateRange++) {
				
				if(addPresentAddressPopUpDatePickerCurrentMonthWithDates.get(startDateRange).getText().equals(date)) {
					//Date Matched & Selected
					addPresentAddressPopUpDatePickerCurrentMonthWithDates.get(startDateRange).click();
					break;
				}
			}
			
	}
		
	public List myDetails_ContactPage_AddressesList_Validation() {
		List<Object>recordName=new ArrayList<Object>();
		for(int record=0;record<addressTableRecordsList.size();record++) {
			recordName.add(record, addressTableRecordsList.get(record).getText());
			
		}
		return recordName;
	}
	
	public List myDetails_ContactPage_EmergencyContactsList_Validation() {
		List<Object>recordName=new ArrayList<Object>();
		for(int record=0;record<emergencyContactTableEmergencyContactRecords.size();record++) {
			recordName.add(record, emergencyContactTableEmergencyContactRecords.get(record).getText());
		}
		return recordName;
	}
	
	public void myDetails_ContactPage_ExistingAddress() {
		myDetails_ContactPage_AddressesList_Validation();
		
	}
	
}

