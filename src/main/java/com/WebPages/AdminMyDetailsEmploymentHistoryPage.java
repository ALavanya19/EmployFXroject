package com.WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Calendar;
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
import com.Log.Log;

public class AdminMyDetailsEmploymentHistoryPage extends Base{

	AdminMyDetailsEmploymentHistoryPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	//Object Repository
	//Employment History Table Headder
	@FindBy(xpath="//*[@class='mt-b-0 icon-color-5' and text()='Employment History']")
	WebElement employmentHistoryTableHeader;
	
	//Employment History Table Add Button
	@FindBy(xpath="//*[@class='emp-info-box form-area mt-b-10']//button")
	WebElement employmentHistoryTableAddButton;
	
	
	
	//Add Employment History Popup Fields
	//Add Employment History Popup Header
	@FindBy(xpath="//h3[contains(text(), 'Add Employment History')]")
	WebElement addEmploymentHistoryPopUpHeader;
	
	//Add Employment History PopUp Emplyer field
	@FindBy(xpath="//*[@formcontrolname='employer_title']")
	WebElement addEmploymentHistoryPopUpEmployerName;
	
	//Job Title Field
	@FindBy(xpath="//*[@formcontrolname='job_title']")
	WebElement addEmploymentHistoryPopUpJobTitle;
	
	//Employment Type field
	@FindBy(xpath="//*[@formcontrolname='employment_type']")
	WebElement addEmploymentHistoryPopUpEmploymentTypeDropDown;
	
	//Employment Type DropDown Options
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/mat-option/span")
	List<WebElement>addEmploymentHistoryPopupemploymentTypeOptions;
	
	//From field
	@FindBy(xpath="//*[@formcontrolname='from_date']")
	WebElement addEmploymentHistoryPopUpFrom;
	
	//From Date Picker
	@FindBy(xpath="//*[@aria-label='Open calendar']")
	List<WebElement>datePicker;
	
	//Date Picker month Year DropDown
	@FindBy(xpath="//*[@aria-label='Choose month and year']")
	WebElement datePickerMonthYearDropDown;
	
	//Date Picker years
	@FindBy(xpath="//*[@class='mat-calendar-table']//td//div[1]")
	List<WebElement>datePickerYears;
	
	//Date Picker Months
	@FindBy(xpath="//*[@class='mat-calendar-body']//td//div[1]")
	List<WebElement>datePickerMonths;
	
	//Date Picker days
	@FindBy(xpath="//*[@class='mat-calendar-body']//td//div[1]")
	List<WebElement>datePickerMonthDays;
	
	//Date Picker Prvious Years
	@FindBy(xpath="//*[@aria-label='Previous month']")
	WebElement previousMonthArrow;
	
	
	//Date Picker Previous Year
	@FindBy(xpath="//*[@aria-label='Previous year']")
	WebElement previousYearsArrow;
	
	//Date Picker forward years
	@FindBy(xpath="//*[@aria-label='Next month']")
	WebElement nextmonthArrow;
	
	//To field
	@FindBy(xpath="//*[@formcontrolname='to_date']")
	WebElement addEmploymentHistoryPopUpTo;
	
	//Employer Phone Number field
	@FindBy(xpath="//*[@formcontrolname='employer_phone']")
	WebElement addEmploymentHistoryPopUpEmployerPhonenumber;
	
	//Address field
	@FindBy(xpath="//*[@formcontrolname='address']")
	WebElement addEmploymentHistoryPopUpAddress;
	
	//Country field
	@FindBy(xpath="//*[@aria-label='Country']")
	WebElement addEmploymentHistoryPopUpCountryDropDoown;
	
	//Countries list
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list mat-autocomplete-visible ng-star-inserted']//mat-option//span")
	List<WebElement>addEmploymentHistoryPopupCountriesList;
	
	//State field
	@FindBy(xpath="//*[@data-placeholder='Select enter state']")
	WebElement addEmploymentHistoryPopUpState;
	
	//State list
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list mat-autocomplete-visible ng-star-inserted']//mat-option//span")
	List<WebElement>addEmploymenthistoryPopUpStatesList;
	
	//City field
	@FindBy(xpath="//*[@formcontrolname='city']")
	WebElement addEmploymentHistoryPopUpCity;
	
	//ZipCode field
	@FindBy(xpath="//*[@formcontrolname='zip_code']")
	WebElement addEmploymentHistoryPopUpZipCode;
	
	//May we connect this employer field
	@FindBy(xpath="//*[@class='mat-radio-container']")
	List<WebElement>addEmploymentHistoryPopUpMayWeConnect;
	
	
	//Responsibilities field
	@FindBy(xpath="//*[@formcontrolname='responsibilities']")
	WebElement addEmploymentHistoryPopUpResponsibilities;
	
