package com.WebPages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class CompanyDetailsPage extends Base{

	CompanyDetailsPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	//
	/*@FindBy(xpath="//div[@class='form-group']//p")
	List<WebElement>companyDetailsList;*/
	
	//Back Button
	@FindBy(xpath="//*[@class='far fa-arrow-alt-circle-left']")
	WebElement backButtonE;
	
	//Heading label text
	@FindBy(xpath="//h1[text()='Company Details']")
	WebElement companyDetailsHeadingLabelText;
	
	//company Name
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[1]/div[2]/div/p")
	WebElement companyNameData;
	
	//Business Category 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[1]/div[3]/div/p")
	WebElement businessCategoryData;
	
	//WebSite 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[1]/div[4]/div/p")
	WebElement websiteData;
	
	//Country
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[2]/div[1]/div/p")
	WebElement countryData;
	
	//State 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[2]/div[1]/div/p")
	WebElement stateData;
	
	//City 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[2]/div[3]/div/p")
	WebElement cityData;
	
	//Street Address
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[2]/div[4]/div/p")
	WebElement streetAddressData;
	
	//ZipCode
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[3]/div[1]/div/p")
	WebElement zipCodeData;
	
	//Email
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[3]/div[1]/div/p")
	WebElement emailData;
	
	//Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[3]/div[3]/div/p")
	WebElement phoneNumberData;
	
	//Fax 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[3]/div[3]/div/p")
	WebElement faxData;
	
	//primary title
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[5]/div[1]/div/p/span[1]")
	WebElement primaryTitleData;
	
	//Contact Name
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[5]/div[1]/div/p/span[2]")
	WebElement primaryContactNameData;
	
	//Primary Country
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[5]/div[2]/div/p")
	WebElement primaryCountryData;
	
	//primary State
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[5]/div[3]/div/p")
	WebElement primaryStateData;
	
	//primary city
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[5]/div[4]/div/p")
	WebElement primaryCityData;
	
	//Primary Street Address
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[5]/div[4]/div/p")
	WebElement primaryStreetAddressData;
	
	//primary ZipCode
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[6]/div[2]/div/p")
	WebElement primaryZipCodeData;
	
	//primary Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[6]/div[3]/div/p")
	WebElement primaryPhoneNumberData;
	
	//primary Fax
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[6]/div[4]/div/p")
	WebElement primaryFaxData;
	
	//primary cell Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[7]/div[1]/div/p")
	WebElement primaryCellNumberData;
	
	//primary Email
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[7]/div[1]/div/p")
	WebElement primaryEmailData;
	
	//Secondary Contact Name
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[7]/div[1]/div/p")
	WebElement secondaryContactNameData;
	
	//Secondary Country
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[7]/div[1]/div/p")
	WebElement secondaryCountryData;
	
	//Secondary State
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[7]/div[1]/div/p")
	WebElement secondaryStateData;
	
	//Secondary City
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[9]/div[4]/div/p")
	WebElement secondaryCityData;
	
	//Secondary Street Address
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[1]/div/p")
	WebElement secondaryStreetAddressData;
	
	//Secondary ZipCode
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[2]/div/p")
	WebElement secondaryZipCodeData;
	
	//Secondary Phone Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[2]/div/p")
	WebElement secondaryPhoneNumberData;
	
	//Secondary Fax
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[4]/div/p")
	WebElement secondaryFaxData;
	
	//Secondary Cell Number
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[5]/div[1]/div/p")
	WebElement secondaryCellNumberData;
	
	//Secondary Email
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[5]/div[2]/div/p")
	WebElement secondaryEmailData;
	
	//Private or public 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[10]/div[5]/div[2]/div/p")
	WebElement privateOrPublicData;
	
	//Total number of employees 
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[12]/div[2]/div/p")
	WebElement totalNumberOfEmployeesData;
	
	//Operating Countries Data
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[12]/div[3]/div/div//span")
	List<WebElement>operatingCountriesData;
	
	//operating States
	@FindBy(xpath="/html/body/app-root/div/mat-drawer-container/mat-drawer-content/div/div/app-company-details/div[2]/div[12]/div[4]/div/div//span")
	List<WebElement>operatingStatesData;
	
	//Image Element
	@FindBy(xpath="//*[@class='company-logo']//img")
	WebElement companyPageLogoE;
	

	
	//Business Logic
	public List companyDetails_Validation() {
		
		List<Object>companyDetailsData=new ArrayList<Object>();
		
		System.out.println(companyNameData.getText());
		companyDetailsData.add(0, companyNameData.getText());
		companyDetailsData.add(1, businessCategoryData.getText());
		companyDetailsData.add(2, countryData.getText());
		companyDetailsData.add(3, stateData.getText());
		companyDetailsData.add(4, cityData.getText());
		companyDetailsData.add(5, streetAddressData.getText());
		companyDetailsData.add(6, zipCodeData.getText());
		companyDetailsData.add(7, websiteData.getText());
		companyDetailsData.add(8, emailData.getText());
		companyDetailsData.add(9, phoneNumberData.getText());
		companyDetailsData.add(10, faxData.getText());
		companyDetailsData.add(11, companyPageLogoE.getAttribute("src"));
		companyDetailsData.add(12, primaryTitleData.getText());
		companyDetailsData.add(13, primaryContactNameData.getText());
		companyDetailsData.add(14, primaryCountryData.getText());
		companyDetailsData.add(15, primaryStateData.getText());
		companyDetailsData.add(16, primaryCityData.getText());
		companyDetailsData.add(17, primaryStreetAddressData.getText());
		companyDetailsData.add(18, primaryZipCodeData.getText());
		companyDetailsData.add(19, primaryPhoneNumberData.getText());
		companyDetailsData.add(20, primaryFaxData.getText());
		companyDetailsData.add(21, primaryCellNumberData.getText());
		companyDetailsData.add(22, primaryEmailData.getText());
		companyDetailsData.add(23, secondaryContactNameData.getText());
		companyDetailsData.add(24, secondaryCountryData.getText());
		companyDetailsData.add(25, secondaryStateData.getText());
		companyDetailsData.add(26, secondaryCityData.getText());
		companyDetailsData.add(27, secondaryStreetAddressData.getText());
		companyDetailsData.add(28, secondaryZipCodeData.getText());
		companyDetailsData.add(29, secondaryPhoneNumberData.getText());
		companyDetailsData.add(30, secondaryFaxData.getText());
		companyDetailsData.add(31, secondaryCellNumberData.getText());
		companyDetailsData.add(32, secondaryEmailData.getText());
		companyDetailsData.add(33, privateOrPublicData.getText());
		companyDetailsData.add(34, totalNumberOfEmployeesData.getText());
		return companyDetailsData;
	}
	
	
	
	public void vali(String compamyName) {
		System.out.println(secondaryEmailData.getText().toString());
	}
	
	
	public String validating_companyDetailsPage_CurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String validating_CompanyDetailsPage_Title() {
		return driver.getTitle();
	}
	
	public String validating_CompanyDetailsPage_HeadingLabelText() {
		return companyDetailsHeadingLabelText.getText();
	}
	
	public CompanyListPage validating_BackButton() {
		backButtonE.click();
		return new CompanyListPage();
	}
	
}
