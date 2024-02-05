package com.WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class AdminMyDetailsWorkAuthorizationPage extends Base {

	AdminMyDetailsWorkAuthorizationPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//Work Authorization Option & Work Authorization option Heading
	@FindBy(xpath="//*[@class='mat-tab-label-content' and text()=' Work Authorization ']")
	WebElement workAuthorizationOptionHeading;
	
	//Work Authorization Table Records List
	@FindBy(xpath="//*[@col-id='document_number']")
	List<WebElement>workAuthorizationRecordsList;
	
	//Work Authorization Add Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mat-raised-button mat-button-base']")
	WebElement workAuthorizationAddButton;
	
	//Work Authorization Table Country Header
	@FindBy(xpath="//*[text()='Country']")
	WebElement workAuthorizationTableCountryHeader;
	
	//Work Authorization Table Document Type Header
	@FindBy(xpath="//*[text()='Document Type']")
	WebElement workAuthorizationTableDocumentTypeHeader;
	
	//Work Authorization Table Document Number Header
	@FindBy(xpath="//*[text()='Document Number']")
	WebElement workAuthorizationTableDocumentNumberHeader;
		
	//Work Authorization Table Document Status HEader
	@FindBy(xpath="//*[text()='Document Status']")
	WebElement workAuthorizationTableDocumentStatusHeader;
		
	//Work Authorization Table Date Issued HEader
	@FindBy(xpath="//*[text()='Date Issued']")
	WebElement workAuthorizationTableDateIssuedHeader;
		
	//Work Authorization Table Valid From Header
	@FindBy(xpath="//*[text()='Valid From']")
	WebElement workAuthorizationTableValidFromHeader;
		
	//Work Authorization Table Expiry Date Header
	@FindBy(xpath="//*[text()='Expiry Date'']")
	WebElement workAuthorizationTableExpiryDateHeader;
		
	//Work Authorization Table A Number Header
	@FindBy(xpath="//*[text()='A Number']")
	WebElement workAuthorizationTableANumberHeader;
		
	//Work Authorization Table Comments Header
	@FindBy(xpath="//*[text()='Comments']")
	WebElement workAuthorizationTableCommentsHeader;
		
	//Work Authorization Table Created At HEader
	@FindBy(xpath="//*[text()='Created At']")
	WebElement workAuthorizationTableCreatedAtHeader;
		
	//Work Authorization Table Updated At Header
	@FindBy(xpath="//*[text()='Updated At']")
	WebElement workAuthorizationTableUpdatedAtHeader;
	
	//Add Work Authorization Detail Pop Up Header 
	@FindBy(xpath="//*[text()=' Add Work Authorization Details ']")
	WebElement addWorkAuthorizationPopUpHeader;
		
	//Add Work Authorization Details PopUp Close(cross) Button
	@FindBy(xpath="//*[@class='close']")
	WebElement addWorkAuthorizationPopUpCloseButton;
		
	//Add Work Authorization Details PopUp Country Element
	@FindBy(xpath="//*[@formcontrolname='country']")
	WebElement addWorkAuthorizationPopUpCountry;
		
	//Add Work Authorization Details PopUp Countries List
	@FindBy(xpath="//*[@class='mat-autocomplete-panel location-list mat-autocomplete-visible ng-star-inserted']//mat-option")
	List<WebElement>addWorkAuthorizationPopUpCountriesList;
	
	//Add Work Authorization Details PopUp Document Type drop Down
	@FindBy(xpath="//*[@formcontrolname='document_type']")
	WebElement addWorkAuthorizationPopupDocumentTypeDropDown;
		
	//Add Work Authorization Details PopUp Document Type Drop Down Options
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/mat-option/span")
	List<WebElement>addWorkAuthorizationPopUpDocumentTypeOptions;
		
	//Add Work Authorization Details PopUp Document Number 
	@FindBy(xpath="//*[@formcontrolname='document_number']")
	WebElement addWorkAuthorizationPopUpDocumentNumber;
		
	//Add Work Authorization Details PopUp Document Status
	@FindBy(xpath="//*[@formcontrolname='document_status']")
	WebElement addWorkAuthorizationPopUpDocumentStatusDropDown;
		
	//Add Work Authorization Details PopUp Document Status Options
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/mat-option/span")
	List<WebElement>addWorkAuthorizationPopUpDocumentStatusDropDownOptions;
		
	//Add Work Authorization Details PopUp Date Issued 
	@FindBy(xpath="//*[@formcontrolname='date_issued']")
	WebElement addWorkAuthorizationPopUpDateIssued;
		
	//Add Work Authorization Details PopUp Date Issued Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[2]/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addWorkAuthorizationPopUpDateIssuedDatePicker;
		
	//Add Work Authorization Details PopUp Month&Year drop  down
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-calendar-period-button mat-button mat-button-base']")
	WebElement addWorkAuthorizationPopUpMonthYearDropDown;
		
	//Add Work Authorization Details PopUp past 24 yearsList
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addWorkAuthorizationPopUpYearsList;
		
	//Add Work Authorization Details PopUp 12 months list
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addWorkAuthorizationPopUpMonthsList;
		
	//Add Work Authorization Details PopUp 31 or 30 days List
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr/td/div[1]")
	List<WebElement>addWorkAuthorizationPopUpDaysList;
		
	//Add Work Authorization Details PopUp Valid From 
	@FindBy(xpath="//*[@formcontrolname='valid_from']")
	WebElement addWorkAuthorizationPopUpValidFrom;
		
	//Add Work Authorization Details PopUp Valid From Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addWorkAuthorizationPopUpValidFromDatePicker;
		
	//Add Work Authorization Deetails PopUp Expiry Date Radio Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[3]/div[1]/div/div/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]")
	WebElement addWorkAuthorizationPopUpExpiryDateRadioButton;
		
	//Add Work Authorization Details PopUp Expiry Date 
	@FindBy(xpath="//*[@formcontrolname='expiry_date']")
	WebElement addWorkAuthorizationPopUpExpiryDate;
		
	//Add Work Authorization Details PopUp N/A Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[3]/div[1]/div/div/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]")
	WebElement addWorkAuthorizationPopUpNAButton;
		
	//Add Work Authorization Details popUp A Number
	@FindBy(xpath="//*[@formcontrolname='a_number']")
	WebElement addWorkAuthorizationPopUpANumber;
		
	//Add Work Authorization Details PopUp Comments
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[4]/div/div/mat-form-field/div/div[1]/div[3]/textarea")
	WebElement addWorkAuthorizationPopUpComments;
	
	//Add Work Authorization Details PopUp Attachment Name
	@FindBy(xpath="//*[@formcontrolname='attachment_name']")
	List<WebElement>addWorkAuthorizationPopUpAttachmentName;
		
	//Add Work Authorization Details PopUp Attachment Comments
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[6]/div/div/div/div/div[2]/div/mat-form-field/div/div[1]/div[3]/input")
	List<WebElement>addWorkAuthorizationPopUpAttachmentComments;
		
	//Add Work Authorization Details PopUp Attachment Choose File 
	@FindBy(xpath="//*[@class='attachment-file']")
	List<WebElement>addWorkAuthorizationPopUpChooseFile;
		
	//Add Work Authorization Details Popup Add plus Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[1]/div[6]/span/mat-icon")
	WebElement addWorkAuthorizationPopUpAddAttachmentPlusButton;
		
	//Add Work Authorization Details PopUp minus Button
	@FindBy(xpath="//*[@class='remove']//*[@class='mat-icon notranslate material-icons mat-icon-no-color']")
	List<WebElement>addWorkAuthorizationPopUpRemoveAttachmentMinusButtons;
		
	//Add Work Authorization Details PopUp Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement addWorkAuthorizationPopupCancelButton;
		
	//Add Work Authorization Details PopUp Save Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-work-authorization-form/div/div[2]/form/div[2]/div/div/button[2]/span[1]")
	WebElement addWorkAuthorizationPopUpSaveButton;	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Passport Option & Passport option Heading
	@FindBy(xpath="//*[@class='mat-tab-label-content' and text()=' Passport ']")
	WebElement passportOptionHeading;
	
	//Passport Option & Passport Option Heading
	@FindBy(xpath="//*[@col-id='passport_number']")
	List<WebElement>passportRecordsList;
	
	//Passport Add Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mat-raised-button mat-button-base']")
	WebElement passportAddButton;
	
	//Passport Table Passport Number Header
	@FindBy(xpath="//*[text()='Passport Number']")
	WebElement passportTablePassportNumberHeader;
		
	//Passport Table Passport Status HEader
	@FindBy(xpath="//*[text()='Passport Status']")
	WebElement passportTablePassportStatusHeader;
		
	//Passport Table Passport Place of Issue
	@FindBy(xpath="//*[text()='Place of Issue']")
	WebElement passportTablePlaceOfIssueHeader;
		
	//Passport Table Passport Place of Birth Header
	@FindBy(xpath="//*[text()='Place of Birth']")
	WebElement passportTablePlaceOfBirthHeader;
		
	//Passport Table Issued Date Header
	@FindBy(xpath="//*[text()='Issued Date']")
	WebElement passportTableIssuedDateHeader;
		
	//Passport Table Issuing Country HEader
	@FindBy(xpath="//*[text()='Issuing Country']")
	WebElement passportTableIssuingCountryHeader;
		
	//Passport Table Expiry Date Header
	@FindBy(xpath="//*[text()='Expiry Date']")
	WebElement passportTableExpiryDateHEader;
		
	//Passport Table Created At Header
	@FindBy(xpath="//*[text()='Created At']")
	WebElement passportTableCreatedAtHeader;
		
	//Passport Table Updated At Header
	@FindBy(xpath="//*[text()='Updated At']")
	WebElement passportTableUpdatedHeader;	
	
	//Add Passport Detail PopUp Heading
	@FindBy(xpath="//*[text()='Add Passport Details']")
	WebElement addPassportDetailsPopUpHeading;
	
	//Add Passport Details PopUp Close Button
	@FindBy(xpath="//*[@class='close']")
	WebElement addPassportDetailsPopUpCloseButton;
	
	//Add Passport Details PopUp Passport Number
	@FindBy(xpath="//*[@formcontrolname='passport_number']")
	WebElement addPassportDetailsPopUpPassportNumber;
	
	//Add Passport Details PopUp Passport Status
	@FindBy(xpath="//*[@formcontrolname='passport_status']")
	WebElement addPassportDetailsPopUpPassportStatus;
	
	//Add Passport Detaails PopUp Passport Status Options
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/mat-option/span")
	List<WebElement>addPassportDetailsPopUpPassportStatusOptions;
	
	//Add Passport Details PopUp Passport Place of Status
	@FindBy(xpath="//*[@formcontrolname='place_of_issue']")
	WebElement addPassportDetailsPopUpPlaceOfIssue;
	
	//Add Passport Details PopUp Place of Birth
	@FindBy(xpath="//*[@formcontrolname='place_of_birth']")
	WebElement addPassportDetailsPopUpPlaceOfBirth;
	
	//Add Passport Details PopUp Issued Date
	@FindBy(xpath="//*[@formcontrolname='date_issued']")
	WebElement addPassportDetailsPopUpDateIssued;
	
	//Add Passport Details PopUp Issued Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-pass-port-form/div/div[2]/form/div[1]/div[2]/div[3]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addPassportDetailsPopupIssuedDateDatePicker;
	
	//Add Passport Details PopUp Expiry Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-pass-port-form/div/div[2]/form/div[1]/div[3]/div[1]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addPassportDetailsPopUpExpiryDateDatePicker;
	
	//Add Passport Details PopUp Year & month drop down
	@FindBy(xpath="//*[@aria-label='Choose month and year']")
	List<WebElement>addPassportDetailsPopUpDatePickerMonthYearDropDown;
	
	//Add Passport Details PopUp Years Selection
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addPassporDetailsPopUpDatePickerYears;
	
	//Add Passport Details PopUp Month Selection
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addPassportDetailsPopUpDatePickerMonths;
	
	//Add Passport Details PopUp Day Selection
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-month-view/table/tbody/tr/td/div[1]")
	List<WebElement>addPassportDetailsPopUpDatePickerDays;
	
	//Add Passport Details PopUp Issuing Country
	@FindBy(xpath="//*[@formcontrolname='issuing_country']")
	WebElement addPassportDetailsPopUpIssuingCountry;
	
	//Add Passport Details PopUp Issuing Countries List
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div/mat-option/span")
	List<WebElement>addPassportDetailsPopUpIssuingCountriesList;
	
	//Add Passport Details PopUp Attachment Name
	@FindBy(xpath="//*[@formcontrolname='attachment_name']")
	List<WebElement>addPassportDetailsPopUpAttachmentNames;
	
	//Add Passport Details Popup Attachment Comments
	@FindBy(xpath="//*[@formcontrolname='comments']")
	List<WebElement>addPassportDetailsPopupAttachmentComments;
	
	//Add Passport Details PopUp Choose File
	@FindBy(xpath="//*[@class='attachment-file']")
	List<WebElement>addPassportDetailsPopUpChooseFile;
	
	//Add Passport Details PopUp remove attachment minus button
	@FindBy(xpath="//*[@class='remove']//*[@class='mat-icon notranslate material-icons mat-icon-no-color']")
	List<WebElement>addPassportDetailsPopUpMinusButtons;
	
	//Add Present Details PopUp Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement addPassportDetailsPopUpCancelButton;
	
	//Add Present Details Popup Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement addPassportDetailsPopUpSaveButton;

	
	
	
	
	
	
	
	
	
	
	
	
	
	//I-94 Option & I-94 Heading option Heading
	@FindBy(xpath="//*[@class='mat-tab-label-content' and text()=' I-94 ']")
	WebElement i94OptionHeading;
	
	//I95 Option Table Records List
	@FindBy(xpath="//*[@col-id='i_94_number']")
	List<WebElement>i94RecordsList;
	
	//I-94 Add Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mat-raised-button mat-button-base']")
	WebElement i94AddButton;
	
	//I-94 Table I-94 Number Header
	@FindBy(xpath="//*[text()='I-94 Number']")
	WebElement i94TableI94NumberHeader;
	
	//I-94 Table Date of Last Arrival HEader
	@FindBy(xpath="//*[text()='Date of Last Arrival']")
	WebElement i94TableDateOfLastArrivalHeader;
	
	//-94 Table Expiry Date Header
	@FindBy(xpath="//*[text()='Expiry Date']")
	WebElement i94TableExpiryDateHeader;
	
	//i-94 Table Status Header
	@FindBy(xpath="//*[text()='Status']")
	WebElement i94TableStatusHeader;
	
	//I-94 Table Priority Date Header
	@FindBy(xpath="//*[text()='Priority Date']")
	WebElement i94TablePriorityDateHeader;
	
	//i-94 Table Created At Header
	@FindBy(xpath="//*[text()='Created At']")
	WebElement i94TableCreatedAtHeader;
	
	//i-94 Table Updated At Header
	@FindBy(xpath="//*[text()='Updated At']")
	WebElement i94TableUpdatedAtHeader;
	
	//Add I-94 Details PopUp Header
	@FindBy(xpath="//*[text()='Add I-94 Details']")
	WebElement addI94DetailsPopupHeader;
	
	//Add i-94 Details PopUp close button
	@FindBy(xpath="//*[@class='close']")
	WebElement addI94DetailsPopUpCloseButton;
	
	//Add I-94 Details Popup I-94 Number
	@FindBy(xpath="//*[@formcontrolname='i_94_number']")
	WebElement addI94DetailsPopUpI94Number;
	
	//Add I-94 Details PopUp Date of last arrival
	@FindBy(xpath="//*[@formcontrolname='last_arrival_date']")
	WebElement addI94DetailsPopUpDateOfLastArrival;
	
	//Add I-94 Details PopUp Date of Last arrival Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-i94-form/div/div[2]/form/div[1]/div[1]/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addI94DetailsPopUpDateOfLastArrivalDatePicker;
	
	//Add I-94 Details PopUp Date of Last arrival Month & Year Drop Down
	@FindBy(xpath="//*[@aria-label='Choose month and year']")
	WebElement addI94DetailsPopUpLastArrivalDateMonthYear;
	
	//Add I-94 Details PopUp Date Of Last Arrival Years Selection
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-multi-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addI94DetailsPopUpLastArrivalDateYears;
	
	//Add I-94 Details PopUp Date Of Last Arrival Month Selection
	@FindBy(xpath="/html/body/div[2]/div[4]/div/mat-datepicker-content/div[2]/mat-calendar/div/mat-year-view/table/tbody/tr/td/div[1]")
	List<WebElement>addI94DetailsPopUpLastArrivalDateMonths;
	
	//Add I-94 Details Popup Date Of Last Arrival Day Selection
	@FindBy(xpath="//*[@id=\"mat-datepicker-13\"]/div/mat-month-view/table/tbody/tr/td/div[1]")
	List<WebElement>addI94DetailsPopUpLastArrivalDateDays;
	
	//Add I-94 Details Popup Status DropDown
	@FindBy(xpath="//*[@formcontrolname='status']")
	WebElement addI94DetailsPopUpStatusDropDown;
	
	//Add I-94 Details PopUp Status DropDown Options
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/mat-option/span")
	List<WebElement>addI94DetailsPopUpStatusDropDownOptions;
	
	//Add I-94 Details PopUp Status Expiry Date Radio Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-i94-form/div/div[2]/form/div[1]/div[2]/div[1]/div/div/mat-radio-group/mat-radio-button[1]/label/span[1]/span[1]")
	WebElement addI94DetailsPopUpStatusExpiryDateRadioButton;
	
	//Add I-94 Details PopUp Status Expiry Date 
	@FindBy(xpath="//*[@formcontrolname='status_expiry_date']")
	WebElement addI94DetailsPopUpStatusExpiryDate;
	
	//Add I-94 Details PopUp Status Expiry Date Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-i94-form/div/div[2]/form/div[1]/div[2]/div[1]/div/div/mat-radio-group/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addI94DetailsPopUpStatusExpiryDateDatePicker;
	
	//Add I-94 Details PopUp N/S Radio Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-i94-form/div/div[2]/form/div[1]/div[2]/div[1]/div/div/mat-radio-group/mat-radio-button[2]/label/span[1]/span[1]")
	WebElement addI94DetailsPopUpNSRadioButton;
	
	//Add I-94 Details PopUp Priority Date 
	@FindBy(xpath="//*[@formcontrolname='priority_date']")
	WebElement addI94DetailsPopUpPriorityDate;
	
	//Add I-94 Details PopUp Priority Date Date Picker
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-i94-form/div/div[2]/form/div[1]/div[2]/div[2]/div/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button")
	WebElement addI94DetailsPopUpPriorityDateDatePicker;
	
	//Add I-94 Details PopUp Attachment Names
	@FindBy(xpath="//*[@formcontrolname='attachment_name']")
	List<WebElement>addI94DetailsPopUpAttachmentNamesList;
	
	//Add I-94 Details PopUp Attachment Comments
	@FindBy(xpath="//*[@formcontrolname='comments']")
	List<WebElement>addI94DetailsPopUpAttachmentCommentsList;
	
	//Add I-94 Details Popup Attachment Choose File
	@FindBy(xpath="//*[@class='attachment-file']")
	List<WebElement>addI94DetailsPopUpAttachmentChooseFileList;
	
	//Add I-94 Details PopUp Minus Buttons
	@FindBy(xpath="//*[@class='remove']//*[@class='mat-icon notranslate material-icons mat-icon-no-color']")
	List<WebElement>addI94DetailsPopUpAttachmentRemoveMinusButtonsList;
	
	//Add I-94 Details PopUp Attachment Add Plus Button
	@FindBy(xpath="/html/body/div[2]/div[2]/div/mat-dialog-container/app-i94-form/div/div[2]/form/div[1]/div[4]/span/mat-icon")
	WebElement addI94DetailsPopUpAttachmentAddPlusButton;
	
	//Add I-94 Details Popup Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement addI94DetailsPopupCancelButton;
	
	//Add I-94 Detaols Popup Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement addI94DetailsPopUpSaveButton;
	

	
	
	
	
	
	
	
	
	
	
	//Business Logic
	//Current URL Validation
	public String myDetails_WorkAuthorization_CurrentURL_Validation() {
		return driver.getCurrentUrl();
	}
	
	//Title Validation
	public String myDetails_WorkAuthorization_Title_Validation() {
		return driver.getTitle();
	}
	
	
	
	
	
	
	
	//Work Authorization Option Methods
	//Work Authorization RecordsList
	public List workAuthorizationRecordsList() {
		List<Object>recordsList=new ArrayList<Object>();
		for(int record=0;record<workAuthorizationRecordsList.size();record++) {
			recordsList.add(record, workAuthorizationRecordsList.get(record).getText());
		}
		return recordsList;
	}

	
	//Work Authroization Option Table Heading
	public String myDetails_WorkAuthorization_WorkAuthorizationTableHeading_Validation() {
		return workAuthorizationOptionHeading.getText().substring(10, 28);
	}
		
	//Work Authorization Option elements as Per requirements
	public List myDetails_WorkAuthorization_WorkAuthorizationElementsAsPerRequirements_Validation() throws AWTException {
		Robot robot=new Robot();
		List<Object>workAuthorizationElementsList=new ArrayList<Object>();
		
		workAuthorizationElementsList.add(0, workAuthorizationAddButton.isDisplayed());
		workAuthorizationElementsList.add(1, workAuthorizationTableCountryHeader.isDisplayed());
		workAuthorizationElementsList.add(2, workAuthorizationTableDocumentTypeHeader.isDisplayed());
		workAuthorizationElementsList.add(3, workAuthorizationTableDocumentNumberHeader.isDisplayed());
		workAuthorizationElementsList.add(4, workAuthorizationTableDocumentStatusHeader.isDisplayed());
		workAuthorizationElementsList.add(5, workAuthorizationTableDateIssuedHeader.isDisplayed());
		workAuthorizationTableDocumentStatusHeader.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		workAuthorizationElementsList.add(6, workAuthorizationTableValidFromHeader.isDisplayed());
		workAuthorizationElementsList.add(7, workAuthorizationTableExpiryDateHeader.isDisplayed());
		workAuthorizationElementsList.add(8, workAuthorizationTableANumberHeader.isDisplayed());
		workAuthorizationElementsList.add(9, workAuthorizationTableCommentsHeader.isDisplayed());
		workAuthorizationTableCreatedAtHeader.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		workAuthorizationElementsList.add(10, workAuthorizationTableCreatedAtHeader.isDisplayed());
		workAuthorizationElementsList.add(11, workAuthorizationTableUpdatedAtHeader.isDisplayed());
			
		return workAuthorizationElementsList;
	}
	
	
	//Work Authorization Add Button Validation
	public void myDetails_WorkAuthorization_WorkAuthorizationOptionAddButton_Validation() {
		workAuthorizationAddButton.click();
	}
	
	//Work Authorization Add Work Authorization Details PopUp Heading Validation
	public String myDetails_WorkAuthorization_AddWorkAuthorizationPopUpHeading_Validation() {
		return addWorkAuthorizationPopUpHeader.getText();
	}	
	
	//Work Authorization Add Work Authorization Details PopUp All Fields Data with Save Button
	public void myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_AllFieldsDataWithSaveButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();
		
		//Clicking on Add Button
		workAuthorizationAddButton.click();
		
		//Country field Data
		addWorkAuthorizationPopUpCountry.sendKeys(allFieldsData.get(0).toString());
		//wait.until(ExpectedConditions.visibilityOfAllElements(addWorkAuthorizationPopUpCountriesList));
		//addWorkAuthorizationPopUpCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpCountry);
		act.sendKeys(Keys.TAB).build().perform();
			
		Thread.sleep(2000);
		
		//Document Type field Data With mandatory field Check
		addWorkAuthorizationPopupDocumentTypeDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentTypeOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentTypeOptions.get(option).getText()).equals(allFieldsData.get(1).toString())) {
				addWorkAuthorizationPopUpDocumentTypeOptions.get(option).click();
				break;
			}
		}
		act.sendKeys(Keys.ESCAPE).build().perform();
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopupDocumentTypeDropDown);
		
		
		//add Document Number Data & Mandatory Field Check
		addWorkAuthorizationPopUpDocumentNumber.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentNumber);
		
		
		//Add Document Status Data & Mandatory field check
		addWorkAuthorizationPopUpDocumentStatusDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentStatusDropDownOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).getText()).equals(allFieldsData.get(3).toString())) {
				addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentStatusDropDown);
		
		
		//Date Issued Date Picker Validation
		datePicker(allFieldsData.get(4).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(800);
		datePicker(allFieldsData.get(5).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(800);
		
		//Expiry Date Or N/A & field Data & Mandatory field check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(6).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		//A-number Field Data & Mandatory field Check
		addWorkAuthorizationPopUpANumber.sendKeys(allFieldsData.get(7).toString());
		
		//Comments field Data & Mandatory Field Check
		addWorkAuthorizationPopUpComments.sendKeys(allFieldsData.get(8).toString());
		
		
		//Attachment Part
		//attachmentPart("","","");
		
		addWorkAuthorizationPopUpSaveButton.click();
		Thread.sleep(4000);
		
		
	}
	
	//Work Authorization Add Work Authorization Details PopUp Mandatory Fields Data with Save Button
	public void myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_MandatoryFieldsDataWithSaveButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();
			
		//Clicking on Add Button
		workAuthorizationAddButton.click();
			
		//Country field Data
		addWorkAuthorizationPopUpCountry.sendKeys(allFieldsData.get(0).toString());
		//wait.until(ExpectedConditions.visibilityOfAllElements(addWorkAuthorizationPopUpCountriesList));
		//addWorkAuthorizationPopUpCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpCountry);
		act.sendKeys(Keys.TAB).build().perform();
				
		Thread.sleep(2000);
			
		//Document Type field Data With mandatory field Check
		addWorkAuthorizationPopupDocumentTypeDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentTypeOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentTypeOptions.get(option).getText()).equals(allFieldsData.get(1).toString())) {
				addWorkAuthorizationPopUpDocumentTypeOptions.get(option).click();
				break;
			}
		}
		act.sendKeys(Keys.ESCAPE).build().perform();
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopupDocumentTypeDropDown);
		
		
		//add Document Number Data & Mandatory Field Check
		addWorkAuthorizationPopUpDocumentNumber.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentNumber);
		
		
		//Add Document Status Data & Mandatory field check
		addWorkAuthorizationPopUpDocumentStatusDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentStatusDropDownOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).getText()).equals(allFieldsData.get(3).toString())) {
				addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentStatusDropDown);
		
		
		//Date Issued Date Picker Validation
		datePicker(allFieldsData.get(4).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		addWorkAuthorizationPopUpSaveButton.click();
		Thread.sleep(2000);
		
			
	}
		
	//Work Authorization Add Work Authorization Details PopUp All Fields Data with Cancel Button
	public void myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_AllFieldsDataWithCancelButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();
		
		//Clicking on Add Button
		workAuthorizationAddButton.click();
		
		//Country field Data
		addWorkAuthorizationPopUpCountry.sendKeys(allFieldsData.get(0).toString());
		//wait.until(ExpectedConditions.visibilityOfAllElements(addWorkAuthorizationPopUpCountriesList));
		//addWorkAuthorizationPopUpCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpCountry);
		act.sendKeys(Keys.TAB).build().perform();
			
		Thread.sleep(2000);
		
		//Document Type field Data With mandatory field Check
		addWorkAuthorizationPopupDocumentTypeDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentTypeOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentTypeOptions.get(option).getText()).equals(allFieldsData.get(1).toString())) {
				addWorkAuthorizationPopUpDocumentTypeOptions.get(option).click();
				break;
			}
		}
		act.sendKeys(Keys.ESCAPE).build().perform();
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopupDocumentTypeDropDown);
		
		
		//add Document Number Data & Mandatory Field Check
		addWorkAuthorizationPopUpDocumentNumber.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentNumber);
		
		
		//Add Document Status Data & Mandatory field check
		addWorkAuthorizationPopUpDocumentStatusDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentStatusDropDownOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).getText()).equals(allFieldsData.get(3).toString())) {
				addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentStatusDropDown);
		
		
		//Date Issued Date Picker Validation
		datePicker(allFieldsData.get(4).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(800);
		datePicker(allFieldsData.get(5).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		Thread.sleep(800);
		
		//Expiry Date Or N/A & field Data & Mandatory field check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(6).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
		
		//A-number Field Data & Mandatory field Check
		addWorkAuthorizationPopUpANumber.sendKeys(allFieldsData.get(7).toString());
		
		//Comments field Data & Mandatory Field Check
		addWorkAuthorizationPopUpComments.sendKeys(allFieldsData.get(8).toString());
		
		
		//Attachment Part
		//attachmentPart("","","");
			
			
		addWorkAuthorizationPopupCancelButton.click();
		Thread.sleep(2000);
					
	}
		
	//Work Authorization Add Work Authorization Details PopUp All Fields Data with Close Button
	public void myDetails_WorkAuthorization_AddWorkAuthorizationPopUp_AllFieldsDataWithCloseButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();
			
		//Clicking on Add Button
		workAuthorizationAddButton.click();
				
		//Country field Data
		addWorkAuthorizationPopUpCountry.sendKeys(allFieldsData.get(0).toString());
		//wait.until(ExpectedConditions.visibilityOfAllElements(addWorkAuthorizationPopUpCountriesList));
		//addWorkAuthorizationPopUpCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpCountry);
		act.sendKeys(Keys.TAB).build().perform();
			
		Thread.sleep(2000);
				
		//Document Type field Data With mandatory field Check
		addWorkAuthorizationPopupDocumentTypeDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentTypeOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentTypeOptions.get(option).getText()).equals(allFieldsData.get(1).toString())) {
				addWorkAuthorizationPopUpDocumentTypeOptions.get(option).click();
				break;
			}
		}
		act.sendKeys(Keys.ESCAPE).build().perform();
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopupDocumentTypeDropDown);
			
			
		//add Document Number Data & Mandatory Field Check
		addWorkAuthorizationPopUpDocumentNumber.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentNumber);
			
				
		//Add Document Status Data & Mandatory field check
		addWorkAuthorizationPopUpDocumentStatusDropDown.click();
		for(int option=0;option<addWorkAuthorizationPopUpDocumentStatusDropDownOptions.size();option++) {
			if((addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).getText()).equals(allFieldsData.get(3).toString())) {
				addWorkAuthorizationPopUpDocumentStatusDropDownOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addWorkAuthorizationPopUpDocumentStatusDropDown);
				
				
		//Date Issued Date Picker Validation
		datePicker(allFieldsData.get(4).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
			
		Thread.sleep(800);
		datePicker(allFieldsData.get(5).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
				
		Thread.sleep(800);
			
		//Expiry Date Or N/A & field Data & Mandatory field check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(6).toString());
		//act.sendKeys(Keys.ENTER).build().perform();
			
		//A-number Field Data & Mandatory field Check
		addWorkAuthorizationPopUpANumber.sendKeys(allFieldsData.get(7).toString());
				
		//Comments field Data & Mandatory Field Check
		addWorkAuthorizationPopUpComments.sendKeys(allFieldsData.get(8).toString());
				
				
		//Attachment Part
		//attachmentPart("","","");
					
		addWorkAuthorizationPopUpCloseButton.click();
		Thread.sleep(2000);
					
	}
			
	
	
	//Edit & Delete Buttons Validations & Sorting 
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	//Passport Option Methods
	//Passport RecordsList
	public List passPortRecordsList() throws InterruptedException {
		passportOptionHeading.click();
		Thread.sleep(2000);
		List<Object>recordsList=new ArrayList<Object>();
		for(int record=0;record<passportRecordsList.size();record++) {
			recordsList.add(record, passportRecordsList.get(record).getText());
		}
		return recordsList;
	}
	
	//Passport Option
	public void myDetails_WorkAuthorization_PassportOption_Validation() {
		passportOptionHeading.click();
	}
	
	
	//Passport Option Table Heading
	public String myDetails_WorkAuthorization_PassportTableHeading_Validation() {
		passportOptionHeading.click();
		return passportOptionHeading.getText().substring(10, 18);
	}
	
	
	//Passport Option Elements as Per requirements
	public List myDetails_WorkAuthorization_PassportElementsAsPerRequirements_Validation() throws AWTException {
		Robot robot=new Robot();
		passportOptionHeading.click();
		List<Object>passportOptionElementsList=new ArrayList<Object>();
			
		passportOptionElementsList.add(0, passportAddButton.isDisplayed());
		passportOptionElementsList.add(1, passportTablePassportNumberHeader.isDisplayed());
		passportOptionElementsList.add(2, passportTablePassportStatusHeader.isDisplayed());
		passportOptionElementsList.add(3, passportTablePlaceOfIssueHeader.isDisplayed());
		passportOptionElementsList.add(4, passportTablePlaceOfBirthHeader.isDisplayed());
		passportOptionElementsList.add(5, passportTableIssuedDateHeader.isDisplayed());
		passportTableIssuedDateHeader.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		passportOptionElementsList.add(6, passportTableIssuingCountryHeader.isDisplayed());
		passportOptionElementsList.add(7, passportTableExpiryDateHEader.isDisplayed());
		passportOptionElementsList.add(8, passportTableCreatedAtHeader.isDisplayed());
		passportOptionElementsList.add(9, passportTableUpdatedHeader.isDisplayed());
		
		return passportOptionElementsList;
	}

	//Passport Add Button Validation
	public void myDetails_WorkAuthorization_PassportOptionAddButton_Validation() {
		passportOptionHeading.click();
		passportAddButton.click();
	}	
	
	//Passport-Add Passport Details Popup Heading
	public String myDetails_WorkAuthorization_AddPassportDetailsPopUpHeading_Validation() {
		passportOptionHeading.click();
		passportAddButton.click();
		return addPassportDetailsPopUpHeading.getText();
	}
	
	//Passport- Add Passport Details PopUp All Fields Data with Save Button
	public void myDetails_WorkAuthorization_AddPassportPopUp_AllFieldsDataWithSaveButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	
		
		//Click on Passport option
		passportOptionHeading.click();
		
		//Click on Passport option Add Button
		passportAddButton.click();
		
		
		//Add Passport Details PopUp Passport Number Field Data & Mandatory fields check
		addPassportDetailsPopUpPassportNumber.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPassportNumber);
		
		
		//Add Passport Details PopUp Status Fields Data & Mandatory fields Check
		addPassportDetailsPopUpPassportStatus.click();
		for(int option=0;option<addPassportDetailsPopUpPassportStatusOptions.size();option++) {
			if(addPassportDetailsPopUpPassportStatusOptions.get(option).getText().equals(allFieldsData.get(1).toString())) {
				addPassportDetailsPopUpPassportStatusOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		
		
		//Add Passport Details PopUp Place of Issue Field Data & Mandatory fields check
		addPassportDetailsPopUpPlaceOfIssue.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPlaceOfIssue);
		
		
		
		//add Passport Details PopUp Place of Birth Field Data & Mandatory field Check
		addPassportDetailsPopUpPlaceOfBirth.sendKeys(allFieldsData.get(3).toString());
		
		
		//Add Passport Details PopUp Issued Date Field Data & Mandatory Field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpDateIssued);
		
		
		Thread.sleep(500);
		//Add Passport Details PopUp Expiry Date Field Data & Mandatory field Check
		datePicker(allFieldsData.get(5).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpExpiryDateDatePicker);
		
		
		
		//Add Passport Details PopUp Issuing Country Field Data & Mandatory Field Check
		addPassportDetailsPopUpIssuingCountry.sendKeys(allFieldsData.get(6).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addPassportDetailsPopUpIssuingCountriesList));
		addPassportDetailsPopUpIssuingCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		
		
		//Attachment Part
		addPassportDetailsPopUpAttachmentNames.get(0).sendKeys(allFieldsData.get(7).toString());
		addPassportDetailsPopupAttachmentComments.get(0).sendKeys(allFieldsData.get(8).toString());
		//addPassportDetailsPopUpChooseFile.get(0).sendKeys("");
		
		addPassportDetailsPopUpSaveButton.click();
		Thread.sleep(1000);
		
	}
	
	//Passport- Add Passport Details PopUp Mandatory Fields Data with Save Button
	public void myDetails_WorkAuthorization_AddPassportPopUp_MandatoryFieldsDataWithSaveButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	
		
		//Click on Passport option
		passportOptionHeading.click();
		
		//Click on Passport option Add Button
		passportAddButton.click();
		
		
		//Add Passport Details PopUp Passport Number Field Data & Mandatory fields check
		addPassportDetailsPopUpPassportNumber.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPassportNumber);
		
		
		//Add Passport Details PopUp Status Fields Data & Mandatory fields Check
		addPassportDetailsPopUpPassportStatus.click();
		for(int option=0;option<addPassportDetailsPopUpPassportStatusOptions.size();option++) {
			if(addPassportDetailsPopUpPassportStatusOptions.get(option).getText().equals(allFieldsData.get(1).toString())) {
				addPassportDetailsPopUpPassportStatusOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		
		
		//Add Passport Details PopUp Place of Issue Field Data & Mandatory fields check
		addPassportDetailsPopUpPlaceOfIssue.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPlaceOfIssue);
		
		
		//Add Passport Details PopUp Issued Date Field Data & Mandatory Field Check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(3).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpDateIssued);
		
		
		Thread.sleep(500);
		//Add Passport Details PopUp Expiry Date Field Data & Mandatory field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpExpiryDateDatePicker);
		
		
		
		//Add Passport Details PopUp Issuing Country Field Data & Mandatory Field Check
		addPassportDetailsPopUpIssuingCountry.sendKeys(allFieldsData.get(5).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addPassportDetailsPopUpIssuingCountriesList));
		addPassportDetailsPopUpIssuingCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		addPassportDetailsPopUpSaveButton.click();
		Thread.sleep(1000);
		
	}

	//Passport- Add Passport Details PopUp All Fields Data with Cancel Button
	public void myDetails_WorkAuthorization_AddPassportPopUp_AllFieldsDataWithCancelButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	
		
		//Click on Passport option
		passportOptionHeading.click();
		
		//Click on Passport option Add Button
		passportAddButton.click();
		
		
		//Add Passport Details PopUp Passport Number Field Data & Mandatory fields check
		addPassportDetailsPopUpPassportNumber.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPassportNumber);
		
		
		//Add Passport Details PopUp Status Fields Data & Mandatory fields Check
		addPassportDetailsPopUpPassportStatus.click();
		for(int option=0;option<addPassportDetailsPopUpPassportStatusOptions.size();option++) {
			if(addPassportDetailsPopUpPassportStatusOptions.get(option).getText().equals(allFieldsData.get(1).toString())) {
				addPassportDetailsPopUpPassportStatusOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		
		
		//Add Passport Details PopUp Place of Issue Field Data & Mandatory fields check
		addPassportDetailsPopUpPlaceOfIssue.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPlaceOfIssue);
		
		
		
		//add Passport Details PopUp Place of Birth Field Data & Mandatory field Check
		addPassportDetailsPopUpPlaceOfBirth.sendKeys(allFieldsData.get(3).toString());
		
		
		//Add Passport Details PopUp Issued Date Field Data & Mandatory Field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpDateIssued);
		
		
		Thread.sleep(500);
		//Add Passport Details PopUp Expiry Date Field Data & Mandatory field Check
		datePicker(allFieldsData.get(5).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpExpiryDateDatePicker);
		
		
		
		//Add Passport Details PopUp Issuing Country Field Data & Mandatory Field Check
		addPassportDetailsPopUpIssuingCountry.sendKeys(allFieldsData.get(6).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addPassportDetailsPopUpIssuingCountriesList));
		addPassportDetailsPopUpIssuingCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		
		
		//Attachment Part
		addPassportDetailsPopUpAttachmentNames.get(0).sendKeys(allFieldsData.get(7).toString());
		addPassportDetailsPopupAttachmentComments.get(0).sendKeys(allFieldsData.get(8).toString());
		//addPassportDetailsPopUpChooseFile.get(0).sendKeys("");
		
		addPassportDetailsPopUpCancelButton.click();
		Thread.sleep(1000);
		
	}

	//Passport- Add Passport Details PopUp All Fields Data with Close Button
	public void myDetails_WorkAuthorization_AddPassportPopUp_AllFieldsDataWithCloseButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	
		
		//Click on Passport option
		passportOptionHeading.click();
		
		//Click on Passport option Add Button
		passportAddButton.click();
		
		
		//Add Passport Details PopUp Passport Number Field Data & Mandatory fields check
		addPassportDetailsPopUpPassportNumber.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPassportNumber);
		
		
		//Add Passport Details PopUp Status Fields Data & Mandatory fields Check
		addPassportDetailsPopUpPassportStatus.click();
		for(int option=0;option<addPassportDetailsPopUpPassportStatusOptions.size();option++) {
			if(addPassportDetailsPopUpPassportStatusOptions.get(option).getText().equals(allFieldsData.get(1).toString())) {
				addPassportDetailsPopUpPassportStatusOptions.get(option).click();
				break;
			}
		}
		//CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		
		
		//Add Passport Details PopUp Place of Issue Field Data & Mandatory fields check
		addPassportDetailsPopUpPlaceOfIssue.sendKeys(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpPlaceOfIssue);
		
		
		
		//add Passport Details PopUp Place of Birth Field Data & Mandatory field Check
		addPassportDetailsPopUpPlaceOfBirth.sendKeys(allFieldsData.get(3).toString());
		
		
		//Add Passport Details PopUp Issued Date Field Data & Mandatory Field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpDateIssued);
		
		
		Thread.sleep(500);
		//Add Passport Details PopUp Expiry Date Field Data & Mandatory field Check
		datePicker(allFieldsData.get(5).toString());
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpExpiryDateDatePicker);
		
		
		
		//Add Passport Details PopUp Issuing Country Field Data & Mandatory Field Check
		addPassportDetailsPopUpIssuingCountry.sendKeys(allFieldsData.get(6).toString());
		wait.until(ExpectedConditions.visibilityOfAllElements(addPassportDetailsPopUpIssuingCountriesList));
		addPassportDetailsPopUpIssuingCountriesList.get(0).click();
		CommonActions.checkMandatoryFieldValidation(addPassportDetailsPopUpIssuingCountry);
		act.sendKeys(Keys.TAB).build().perform();
		
		
		
		//Attachment Part
		addPassportDetailsPopUpAttachmentNames.get(0).sendKeys(allFieldsData.get(7).toString());
		addPassportDetailsPopupAttachmentComments.get(0).sendKeys(allFieldsData.get(8).toString());
		//addPassportDetailsPopUpChooseFile.get(0).sendKeys("");
		
		addPassportDetailsPopUpCloseButton.click();
		Thread.sleep(1000);
		
	}

	
	
	
	
	//Edit & Delete Button Validation
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//I-94 option Heading
	//Passport RecordsList
	public List i94RecordsList() throws InterruptedException {
		//First Click on I-94 Option
		i94OptionHeading.click();
		Thread.sleep(1000);
		//Get the Records List
		List<Object>recordsList=new ArrayList<Object>();
		for(int record=0;record<i94RecordsList.size();record++) {
			recordsList.add(record, i94RecordsList.get(record).getText());
		}
		return recordsList;
	}

	//Passport Option
	public void myDetails_WorkAuthorization_I94Option_Validation() {
		i94OptionHeading.click();
	}
	
	//I-94 Option Table Heading
	public String myDetails_WorkAuthorization_I94TableHeading_Validation() {
		//Click on I-94 Option
		i94OptionHeading.click();
		//return i-94 Header Text
		return i94OptionHeading.getText().substring(10,14);
	}
	
	//I-94 Option Elements as Per Requirements
	public List myDetails_WorkAuthorization_I94ElementsAsPerRequirements_Validation() throws AWTException {
		Robot robot=new Robot();
		
		//Click on I-94 Option
		i94OptionHeading.click();
		
		//Check the Elements present in the page or not & Update,Store the Status
		List<Object>i94ElementsList=new ArrayList<Object>();
		
		i94ElementsList.add(0, i94AddButton.isDisplayed());
		i94ElementsList.add(1, i94TableI94NumberHeader.isDisplayed());
		i94ElementsList.add(2, i94TableDateOfLastArrivalHeader.isDisplayed());
		i94ElementsList.add(3, i94TableExpiryDateHeader.isDisplayed());
		i94ElementsList.add(4, i94TableStatusHeader.isDisplayed());
		i94TableExpiryDateHeader.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		i94ElementsList.add(5, i94TablePriorityDateHeader.isDisplayed());
		i94ElementsList.add(6, i94TableCreatedAtHeader.isDisplayed());
		i94ElementsList.add(7, i94TableUpdatedAtHeader.isDisplayed());
		
		return i94ElementsList;
	}
	
	//I-94 Add Button Validation
	public void myDetails_WorkAuthorization_I94OptionAddButton_Validation() {
		//Click on I-94 Option
		i94OptionHeading.click();
		
		//Click on I-94 Add Button
		i94AddButton.click();
	}
	
	//I-94 - Add I-94 Details PopUp Heading
	public String myDetails_WorkAuthorization_AddI94DetailsPopUpHeading_Validation() {
		//Click on I-94 Option
		i94OptionHeading.click();
		
		//Click on Add Button
		i94AddButton.click();
		
		//Return AddI-94Details PopUp Header Text
		return addI94DetailsPopupHeader.getText();
	}
	
	//I-94 - Add I-94 Details PopUp Elements to be present
	public List myDetails_WorkAutjorization_AddI94DetailsPopUp_ElementsToBePresent_Validation() throws AWTException {
		Robot robot=new Robot();
		
		//Click on I-94 Option
		i94OptionHeading.click();
		
		//Click on Add Button
		i94AddButton.click();
		
		//Check the Elements present in the page or not & Update,Store the Status
		List<Object>i94ElementsList=new ArrayList<Object>();
		
		i94ElementsList.add(0, addI94DetailsPopUpI94Number.isDisplayed());
		i94ElementsList.add(1, addI94DetailsPopUpDateOfLastArrival.isDisplayed());
		i94ElementsList.add(2, addI94DetailsPopUpStatusDropDown.isDisplayed());
		i94ElementsList.add(3, addI94DetailsPopUpStatusExpiryDate.isDisplayed());
		i94ElementsList.add(4, addI94DetailsPopUpPriorityDate.isDisplayed());
		i94ElementsList.add(5, addI94DetailsPopUpAttachmentNamesList.get(0).isDisplayed());
		i94ElementsList.add(6, addI94DetailsPopUpAttachmentCommentsList.get(0).isDisplayed());
		i94ElementsList.add(7, addI94DetailsPopUpAttachmentChooseFileList.get(0).isDisplayed());
		i94ElementsList.add(8, addI94DetailsPopupCancelButton.isDisplayed());
		i94ElementsList.add(9, addI94DetailsPopUpSaveButton.isDisplayed());
		i94ElementsList.add(10, addI94DetailsPopUpCloseButton.isDisplayed());
		i94ElementsList.add(11, addI94DetailsPopupHeader.isDisplayed());
		
		return i94ElementsList;
	}
	

	//I94- Add I-94 Details PopUp All Fields Data with Save Button
	public void myDetails_WorkAuthorization_AddI94PopUp_AllFieldsDataWithSaveButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	
		
		//Click on I-94 option
		i94OptionHeading.click();
		
		//Click on Add Button
		i94AddButton.click();
		
		//I-94 Number Field Data & Mandatory field check
		addI94DetailsPopUpI94Number.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		
		
		//Date of Last Arrival Field Data & Mandatory field Check
		datePicker(allFieldsData.get(1).toString());
		
		
		Thread.sleep(5000);
		
		//Status Field Data & Mandatory Field Check
		addI94DetailsPopUpStatusDropDown.click();
		for(int option=0;option<addI94DetailsPopUpStatusDropDownOptions.size();option++) {
			if(addI94DetailsPopUpStatusDropDownOptions.get(option).getText().equals(allFieldsData.get(2).toString()))
			{
				addI94DetailsPopUpStatusDropDownOptions.get(option).click();
				break;
			}
		}
	
		//Status Expiry Field Data & Mandatory field Check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(3).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
		
		//Priority Field Data & Mandatory Field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
		
		//Attachment Part
		//Attachment Name Field Data & Mandatory field Check
		addI94DetailsPopUpAttachmentNamesList.get(0).sendKeys(allFieldsData.get(5).toString());
		addI94DetailsPopUpAttachmentCommentsList.get(0).sendKeys(allFieldsData.get(6).toString());
		//addI94DetailsPopUpAttachmentChooseFileList.get(0).sendKeys("");
		
		addI94DetailsPopUpSaveButton.click();
		Thread.sleep(2000);
		
	}
	
	//I94- Add I94 Details PopUp Mandatory Fields Data with Save Button
	public void myDetails_WorkAuthorization_AddI94PopUp_MandatoryFieldsDataWithSaveButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	
		
		//Click on I-94 option
		i94OptionHeading.click();
		
		//Click on Add Button
		i94AddButton.click();
		
		//I-94 Number Field Data & Mandatory field check
		addI94DetailsPopUpI94Number.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		
		//Status Field Data & Mandatory Field Check
		addI94DetailsPopUpStatusDropDown.click();
		for(int option=0;option<addI94DetailsPopUpStatusDropDownOptions.size();option++) {
			if(addI94DetailsPopUpStatusDropDownOptions.get(option).getText().equals(allFieldsData.get(1).toString()))
			{
				addI94DetailsPopUpStatusDropDownOptions.get(option).click();
				break;
			}
		}
	
		//Status Expiry Field Data & Mandatory field Check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(2).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
			
		addI94DetailsPopUpSaveButton.click();
		Thread.sleep(2000);
		
	}

	//I94- Add I94 Details PopUp All Fields Data with Cancel Button
	public void myDetails_WorkAuthorization_AddI94PopUp_AllFieldsDataWithCancelButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	

		//Click on I-94 option
		i94OptionHeading.click();
		
		//Click on Add Button
		i94AddButton.click();
		
		//I-94 Number Field Data & Mandatory field check
		addI94DetailsPopUpI94Number.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		
		
		//Date of Last Arrival Field Data & Mandatory field Check
		datePicker(allFieldsData.get(1).toString());
		
		
		//Status Field Data & Mandatory Field Check
		addI94DetailsPopUpStatusDropDown.click();
		for(int option=0;option<addI94DetailsPopUpStatusDropDownOptions.size();option++) {
			if(addI94DetailsPopUpStatusDropDownOptions.get(option).getText().equals(allFieldsData.get(2).toString()))
			{
				addI94DetailsPopUpStatusDropDownOptions.get(option).click();
				break;
			}
		}
	
		//Status Expiry Field Data & Mandatory field Check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(3).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
		
		//Priority Field Data & Mandatory Field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
		
		//Attachment Part
		//Attachment Name Field Data & Mandatory field Check
		addI94DetailsPopUpAttachmentNamesList.get(0).sendKeys(allFieldsData.get(5).toString());
		addI94DetailsPopUpAttachmentCommentsList.get(0).sendKeys(allFieldsData.get(6).toString());
		//addI94DetailsPopUpAttachmentChooseFileList.get(0).sendKeys("");
		
		addI94DetailsPopupCancelButton.click();
		Thread.sleep(2000);
		
	}

	//I94- Add I94 Details PopUp All Fields Data with Close Button
	public void myDetails_WorkAuthorization_AddI94PopUp_AllFieldsDataWithCloseButton_Validation(List<Object>allFieldsData) throws InterruptedException, AWTException {
		WebDriverWait wait=CommonActions.webDriverWaitMethod();
		Actions act=new Actions(driver);
		Robot robot=new Robot();	

		//Click on I-94 option
		i94OptionHeading.click();
		
		//Click on Add Button
		i94AddButton.click();
		
		//I-94 Number Field Data & Mandatory field check
		addI94DetailsPopUpI94Number.sendKeys(allFieldsData.get(0).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		
		
		//Date of Last Arrival Field Data & Mandatory field Check
		datePicker(allFieldsData.get(1).toString());
		
		
		//Status Field Data & Mandatory Field Check
		addI94DetailsPopUpStatusDropDown.click();
		for(int option=0;option<addI94DetailsPopUpStatusDropDownOptions.size();option++) {
			if(addI94DetailsPopUpStatusDropDownOptions.get(option).getText().equals(allFieldsData.get(2).toString()))
			{
				addI94DetailsPopUpStatusDropDownOptions.get(option).click();
				break;
			}
		}
	
		//Status Expiry Field Data & Mandatory field Check
		act.sendKeys(Keys.TAB).build().perform();
		datePicker(allFieldsData.get(3).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
		
		//Priority Field Data & Mandatory Field Check
		datePicker(allFieldsData.get(4).toString());
		CommonActions.checkMandatoryFieldValidation(addI94DetailsPopUpI94Number);
		Thread.sleep(800);
		
		//Attachment Part
		//Attachment Name Field Data & Mandatory field Check
		addI94DetailsPopUpAttachmentNamesList.get(0).sendKeys(allFieldsData.get(5).toString());
		addI94DetailsPopUpAttachmentCommentsList.get(0).sendKeys(allFieldsData.get(6).toString());
		//addI94DetailsPopUpAttachmentChooseFileList.get(0).sendKeys("");
		
		addI94DetailsPopUpCloseButton.click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Date Picking

		private void datePicker(String Date) throws InterruptedException {
			Actions act=new Actions(driver);
			

			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.TAB).build().perform();
			act.sendKeys(Keys.ENTER).build().perform();
			

			String sliptter[]=Date.split("/");
			String month=sliptter[0];
			String date=sliptter[1];
			String year=sliptter[2];
			System.out.println(date);
			
			addWorkAuthorizationPopUpMonthYearDropDown.click();
			//Checking All Years with matching year
			for(int startDateRange=0;startDateRange<addWorkAuthorizationPopUpYearsList.size();startDateRange++) {
				
				if(addWorkAuthorizationPopUpYearsList.get(startDateRange).getText().equals(year)) {
					//Year matched & Selected
					addWorkAuthorizationPopUpYearsList.get(startDateRange).click();
					break;
				}
			}
			
			Thread.sleep(2000);
			
			//Checking All Months with Matching month
			for(int startMonthRange=0;startMonthRange<addWorkAuthorizationPopUpMonthsList.size();startMonthRange++) {
				
				if(addWorkAuthorizationPopUpMonthsList.get(startMonthRange).getText().equals(month)) {
					//Month matched & Selected
					addWorkAuthorizationPopUpMonthsList.get(startMonthRange).click();
					break;
				}
			}
			
			Thread.sleep(2000);
			//Checking All Dates with matching Date
			for(int startDateRange=0;startDateRange<addWorkAuthorizationPopUpDaysList.size();startDateRange++) {
				
				if(addWorkAuthorizationPopUpDaysList.get(startDateRange).getText().equals(date)) {
					//Date Matched & Selected
					addWorkAuthorizationPopUpDaysList.get(startDateRange).click();
					break;
				}
			}
			
			
		}
		
	
		//Attachment Name & Comments & Choose File
		public void attachmentPart(Object attachmentName,Object attachmentComments,Object atatchmentImageFilePath) {
			addWorkAuthorizationPopUpAttachmentName.get(0).sendKeys(attachmentName.toString());
			addWorkAuthorizationPopUpAttachmentComments.get(0).sendKeys(attachmentComments.toString());
			addWorkAuthorizationPopUpChooseFile.get(0).sendKeys(attachmentComments.toString());
		}
		
		
		//
		
	
}