	//Reason for Leaving field
	@FindBy(xpath="//*[@formcontrolname='reason_for_living']")
	WebElement addEmploymentHistoryPopUpReasonForLeaving;
	
	// Attachment Name
	@FindBy(xpath="//*[@formcontrolname='attachment_name']")
	List<WebElement>addemploymentHistoryPopUpAttachmentName;
	
	//Attachment Comments
	@FindBy(xpath="//*[@formcontrolname='comments']")
	List<WebElement>addEmploymentHistoryPopUpAttachmentComments;
	
	//Choose File
	@FindBy(xpath="//*[@class='attachment-file']")
	List<WebElement>addEmploymentHistoryPopupChooseFile;
	
	//[+] Button
	@FindBy(xpath="//*[@class='icon-color-1 attach-btn add-btn']")
	WebElement addEmploymentHistoryPopUpPlusButton;
	
	//[-] Buttons
	@FindBy(xpath="//*[@class='remove']//span")
	List<WebElement>addEmploymentHistoryPopUpRemoveButton;
	
	//Cancel Button
	@FindBy(xpath="//*[text()=' Cancel ']")
	WebElement addEmploymentHistoryPopupCancelButton;
	
	//Save Button
	@FindBy(xpath="//*[text()=' Save ']")
	WebElement addEmploymenthistoryPopUpSaveButton;
	
	//Close Button
	@FindBy(xpath="//*[@class='close']")
	WebElement addemploymentHistoryPopUpCloseButton;
	
	
	
	
	
	//Employment history Table Headers Details
	
	//Employment History Table Employer Name header
	@FindBy(xpath="//*[text()='Employer Name']")
	WebElement employmentHistoryTableEmployerNameHEader;
	
	//Employment History Table Employment Type HEader
	@FindBy(xpath="//*[text()='Employment Type']")
	WebElement employmentHistoryTableEmploymentTypeHeader;
	
	//Employment History Table From Date Header
	@FindBy(xpath="//*[text()='	From']")
	WebElement employmentHistoryTableFromDateHeader;
	
	//Employment History Table To Date HEader
	@FindBy(xpath="//*[text()='To']")
	WebElement employmentHistoryTableToDateHeader;
	
	//Employment History Table Employer Phone Number Header
	@FindBy(xpath="//*[text()='Employer Phone Number']")
	WebElement employmentHistoryTableEmployerPhoneNumberHeader;
	
	//Employment History Table ZipCode Header
	@FindBy(xpath="//*[text()='Zip Code']")
	WebElement employementHistoryTableZipCodeHeader;
	

	
	//Employment History Table Contact Employer Header
	@FindBy(xpath="//*[text()='Contact Employer']")
	WebElement employmentHistoryTableContactEmployerHeader;
	
	//Employment History Table Responsilibities Header
	@FindBy(xpath="//*[text()='Responsibilities']")
	WebElement employmentHistoryTableResponsibilitiesHeader;
	
	//Employment History Table Reason For LEaving Header
	@FindBy(xpath="//*[text()='Reason For Leaving']")
	WebElement employmentHistoryTableReasonForLeavingHeader;
	
	//Employment History Table Created AT Header
	@FindBy(xpath="//*[@id=\"myGrid\"]/div/div[1]/div[2]/div[1]/div[2]/div/div/div[6]/div[3]/div/span[1]/text()")
	WebElement employmentHistoryTableCreatedAt;
	
	//Employment History Table Updated At Header
	@FindBy(xpath="//*[@id=\"myGrid\"]/div/div[1]/div[2]/div[1]/div[2]/div/div/div[7]/div[3]/div/span[1]/text()")
	WebElement employmentHistoryTableUpdatedAt;
	
	
	
	//Employemnt History Table Employer Name Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]")
	List<WebElement>employmentHistoryTableEmployerNameRecords;
	
	//Employment History Table Job Title Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[2]")
	List<WebElement>employmentHistoryTableJobTilteRecords;
	
	//Employement History Table Employment Yype
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")
	List<WebElement>employmentHistoryTableEmploymentTypeRecords;
	
	//Employment History Table Form Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>employmentHistoryTableFromRecords;
	
	//Employment History Table To Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[5]")
	List<WebElement>employmentHistoryTableToRecords;
	
	//Employment History Table Phone Number Reocrds
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")
	List<WebElement>employmentHistoryTableEmployerPhoneNumber;
	
	//Employment History Table Address Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>employmentHistoryTableAddressRecords;
	
	//Employment History Table Country Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[5]")
	List<WebElement>employmentHistoryTableCountryRecords;
	
