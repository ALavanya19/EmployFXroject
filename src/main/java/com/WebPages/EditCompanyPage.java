package com.WebPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
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

public class EditCompanyPage extends Base {

	EditCompanyPage(){
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//Edit Company Page Heading Label Element
	@FindBy(xpath="//h1[text()='Edit Company ']")
	WebElement headingLabelTextE;
	
	//Edit Company Page Sub Heading Label Element
	@FindBy(xpath="//h3[text()='Company Details ']")
	WebElement subHeadingLabelTextE;
	
	//CompanyName Element
	@FindBy(xpath="//*[@formcontrolname='name']")
	WebElement companyNameE;
	
	//Business Category Element
		@FindBy(xpath="//*[@formcontrolname='business_category_id']")
		WebElement businessCategoryE;
		    
		     //Business Category Options
		     @FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/mat-option")
		     List<WebElement>businessCategoryOptionsE;
		    
		     //Business Categoryfield
		     @FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div[2]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span/span")
		     WebElement businessCategoryField;
		     
		//Country Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div[3]/app-country-state-selection/div/div[1]/div/mat-form-field/div/div[1]/div[3]/div/input")
		WebElement countryFilterE;
		  
		//246 Countries List
		@FindBy(xpath="/html/body/div[2]/div/div/div/mat-option")
		List<WebElement>countriesList;
		
		//State Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[1]/div[3]/app-country-state-selection/div/div[2]/div/mat-form-field/div/div[1]/div[3]/div/input")
		WebElement stateFilterE;
		
		//States List
		@FindBy(xpath="/html/body/div[2]/div/div/div/mat-option")
		List<WebElement>statesList;
		
		//City Element
		@FindBy(xpath="//*[@formcontrolname='general_city']")
		WebElement cityE;
		
		//Street Address
		@FindBy(xpath="//*[@formcontrolname='general_street_address']")
		WebElement streetAddressE;
		
		//ZipCode Element
		@FindBy(xpath="//*[@formcontrolname='general_zipcode']")
		WebElement zipCodeE;
		
		//WebSite Element
		@FindBy(xpath="//*[@formcontrolname='general_website']")
		WebElement webSiteE;
		
		//Email Element
		@FindBy(xpath="//*[@formcontrolname='email']")
		WebElement emailE;
		
		//Phone Number Element
		@FindBy(xpath="//*[@formcontrolname='general_phone']")
		WebElement phoneNumberE;
		
		//Fax Element
		@FindBy(xpath="//*[@formcontrolname='general_fax']")
		WebElement faxE;
		
		//Choose File
		@FindBy(xpath="//*[@id='fileName']")
		WebElement chooseFileE;
		
		//Upload ogo
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[3]/div[3]/div/div[2]/div/div/input[2]")
		WebElement uploadFileE;
		
		//Primary Title
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[5]/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")
		WebElement primaryTitleE;
		
		//Primary Title list
		@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/mat-option/span")
		List<WebElement>primaryTitleList;
		
		//Primary Contact Name
		@FindBy(xpath="//*[@formcontrolname='primary_contact_name']")
		WebElement primaryContactNameE;
		
		//Primary Country Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[5]/div[3]/app-country-state-selection/div/div[1]/div/mat-form-field/div/div[1]/div[3]/div/input")
		WebElement primaryCountryFilterE;
		
		//Primary Contry List
		@FindBy(xpath="/html/body/div[2]/div/div/div/mat-option[1]/span")
		List<WebElement>primaryCountriesList;
		
		//Primary State Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[5]/div[3]/app-country-state-selection/div/div[2]/div/mat-form-field/div/div[1]/div[3]/div/input")
		WebElement primaryStateFilterE;
		
		//Primary State List
		@FindBy(xpath="/html/body/div[2]/div/div/div/mat-option[1]/span")
		List<WebElement>primaryStatesListE;
		
		//Primary City Element
		@FindBy(xpath="//*[@formcontrolname='primary_city']")
		WebElement primaryCityE;
		
		//Primary Street Address Element
		@FindBy(xpath="//*[@formcontrolname='primary_street_address']")
		WebElement primaryStreetAddressE;
		
		//Primary ZipCode Element
		@FindBy(xpath="//*[@formcontrolname='primary_zipcode']")
		WebElement primaryZipCodeE;
		
		//Primary Phone Number Element
		@FindBy(xpath="//*[@formcontrolname='primary_phone']")
		WebElement primaryPhoneNumberE;
		
		//Primary Fax Element
		@FindBy(xpath="//*[@formcontrolname='primary_fax']")
		WebElement primaryFaxE;
		
		//Primary Cell Number Element
		@FindBy(xpath="//*[@formcontrolname='primary_cell_number']")
		WebElement primaryCellNumberE;
		
		//Primary Email Element
		@FindBy(xpath="//*[@formcontrolname='primary_email']")
		WebElement primaryEmailE;
		
		//Secondary Title Element
		@FindBy(xpath="//*[@formcontrolname='secondary_title']")
		WebElement secondaryTitleE;
		
		//Secondary Title list
		@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/div/mat-option/span")
		List<WebElement>secondaryTitleListE;
		
		//Secondary Contact Name Element
		@FindBy(xpath="//*[@formcontrolname='secondary_contact_name']")
		WebElement secondaryContactNameE;
		
		//Seconday Country Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[9]/div[3]/app-country-state-selection/div/div[1]/div/mat-form-field/div/div[1]/div[3]/div/input")
		WebElement secondaryCountryFilterE;
		
		//Secondary Country input filter
		@FindBy(xpath="/html/body/div[2]/div/div/div/mat-option/span")
		List<WebElement>secondaryCountriesList;
		
		//Secondary State element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[9]/div[3]/app-country-state-selection/div/div[2]/div/mat-form-field/div/div[1]/div[3]/div/input")
		WebElement secondaryStateFilterE;
		
		//Secondary State input filter
		@FindBy(xpath="/html/body/div[2]/div/div/div/mat-option/span")
		List<WebElement>secondaryStatesList;
		
		//Secondary City Element
		@FindBy(xpath="//*[@formcontrolname='secondary_city']")
		WebElement secondaryCityE;
		
		//Secondary Street Address Element
		@FindBy(xpath="//*[@formcontrolname='secondary_street_address']")
		WebElement secondaryStreetAddressE;
		
		//Secondary  ZipCode Element
		@FindBy(xpath="//*[@formcontrolname='secondary_zipcode']")
		WebElement secondaryZipCodeE;
		
		//Secondary Phone Number Element
		@FindBy(xpath="//*[@formcontrolname='secondary_phone']")
		WebElement secondaryPhoneNumberE;
		
		//Secondary Fax Number Element
		@FindBy(xpath="//*[@formcontrolname='secondary_fax']")
		WebElement secondaryFaxE;
		
		//Secondary Cell Number Element
		@FindBy(xpath="//*[@formcontrolname='secondary_cell_number']")
		WebElement secondaryCellNumberE;
		
		//Secondary Email Element
		@FindBy(xpath="//*[@formcontrolname='secondary_email']")
		WebElement secondaryEmailE;
		
		//Public or Private DropDown Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[13]/div[1]/div/mat-form-field/div/div[1]/div[3]/mat-select")
		WebElement publicOrPrivateE;
		
		//public or Private DropDown elements
		@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option/span")
		List<WebElement>publicOrPrivateList;
		
		//Total number of employees Element
		@FindBy(xpath="//*[@formcontrolname='no_of_employees']")
		WebElement totalNumberOfEmployeesE;
		
		//Operating Countries Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[13]/div[3]/div/mat-form-field/div/div[1]/div[3]/mat-select")
		WebElement operatingCountriesE;
		
		//Operating Countries List
		@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option/span")
		List<WebElement>operatingCountriesList;
		
		//Operating States Element
		@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-add-compnay/div[2]/div/div[2]/div/form/div[1]/div/div[13]/div[4]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")
		WebElement operatingStatesE;
		
		//Operating States Element List
		@FindBy(xpath="/html/body/div[2]/div[2]/div/div/div/mat-option/span")
		List<WebElement>operatingStatesListE;
		
		//Cancel Button
		@FindBy(xpath="//*[@class='mat-focus-indicator mt-l-12 mat-stroked-button mat-button-base']")
		WebElement cancelButtonE;
		
		//Save Button
		@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
		WebElement saveButtonE;
	
		
		
		
		//Business Logic
		//Current Url Validation
		public String editCompanyPage_CurrentURL_Validation() {
			return driver.getCurrentUrl();
		}
		
		//Edit Company Page Title Validation
		public String editCompanyPage_Title_Validation() {
			return driver.getTitle();
		}
		
		//Edit Company Page Heading Label Text
		public String editCompanyPage_HeadingLabelText_Validation() {
			return headingLabelTextE.getText();
		}
		
		//Edit Company Page Sub Heading Label Text
		public String editCompanyPage_SubHeadingLabelText_Validation() {
			return subHeadingLabelTextE.getText();
		}
			
		//Edit Company Page With Mandatory fields Validation
		public void editCompanyPage_WithMandatoryField_Validation(List<Object>MandatoryFieldsData,List<Object>operatingCountries,List<Object>operatingStates) throws InterruptedException, AWTException, IOException {
			editCompanyPage_AllFieldsData(MandatoryFieldsData, operatingCountries, operatingStates);
			saveButtonE.click();
			
		}
		
		public void editCompanyPage_AllFieldsSave_Validation(List<Object>AllFieldsData,List<Object>operatingCountries,List<Object>operatingStates) throws InterruptedException, AWTException, IOException {
			
			editCompanyPage_AllFieldsData(AllFieldsData, operatingCountries, operatingStates);
			saveButtonE.click();
			
		}
		
		public void editompanyPage_AllFieldsCancel_Validation(List<Object>AllFieldsData,List<Object>operatingCountries,List<Object>operatingStates) throws InterruptedException, AWTException, IOException {
		    
			editCompanyPage_AllFieldsData(AllFieldsData, operatingCountries, operatingStates);
			cancelButtonE.click();	
		}
		
		public void editCompanyPage_AllFieldsData(List<Object>AllFieldsData,List<Object>operatingCountries,List<Object>operatingStates) throws InterruptedException, AWTException, IOException {
			Actions act=new Actions(driver);
			Robot robot=new Robot();
			WebDriverWait wait=CommonActions.webDriverWaitMethod();
			
			if((boolean)AllFieldsData.get(0).toString().isEmpty()) 
			{
				
			}
			else
			{
				companyNameE.clear();
				companyNameE.sendKeys((CharSequence)AllFieldsData.get(0).toString());
				CommonActions.checkMandatoryFieldValidation(companyNameE);
			}
			
			if((boolean)AllFieldsData.get(1).toString().isEmpty())
			{
			
			}
			else
			{
				businessCategoryE.click();
				for(int i=0;i<businessCategoryOptionsE.size();i++) {
					String actualCategory=businessCategoryOptionsE.get(i).getText();
					if(actualCategory.equals((CharSequence)AllFieldsData.get(1).toString())) {
						businessCategoryOptionsE.get(i).click();
					}
				}
				robot.keyPress(KeyEvent.VK_ESCAPE);
			}
			
			if((Boolean)AllFieldsData.get(2).toString().isEmpty())
			{
			}
			else
			{
			countryFilterE.clear();
			countryFilterE.sendKeys((CharSequence)AllFieldsData.get(2).toString());

			wait.until(ExpectedConditions.visibilityOfAllElements(countriesList));
			countriesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(countryFilterE);
			robot.keyPress(KeyEvent.VK_TAB);
			}
			
			if((Boolean)AllFieldsData.get(3).toString().isEmpty())
			{
			}
			else
			{
			stateFilterE.clear();
			stateFilterE.sendKeys((CharSequence)AllFieldsData.get(3).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(statesList));
			Thread.sleep(1300);
			statesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(stateFilterE);		
			}
			
			if((Boolean)AllFieldsData.get(4).toString().isEmpty())
			{
				
				
			}
			else
			{
			cityE.clear();
			cityE.sendKeys((CharSequence)AllFieldsData.get(4).toString());
			CommonActions.checkMandatoryFieldValidation(cityE);
			}
			
			if((Boolean)AllFieldsData.get(5).toString().isEmpty())
			{
				
			}
			else
			{
			streetAddressE.clear();
			streetAddressE.sendKeys((CharSequence)AllFieldsData.get(5).toString());
			CommonActions.checkMandatoryFieldValidation(streetAddressE);
			}
			
			if((Boolean)AllFieldsData.get(6).toString().isEmpty())
			{
				
			}
			else
			{
			zipCodeE.clear();
			zipCodeE.sendKeys((CharSequence)AllFieldsData.get(6).toString());
			CommonActions.checkMandatoryFieldValidation(zipCodeE);
			}
			
			if((Boolean)AllFieldsData.get(7).toString().isEmpty())
			{
				
			}
			else
			{
				
			webSiteE.clear();
			webSiteE.sendKeys((CharSequence)AllFieldsData.get(7).toString());
			}

			if((Boolean)AllFieldsData.get(9).toString().isEmpty())
			 {
				
			 }
			else
			{
			phoneNumberE.clear();
			phoneNumberE.sendKeys((CharSequence)AllFieldsData.get(9).toString());
			CommonActions.checkMandatoryFieldValidation(phoneNumberE);
			}
			
			if((Boolean)AllFieldsData.get(10).toString().isEmpty())
			{
				
				
			}
			else
			{
			faxE.clear();
			faxE.sendKeys((CharSequence)AllFieldsData.get(10).toString());
			}			
			
			if(AllFieldsData.get(11).toString().isEmpty())
			 {
				
			 }
			else {
			}
			
			if((Boolean)AllFieldsData.get(12).toString().isEmpty())
			{
				
			}
			else
			{	
			
			for(int option=0;option<primaryTitleList.size();option++) {
				String actualTitle=primaryTitleList.get(option).getText();
				if(actualTitle.equalsIgnoreCase((String)AllFieldsData.get(12).toString())) {
					primaryTitleList.get(option).click();
				}
			}
			//CommonActions.checkMandatoryFieldValidation(primaryTitleE);
			}
			
			if((Boolean)AllFieldsData.get(13).toString().isEmpty()) 
			{
			
			}
			else
			{
			primaryContactNameE.clear();
			primaryContactNameE.sendKeys((CharSequence)AllFieldsData.get(13).toString());
			CommonActions.checkMandatoryFieldValidation(primaryContactNameE);
			}
			
			
			if((Boolean)AllFieldsData.get(14).toString().isEmpty()) {
			
			}
			else
			{
			primaryCountryFilterE.clear();
			primaryCountryFilterE.sendKeys((CharSequence)AllFieldsData.get(14).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(primaryCountriesList));
			primaryCountriesList.get(0).click();
			CommonActions.checkMandatoryFieldValidation(primaryCountryFilterE);
			}
			
			if((Boolean)AllFieldsData.get(15).toString().isEmpty())
			{
				
			}
			else
			{
			primaryStateFilterE.clear();
			primaryStateFilterE.sendKeys((CharSequence)AllFieldsData.get(15).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(primaryStatesListE));
			Thread.sleep(1300);
			primaryStatesListE.get(0).click();
			robot.keyPress(KeyEvent.VK_ENTER);
			CommonActions.checkMandatoryFieldValidation(primaryStateFilterE);
			}
			
			if((Boolean)AllFieldsData.get(16).toString().isEmpty())
			{
				
			}
			else
			{
				
			primaryCityE.clear();
			primaryCityE.sendKeys((CharSequence)AllFieldsData.get(16).toString());
			}
			
			if((Boolean)AllFieldsData.get(17).toString().isEmpty())
			{
				
				
			}
			else
			{
			primaryStatesListE.clear();
			primaryStreetAddressE.sendKeys((CharSequence)AllFieldsData.get(17).toString());
			CommonActions.checkMandatoryFieldValidation(primaryStreetAddressE);
			}
			
			if((Boolean)AllFieldsData.get(18).toString().isEmpty())
			{
			
				
			}
			else
			{
			primaryZipCodeE.clear();
			primaryZipCodeE.sendKeys((CharSequence)AllFieldsData.get(18).toString());
			}
			
			if((Boolean)AllFieldsData.get(19).toString().isEmpty()) {
				
				
			}
			else
			{
				
			primaryPhoneNumberE.clear();
			primaryPhoneNumberE.sendKeys((CharSequence)AllFieldsData.get(19).toString());
			CommonActions.checkMandatoryFieldValidation(primaryPhoneNumberE);
			}
			
			if((boolean)AllFieldsData.get(20).toString().isEmpty()) {
				
			}
			else
			{
				
			primaryFaxE.clear();
			primaryFaxE.sendKeys((CharSequence)AllFieldsData.get(20).toString());
			}
			
			if((Boolean)AllFieldsData.get(21).toString().isEmpty())
			{
				
			}
			else
			{
			primaryCellNumberE.clear();
			primaryCellNumberE.sendKeys((CharSequence)AllFieldsData.get(21).toString());
			}
			
			if((boolean)AllFieldsData.get(22).toString().isEmpty()){
				
			}
			else
			{
			
			primaryEmailE.clear();
			primaryEmailE.sendKeys((CharSequence)AllFieldsData.get(22).toString());
			}
			
			if((boolean)AllFieldsData.get(23).toString().isEmpty()) {
					
			}
			else
			{
				
			secondaryTitleE.click();
			for(int option=0;option<secondaryTitleListE.size();option++) {
				String actualTitle=secondaryTitleListE.get(option).getText();
				if(actualTitle.equalsIgnoreCase((String)AllFieldsData.get(23).toString())) {
					secondaryTitleListE.get(option).click();
				}
			}
			}
			
			
			if((boolean)AllFieldsData.get(24).toString().isEmpty()) {
				
					
			}
			else
			{
				
			secondaryContactNameE.clear();
			secondaryContactNameE.sendKeys((CharSequence)AllFieldsData.get(24).toString());
			}
			
			if((boolean)AllFieldsData.get(25).toString().isEmpty())
			{
			
				
			}	
			else
			{
			secondaryCountryFilterE.clear();
			secondaryCountryFilterE.sendKeys((CharSequence)AllFieldsData.get(25).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(secondaryCountriesList));
			secondaryCountriesList.get(0).click();
			}
			
			if((boolean)AllFieldsData.get(26).toString().isEmpty())
			{
			
			}
			else
			{
			secondaryStateFilterE.clear();
			secondaryStateFilterE.sendKeys((CharSequence)AllFieldsData.get(26).toString());
			wait.until(ExpectedConditions.visibilityOfAllElements(secondaryStatesList));
			Thread.sleep(1300);
			secondaryStatesList.get(0).click();
			robot.keyPress(KeyEvent.VK_ENTER);
			}
			
			if((boolean)AllFieldsData.get(27).toString().isEmpty()) {
				
			}
			else
			{
				secondaryCityE.clear();
				secondaryCityE.sendKeys((CharSequence)AllFieldsData.get(27).toString());
			}
			
			if((boolean)AllFieldsData.get(28).toString().isEmpty()) {
			
				
			}
			else
			{
				secondaryStreetAddressE.clear();
				secondaryStreetAddressE.sendKeys((CharSequence)AllFieldsData.get(28).toString());
				
			}
			
			if((boolean)AllFieldsData.get(29).toString().isEmpty())	
			{

			}
			else
			{
				secondaryZipCodeE.clear();
				secondaryZipCodeE.sendKeys((CharSequence)AllFieldsData.get(29).toString());
			}
			
			if((boolean)AllFieldsData.get(30).toString().isEmpty()) {
				
			}
			else
			{
				secondaryPhoneNumberE.clear();
				secondaryPhoneNumberE.sendKeys((CharSequence)AllFieldsData.get(30).toString());
			}
			
			if((boolean)AllFieldsData.get(31).toString().isEmpty())
			{
				
			}
			else
			{
				
			secondaryFaxE.clear();
			secondaryFaxE.sendKeys((CharSequence)AllFieldsData.get(31).toString());
			}
			
			if((boolean)AllFieldsData.get(32).toString().isEmpty())
			{
				
			}
			else
			{
			secondaryCellNumberE.clear();
			secondaryCellNumberE.sendKeys((CharSequence)AllFieldsData.get(32).toString());
			}
			
			if((boolean)AllFieldsData.get(33).toString().isEmpty()) {
				
			}
			else
			{
				secondaryEmailE.clear();
				secondaryEmailE.sendKeys((CharSequence)AllFieldsData.get(33).toString());
			}
			
			if((boolean)AllFieldsData.get(34).toString().isEmpty()) 
			{
				
			}
			else
			{
				publicOrPrivateE.click();
				for(int option=0;option<publicOrPrivateList.size();option++) {
					String actualTitle=publicOrPrivateList.get(option).getText();
					if(actualTitle.equalsIgnoreCase((String)AllFieldsData.get(34).toString())) {
						publicOrPrivateList.get(option).click();
					}
				}
				
			}
			
		
			if((boolean)AllFieldsData.get(35).toString().isEmpty()) {
				
			}
			else
			{
				totalNumberOfEmployeesE.clear();
				totalNumberOfEmployeesE.sendKeys((CharSequence)AllFieldsData.get(35).toString());
				CommonActions.checkMandatoryFieldValidation(totalNumberOfEmployeesE);
			}
			
			System.out.println();
			if(operatingCountries.size()==0) {
			
			}
			else
			{
				
				operatingCountriesE.click();
				for(int i=0;i<operatingCountriesList.size();i++) {
					operatingCountriesList.get(i).click();
				}
				
				for(int countriesOption=0;countriesOption<operatingCountriesList.size();countriesOption++) {
					String actualOperatingCountries=operatingCountriesList.get(countriesOption).getText();
					for(int operatingCountriesOptions=0;operatingCountriesOptions<operatingCountries.size();operatingCountriesOptions++) {
					if(actualOperatingCountries.equalsIgnoreCase((String)operatingCountries.get(operatingCountriesOptions).toString())){
						operatingCountriesList.get(countriesOption).click();
					}
					}
				}
				
			}
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyPress(KeyEvent.VK_ESCAPE);
			
			Thread.sleep(2500);
			
			if(operatingStates.size()==0)
			{
			
			}
			else
			{
				operatingStatesE.click();
				for(int i=0;i<operatingStatesListE.size();i++) {
					operatingStatesListE.get(i).click();
				}
				
				wait.until(ExpectedConditions.visibilityOfAllElements(operatingStatesListE));
				for(int statesOption=0;statesOption<operatingStatesListE.size();statesOption++) {
					String actualOperatingStates=operatingStatesListE.get(statesOption).getText();
					for(int operatingStatesOptions=0;operatingStatesOptions<operatingStates.size();operatingStatesOptions++) {
						if(actualOperatingStates.equalsIgnoreCase((String)operatingStates.get(operatingStatesOptions).toString())) {
							operatingStatesListE.get(statesOption).click();
						}
					}
				}
				
			}
			
			robot.keyPress(KeyEvent.VK_ESCAPE);
			
		}
}
