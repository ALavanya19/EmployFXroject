package com.WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.Base.Base;
import com.CommonActions.CommonActions;

public class CompanyListPage extends Base{
	
	public CompanyListPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//Companies Page Heading Label Text
	@FindBy(xpath="//h1[text()='Company List']")
	WebElement companyListPageHeadingLabelText;
	
	//Search Option
	@FindBy(xpath="//*[@id='filter-text-box']")
	WebElement companyListPageSearchOption;
	
	
	        //After search results company List table
			@FindBy(xpath="//*[@class='ag-center-cols-container' and @unselectable='on']//*[@role='row']")
			List<WebElement>companiesTableAfterSearchResults;
	
	//Add Company Button
	@FindBy(xpath="//*[@class='custom-add-btn']")
	WebElement addCompanyButton;
	
	//Companies Table Company Name
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Company Name']")
	WebElement companiesTableCompanyNameE;
	    
			//Companies Table Company Name List
			@FindBy(xpath="//*[@col-id='name_1']")
			List<WebElement>companiesTableCompanyNamesList;
			
	
	//Companies Table Business Categories
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Business Category']")
	WebElement companiesTableBusinessCategoryE;
	
			//Companies Table Business Categories List
			@FindBy(xpath="//*[@col-id='business_category.name']")
			List<WebElement>companiesTableBusinessCategoryNamesList;
	
	//Companies Table Country
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Country']")
	WebElement companiesTableCountryE;
	
			//comapnies Table Countries List
			@FindBy(xpath="//*[@col-id='general_country.name']")
			List<WebElement>companiesTableCountriesList;
			