	//Employment History Table State Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")
	List<WebElement>employmentHistoryTableStateRecords;
	
	//Employment History Table City Reocrds
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>employmentHistoryCityRecords;
	
	//Employment History Table ZipCode Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")
	List<WebElement>employmentHstoryZipCodeRecords;
	
	//Employment History Table Contact Employer 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>employmenthistoryContactEmployerRecords;
	
	//Employment History Table Responsibilities Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>employmentHistoryResponsibilitiesRecords;
	
	//Employement History Table Reason For Leaving Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[5]")
	List<WebElement>employmentHistoryReasonForLeavingRecords;
	
	//Employment History Table Created At Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[6]")
	List<WebElement>employmentHistoryCreatedAtRecords;
	
	//Employment History Table Updated At Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[7]")
	List<WebElement>employmentHistoryUpdatedAtRecords;
	
	//Employment History Table Edit Buttons
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[3]/div/div[1]/app-red-component/i")
	List<WebElement>employmentHistoryEditButtons;
	
	//Employment History Table Delete Buttons
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[1]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[3]/div/div[2]/app-red-component/i")
	List<WebElement>employmentHistoryDeleteButtons;
	
	
	
	
	
	
	//References Table Elements
	
	//References Table Header
	@FindBy(xpath="//*[text()='References']")
	WebElement referencesTableHeader;
	
	//References Table Add Button
	@FindBy(xpath="//*[@class='emp-info-box form-area']//button")
	WebElement referencesTableAddButton;
	
	//Add Reference Popup fields
	//Header
	@FindBy(xpath="//*[contains(text(),'Add Reference')]")
	WebElement addReferencePopUpHeader;
	
	//Full Name field
	@FindBy(xpath="//*[@formcontrolname='full_name']")
	WebElement addReferencePopupFullName;
	
	//Job Title field
	@FindBy(xpath="//*[@formcontrolname='job_title']")
	WebElement addReferencePopUpJobtitle;
	
	//Company field
	@FindBy(xpath="//*[@formcontrolname='company']")
	WebElement addReferencePopUpCompany;
	
	//Phone number field
	@FindBy(xpath="//*[@formcontrolname='phone']")
	WebElement addReferencePopUpPhoneNumber;
	
	//Emal field
	@FindBy(xpath="//*[@formcontrolname='email']")
	WebElement addReferencePopUpEmail;
	
	//Year Acquainted
	@FindBy(xpath="//*[@formcontrolname='years_acquainted']")
	WebElement addReferencePopUpYearsAcquainted;
	
	//Address field
	@FindBy(xpath="//*[@formcontrolname='address']")
	WebElement addReferencePopUpAddress;
	
	//Country field
	@FindBy(xpath="//*[@aria-label='Country']")
	WebElement addReferencePopUpCountry;
	
	//Countries List
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list ng-star-inserted mat-autocomplete-visible']//mat-option")
	List<WebElement>countriesList;
	
	//State field
	@FindBy(xpath="//*[@placeholder='Select enter state']")
	WebElement addReferencePopupStateField;
	
	//States list
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list mat-autocomplete-visible ng-star-inserted']//mat-option")
	List<WebElement>stateList;

	//City field
	@FindBy(xpath="//*[@formcontrolname='city']")
	WebElement addReferencePopUpCity;
	
	//ZipCode field
	@FindBy(xpath="//*[@formcontrolname='zip_code']")
	WebElement addReferencePopUpZipCode;
	
	//Cancel Button
	@FindBy(xpath="//*[text()=' Cancel ']")
	WebElement addReferencePopUpCancelButton;
	
	//Save Button
	@FindBy(xpath="//*[text()=' Save ']")
	WebElement addReferencePopUpSaveButton;
	
	//Close Button
	@FindBy(xpath="//*[@class='close']")
	WebElement addReferencePopUpCloseButton;
	
	
	
	//Reference Table records data
	//References Table Full Name Header
	@FindBy(xpath="//*[text()='Full Name']")
	WebElement referencesTableFullNameHeader;
	
	//References Table Company Header
	@FindBy(xpath="//*[text()='Company']")
	WebElement referencesTableCompanyHeader;
	
	//References Table Phone number Header
	@FindBy(xpath="//*[text()='Phone Number']")
	WebElement referencesTablePhoneNumberHeader;
	
	//References Table Email Header
	@FindBy(xpath="//*[text()='Email']")
	WebElement referencesTableEmailHeader;
	
	//References Table Years Acquainted Header
	@FindBy(xpath="//*[text()='Years Acquainted']")
	WebElement referencesTableYearsAcquaintedHeader;
	
