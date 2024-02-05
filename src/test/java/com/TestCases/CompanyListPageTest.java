package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;

import com.WebPages.CompanyListPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;

public class CompanyListPageTest extends Base{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	CompanyListPage companyListPage;
	
	@BeforeMethod
	public void companiesPgae_SetUp() {
		setUp();
		loginPage=new LoginPage();
		dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		companyListPage=dashboardPage.validating_CompaniesOption();
	}
	
	@AfterMethod
	public void companyListPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	@Test(priority = 1, description = "CompanyList Page Current Url Validation")
	public void validating_companyListPage_CurrentUrl_Test() {
		test=extent.createTest("companyList Current Url Validation");
		test.info("Validating for companyList Current Url");
		String actual_companyListPage_CurrentUrl=companyListPage.validating_companyListPage_CurrentUrl();
		String axpected_companyListPage_CurrentUrl="company";
		if(actual_companyListPage_CurrentUrl.contains(axpected_companyListPage_CurrentUrl))
		{
			test.pass("companyList Current Url Validation Successfull");
			Log.info("companyList Current Url Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("companyList Current Url Validation Unsuccessfull");
			Log.info("companyList Current Url Validation Unssuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 2, description = "companyList title Validation")
	public void validating_companyListPage_Title_Test() {
		test=extent.createTest("companyList Title Validation");
		test.info("Validation for companyList Title Validation");
		String actual_companyListPage_Title=companyListPage.validating_companyListPage_Title();
		String expected_companyListPage_Title="EmployFX - Employee Management";
		if(actual_companyListPage_Title.equals(expected_companyListPage_Title))
		{
			test.pass("companyList Title Validation Successfull");
			test.info("companyList Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("companyList Title Validation Unsuccessfull");
			test.info("companyList Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "companyList Heading Validation")
	public void validating_companyListPage_HeadingLabelText_Test() {
		test=extent.createTest("companyList Heading Validation");
		test.info("Validation for companyList Heading Label Text");
		String actual_companyListPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_companyListPage_HeadingLabelText="Company List";
		if(actual_companyListPage_HeadingLabelText.equals(expected_companyListPage_HeadingLabelText))
		{
			test.pass("companyList Heading Label Text Validation successfull");
			Log.info("companyList Heading Label Text Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("companyList Heading Label Text Validation Unsuccessfull");
			Log.info("companyList Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 4, description = "companyList Search Option Validation")
	public void validating_companyListPage_SearchOption_Test() {
		test=extent.createTest("companyList Search Option Validation");
		test.info("Validating companyList Search Option");
		int totalNumberOfecords=companyListPage.validating_companyListPage_SearchOption("Andorra");
		if(totalNumberOfecords==-1)
		{
			test.pass("No Records Found");
			Log.info("No Records Found - FAIL");
		}
		else if(totalNumberOfecords==0)
		{
			Assert.fail("companyList Search Option validation Successfull & No Records displayed");
			Log.info("companyList Search Option validation Successfull & No Records displayed - PASS");
		}
		else
		{
			test.pass("companyList Search Option validation Successfull & Records displayed successfully");
			Log.info("companyList Search Option validation Successfull & Records displayed successfully - PASS");
			
		}

	}
	
	@Test(priority = 5, description = "companyList Add Company Button Validation")
	public void validating_companyListPage_AddCompanyButton_Test() {
		test=extent.createTest("companyList Add Company Button Validation");
		test.info("Validation for companyList Add Company Button");
		companyListPage.validating_companyListPage_AddCompanyButton();
		test.info("Navigated to Add Company Page Successfully");
		Log.info("Navigated to Add Company Page Successfully");
	}
	
	/*@Test(priority = 6, description = "companyList Company List Table As per Company Name validation")
	public void validating_CompaiesPage_SortingAsPerCompanyName_Test() {
		test=extent.createTest("companyList Company List Table as per Company Name Validation");
		test.info("Validation of companyList Company List Table as per Company Name");
		Object[] before_Sorting=companyListPage.validatin_companyListPage_SortingAsPerCompanyName();
		companyListPage.validatin_companyListPage_CompanyNameHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validatin_companyListPage_SortingAsPerCompanyName();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Company Name is not sorted");
			Log.info("companyList Company List Table as per Company Name is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Company Name is not sorted");
			Log.info("companyList Company List Table as per Company Name is not sorted - PASS");
		}
	}
	
	@Test(priority = 7, description = "companyList Company List Table As per Business Category validation")
	public void validating_CompaiesPage_SortingAsPerBusinessCategory_Test() {
		test=extent.createTest("companyList Company List Table as per Business Category Validation");
		test.info("Validation of companyList Company List Table as per Business Category");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerBusinessCategory();
		companyListPage.validatin_companyListPage_BusinessCategoryHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerBusinessCategory();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Business Category is not sorted");
			Log.info("companyList Company List Table as per Business Category is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Business Category is not sorted");
			Log.info("companyList Company List Table as per Business Category is not sorted - PASS");
		}
	}
	
	@Test(priority = 8, description = "companyList Company List Table As per Country validation")
	public void validating_companyListPage_SortingAsPerCountry_Test() {
		test=extent.createTest("companyList Company List Table as per Country Validation");
		test.info("Validation of companyList Company List Table as per Country Name");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerCountry();
		companyListPage.validatin_companyListPage_CountryHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerCountry();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Country is not sorted");
			Log.info("companyList Company List Table as per Country is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Country is not sorted");
			Log.info("companyList Company List Table as per Country is not sorted - PASS");
		}
	}

	@Test(priority = 9, description = "companyList Company List Table As per State validation")
	public void validating_companyListPage_SortingAsPerState_Test() {
		test=extent.createTest("companyList Company List Table as per State Validation");
		test.info("Validation of companyList Company List Table as per State");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerState();
		companyListPage.validatin_companyListPage_stateHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerState();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per State is not sorted");
			Log.info("companyList Company List Table as per State is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per State is not sorted");
			Log.info("companyList Company List Table as per State is not sorted - PASS");
		}
	}
	
	@Test(priority = 10, description = "companyList Company List Table As per City validation")
	public void validating_companyListPage_SortingAsPerCity_Test() {
		test=extent.createTest("companyList Company List Table as per City Validation");
		test.info("Validation of companyList Company List Table as per City");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerCity();
		companyListPage.validatin_companyListPage_CityHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerCity();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per City is not sorted");
			Log.info("companyList Company List Table as per City is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per City is not sorted");
			Log.info("companyList Company List Table as per City is not sorted - PASS");
		}
	}
	
	@Test(priority = 11, description = "companyList Company List Table As per Street Address validation")
	public void validating_companyListPage_SortingAsPerStreetAddress_Test() {
		test=extent.createTest("companyList Company List Table as per Street Address Validation");
		test.info("Validation of companyList Company List Table as per Street Address");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerStreetAddress();
		companyListPage.validatin_companyListPage_StreetAddressHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerStreetAddress();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Street Address is not sorted");
			Log.info("companyList Company List Table as per Street Address is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Street Address is not sorted");
			Log.info("companyList Company List Table as per Street Address is not sorted - PASS");
		}
	}
	
	@Test(priority = 12, description = "companyList Company List Table As per ZipCode validation")
	public void validating_companyListPage_SortingAsPerZipCode_Test() {
		test=extent.createTest("companyList Company List Table as per ZipCode Validation");
		test.info("Validation of companyList Company List Table as per ZipCode");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerZipCode();
		companyListPage.validatin_companyListPage_ZipCodeHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerZipCode();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per ZipCode is not sorted");
			Log.info("companyList Company List Table as per ZipCode is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per ZipCode is not sorted");
			Log.info("companyList Company List Table as per ZipCode is not sorted - PASS");
		}
	}
	
	@Test(priority = 13, description = "companyList Company List Table As per WebSite validation")
	public void validating_companyListPage_SortingAsPerWebSite_Test() {
		test=extent.createTest("companyList Company List Table as per Website Validation");
		test.info("Validation of companyList Company List Table as per Website");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerWebSite();
		companyListPage.validatin_companyListPage_WebSiteHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerWebSite();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per WebSite is not sorted");
			Log.info("companyList Company List Table as per WebSite is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per WebSite is not sorted");
			Log.info("companyList Company List Table as per WebSite is not sorted - PASS");
		}
	}
	
	@Test(priority = 14, description = "companyList Company List Table As per Email validation")
	public void validating_companyListPage_SortingAsPerEmail_Test() {
		test=extent.createTest("companyList Company List Table as per Email Validation");
		test.info("Validation of companyList Company List Table as per Email");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerEmail();
		companyListPage.validatin_companyListPage_EmailHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerEmail();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Email is not sorted");
			Log.info("companyList Company List Table as per Email is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Email is not sorted");
			Log.info("companyList Company List Table as per Email is not sorted - PASS");
		}
	}
	
	@Test(priority = 15, description = "companyList Company List Table As per Phone Number validation")
	public void validating_companyListPage_SortingAsPerPhoneNumber_Test() {
		test=extent.createTest("companyList Company List Table as per Phone Number Validation");
		test.info("Validation of companyList Company List Table as per Phone Number");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPhoneNumber();
		companyListPage.validatin_companyListPage_PhoneNumberHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPhoneNumber();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Phone Number is not sorted");
			Log.info("companyList Company List Table as per Phone Number is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Phone Number is not sorted");
			Log.info("companyList Company List Table as per Phone Number is not sorted - PASS");
		}
	}
	
	@Test(priority = 16, description = "companyList Company List Table As per Fax validation")
	public void validating_companyListPage_SortingAsPerFax_Test() {
		test=extent.createTest("companyList Company List Table as per Fax Validation");
		test.info("Validation of companyList Company List Table as per Fax");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerFax();
		companyListPage.validatin_companyListPage_FaxHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerFax();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Fax is not sorted");
			Log.info("companyList Company List Table as per Fax is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Fax is not sorted");
			Log.info("companyList Company List Table as per Fax is not sorted - PASS");
		}
	}
	
	@Test(priority = 17, description = "companyList Company List Table As per Attachment validation")
	public void validating_companyListPage_SortingAsPerAttachment_Test() {
		test=extent.createTest("companyList Company List Table as per Attachment Validation");
		test.info("Validation of companyList Company List Table as per Attachment");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerAttachment();
		companyListPage.validatin_companyListPage_AttachmentHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerAttachment();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Attachment is not sorted");
			Log.info("companyList Company List Table as per Attachment is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Attachment is not sorted");
			Log.info("companyList Company List Table as per Attachment is not sorted - PASS");
		}
	}
	
	@Test(priority = 18, description = "companyList Company List Table As per Primary Title validation")
	public void validating_companyListPage_SortingAsPerPrimaryTitle_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Title Validation");
		test.info("Validation of companyList Company List Table as per Primary Title");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryTitle();
		companyListPage.validatin_companyListPage_PrimaryTitleHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryTitle();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Title is not sorted");
			Log.info("companyList Company List Table as per Primary Title is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Title is not sorted");
			Log.info("companyList Company List Table as per Primary Title is not sorted - PASS");
		}
	}
	
	@Test(priority = 19, description = "companyList Company List Table As per Primary Contact Name validation")
	public void validating_companyListPage_SortingAsPerPrimaryContactName_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Company Name Validation");
		test.info("Validation of companyList Company List Table as per Primary Company Name");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryContactName();
		companyListPage.validatin_companyListPage_PrimaryContactNameHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryContactName();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Contact Name is not sorted");
			Log.info("companyList Company List Table as per Primary Contact Name is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Contact Name is not sorted");
			Log.info("companyList Company List Table as per Primary Contact Name is not sorted - PASS");
		}
	}
	
	@Test(priority = 20, description = "companyList Company List Table As per Primary Country validation")
	public void validating_companyListPage_SortingAsPerPrimaryCountry_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Country Validation");
		test.info("Validation of companyList Company List Table as per Primary Country");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryCountry();
		companyListPage.validatin_companyListPage_PrimaryCountryHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryCountry();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Country is not sorted");
			Log.info("companyList Company List Table as per Primary Country is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Country is not sorted");
			Log.info("companyList Company List Table as per Primary Country is not sorted - PASS");
		}
	}
	
	@Test(priority = 21, description = "companyList Company List Table As per Primary State validation")
	public void validating_companyListPage_SortingAsPerPrimaryState_Test() {
		test=extent.createTest("companyList Company List Table as per Primary State Validation");
		test.info("Validation of companyList Company List Table as per Primary State");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryState();
		companyListPage.validatin_companyListPage_PrimaryStateHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryState();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary State is not sorted");
			Log.info("companyList Company List Table as per Primary State is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary State is not sorted");
			Log.info("companyList Company List Table as per Primary State is not sorted - PASS");
		}
	}
	
	@Test(priority = 22, description = "companyList Company List Table As per Primary City validation")
	public void validating_companyListPage_SortingAsPerPrimaryCity_Test() {
		test=extent.createTest("companyList Company List Table as per Primary City Validation");
		test.info("Validation of companyList Company List Table as per Primary City");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryCity();
		companyListPage.validatin_companyListPage_PrimaryCityHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryCity();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary City is not sorted");
			Log.info("companyList Company List Table as per Primary City is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary City is not sorted");
			Log.info("companyList Company List Table as per Primary City is not sorted - PASS");
		}
	}
	
	@Test(priority = 23, description = "companyList Company List Table As per Primary Street Address validation")
	public void validating_companyListPage_SortingAsPerPrimaryStreetAddress_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Street Address Validation");
		test.info("Validation of companyList Company List Table as per Primary Street Address");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryStreetAddress();
		companyListPage.validatin_companyListPage_PrimaryStreetAddressHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryStreetAddress();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Street Address is not sorted");
			Log.info("companyList Company List Table as per Primary Street Address is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Street Address is not sorted");
			Log.info("companyList Company List Table as per Primary Street Address is not sorted - PASS");
		}
	}
	
	@Test(priority = 24, description = "companyList Company List Table As per Primary ZipCode validation")
	public void validating_companyListPage_SortingAsPerPrimaryZipCode_Test() {
		test=extent.createTest("companyList Company List Table as per Primary ZipCode Validation");
		test.info("Validation of companyList Company List Table as per Primary ZipCode");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryZipCode();
		companyListPage.validatin_companyListPage_PrimaryZipCodeHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryZipCode();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary ZipCode is not sorted");
			Log.info("companyList Company List Table as per Primary ZipCode is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary ZipCode is not sorted");
			Log.info("companyList Company List Table as per Primary ZipCode is not sorted - PASS");
		}
	}
	
	@Test(priority = 25, description = "companyList Company List Table As per Primary Phone Number validation")
	public void validating_companyListPage_SortingAsPerPrimaryPhoneNumber_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Phone Number Validation");
		test.info("Validation of companyList Company List Table as per Primary Phone Numbee");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryPhoneNumber();
		companyListPage.validatin_companyListPage_PrimaryPhoneNumberHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryPhoneNumber();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Phone Number is not sorted");
			Log.info("companyList Company List Table as per Primary Phone Number is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Phone Number is not sorted");
			Log.info("companyList Company List Table as per Primary Phone Number is not sorted - PASS");
		}
	}
	
	@Test(priority = 26, description = "companyList Company List Table As per Primary Fax validation")
	public void validating_companyListPage_SortingAsPerPrimaryFax_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Fax Validation");
		test.info("Validation of companyList Company List Table as per Primary Fax");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryFax();
		companyListPage.validatin_companyListPage_PrimaryFaxHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryFax();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Fax is not sorted");
			Log.info("companyList Company List Table as per Primary Fax is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Fax is not sorted");
			Log.info("companyList Company List Table as per Primary Fax is not sorted - PASS");
		}
	}
	
	@Test(priority = 27, description = "companyList Company List Table As per Cell Number validation")
	public void validating_companyListPage_SortingAsPerPrimaryCellNumber_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Cell Number Validation");
		test.info("Validation of companyList Company List Table as per Primary Cell Number");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryCellNumber();
		companyListPage.validatin_companyListPage_PrimaryCellNumberHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryCellNumber();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Cell Number is not sorted");
			Log.info("companyList Company List Table as per Primary Cell Number is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Cell Number is not sorted");
			Log.info("companyList Company List Table as per Primary Cell Number is not sorted - PASS");
		}
	}
	
	@Test(priority = 27, description = "companyList Company List Table As per Primary Email validation")
	public void validating_companyListPage_SortingAsPerPrimaryEmail_Test() {
		test=extent.createTest("companyList Company List Table as per Primary Email Validation");
		test.info("Validation of companyList Company List Table as per Primary Email");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryEmail();
		companyListPage.validatin_companyListPage_PrimaryEmailHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrimaryEmail();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Primary Email is not sorted");
			Log.info("companyList Company List Table as per Primary Email is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Primary Email is not sorted");
			Log.info("companyList Company List Table as per Primary Email is not sorted - PASS");
		}
	}
	
	@Test(priority = 28, description = "companyList Company List Table As per Secondary Title validation")
	public void validating_companyListPage_SortingAsPerSecondaryTitle_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Title Validation");
		test.info("Validation of companyList Company List Table as per Secondary Title");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryTitle();
		companyListPage.validatin_companyListPage_SecondaryTitleHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryTitle();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Title is not sorted");
			Log.info("companyList Company List Table as per Secondary Title is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Title is not sorted");
			Log.info("companyList Company List Table as per Secondary Title is not sorted - PASS");
		}
	}
	
	@Test(priority = 29, description = "companyList Company List Table As per Secondary Contact Name validation")
	public void validating_companyListPage_SortingAsPerSecondaryContactName_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Contact Name Validation");
		test.info("Validation of companyList Company List Table as per Secondary Contact Name");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryContactName();
		companyListPage.validatin_companyListPage_SecondaryContactNameHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryContactName();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Contact Name is not sorted");
			Log.info("companyList Company List Table as per Secondary Contact Name is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Contact Name is not sorted");
			Log.info("companyList Company List Table as per Secondary Contact Name is not sorted - PASS");
		}
	}
	
	@Test(priority = 30, description = "companyList Company List Table As per Secondary Country validation")
	public void validating_companyListPage_SortingAsPerSecondaryCountry_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Country Validation");
		test.info("Validation of companyList Company List Table as per Secondary Country");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryCountry();
		companyListPage.validatin_companyListPage_SecondaryCountryHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryCountry();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Country is not sorted");
			Log.info("companyList Company List Table as per Secondary Country is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Country is not sorted");
			Log.info("companyList Company List Table as per Secondary Country is not sorted - PASS");
		}
	}
	
	@Test(priority = 31, description = "companyList Company List Table As per Secondary State validation")
	public void validating_companyListPage_SortingAsPerSecondaryState_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary State Validation");
		test.info("Validation of companyList Company List Table as per Secondary State");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryState();
		companyListPage.validatin_companyListPage_SecondaryStateHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryState();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary State is not sorted");
			Log.info("companyList Company List Table as per Secondary State is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary State is not sorted");
			Log.info("companyList Company List Table as per Secondary State is not sorted - PASS");
		}
	}
	
	@Test(priority = 32, description = "companyList Company List Table As per Secondary City validation")
	public void validating_companyListPage_SortingAsPerSecondaryCity_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary City Validation");
		test.info("Validation of companyList Company List Table as per Secondary City");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryCity();
		companyListPage.validatin_companyListPage_SecondaryCityHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryCity();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary City is not sorted");
			Log.info("companyList Company List Table as per Secondary City is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary City is not sorted");
			Log.info("companyList Company List Table as per Secondary City is not sorted - PASS");
		}
	}
	
	@Test(priority = 33, description = "companyList Company List Table As per Secondary Street Address validation")
	public void validating_companyListPage_SortingAsPerSecondaryStreetAddress_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Street Address Validation");
		test.info("Validation of companyList Company List Table as per Secondary Street Address");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryStreetAddress();
		companyListPage.validatin_companyListPage_SecondaryStreetAddressHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryStreetAddress();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Street Address is not sorted");
			Log.info("companyList Company List Table as per Secondary Street Address is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Street Address is not sorted");
			Log.info("companyList Company List Table as per Secondary Street Address is not sorted - PASS");
		}
	}
	
	@Test(priority = 34, description = "companyList Company List Table As per Secondary ZipCode validation")
	public void validating_companyListPage_SortingAsPerSecondaryZipCode_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary ZipCode Validation");
		test.info("Validation of companyList Company List Table as per Secondary ZipCode");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryZipCode();
		companyListPage.validatin_companyListPage_SecondaryStreetAddressHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryZipCode();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary ZipCode is not sorted");
			Log.info("companyList Company List Table as per Secondary ZipCode is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary ZipCode is not sorted");
			Log.info("companyList Company List Table as per Secondary ZipCode is not sorted - PASS");
		}
	}
	
	@Test(priority = 34, description = "companyList Company List Table As per Secondary Phone Number validation")
	public void validating_companyListPage_SortingAsPerSecondaryPhoneNumber_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Phone Number Validation");
		test.info("Validation of companyList Company List Table as per Secondary Phone Number");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryPhoneNumber();
		companyListPage.validatin_companyListPage_SecondaryStreetAddressHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryPhoneNumber();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Phone Number is not sorted");
			Log.info("companyList Company List Table as per Secondary Phone Number is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Phone Number is not sorted");
			Log.info("companyList Company List Table as per Secondary Phone Number is not sorted - PASS");
		}
	}
	
	@Test(priority = 35, description = "companyList Company List Table As per Secondary Fax validation")
	public void validating_companyListPage_SortingAsPerSecondaryFax_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Fax Validation");
		test.info("Validation of companyList Company List Table as per Secondary Fax");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryFax();
		companyListPage.validatin_companyListPage_SecondaryFaxHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryFax();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Fax is not sorted");
			Log.info("companyList Company List Table as per Secondary Fax is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Fax is not sorted");
			Log.info("companyList Company List Table as per Secondary Fax is not sorted - PASS");
		}
	}
	
	@Test(priority = 36, description = "companyList Company List Table As per Secondary Cell Number validation")
	public void validating_companyListPage_SortingAsPerSecondaryCellNumber_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Cell Number Validation");
		test.info("Validation of companyList Company List Table as per Secondary Cell Number");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryCellNumber();
		companyListPage.validatin_companyListPage_SecondaryFaxHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryCellNumber();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Cell Number is not sorted");
			Log.info("companyList Company List Table as per Secondary Cell Number is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Cell Number is not sorted");
			Log.info("companyList Company List Table as per Secondary Cell Number is not sorted - PASS");
		}
	}
	
	@Test(priority = 37, description = "companyList Company List Table As per Secondary Email validation")
	public void validating_companyListPage_SortingAsPerSecondaryEmail_Test() {
		test=extent.createTest("companyList Company List Table as per Secondary Email Validation");
		test.info("Validation of companyList Company List Table as per Secondary Email");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryEmail();
		companyListPage.validatin_companyListPage_SecondaryEmailHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerSecondaryEmail();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Secondary Email is not sorted");
			Log.info("companyList Company List Table as per Secondary Email is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Secondary Email is not sorted");
			Log.info("companyList Company List Table as per Secondary Email is not sorted - PASS");
		}
	}
	
	@Test(priority = 37, description = "companyList Company List Table As per Public Or Private validation")
	public void validatin_companyListPage_PublicOrPrivateHeader_Test() {
		test=extent.createTest("companyList Company List Table as per Public Or Private Validation");
		test.info("Validation of companyList Company List Table as per Public Or Private");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrivateOrPublic();
		companyListPage.validatin_companyListPage_PublicOrPrivateHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerPrivateOrPublic();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Public Or Private is not sorted");
			Log.info("companyList Company List Table as per Public Or Private is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Public Or Private is not sorted");
			Log.info("companyList Company List Table as per Public Or Private is not sorted - PASS");
		}
	}
	
	@Test(priority = 38, description = "companyList Company List Table As per Total Number of employees validation")
	public void validating_companyListPage_SortingAsPerTotalNumberOfEmployees_Test() {
		test=extent.createTest("companyList Company List Table as per Total number of employees Validation");
		test.info("Validation of companyList Company List Table as per Total number of employees ");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerTotalNumberOfEmployees();
		companyListPage.validatin_companyListPage_TotalNumberOfemployeesHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerTotalNumberOfEmployees();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Total Number of Employees is not sorted");
			Log.info("companyList Company List Table as per Total Number of Employees is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Total Number of Employees is not sorted");
			Log.info("companyList Company List Table as per Total Number of Employees is not sorted - PASS");
		}
	}
	
	@Test(priority = 39, description = "companyList Company List Table As per Operating Countries validation")
	public void validating_companyListPage_SortingAsPerOperatingCountries_Test() {
		test=extent.createTest("companyList Company List Table as per Operating Countries Validation");
		test.info("Validation of companyList Company List Table as per Operating Countries ");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerOperatingCountries();
		companyListPage.validatin_companyListPage_OperatingCountriesHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerOperatingCountries();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Operating Countries is not sorted");
			Log.info("companyList Company List Table as per Operating Countries is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Operating Countries is not sorted");
			Log.info("companyList Company List Table as per Operating Countries is not sorted - PASS");
		}
	}
	
	@Test(priority = 39, description = "companyList Company List Table As per Operating State validation")
	public void validating_companyListPage_SortingAsPerOperatingState_Test() {
		test=extent.createTest("companyList Company List Table as per Operating State Validation");
		test.info("Validation of companyList Company List Table as per Operating State");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerOperatingState();
		companyListPage.validatin_companyListPage_OperatingStatesHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerOperatingState();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Operating State is not sorted");
			Log.info("companyList Company List Table as per Operating State is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Operating State is not sorted");
			Log.info("companyList Company List Table as per Operating State is not sorted - PASS");
		}
	}
	
	@Test(priority = 40, description = "companyList Company List Table As per Created At validation")
	public void validating_companyListPage_SortingAsPerCreatedAt_Test() {
		test=extent.createTest("companyList Company List Table as per Created At Validation");
		test.info("Validation of companyList Company List Table as per Created At");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerCreatedAt();
		companyListPage.validatin_companyListPage_CreatedAtHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerCreatedAt();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Created At is not sorted");
			Log.info("companyList Company List Table as per Created At is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Created At is not sorted");
			Log.info("companyList Company List Table as per Created At is not sorted - PASS");
		}
	}
	
	@Test(priority = 41, description = "companyList Company List Table As per Updated At validation")
	public void validating_companyListPage_SortingAsPerUpdatedAt_Test() {
		test=extent.createTest("companyList Company List Table as per Updated At Validation");
		test.info("Validation of companyList Company List Table as per Updated At");
		Object[] before_Sorting=companyListPage.validating_companyListPage_SortingAsPerUpdatedAt();
		companyListPage.validatin_companyListPage_UpdatedAtHeader();
		Arrays.sort(before_Sorting);
		Object[] after_Sorting=companyListPage.validating_companyListPage_SortingAsPerUpdatedAt();
		int count=0;
		for(int record=0;record<before_Sorting.length;record++)
		{
			if(before_Sorting[record].equals(after_Sorting[record]))
			{
				count++;
			}
			else
			{
				count=0;
			}
		}
		if(count==0)
		{
			test.fail("companyList Company List Table as per Updated At is not sorted");
			Log.info("companyList Company List Table as per Updated At is not sorted - FAIL");
		}
		else
		{
			test.pass("companyList Company List Table as per Updated At is not sorted");
			Log.info("companyList Company List Table as per Updated At is not sorted - PASS");
		}
	}*/
	
	/*@Test(priority = 42, description = "companyListPage Logging into the Application and browsing back using Browser back button validaion")
	public void companyListPage_ValidatingBrowserBackButton_Test() {
		test=extent.createTest("companyListPage Logging into the Application and browsing back using Browser back button validaion");
		test.info("Validating of companyListPage Logging into the Application and browsing back using Browser back button");
		driver.navigate().back();
		driver.navigate().forward();
		String actual_401PopUp=CommonActions.PageNotFoundError();
		String expected_401PopUp="OPPS! PAGE NOT FOUND";
		if(actual_401PopUp.contains(expected_401PopUp)) {
			test.pass("401 - Page not Found error Showing Successfull");
			Log.info("401 - Page not Found error Showing Successfull - PASS");
		}
		else
		{
			test.fail("401 - Page not Found error is not Showing Unsccessfull");
			Log.info("401 - Page not Found error is not Showing UnSccessfull - FAIL");
		}
		
	}*/
	
	@Test(priority = 43, description = "companyListPage Loggingout from the Application and browsing back using Browser back button Validation")
	public void companyListPage_ValidatingLoggingOutBackButon_Test() {
		test=extent.createTest("BusinessCategoryPage Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating for BusinessCategoryPage Loggingout from the Application and browsing back using Browser back button");
		dashboardPage.validating_UserDropDown();
		dashboardPage.validating_LogOut();
		driver.navigate().back();
		String actual_401PopUp=CommonActions.PageNotFoundError();
		String expected_401PopUp="OPPS! PAGE NOT FOUND";
		if(actual_401PopUp.contains(expected_401PopUp)) {
			test.pass("401 - Page not Found error Showing Successfull");
			Log.info("401 - Page not Found error Showing Successfull - PASS");
		}
		else
		{
			Assert.fail("401 - Page not Found error is not Showing Unsccessfull");
			Log.info("401 - Page not Found error is not Showing UnSccessfull - FAIL");
		}
	}
		
}