	//Companies Table State
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='State/Province']")
	WebElement companiesTableStateE;
	
			//Comapnies Table States List
			@FindBy(xpath="//*[@col-id='general_state.name']")
			List<WebElement>companiesTableStatesList;
			
	//Companies Table City
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='City']")
	WebElement companiesTableCityE;
	
			//Companies Table City List
			@FindBy(xpath="//*[@col-id='generalCity']")
			List<WebElement>companiesTableCityList;
			
	//Companies Table Street address
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='State Address']")
	WebElement companiesTableStreetAddressE;
	
			//Companies Street address list
			@FindBy(xpath="//*[@col-id='generalStreetAddress']")
			List<WebElement>companiesTableStreetAddressList;
			
	//Companies Table ZipCode
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='ZipCode']")
	WebElement companiesTableZipCodeE;
	
			//Companies ZipCode list
			@FindBy(xpath="//*[@col-id='generalZipCode']")
			List<WebElement>companiesTableLZipCodeist;
	
	//companies Table Website
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Website']")
	WebElement companiesTableWebSiteE;
	
			//Companies Website list
			@FindBy(xpath="//*[@col-id='generalWebsite']")
			List<WebElement>companiesTableWebSiteList;
	
	//Companies Table Email
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Email']")
	WebElement companiesTableEmailE;
	
			//Companies Table email List
			@FindBy(xpath="//*[@col-id='email']")
			List<WebElement>companiesTableEmailList;
	
	//Companies Table Phone Number
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Phone Number']")
	WebElement companiesTablePhoneNumberE;
			
			//Companies Table Phone Number List
			@FindBy(xpath="//*[@col-id='generalPhone']")
			List<WebElement>companiesTablePhoneNumberList;
			
	//comapanies Table Fax
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Fax']")
	WebElement comapniesTableFaxE;
			
			//Companies Table Fax List
			@FindBy(xpath="//*[@col-id='generalFax']")
			List<WebElement>companiesTableFaxList;
	
	//Comapnies Table Attachment
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Attachment']")
	WebElement comapniesTableAttachmentE;
	
			//Companies Table Attachment List
			@FindBy(xpath="//*[@col-id='attachment.name']")
			List<WebElement>companiesTableAttachmentList;
	
	//Companies Table Primary title
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Title']")
	WebElement companiesTablePrimaryTitleE;
	
			//companies Table Primary title List
			@FindBy(xpath="//*[@col-id='primaryTitle']")
			List<WebElement>companiesTablePrimaryTitleList;
			
	//Comapnies Table Primary contact Name
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Contact Name']")
	WebElement companiesTablePrimaryContactNameE;
			
			//Companies Table Primary Contact Name List
			@FindBy(xpath="//*[@col-id='primaryContactName']")
			List<WebElement>companiesTablePrimaryContactNameList;
			
	//Companies Table Primary Country
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Country']")
	WebElement companiesTablePrimaryCountryE;
			
			//Companies Table Primary Country List
			@FindBy(xpath="//*[@col-id='primary_country.name']")
			List<WebElement>companiesTablePrimaryCountryList;
	
	//Companies Table Primary State/Province
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary State/Province']")
	WebElement companiesTablePrimaryStateE;
	
			//Companies Table Primary State List
			@FindBy(xpath="//*[@col-id='primary_state.name']")
			List<WebElement>companiesTablePrimaryStateList;
			
	//Comapnies Table Primary City
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary City']")
	WebElement companiesTablePrimaryCityE;
			
			//Companies Table Primary City
			@FindBy(xpath="primaryCity")
			List<WebElement>companiesTablePrimaryCityList;
			
	//comapnies Table Primary Street Address
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Street Address']")
	WebElement companiesTablePrimaryStreetAddressE;
			
			//Companies Table Primary Street Address
			@FindBy(xpath="//*[@col-id='primaryStreetAddress']")
			List<WebElement>companiesTablePrimaryStreetAddressList;
			
	//Companies Table Primary Zipcode
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary ZipCode']")
	WebElement companiesTablePrimaryZipcodeE;
			
			//Companies Table Primary ZipCode
			@FindBy(xpath="//*[@col-id='primaryZipCode']")
			List<WebElement>companiesTablePrimaryZipCodeList;
	
	//comapnies Table Primary Phone Number
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Phone Number']")
	WebElement companiesTablePrimaryPhoneNumberE;
	
			//Companies Table Primary Phone Number
			@FindBy(xpath="//*[@col-id='primaryPhone']")
			List<WebElement>companiesTablePrimaryPhoneNumberList;
			
	//Companies Table Primary Fax
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Fax']")
	WebElement companiesTablePrimaryFaxE;
			
			//Companies Table Primary Fax
			@FindBy(xpath="//*[@col-id='primaryFax']")
			List<WebElement>companiesTablePrimaryFaxList;
			
	
	//Comapnies Table Primary Cell Number
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Cell Number']")
	WebElement companiesTablePrimaryCellNumberE;
			
			//Companies Table Primary Cell Number List
			@FindBy(xpath="//*[@col-id='primaryCellNumber']")
			List<WebElement>companiesTablePrimaryCellNumberList;
			
	//Companies Table Primary Email
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Primary Email']")
	WebElement companiesTablePrimaryEmailE;
	
			//Companies Table Primary Email
			@FindBy(xpath="//*[@col-id='primaryEmail']")
			List<WebElement>companiesTablePrimaryEmailList;
			
	//Comapnies Table Secondaary title
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Title']")
	WebElement companiesTableSecondaryTitleE;
	
			//Companies Table Secondary Title
			@FindBy(xpath="//*[@col-id='secondaryTitle']")
			List<WebElement>companiesTableSecondaryTitleList;
			
	//Companies Table secondaty Conatct Name
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Contact Name']")
	WebElement companiesTableSecondaryConatctNameE;
			
			//Comapnies Table Secondary Contact Name
			@FindBy(xpath="//*[@col-id='secondaryContactName']")
			List<WebElement>companiesTableSecondaryContactNameList;
			
	//Companies Table Secondary Country
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Country']")
	WebElement companiesTableSecondaryCountryE;
	
			//Comapanies Table Secondary Country
			@FindBy(xpath="//*[@col-id='secondary_country.name']")
			List<WebElement>companiesTableSecondaryCountryList;
			
	//Companies Table Secondary State/province
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Seconday State/Province']")
	WebElement companiesTableSecondaryStateE;
			
			//Companies Table Secondary State List
			@FindBy(xpath="//*[@col-id='secondary_state.name']")
			List<WebElement>companiesTableSecondaryStateList;
			
	//Comapnies Table Secondary Sity
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary City']")
	WebElement companiesTableSecondaryCityE;
			
			//Companies Table Secondary City
			@FindBy(xpath="//*[@col-id='secondaryCity']")
			List<WebElement>companiesTableSecondaryCityList;
			
	//Companies Table Secondary Street Address
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Street Address']")
	WebElement companiesTableSecondaryStreetAddressE;
			
			//Comapnies Table Secondary Street Address
			@FindBy(xpath="//*[@col-id='secondaryStreetAddress']")
			List<WebElement>companiesTableSecondaryStreetAddressList;
			
	//Comapnies Table Secondary ZipCode
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary ZipCode']")
	WebElement companiesTableSecondaryZipCodeE;
			
			//Companies Table Secondary ZipCode
			@FindBy(xpath="//*[@col-id='secondaryZipCode']")
			List<WebElement>companiesTableSecondaryZipCodeList;
			
	//companies Table Secondar Phone Number
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Phone Number']")
	WebElement companiesTableSecondaryPhoneNumberE;
	
			//Companies Table Secondary Phone Number List
			@FindBy(xpath="//*[@col-id='secondaryPhone']")
			List<WebElement>companiesTableSecondaryPhoneNumberList;
	
	//Comapnies Table Secondary Fax
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Fax']")
	WebElement companiesTableSecondaryFaxE;
			
			//Companies Table Secondary Fax
			@FindBy(xpath="//*[@col-id='secondaryFax']")
			List<WebElement>companiesTableSecondaryFaxList;
			
	//Companies Table Secondary Cell Number
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Cell Number']")
	WebElement companiesTableSecondaryCellNumberE;
	
			//Companies Table Secondary Cell Number
			@FindBy(xpath="//*[@col-id='secondaryCellNumber']")
			List<WebElement>companiesTableSecondaryCellNumberList;
			
	//Companies Table Secondary Email
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Secondary Email']")
	WebElement companiesTableSecondaryEmailE;
	
			//Companies Table Secondary Email
			@FindBy(xpath="//*[@col-id='secondaryEmail']")
			List<WebElement>companiesTableSecondaryEmailList;
			
	//Companies Table Public or Private
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Public Or Private']")
	WebElement companiesTablePublicOrPrivateE;
	
			//Comapnies Table Public & Private
			@FindBy(xpath="//*[@col-id='publicOrPrivate']")
			List<WebElement>companiesTablePublicOrPrivateList;
			
	//Companies Table Total number of employees
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='No of Employees']")
	WebElement companiesTableTotalNumberOfEmployeesE;
		
			//Comapnies Table Total number of employee
			@FindBy(xpath="//*[@col-id='noOfEmployees']")
			List<WebElement>companiesTableTotalNumberOfEmployeeList;
			
	//Companies Table Operating Countries
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Operating Countries']")
	WebElement companiesTableOperatingCountriesE;
	
			//Companies Table Operating Country
			@FindBy(xpath="//*[@col-id='operating_countries']")
			List<WebElement>companiesTableOperatingCountriesList;
			
	//Companies Table Operating States
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Operating States']")
	WebElement companiesTableOperatingStatesE;
			
			//Companies Table Operating State
			@FindBy(xpath="//*[@col-id='operating_states']")
			List<WebElement>companiesTableOperatingStateList;
			
	//Companies Table Created At
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Created At']")
	WebElement companiesTableCreatedAtE;
	
			//comapnies Table Created At
			@FindBy(xpath="//*[@col-id='created_at']")
			List<WebElement>companiesTableCreatedAtList;
			
	//Companies Table Updated At
	@FindBy(xpath="//*[@class='ag-header-cell-text' and text()='Updated At']")
	WebElement companiesTableUpdatedAtE;
	
			//Comapnies Table Updated At
			@FindBy(xpath="//*[@col-id='updated_at']")
			List<WebElement>companiesTableUpdatedAtList;

	//Companies Table Edit Button
	@FindBy(xpath="//*[@class='fa-edit fas']")
	List<WebElement>companiesTableEditButton;
			
	//Companies Table delete Button-
	//@FindBy(xpath="//*[@class='fa-trash-alt far']")
	//List<WebElement>companiesTableDeleteButton;
	
	
	//CompanyList Table Elements for CompanyDetailsPage
	//Company Name Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='name_1']")
	WebElement companyDetailsCompanyNameE;
	
	
	//Business Category Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='business_category.name']//span")
	WebElement companyDetailsBusinessCategoryE;
	
	//Country Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_country.name']//span")
	WebElement companyDetailsCountryE;
	
	//State Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_state.name']//span")
	WebElement companyDetailsStateE;
	
	//City Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_city']")
	WebElement companyDetailsCityE;
	
	//Street Address
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_street_address']")
	WebElement companyDetailsStreetAddressE;
	
	//ZipCode Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_zipcode']")
	WebElement companyDetailsZipCodeE;
	
	//WebSite Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_website']")
	WebElement companyDetailsWebSiteE;
	
	//email Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='email']")
	WebElement companyDetailsEmailE;
	
	//Phone Number Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_phone']")
	WebElement companyDetailsPhoneNumberE;
	
	//Fax Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='general_fax']")
	WebElement companyDetailsFaxE;
	
	//Attachment Element
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='attachments?.name']")
	WebElement companyDetailsAttachmentE;
	
	//Primary Title
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_title']")
	WebElement companyDetailsprimaryTitleE;
	
	//Primary Contact Name
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_contact_name']")
	WebElement companyDetailsPrimaryContactNameE;
	
	//Primary Country
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_country.name']//span")
	WebElement companyDetailsPrimaryCountryE;
	
	//Primary State
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_state.name']//span")
	WebElement companyDetailsPrimaryStateE;
	
	//primary City
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_city']")
	WebElement companyDetailsPrimaryCityE;
	
	//Primary Street Address
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_street_address']")
	WebElement companyDetailsPrimaryStreetAddressE;
	
	//Primary ZipCode
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_zipcode']")
	WebElement companyDetailsPrimaryZipCodeE;
	
	//Primary Phone Number
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_phone']")
	WebElement companyDetailsPrimaryPhoneNumberE;
	
	//Primary Fax
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_fax']")
	WebElement companyDetailsPrimaryFaxE;
	
	//Primary Cell Number
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_cell_number']")
	WebElement companyDetailsPrimaryCellNumberE;
	
	//Primary Email
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='primary_email']")
	WebElement companyDetailsPrimaryEmailE;
	
	//Secondary Title
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_title']")
	WebElement companyDetailsSecondaryTitleE;
	
	//Secondary Contact Name
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_phone']")
	WebElement companyDetailsSecondaryContactNameE;
	
	//Secondary Country
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_country.name']//span")
	WebElement companyDetailsSecondaryCountryE;
	
	//Secondary State
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_state.name']//span")
	WebElement comapanyDetailsSecondaryStateE;
	
	//Secondary City
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_city']")
	WebElement companyDetailsSecondaryCityE;
	
	//Secondary Street Address
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_street_address']")
	WebElement companyDetailsSecondaruStreetAddressE;
	
	//Secondary ZiipCode 
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_zipcode']")
	WebElement companyDetailsSecondaryZipCideE;
	
	//Secondary Phone Number
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_phone_1']")
	WebElement companyDetailsSecondaryPhoneNumberE;
	
	//Secondary Fax
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_fax']")
	WebElement companyDetailsSecondaryFaxE;
	
	//Secondary Cell Number
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_cell_number']")
	WebElement companyDetailsSecondaryCellNumberE;
	
	//secondary email 
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='secondary_email']")
	WebElement companyDetailsSecondaryEmailE;
	
	//Private or public 
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='type']//span")
	WebElement companyDetailsPrivateOrPublicE;
	
	//Total number of employees
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='no_of_employees']")
	WebElement companyDetailsTotalNoofEmployeesE;
	
	//Operating Countries
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='operating_countries']//span")
	WebElement companyDetailsOperatingCountriesE;
	
	//Operating State
	@FindBy(xpath="//*[@aria-rowindex='2']//*[@col-id='operating_states']//span")
	WebElement companyDetailsOperatingStatesE;
	
	//Horizantal scroll bar
		@FindBy(xpath="//*[@class='ag-body-horizontal-scroll-container']")
		WebElement horizantalScrollBarE;
		
	

			
	//Business Logic
	
	//Current URL Validation
	public String validating_companyListPage_CurrentUrl()
	{
		return driver.getCurrentUrl();
	}
	
	//Title Validation
	public String validating_companyListPage_Title() {
		return driver.getTitle();
	}
	
	//Companies Page Heading Validation
	public String validating_companyListPage_HeadingLabelText() {
		return companyListPageHeadingLabelText.getText();
	}
	
	//Companies Page Search option Validation
	public int validating_companyListPage_SearchOption(String searchRecordName) {
		companyListPageSearchOption.sendKeys(searchRecordName);
		return validating_CompanyListTable();
	}
	
	
	//Company Table after search
	public int validating_CompanyListTable() {
		return companiesTableAfterSearchResults.size();
	}
			
	//Companies Page Add Company Validation
	public AddCompanyPage validating_companyListPage_AddCompanyButton() {
		addCompanyButton.click();
		return new AddCompanyPage();
	}
	
	//Companies Page Company Name Button in Company Table
	public void validatin_companyListPage_CompanyNameHeader() {
		companiesTableCompanyNameE.click();
	}
	
	//Company Page Edit Company Validation
	public EditCompanyPage validating_companyListPage_EditButton(String companyName) {
		companyListPageSearchOption.sendKeys(companyName);
		companiesTableEditButton.get(0).click();
		return new EditCompanyPage();
	}
	
	//CompanyDetails Page 
	public List validating_CompanyDetails(String companyName) throws AWTException {
		Actions act=new Actions(driver);
		Robot robot=new Robot();
		
		
		
		companyListPageSearchOption.sendKeys(companyName);
		List<Object>companyDetailsPageDetails=new ArrayList<Object>();
		companyDetailsPageDetails.add(0, companyDetailsCompanyNameE.getText());
		companyDetailsPageDetails.add(1, companyDetailsBusinessCategoryE.getText());
		companyDetailsPageDetails.add(2, companyDetailsCountryE.getText());
		companyDetailsPageDetails.add(3, companyDetailsStateE.getText());
		companyDetailsPageDetails.add(4, companyDetailsCityE.getText());
		companyDetailsPageDetails.add(5, companyDetailsStreetAddressE.getText());
		companyDetailsPageDetails.add(6, companyDetailsZipCodeE.getText());
		companiesTableZipCodeE.click();
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
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		//robot.keyPress(KeyEvent.VK_TAB);
		//act.keyDown(Keys.TAB).build().perform();
		//CommonActions.scroll(horizantalScrollBarE);
		//act.dragAndDrop(horizantalScrollBarE, companyDetailsZipCodeE).build().perform();
		//act.dragAndDropBy(horizantalScrollBarE, 200, 0);
		//act.clickAndHold(horizantalScrollBarE).build().perform();
		//act.doubleClick(companyDetailsZipCodeE).
		//horizantalScrollBarE.
		companyDetailsPageDetails.add(7, companyDetailsWebSiteE.getText());
		companyDetailsPageDetails.add(8, companyDetailsEmailE.getText());
		companyDetailsPageDetails.add(9, companyDetailsPhoneNumberE.getText());
		companyDetailsPageDetails.add(10, companyDetailsFaxE.getText());
		companyDetailsPageDetails.add(11, companyDetailsAttachmentE.getText());
		companyDetailsPageDetails.add(12, companyDetailsprimaryTitleE.getText());
		companiesTablePrimaryTitleE.click();
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
		
		
		//CommonActions.scroll(companyDetailsprimaryTitleE);
		companyDetailsPageDetails.add(13, companyDetailsPrimaryContactNameE.getText());
		companyDetailsPageDetails.add(14, companyDetailsPrimaryCountryE.getText());
		companyDetailsPageDetails.add(15, companyDetailsPrimaryStateE.getText());
		companyDetailsPageDetails.add(16, companyDetailsPrimaryCityE.getText());
		companyDetailsPageDetails.add(17, companyDetailsPrimaryStreetAddressE.getText());
		companiesTablePrimaryStreetAddressE.click();
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
		
		//CommonActions.scroll(companyDetailsPrimaryStreetAddressE);
		companyDetailsPageDetails.add(18, companyDetailsPrimaryZipCodeE.getText());
		companyDetailsPageDetails.add(19, companyDetailsPrimaryPhoneNumberE.getText());
		companyDetailsPageDetails.add(20, companyDetailsPrimaryFaxE.getText());
		companyDetailsPageDetails.add(21, companyDetailsPrimaryCellNumberE.getText());
		companyDetailsPageDetails.add(22, companyDetailsPrimaryEmailE.getText());
		companiesTablePrimaryEmailE.click();
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
		
		//CommonActions.scroll(companyDetailsPrimaryEmailE);
		companyDetailsPageDetails.add(23, companyDetailsSecondaryTitleE.getText());
		companyDetailsPageDetails.add(24, companyDetailsSecondaryContactNameE.getText());
		companyDetailsPageDetails.add(25, companyDetailsSecondaryCountryE.getText());
		companyDetailsPageDetails.add(26, comapanyDetailsSecondaryStateE.getText());
		companiesTableSecondaryStateE.click();
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
		
		//CommonActions.scroll(comapanyDetailsSecondaryStateE);
		companyDetailsPageDetails.add(27, companyDetailsSecondaryCityE.getText());
		companyDetailsPageDetails.add(28, companyDetailsSecondaruStreetAddressE.getText());
		companyDetailsPageDetails.add(29, companyDetailsSecondaryZipCideE.getText());
		companyDetailsPageDetails.add(30, companyDetailsSecondaryPhoneNumberE.getText());
		companiesTableSecondaryPhoneNumberE.click();
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
		
		//CommonActions.scroll(companyDetailsSecondaryPhoneNumberE);
		companyDetailsPageDetails.add(31, companyDetailsSecondaryFaxE.getText());
		companyDetailsPageDetails.add(32, companyDetailsSecondaryCellNumberE.getText());
		companyDetailsPageDetails.add(33, companyDetailsSecondaryEmailE.getText());
		companyDetailsPageDetails.add(34, companyDetailsPrivateOrPublicE.getText());
		companyDetailsPageDetails.add(35, companyDetailsTotalNoofEmployeesE.getText());
		companiesTableTotalNumberOfEmployeesE.click();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		companyDetailsPageDetails.add(36, companyDetailsOperatingCountriesE.getText());
		companyDetailsPageDetails.add(37, companyDetailsOperatingStatesE.getText());
		
		return companyDetailsPageDetails;
	}
	
	
	public CompanyDetailsPage validating_companyListPage_CompanyDetails(String companyName) {
		companyListPageSearchOption.sendKeys(companyName);
		companyDetailsCompanyNameE.click();
		return new CompanyDetailsPage();
	}

	
	
	