    //ZipCode Header
	@FindBy(xpath="//*[text()='Zipcode']")
	WebElement referencesTableZipCodeHeader;
	
	//Reference Table Full Name records 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[1]")
	List<WebElement>referenceTableFullNameRecords;
	
	//Reference Table Job Title Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[2]")
	List<WebElement>referenceTableJobTitleRecords;
	
	//Reference Table Company Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")
	List<WebElement>referenceTableCompanyRecords;
	
	//Reference Table Phone Number Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>referenceTablePhoneNumberRecords;
	
	//Reference Table email records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[5]")
	List<WebElement>referenceTableEmailRecords;
	
	//Reference Table Years acquainted Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[2]")
	List<WebElement>referenceTableYearsAcquaintedRecords;
	
	//Reference Table Address Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[3]")
	List<WebElement>referenceTableAddressRecords;
	
	//Reference Table Country Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>referenceTableCountryRecords;
	
	//Reference Table State Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[4]")
	List<WebElement>referenceTableStateRecords;
	
	//Reference Table City Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[5]")
	List<WebElement>referenceTableCityRecords;
	
	//Reference Table Zipcode Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[6]")
	List<WebElement>referenceTableZipCodeRecords;
	
	//Reference Table Created At Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[7]")
	List<WebElement>referenceTableCreatedAtRecords;
	
	//Reference Tab;e Updated At Records
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-employe-details/div[2]/div/div[2]/div/app-employe-history/div/div[2]/div[2]/div/div/ag-grid-angular/div/div[1]/div[2]/div[3]/div[2]/div/div/div/div[8]")
	List<WebElement>referenceTableUpdatedAtRecords;
	
	
	
	
	
	
	
	
	
	//Common fields
	//Job Title Headers
	@FindBy(xpath="//*[text()='Job Title']")
	List<WebElement>jobTitleHeader;
	
	//Address Headers
	@FindBy(xpath="//*[text()='Address']")
	List<WebElement>addressHeader;
	
	//Country Header
	@FindBy(xpath="//*[text()='Country']")
	List<WebElement>countryHeader;
	
	//State Header
	@FindBy(xpath="//*[text()='State']")
	List<WebElement>stateHeader;
	
	//City Header
	@FindBy(xpath="//*[text()='City']")
	List<WebElement>cityHeader;
	

	//Create At HEader
	@FindBy(xpath="//*[text()='Created At']")
	List<WebElement>createAtHeader;
		
	//Updated At HEader
	@FindBy(xpath="//*[text()='Updated At']")
	List<WebElement>updatedAtHeader;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Business Logic
	//Current URL Validation
	public String myDetails_EmployementHistoryPage_CurrentURL_Validation() {
		return driver.getCurrentUrl();
	}
	
	//Title Validation
	public String myDetails_EmploymentHistoryPage_Title_Validation() {
		return driver.getTitle();
	}
	
	
	//Employment History Employer RecordsList
	public List employmentHistoryPage_EmployerRecordsList() {
		List<Object>employerRecordsList=new ArrayList<Object>();
		for(int record=0;record<employmentHistoryTableEmployerNameRecords.size();record++) {
			employerRecordsList.add(record, employmentHistoryTableEmployerNameRecords.get(record).getText());
		}
		return employerRecordsList;
	}
	
