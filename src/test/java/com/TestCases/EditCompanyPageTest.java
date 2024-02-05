package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.BusinessCategoriesPage;
import com.WebPages.CompanyListPage;
import com.WebPages.DashboardPage;
import com.WebPages.EditCompanyPage;
import com.WebPages.LoginPage;

public class EditCompanyPageTest extends Base {

	LoginPage loginPage;
	DashboardPage dashboardPage;
	BusinessCategoriesPage businessCategoryPage;
	CompanyListPage companyListPage;
	EditCompanyPage editCompanyPage;
	
	@BeforeMethod
	public void addCompaniesPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		companyListPage=dashboardPage.validating_CompaniesOption();
		editCompanyPage=companyListPage.validating_companyListPage_EditButton(PropertiesClass.getProperties("editCompany"));
		
	}
	
	@AfterMethod
	public void addCompanyPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	
	@Test(priority = 1, description = "Edit Company Page Current URL Validation")
	public void editCompanyPage_CurrentURL_Validation_Test() {
		test=extent.createTest("Edit Company Page Current URL Validation");
		test.info("Validation for Edit Company Page Current Url");
		String actualCurrentURL=editCompanyPage.editCompanyPage_CurrentURL_Validation();
		String expectedCurrentURL="editCompany";
		if(actualCurrentURL.contains(expectedCurrentURL))
		{
			test.pass("Edit Company Page Current URL Validation Successfull");
			Log.info("Edit Company Page Current URL Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Edit Company Page Current URL Validation Unsuccessfull");
			Log.info("Edit Company Page Current URL Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 2, description = "Edit Company Page Title Validation")
	public void editCompanyPage_Title_Validation_Test() {
		test=extent.createTest("edit Company Page Title Validation");
		test.info("Validation for edit Company Page Title");
		String actualTitle=editCompanyPage.editCompanyPage_Title_Validation();
		String expectedTitle="EmployFX - Employee Management";
		if(actualTitle.equals(expectedTitle))
		{
			test.pass("Edit Company Page Title Validation Successfull");
			Log.info("Edit Company Page Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Edit Company Page Title Validation Unsuccessfull");
			Log.info("Edit Company Page Title Validation UnSuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Edit Company Page Heading Label Text Validation")
	public void editCompanyPage_HeadingLabelText_Validation_Test() {
		test=extent.createTest("Edit Company Page Heading Label Text Validation");
		test.info("Validation for Edit Company Page Heading Label Text");
		String actual_HeadingLabellText=editCompanyPage.editCompanyPage_HeadingLabelText_Validation();
		String expected_HeadingLabelText="Edit Company";
		if(actual_HeadingLabellText.equals(expected_HeadingLabelText))
		{
			test.pass("Edit Company Page Heading Label Text Validation Successfull");
			Log.info("Edit Company Page Heading Label Text Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Edit Company Page Heading Label Text Validation Unsuccessfull");
			Log.info("Edit Company Page Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}

	@Test(priority = 4, description = "Edit Company Page Sub Heading Label Text Validation")
	public void editCompanyPage_SubHeadingLabelText_Validation_Test() {
		test=extent.createTest("Edit Company Page Sub Heading Label Text Validation");
		test.info("Validation for Edit Company Page Sub Heading Label Text");
		String actual_SubHeadingLabelText=editCompanyPage.editCompanyPage_SubHeadingLabelText_Validation();
		String expected_SubHeadingLabelText="Company Details";
		if(actual_SubHeadingLabelText.equals(expected_SubHeadingLabelText))
		{
			test.pass("Edit Company Page Sub Heading Label Text Validation Successfull");
			Log.info("Edit Company Page Sub Heading Label Text Validation Successfull - PASS");	
		}
		else
		{
			Assert.fail("Edit Company Page Sub Heading Label Text Validation Unsuccessfull");
			Log.info("Edit Company Page Sub Heading Label Text Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 5, description = "Edit Company Page With Mandatory fields with save button")
	public void editCompanyPage_AllMandatoryFields_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Edit Company Page with Mandatory fields");
		test.info("Validating with Mandatory fields");
		
		List<Object>mandatoryFieldsData=new ArrayList<Object>();
		
		mandatoryFieldsData.add(0, "");
		mandatoryFieldsData.add(1, "");
		mandatoryFieldsData.add(2, "United States");
		mandatoryFieldsData.add(3, "");
		mandatoryFieldsData.add(4, "Hyderaba");
		mandatoryFieldsData.add(5,"Kukatpaly");
		mandatoryFieldsData.add(6, "");
		mandatoryFieldsData.add(7,"");
		mandatoryFieldsData.add(8, "7894561235");
		mandatoryFieldsData.add(9, "Mr");
		mandatoryFieldsData.add(10, "Srinivas Radha");
		mandatoryFieldsData.add(11, "India");
		mandatoryFieldsData.add(12, "Telangana");
		mandatoryFieldsData.add(13, "Madhapur");
		mandatoryFieldsData.add(14, "9874563218");
		mandatoryFieldsData.add(15, "100");
		
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add("India");
		operatingCountries.add("United States");
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add("Telangana");
		operatingStates.add("Alabama");
		
		editCompanyPage.editCompanyPage_WithMandatoryField_Validation(mandatoryFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Edited Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Edited Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Edit Company");
			Log.info("Unable to Edit Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(mandatoryFieldsData.get(0).toString()));
		}
		
	}
	

	@Test(priority = 6, description = "Edit Company Page With All fields Data with save button")
	public void editCompanyPage_AllFields_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Edit Company Page with All fields Data");
		test.info("Validating with Edit Company Page withh All fields Data");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, "");
		allFieldsData.add(1, "");
		allFieldsData.add(2, "");
		allFieldsData.add(3, "");
		allFieldsData.add(4, "");
		allFieldsData.add(5, "");
		allFieldsData.add(6, "");
		allFieldsData.add(7, "");
		allFieldsData.add(8, "");
		allFieldsData.add(9, "");
		allFieldsData.add(10, "");
		allFieldsData.add(11, "");
		allFieldsData.add(12, "");
		allFieldsData.add(13, "");
		allFieldsData.add(14, "");
		allFieldsData.add(15, "");
		allFieldsData.add(16, "");
		allFieldsData.add(17, "");
		allFieldsData.add(18, "");
		allFieldsData.add(19, "");
		allFieldsData.add(20, "");
		allFieldsData.add(21, "");
		allFieldsData.add(22, "");
		allFieldsData.add(23, "");
		allFieldsData.add(24, "");
		allFieldsData.add(25, "");
		allFieldsData.add(26, "");
		allFieldsData.add(27, "");
		allFieldsData.add(28, "");
		allFieldsData.add(29, "");
		allFieldsData.add(30, "");
		allFieldsData.add(31, "");
		allFieldsData.add(32, "");
		allFieldsData.add(33, "");
		allFieldsData.add(34, "");
		allFieldsData.add(35, "555");
		
		
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add("United States");
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add("Alabama");
		
		editCompanyPage.editCompanyPage_AllFieldsSave_Validation(allFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Edited Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Edited Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Edit Company");
			Log.info("Unable to Edit Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(allFieldsData.get(0).toString()));
		}
		
	}
	
	@Test(priority = 6, description = "Edit Company Page With All fields Data with Cancel button")
	public void editCompanyPage_AllFieldsCancel_Validation_Test() throws InterruptedException, AWTException, IOException{
		test=extent.createTest("Edit Company Page with All fields Data with Cancel Button");
		test.info("Validating with Edit Company Page with All fields Data with cancel button");
		
		List<Object>allFieldsData=new ArrayList<Object>();
		
		allFieldsData.add(0, "");
		allFieldsData.add(1, "");
		allFieldsData.add(2, "");
		allFieldsData.add(3, "");
		allFieldsData.add(4, "");
		allFieldsData.add(5, "");
		allFieldsData.add(6, "");
		allFieldsData.add(7, "");
		allFieldsData.add(8, "");
		allFieldsData.add(9, "");
		allFieldsData.add(10, "");
		allFieldsData.add(11, "");
		allFieldsData.add(12, "");
		allFieldsData.add(13, "");
		allFieldsData.add(14, "");
		allFieldsData.add(15, "");
		allFieldsData.add(16, "");
		allFieldsData.add(17, "");
		allFieldsData.add(18, "");
		allFieldsData.add(19, "");
		allFieldsData.add(20, "");
		allFieldsData.add(21, "");
		allFieldsData.add(22, "");
		allFieldsData.add(23, "");
		allFieldsData.add(24, "Kalyan Singh");
		allFieldsData.add(25, "");
		allFieldsData.add(26, "");
		allFieldsData.add(27, "");
		allFieldsData.add(28, "");
		allFieldsData.add(29, "");
		allFieldsData.add(30, "");
		allFieldsData.add(31, "");
		allFieldsData.add(32, "");
		allFieldsData.add(33, "kalyansinghfgbhnj@gmail.com");
		allFieldsData.add(34, "");
		allFieldsData.add(35, "");
		
		
		List<Object>operatingCountries=new ArrayList<Object>();
		operatingCountries.add("United States");
		
		List<Object>operatingStates=new ArrayList<Object>();
		operatingStates.add("Alabama");
		
		editCompanyPage.editompanyPage_AllFieldsCancel_Validation(allFieldsData,operatingCountries,operatingStates);
		
		String actual_CompaniesPage_HeadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPage_HeadingLabelText="Company List";
		if(actual_CompaniesPage_HeadingLabelText.equals(expected_CompaniesPage_HeadingLabelText))
		{
			test.pass("Company Edited Successfully & Navigated to Company List Page Successfully");
			Log.info("Company Edited Successfully & Navigated to Company List Page Successfully - PASS");
		}
		else
		{
			Assert.fail("Unable to Edit Company");
			Log.info("Unable to Edit Company - FAIL");
			CommonActions.screenShot(PropertiesClass.getProperties(allFieldsData.get(0).toString()));
		}
		
	}
		
}