/*	//Companies Page Sorting as per company name
	public Object[] validatin_companyListPage_SortingAsPerCompanyName() {
		Object[] before_Sorting=new Object[companiesTableCompanyNamesList.size()];
		for(int record=1;record<companiesTableCompanyNamesList.size();record++) 
		{
			before_Sorting[record]=companiesTableCompanyNamesList.get(record).getText();
		}
		return before_Sorting;
		
	}

	public Object[] validating_companyListPage_AfterSortingCompanyName() {
		
		for(int i=2;i<tableRow.size();i++) {
		List<WebElement>soring=driver.findElements(By.xpath("//*[@ref='eContainer']//div[@aria-rowindex='"+i+"']"));
		}Object[] after_Sorting=new Object[companiesTableCompanyNamesList.size()];
		
		for(int record=0;record<tableRow.size();record++) 
		{
			after_Sorting[record]=tableRow.get(record).getText();
		}
		return after_Sorting;
	}
	
	//Companies Page business Category Button in Company Table
		public void validatin_companyListPage_BusinessCategoryHeader() {
			companiesTableBusinessCategoryE.click();
		}
	
	
	//companies Page Sorting as per Business Categories
	public Object[] validating_companyListPage_SortingAsPerBusinessCategory() {
		Object[] before_Sorting=new Object[companiesTableBusinessCategoryNamesList.size()];
		for(int record=0;record<companiesTableBusinessCategoryNamesList.size();record++) 
		{
			before_Sorting[record]=companiesTableBusinessCategoryNamesList.get(record).getText();
		}
		return before_Sorting;
	}
	
	
	//Companies Page Country Button in Company Table
	public void validatin_companyListPage_CountryHeader() {
	 	companiesTableCountryE.click();
	}
	
	//companies Page Sorting as per Country 
	public Object[] validating_companyListPage_SortingAsPerCountry() {
		Object[] before_Sorting=new Object[companiesTableCountriesList.size()];
		for(int record=0;record<companiesTableCountriesList.size();record++) 
		{
			before_Sorting[record]=companiesTableCountriesList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page state Header in Company Table
	public void validatin_companyListPage_stateHeader() {
		companiesTableStateE.click();
	}
		
	
	//Companies Page Sorting as per State/Province
	public Object[] validating_companyListPage_SortingAsPerState() {
		Object[] before_Sorting=new Object[companiesTableStatesList.size()];
		for(int record=0;record<companiesTableStatesList.size();record++) 
		{
			before_Sorting[record]=companiesTableStatesList.get(record).getText();
		}
		return before_Sorting;
	}
	
	
	//Companies Page City Header in Company Table
	public void validatin_companyListPage_CityHeader() {
		companiesTableCityE.click();
	}
	
	//Companies Page sorting as per City
	public Object[] validating_companyListPage_SortingAsPerCity() {
		Object[] before_Sorting=new Object[companiesTableCityList.size()];
		for(int record=0;record<companiesTableCityList.size();record++) 
		{
			before_Sorting[record]=companiesTableCityList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Street Address Header in Company Table
	public void validatin_companyListPage_StreetAddressHeader() {
		companiesTableStreetAddressE.click();
	}
	
	//Companies Page sorting as per Street Address
		public Object[] validating_companyListPage_SortingAsPerStreetAddress() {
			Object[] before_Sorting=new Object[companiesTableStreetAddressList.size()];
			for(int record=0;record<companiesTableStreetAddressList.size();record++) 
			{
				before_Sorting[record]=companiesTableStreetAddressList.get(record).getText();
			}
			return before_Sorting;
		}
	
	//Companies Page ZipCode Header in Company Table
	public void validatin_companyListPage_ZipCodeHeader() {
		companiesTableZipCodeE.click();
	}	
		
		
	//Companies Page sorting as per ZipCode
	public Object[] validating_companyListPage_SortingAsPerZipCode() {
		Object[] before_Sorting=new Object[companiesTableLZipCodeist.size()];
		for(int record=0;record<companiesTableLZipCodeist.size();record++) 
		{
			before_Sorting[record]=companiesTableLZipCodeist.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page WebSite Header in Company Table
	public void validatin_companyListPage_WebSiteHeader() {
		companiesTableWebSiteE.click();
	}
	
	//Companies Page sorting as per WebSite
	public Object[] validating_companyListPage_SortingAsPerWebSite() {
		Object[] before_Sorting=new Object[companiesTableWebSiteList.size()];
		for(int record=0;record<companiesTableWebSiteList.size();record++) 
		{
			before_Sorting[record]=companiesTableWebSiteList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page state Header in Company Table
	public void validatin_companyListPage_EmailHeader() {
		companiesTableEmailE.click();
	}
	
	//Companies Page sorting as per Email
	public Object[] validating_companyListPage_SortingAsPerEmail() {
		Object[] before_Sorting=new Object[companiesTableEmailList.size()];
		for(int record=0;record<companiesTableEmailList.size();record++) 
		{
			before_Sorting[record]=companiesTableEmailList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Phone Number Header in Company Table
	public void validatin_companyListPage_PhoneNumberHeader() {
		companiesTablePhoneNumberE.click();
	}
	
	//Companies Page sorting as per Phone Number
	public Object[] validating_companyListPage_SortingAsPerPhoneNumber() {
		Object[] before_Sorting=new Object[companiesTablePhoneNumberList.size()];
		for(int record=0;record<companiesTablePhoneNumberList.size();record++) 
		{
			before_Sorting[record]=companiesTablePhoneNumberList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Fax Header in Company Table
	public void validatin_companyListPage_FaxHeader() {
		comapniesTableFaxE.click();
	}
	
	//Companies Page sorting as per Fax
	public Object[] validating_companyListPage_SortingAsPerFax() {
		Object[] before_Sorting=new Object[companiesTableFaxList.size()];
		for(int record=0;record<companiesTableFaxList.size();record++) 
		{
			before_Sorting[record]=companiesTableFaxList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page attachment Header in Company Table
	public void validatin_companyListPage_AttachmentHeader() {
		comapniesTableAttachmentE.click();
	}
	
	//Companies Page sorting as per Attachment
	public Object[] validating_companyListPage_SortingAsPerAttachment() {
		Object[] before_Sorting=new Object[companiesTableAttachmentList.size()];
	    for(int record=0;record<companiesTableAttachmentList.size();record++) 
		{
			before_Sorting[record]=companiesTableAttachmentList.get(record).getText();
		}
		return before_Sorting;
	}
	

	//Companies Page Primary Title Header in Company Table
	public void validatin_companyListPage_PrimaryTitleHeader() {
		companiesTablePrimaryTitleE.click();
	}
	
	//Companies Page sorting as per Primary Title
	public Object[] validating_companyListPage_SortingAsPerPrimaryTitle() {
		Object[] before_Sorting=new Object[companiesTablePrimaryTitleList.size()];
	    for(int record=0;record<companiesTablePrimaryTitleList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryTitleList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Contact Name Header in Company Table
	public void validatin_companyListPage_PrimaryContactNameHeader() {
		companiesTablePrimaryContactNameE.click();
	}
	

	//Companies Page sorting as per Primary Contact Name
	public Object[] validating_companyListPage_SortingAsPerPrimaryContactName() {
		Object[] before_Sorting=new Object[companiesTablePrimaryContactNameList.size()];
	    for(int record=0;record<companiesTablePrimaryContactNameList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryContactNameList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Country Header in Company Table
	public void validatin_companyListPage_PrimaryCountryHeader() {
		companiesTablePrimaryCountryE.click();
	}

	//Companies Page sorting as per Primary Country
	public Object[] validating_companyListPage_SortingAsPerPrimaryCountry() {
		Object[] before_Sorting=new Object[companiesTablePrimaryCountryList.size()];
	    for(int record=0;record<companiesTablePrimaryCountryList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryCountryList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary State Header in Company Table
	public void validatin_companyListPage_PrimaryStateHeader() {
		companiesTablePrimaryStateE.click();
	}

	//Companies Page sorting as per Primary State/Province
	public Object[] validating_companyListPage_SortingAsPerPrimaryState() {
		Object[] before_Sorting=new Object[companiesTablePrimaryStateList.size()];
	    for(int record=0;record<companiesTablePrimaryStateList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryStateList.get(record).getText();
		}
		return before_Sorting;
	}

	//Companies Page Primary City Header in Company Table
	public void validatin_companyListPage_PrimaryCityHeader() {
		companiesTablePrimaryCityE.click();
	}

	//Companies Page sorting as per Primary City
	public Object[] validating_companyListPage_SortingAsPerPrimaryCity() {
		Object[] before_Sorting=new Object[companiesTablePrimaryCityList.size()];
	    for(int record=0;record<companiesTablePrimaryCityList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryCityList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Street Address Header in Company Table
	public void validatin_companyListPage_PrimaryStreetAddressHeader() {
		companiesTablePrimaryStreetAddressE.click();
	}

	//Companies Page sorting as per Primary Street Address
	public Object[] validating_companyListPage_SortingAsPerPrimaryStreetAddress() {
		Object[] before_Sorting=new Object[companiesTablePrimaryStreetAddressList.size()];
	    for(int record=0;record<companiesTablePrimaryStreetAddressList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryStreetAddressList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary ZipCode Header in Company Table
	public void validatin_companyListPage_PrimaryZipCodeHeader() {
		companiesTablePrimaryZipcodeE.click();
	}

	//Companies Page sorting as per Primary ZipCode
	public Object[] validating_companyListPage_SortingAsPerPrimaryZipCode() {
		Object[] before_Sorting=new Object[companiesTablePrimaryZipCodeList.size()];
	    for(int record=0;record<companiesTablePrimaryZipCodeList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryZipCodeList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Phone Number Header in Company Table
	public void validatin_companyListPage_PrimaryPhoneNumberHeader() {
		companiesTablePrimaryPhoneNumberE.click();
	}

	
	//Companies Page sorting as per Primary Phone Number
	public Object[] validating_companyListPage_SortingAsPerPrimaryPhoneNumber() {
		Object[] before_Sorting=new Object[companiesTablePrimaryPhoneNumberList.size()];
	    for(int record=0;record<companiesTablePrimaryPhoneNumberList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryPhoneNumberList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Fax Header in Company Table
	public void validatin_companyListPage_PrimaryFaxHeader() {
		companiesTablePrimaryFaxE.click();
	}

	
	//Companies Page sorting as per Primary Fax
	public Object[] validating_companyListPage_SortingAsPerPrimaryFax() {
		Object[] before_Sorting=new Object[companiesTablePrimaryFaxList.size()];
	    for(int record=0;record<companiesTablePrimaryFaxList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryFaxList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Cell Number Header in Company Table
	public void validatin_companyListPage_PrimaryCellNumberHeader() {
		companiesTablePrimaryCellNumberE.click();
	}

	//Companies Page sorting as per Primary Cell Number
	public Object[] validating_companyListPage_SortingAsPerPrimaryCellNumber() {
		Object[] before_Sorting=new Object[companiesTablePrimaryCellNumberList.size()];
	    for(int record=0;record<companiesTablePrimaryCellNumberList.size();record++) 
		{
			before_Sorting[record]=companiesTablePrimaryCellNumberList.get(record).getText();
		}
		return before_Sorting;
	}
	
	//Companies Page Primary Email Header in Company Table
	public void validatin_companyListPage_PrimaryEmailHeader() {
		companiesTablePrimaryEmailE.click();
	}

	//Companies Page sorting as per Primary Email
		public Object[] validating_companyListPage_SortingAsPerPrimaryEmail() {
			Object[] before_Sorting=new Object[companiesTablePrimaryEmailList.size()];
		    for(int record=0;record<companiesTablePrimaryEmailList.size();record++) 
			{
				before_Sorting[record]=companiesTablePrimaryEmailList.get(record).getText();
			}
			return before_Sorting;
		}
	
		//Companies Page Secondary Title Header in Company Table
		public void validatin_companyListPage_SecondaryTitleHeader() {
			companiesTableSecondaryTitleE.click();
		}

		//Companies Page sorting as per Secondary Title
		public Object[] validating_companyListPage_SortingAsPerSecondaryTitle() {
			Object[] before_Sorting=new Object[companiesTableSecondaryTitleList.size()];
		    for(int record=0;record<companiesTableSecondaryTitleList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryTitleList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Contact Name Header in Company Table
		public void validatin_companyListPage_SecondaryContactNameHeader() {
			companiesTableSecondaryConatctNameE.click();
		}

		//Companies Page sorting as per Secondary Contact Name
		public Object[] validating_companyListPage_SortingAsPerSecondaryContactName() {
			Object[] before_Sorting=new Object[companiesTableSecondaryContactNameList.size()];
		    for(int record=0;record<companiesTableSecondaryContactNameList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryContactNameList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Country Header in Company Table
		public void validatin_companyListPage_SecondaryCountryHeader() {
			companiesTableSecondaryCountryE.click();
		}

		
		//Companies Page sorting as per Secondaary Country
		public Object[] validating_companyListPage_SortingAsPerSecondaryCountry() {
			Object[] before_Sorting=new Object[companiesTableSecondaryCountryList.size()];
		    for(int record=0;record<companiesTableSecondaryCountryList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryCountryList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary State Header in Company Table
		public void validatin_companyListPage_SecondaryStateHeader() {
			companiesTableSecondaryStateE.click();
		}

		
		//Companies Page sorting as per Secondary State
		public Object[] validating_companyListPage_SortingAsPerSecondaryState() {
			Object[] before_Sorting=new Object[companiesTableSecondaryStateList.size()];
		    for(int record=0;record<companiesTableSecondaryStateList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryStateList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary City Header in Company Table
		public void validatin_companyListPage_SecondaryCityHeader() {
			companiesTableSecondaryCityE.click();
		}

		//Companies Page sorting as per Secondary City
		public Object[] validating_companyListPage_SortingAsPerSecondaryCity() {
			Object[] before_Sorting=new Object[companiesTableSecondaryCityList.size()];
		    for(int record=0;record<companiesTableSecondaryCityList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryCityList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Street Address Header in Company Table
		public void validatin_companyListPage_SecondaryStreetAddressHeader() {
			companiesTableSecondaryStreetAddressE.click();
		}
		
		//Companies Page sorting as per Secondary Street Address
		public Object[] validating_companyListPage_SortingAsPerSecondaryStreetAddress() {
			Object[] before_Sorting=new Object[companiesTableSecondaryStreetAddressList.size()];
		    for(int record=0;record<companiesTableSecondaryStreetAddressList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryStreetAddressList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary ZipCode Header in Company Table
		public void validatin_companyListPage_SecondaryZipCodeHeader() {
			companiesTableSecondaryZipCodeE.click();
		}

		//Companies Page sorting as per Secondary ZipCode
		public Object[] validating_companyListPage_SortingAsPerSecondaryZipCode() {
			Object[] before_Sorting=new Object[companiesTableSecondaryZipCodeList.size()];
		    for(int record=0;record<companiesTableSecondaryZipCodeList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryZipCodeList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Phone Number Header in Company Table
		public void validatin_companyListPage_SecondaryPhoneNumberHeader() {
			companiesTableSecondaryPhoneNumberE.click();
		}

		//Companies Page sorting as per Secondary Phone Number
		public Object[] validating_companyListPage_SortingAsPerSecondaryPhoneNumber() {
			Object[] before_Sorting=new Object[companiesTableSecondaryPhoneNumberList.size()];
		    for(int record=0;record<companiesTableSecondaryPhoneNumberList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryPhoneNumberList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Fax Header in Company Table
		public void validatin_companyListPage_SecondaryFaxHeader() {
			companiesTableSecondaryFaxE.click();
		}

		//Companies Page sorting as per Secondary Fax
		public Object[] validating_companyListPage_SortingAsPerSecondaryFax() {
			Object[] before_Sorting=new Object[companiesTableSecondaryFaxList.size()];
		    for(int record=0;record<companiesTableSecondaryFaxList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryFaxList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Cell Number Header in Company Table
		public void validatin_companyListPage_SecondaryCellNumberHeader() {
			companiesTableSecondaryCellNumberE.click();
		}

		//Companies Page sorting as per Secondary Cell Number
		public Object[] validating_companyListPage_SortingAsPerSecondaryCellNumber() {
			Object[] before_Sorting=new Object[companiesTableSecondaryCellNumberList.size()];
		    for(int record=0;record<companiesTableSecondaryCellNumberList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryCellNumberList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Secondary Email Header in Company Table
		public void validatin_companyListPage_SecondaryEmailHeader() {
			companiesTableSecondaryEmailE.click();
		}

		//Companies Page sorting as per Secondary Email
		public Object[] validating_companyListPage_SortingAsPerSecondaryEmail() {
			Object[] before_Sorting=new Object[companiesTableSecondaryEmailList.size()];
		    for(int record=0;record<companiesTableSecondaryEmailList.size();record++) 
			{
				before_Sorting[record]=companiesTableSecondaryEmailList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Private Or Public  Header in Company Table
		public void validatin_companyListPage_PublicOrPrivateHeader() {
			companiesTablePublicOrPrivateE.click();
		}

		//Companies Page sorting as per Private Or Public
		public Object[] validating_companyListPage_SortingAsPerPrivateOrPublic() {
			Object[] before_Sorting=new Object[companiesTablePublicOrPrivateList.size()];
		    for(int record=0;record<companiesTablePublicOrPrivateList.size();record++) 
			{
				before_Sorting[record]=companiesTablePublicOrPrivateList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Total Number of Employee Header in Company Table
		public void validatin_companyListPage_TotalNumberOfemployeesHeader() {
			companiesTableTotalNumberOfEmployeesE.click();
		}

		//Companies Page sorting as per Total Number of employees
		public Object[] validating_companyListPage_SortingAsPerTotalNumberOfEmployees() {
			Object[] before_Sorting=new Object[companiesTableTotalNumberOfEmployeeList.size()];
		    for(int record=0;record<companiesTableTotalNumberOfEmployeeList.size();record++) 
			{
				before_Sorting[record]=companiesTableTotalNumberOfEmployeeList.get(record).getText();
			}
			return before_Sorting;
		}

		//Companies Page Operating Countries Header in Company Table
		public void validatin_companyListPage_OperatingCountriesHeader() {
			companiesTableOperatingCountriesE.click();
		}

		//Companies Page sorting as per Operating Countries
		public Object[] validating_companyListPage_SortingAsPerOperatingCountries() {
			Object[] before_Sorting=new Object[companiesTableOperatingCountriesList.size()];
		    for(int record=0;record<companiesTableOperatingCountriesList.size();record++) 
			{
				before_Sorting[record]=companiesTableOperatingCountriesList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Operating States Header in Company Table
		public void validatin_companyListPage_OperatingStatesHeader() {
			companiesTableOperatingStatesE.click();
		}

		//Companies Page sorting as per Operating States
		public Object[] validating_companyListPage_SortingAsPerOperatingState() {
			Object[] before_Sorting=new Object[companiesTableOperatingStateList.size()];
		    for(int record=0;record<companiesTableOperatingStateList.size();record++) 
			{
				before_Sorting[record]=companiesTableOperatingStateList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Created At Header in Company Table
		public void validatin_companyListPage_CreatedAtHeader() {
			companiesTableCreatedAtE.click();
		}

		//Companies Page sorting as per Created At
		public Object[] validating_companyListPage_SortingAsPerCreatedAt() {
			Object[] before_Sorting=new Object[companiesTableCreatedAtList.size()];
		    for(int record=0;record<companiesTableCreatedAtList.size();record++) 
			{
				before_Sorting[record]=companiesTableCreatedAtList.get(record).getText();
			}
			return before_Sorting;
		}
		
		//Companies Page Updated At Header in Company Table
		public void validatin_companyListPage_UpdatedAtHeader() {
			companiesTableUpdatedAtE.click();
		}

		//Companies Page sorting as per Updated At
		public Object[] validating_companyListPage_SortingAsPerUpdatedAt() {
			Object[] before_Sorting=new Object[companiesTableUpdatedAtList.size()];
		    for(int record=0;record<companiesTableUpdatedAtList.size();record++) 
			{
				before_Sorting[record]=companiesTableUpdatedAtList.get(record).getText();
			}
			return before_Sorting;
		}
		*/
		
		public List companyListPage_CompanyName_Validation() {
			return companiesTableCompanyNamesList;
		}
				
}