	//Employer History Job Title Records List
	public List employmentHistoryPage_JobtitleList() {
		List<Object>jobTitleRecordsList=new ArrayList<Object>();
		for(int record=0;record<employmentHistoryTableJobTilteRecords.size();record++) {
			jobTitleRecordsList.add(record, employmentHistoryTableJobTilteRecords.get(record).getText());
		}
		return jobTitleRecordsList;
	}
	
	
	//Employment History Table Headers elements need to present
	public List myDetails_EmployentHistoryPage_EmploymentHistoryTablePresenceOfElements_Validation() throws AWTException {
		Robot robot=new Robot();
		Actions act=new Actions(driver);
		
		
		List<Object>employmentHistoryTableElementsCount=new ArrayList<Object>();
		
		employmentHistoryTableElementsCount.add(0, employmentHistoryTableEmployerNameHEader.isDisplayed());
		employmentHistoryTableElementsCount.add(1, jobTitleHeader.get(0).isDisplayed());
		employmentHistoryTableElementsCount.add(2, employmentHistoryTableEmploymentTypeHeader.isDisplayed());
		employmentHistoryTableElementsCount.add(3, employmentHistoryTableFromDateHeader.isDisplayed());
		employmentHistoryTableElementsCount.add(4, employmentHistoryTableToDateHeader.isDisplayed());
		
		employmentHistoryTableToDateHeader.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		employmentHistoryTableElementsCount.add(5, employmentHistoryTableEmployerPhoneNumberHeader.isDisplayed());
		employmentHistoryTableElementsCount.add(6, addressHeader.get(0).isDisplayed());
		employmentHistoryTableElementsCount.add(7, countryHeader.get(0).isDisplayed());
		employmentHistoryTableElementsCount.add(8, stateHeader.get(0).isDisplayed());
		employmentHistoryTableElementsCount.add(9, cityHeader.get(0).isDisplayed());
		
		cityHeader.get(0).click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		employmentHistoryTableElementsCount.add(10, employementHistoryTableZipCodeHeader.isDisplayed());
		employmentHistoryTableElementsCount.add(11, employmentHistoryTableContactEmployerHeader.isDisplayed());
		employmentHistoryTableElementsCount.add(12, employmentHistoryTableResponsibilitiesHeader.isDisplayed());
		
		employmentHistoryTableResponsibilitiesHeader.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		employmentHistoryTableElementsCount.add(13, employmentHistoryTableReasonForLeavingHeader.isDisplayed());
		employmentHistoryTableElementsCount.add(14, createAtHeader.get(0).isDisplayed());
		employmentHistoryTableElementsCount.add(15, updatedAtHeader.get(0).isDisplayed());
		
		return employmentHistoryTableElementsCount;
	}
	
	
	//Add Employment History PopUp Validation
	//Elements need to present
	public List myDetails_EmploymentHistoryPage_AddEmploymentHistoryPopUp_PresenceOfElements_Validation() {
		
		List<Object>elementsCount=new ArrayList<Object>();
		
		elementsCount.add(0, addEmploymentHistoryPopUpEmployerName.isDisplayed());
		elementsCount.add(1, addEmploymentHistoryPopUpJobTitle.isDisplayed());
		elementsCount.add(2, addEmploymentHistoryPopUpEmploymentTypeDropDown.isDisplayed());
		elementsCount.add(3, addEmploymentHistoryPopUpFrom.isDisplayed());
		elementsCount.add(4, addEmploymentHistoryPopUpTo.isDisplayed());
		elementsCount.add(5, addEmploymentHistoryPopUpEmployerPhonenumber.isDisplayed());
		elementsCount.add(6, addEmploymentHistoryPopUpAddress.isDisplayed());
		elementsCount.add(7, addEmploymentHistoryPopUpCountryDropDoown.isDisplayed());
		elementsCount.add(8, addEmploymentHistoryPopUpState.isDisplayed());
		elementsCount.add(9, addEmploymentHistoryPopUpCity.isDisplayed());
		elementsCount.add(10, addEmploymentHistoryPopUpZipCode.isDisplayed());
		elementsCount.add(11, addEmploymentHistoryPopUpMayWeConnect.get(0).isDisplayed());
		elementsCount.add(12, addEmploymentHistoryPopUpMayWeConnect.get(1).isDisplayed());
		elementsCount.add(13, addEmploymentHistoryPopUpResponsibilities.isDisplayed());
		elementsCount.add(14, addEmploymentHistoryPopUpReasonForLeaving.isDisplayed());
		elementsCount.add(15, addemploymentHistoryPopUpAttachmentName.get(0).isDisplayed());
		elementsCount.add(16, addEmploymentHistoryPopUpAttachmentComments.get(0).isDisplayed());
		elementsCount.add(17, addEmploymentHistoryPopupChooseFile.get(0).isDisplayed());
		elementsCount.add(18, addEmploymentHistoryPopupCancelButton.isDisplayed());
		elementsCount.add(19, addEmploymenthistoryPopUpSaveButton.isDisplayed());
		elementsCount.add(20, addemploymentHistoryPopUpCloseButton.isDisplayed());
		elementsCount.add(21, addEmploymentHistoryPopUpPlusButton.isDisplayed());
		return elementsCount;
	}
	
	
	//All fields Data with Save Button 
	public void myDetails_EmployementHistory_AddEmploymentHistoryPopUp_AllFieldsDataWithSaveButton_Validation(List<Object>allFieldsdata) throws AWTException, InterruptedException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		
		//Employer Name field with Data
		addEmploymentHistoryPopUpEmployerName.sendKeys(allFieldsdata.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
		
		//Job Title field with Data
		addEmploymentHistoryPopUpJobTitle.sendKeys(allFieldsdata.get(1).toString());
		CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
		
		//Employement Type Field with data
		addEmploymentHistoryPopUpEmploymentTypeDropDown.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(addEmploymentHistoryPopupemploymentTypeOptions));
		for(int option=0;option<addEmploymentHistoryPopupemploymentTypeOptions.size();option++) {
			if(addEmploymentHistoryPopupemploymentTypeOptions.get(option).getText().trim().equals(allFieldsdata.get(2).toString())) {
				addEmploymentHistoryPopupemploymentTypeOptions.get(option).click();
				break;
			}
		}
		
		//From Date
		datePicker(allFieldsdata.get(3).toString(),0);
		//act.sendKeys(Keys.ENTER).build().perform();
		
		//To Date
		datePicker(allFieldsdata.get(4).toString(),1);
		
		//Employer Phone number field with data
		addEmploymentHistoryPopUpEmployerPhonenumber.sendKeys(allFieldsdata.get(5).toString());
		
		//Address field With data
		addEmploymentHistoryPopUpAddress.sendKeys(allFieldsdata.get(6).toString());
		
		//Counrty Field With data
		addEmploymentHistoryPopUpCountryDropDoown.sendKeys(allFieldsdata.get(7).toString());

			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(1000);
		
		//State field Data 
		addEmploymentHistoryPopUpState.sendKeys(allFieldsdata.get(8).toString());
		
		if(addEmploymenthistoryPopUpStatesList.get(0).getText().equals("Please select state."))	{
			Log.warn("Selected state not exist");
		}
		else
		{
			addEmploymenthistoryPopUpStatesList.get(0).click();
		}
		
		Thread.sleep(1000);
		
		//city field with data
		addEmploymentHistoryPopUpCity.sendKeys(allFieldsdata.get(9).toString());
		
		//zipCode field with data
		addEmploymentHistoryPopUpZipCode.sendKeys(allFieldsdata.get(10).toString().substring(0, 6));

		//Can we connect this employe field with Data
		for(int radioButtonOption=0;radioButtonOption<addEmploymentHistoryPopUpMayWeConnect.size();radioButtonOption++) {
			if(addEmploymentHistoryPopUpMayWeConnect.get(radioButtonOption).getText().equals(allFieldsdata.get(11).toString())) {
				addEmploymentHistoryPopUpMayWeConnect.get(radioButtonOption).click();
				break;
			}
		}
		
		//Responsibilities field with data
		addEmploymentHistoryPopUpResponsibilities.sendKeys(allFieldsdata.get(12).toString());
		
		//Reason for Leaving field with data
		addEmploymentHistoryPopUpReasonForLeaving.sendKeys(allFieldsdata.get(13).toString());
		
		//Attachment Name1 field with data
		addemploymentHistoryPopUpAttachmentName.get(0).sendKeys(allFieldsdata.get(14).toString());
		
		//Attachment Comments1 field with data
		addEmploymentHistoryPopUpAttachmentComments.get(0).sendKeys(allFieldsdata.get(15).toString());
		
		//Choose File1 field with dta
		addEmploymentHistoryPopupChooseFile.get(0).sendKeys(allFieldsdata.get(16).toString());
		
		addEmploymenthistoryPopUpSaveButton.click();
		
		Thread.sleep(4000);
		
	}
	
	
	//Mandatory fields Data with Save Button 
	public void myDetails_EmployementHistory_AddEmploymentHistoryPopUp_MandatoryFieldsDataWithSaveButton_Validation(List<Object>allFieldsdata) throws AWTException, InterruptedException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		
		//Employer Name field with Data
		addEmploymentHistoryPopUpEmployerName.sendKeys(allFieldsdata.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
		
		//Job Title field with Data
		addEmploymentHistoryPopUpJobTitle.sendKeys(allFieldsdata.get(1).toString());
		CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
		
		//From Date
		datePicker(allFieldsdata.get(2).toString(),0);
		//act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(5000);
		
		//To Date
		datePicker(allFieldsdata.get(3).toString(),1);
		
		Thread.sleep(4000);
		addEmploymenthistoryPopUpSaveButton.click();
		
		Thread.sleep(4000);
		
	}
	
	
	
	//All fields Data with Cancel Button 
		public void myDetails_EmployementHistory_AddEmploymentHistoryPopUp_AllFieldsDataWithCancelButton_Validation(List<Object>allFieldsdata) throws AWTException, InterruptedException {
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			Actions act=new Actions(driver);
			
			//Employer Name field with Data
			addEmploymentHistoryPopUpEmployerName.sendKeys(allFieldsdata.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
			
			//Job Title field with Data
			addEmploymentHistoryPopUpJobTitle.sendKeys(allFieldsdata.get(1).toString());
			CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
			
			//Employement Type Field with data
			addEmploymentHistoryPopUpEmploymentTypeDropDown.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(addEmploymentHistoryPopupemploymentTypeOptions));
			for(int option=0;option<addEmploymentHistoryPopupemploymentTypeOptions.size();option++) {
				if(addEmploymentHistoryPopupemploymentTypeOptions.get(option).getText().trim().equals(allFieldsdata.get(2).toString())) {
					addEmploymentHistoryPopupemploymentTypeOptions.get(option).click();
					break;
				}
			}
			
			//From Date
			datePicker(allFieldsdata.get(3).toString(),0);
			//act.sendKeys(Keys.ENTER).build().perform();
			
			//To Date
			datePicker(allFieldsdata.get(4).toString(),1);
			
			//Employer Phone number field with data
			addEmploymentHistoryPopUpEmployerPhonenumber.sendKeys(allFieldsdata.get(5).toString());
			
			//Address field With data
			addEmploymentHistoryPopUpAddress.sendKeys(allFieldsdata.get(6).toString());
			
			//Counrty Field With data
			addEmploymentHistoryPopUpCountryDropDoown.sendKeys(allFieldsdata.get(7).toString());

				act.sendKeys(Keys.ARROW_DOWN).build().perform();
				act.sendKeys(Keys.ENTER).build().perform();
				act.sendKeys(Keys.TAB).build().perform();
			
			Thread.sleep(1000);
			
			//State field Data 
			addEmploymentHistoryPopUpState.sendKeys(allFieldsdata.get(8).toString());
			
			if(addEmploymenthistoryPopUpStatesList.get(0).getText().equals("Please select state."))	{
				Log.warn("Selected state not exist");
			}
			else
			{
				addEmploymenthistoryPopUpStatesList.get(0).click();
			}
			
			Thread.sleep(1000);
			
			//city field with data
			addEmploymentHistoryPopUpCity.sendKeys(allFieldsdata.get(9).toString());
			
			//zipCode field with data
			addEmploymentHistoryPopUpZipCode.sendKeys(allFieldsdata.get(10).toString().substring(0, 6));

			//Can we connect this employe field with Data
			for(int radioButtonOption=0;radioButtonOption<addEmploymentHistoryPopUpMayWeConnect.size();radioButtonOption++) {
				if(addEmploymentHistoryPopUpMayWeConnect.get(radioButtonOption).getText().equals(allFieldsdata.get(11).toString())) {
					addEmploymentHistoryPopUpMayWeConnect.get(radioButtonOption).click();
					break;
				}
			}
			
			//Responsibilities field with data
			addEmploymentHistoryPopUpResponsibilities.sendKeys(allFieldsdata.get(12).toString());
			
			//Reason for Leaving field with data
			addEmploymentHistoryPopUpReasonForLeaving.sendKeys(allFieldsdata.get(13).toString());
			
			//Attachment Name1 field with data
			addemploymentHistoryPopUpAttachmentName.get(0).sendKeys(allFieldsdata.get(14).toString());
			
			//Attachment Comments1 field with data
			addEmploymentHistoryPopUpAttachmentComments.get(0).sendKeys(allFieldsdata.get(15).toString());
			
			//Choose File1 field with dta
			addEmploymentHistoryPopupChooseFile.get(0).sendKeys(allFieldsdata.get(16).toString());
			
			addEmploymentHistoryPopupCancelButton.click();
			
			Thread.sleep(4000);
			
		}
	
		//All fields Data with Cross Button 
		public void myDetails_EmployementHistory_AddEmploymentHistoryPopUp_AllFieldsDataWithCrossButton_Validation(List<Object>allFieldsdata) throws AWTException, InterruptedException {
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			Actions act=new Actions(driver);
			
			//Employer Name field with Data
			addEmploymentHistoryPopUpEmployerName.sendKeys(allFieldsdata.get(0).toString());
			CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
			
			//Job Title field with Data
			addEmploymentHistoryPopUpJobTitle.sendKeys(allFieldsdata.get(1).toString());
			CommonActions.checkMandatoryFieldValidation(addEmploymentHistoryPopUpEmployerName);
			
			//Employement Type Field with data
			addEmploymentHistoryPopUpEmploymentTypeDropDown.click();
			wait.until(ExpectedConditions.visibilityOfAllElements(addEmploymentHistoryPopupemploymentTypeOptions));
			for(int option=0;option<addEmploymentHistoryPopupemploymentTypeOptions.size();option++) {
			if(addEmploymentHistoryPopupemploymentTypeOptions.get(option).getText().trim().equals(allFieldsdata.get(2).toString())) {
					addEmploymentHistoryPopupemploymentTypeOptions.get(option).click();
					break;
			    }
			}
					
			//From Date
			datePicker(allFieldsdata.get(3).toString(),0);
			//act.sendKeys(Keys.ENTER).build().perform();
					
			//To Date
			datePicker(allFieldsdata.get(4).toString(),1);
					
			//Employer Phone number field with data
			addEmploymentHistoryPopUpEmployerPhonenumber.sendKeys(allFieldsdata.get(5).toString());
					
			//Address field With data
			addEmploymentHistoryPopUpAddress.sendKeys(allFieldsdata.get(6).toString());
					
			//Counrty Field With data
			addEmploymentHistoryPopUpCountryDropDoown.sendKeys(allFieldsdata.get(7).toString());

			act.sendKeys(Keys.ARROW_DOWN).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
					
			Thread.sleep(1000);
					
			//State field Data 
			addEmploymentHistoryPopUpState.sendKeys(allFieldsdata.get(8).toString());
					
			if(addEmploymenthistoryPopUpStatesList.get(0).getText().equals("Please select state."))	{
				Log.warn("Selected state not exist");
				}
			else
				{
					addEmploymenthistoryPopUpStatesList.get(0).click();
				}
					
			Thread.sleep(1000);
					
			//city field with data
			addEmploymentHistoryPopUpCity.sendKeys(allFieldsdata.get(9).toString());
					
			//zipCode field with data
			addEmploymentHistoryPopUpZipCode.sendKeys(allFieldsdata.get(10).toString().substring(0, 6));

			//Can we connect this employe field with Data
			for(int radioButtonOption=0;radioButtonOption<addEmploymentHistoryPopUpMayWeConnect.size();radioButtonOption++) {
					if(addEmploymentHistoryPopUpMayWeConnect.get(radioButtonOption).getText().equals(allFieldsdata.get(11).toString())) {
						addEmploymentHistoryPopUpMayWeConnect.get(radioButtonOption).click();
						break;
					}
				}
				
			//Responsibilities field with data
			addEmploymentHistoryPopUpResponsibilities.sendKeys(allFieldsdata.get(12).toString());
					
			//Reason for Leaving field with data
			addEmploymentHistoryPopUpReasonForLeaving.sendKeys(allFieldsdata.get(13).toString());
					
			//Attachment Name1 field with data
			addemploymentHistoryPopUpAttachmentName.get(0).sendKeys(allFieldsdata.get(14).toString());
					
			//Attachment Comments1 field with data
			addEmploymentHistoryPopUpAttachmentComments.get(0).sendKeys(allFieldsdata.get(15).toString());
			
			//Choose File1 field with dta
			addEmploymentHistoryPopupChooseFile.get(0).sendKeys(allFieldsdata.get(16).toString());
				
			addemploymentHistoryPopUpCloseButton.click();
					
			Thread.sleep(4000);
					
			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Add Employment History PopUp Heading Validations
	public void myDetails_EmploymentHistoryPage_AddButton_Validation() {
		employmentHistoryTableAddButton.click();
	}
	
	
	//Employment History Table HEader
	public String myDetails_EmploymentHistoryPage_Header_Validation(){
		return employmentHistoryTableHeader.getText();
	}
	
	//Add Employment History PopUp Heading validation
	public String myDetails_EmploymentHistoryPage_AddEmploymentHistoryPoUp_Heading_Validation() {
		return addEmploymentHistoryPopUpHeader.getText();
	}
	
	
	//Date Picking
	private void datePicker(String Date,int calenderNum) throws AWTException {
		Robot robot=new Robot();
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.TAB).build().perform();
		/*act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();*/
		
		datePicker.get(calenderNum).click();
		
		//Spliting the Date into month & Day & Year
		String dateSlipter[]=Date.split("/");
		String month=dateSlipter[0];
		String date=dateSlipter[1];
		String year=dateSlipter[2];

		int pickyear=Integer.parseInt(year);

		//Get the current Year
		int currentYear= Calendar.getInstance().get(Calendar.YEAR);
		
		datePickerMonthYearDropDown.click();
		datePickerYears.get(datePickerYears.size()-1).click();
	
		//
		for(int i=0;i<(currentYear-pickyear);i++) {
			previousYearsArrow.click();
		}
		
		//Checking all months with matching month
		for(int startMonthDate=0;startMonthDate<datePickerMonths.size();startMonthDate++) {
			if(datePickerMonths.get(startMonthDate).getText().equals(month)) {
				//Month matched & selected
				datePickerMonths.get(startMonthDate).click();
				break;
			}

		}
		
		//Checking all days with matching day
		for(int startDateRange=0;startDateRange<datePickerMonthDays.size();startDateRange++) {
			
			if(datePickerMonthDays.get(startDateRange).getText().equals(date)) {
				//Date Matched & Selected
				datePickerMonthDays.get(startDateRange).click();
				break;
			}

		}
	}
	
	
}
