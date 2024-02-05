package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tools.ant.taskdefs.Concat;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;

import com.WebPages.CompanyDetailsPage;
import com.WebPages.CompanyListPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;


public class CompanyDetailsPageTest extends Base{

	LoginPage loginPage;
	DashboardPage dashboardPage;
	CompanyListPage companyListPage;
	CompanyDetailsPage companyDetailsPage;
	
	@BeforeMethod
	public void companyDetailsPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		dashboardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		companyListPage=dashboardPage.validating_CompaniesOption();
		companyDetailsPage=companyListPage.validating_companyListPage_CompanyDetails(PropertiesClass.getProperties("CompanyDetails"));
	}
	
	@AfterMethod
	public void companyDetailsPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	@Test(priority = 1, description = "CompanyDetailsPage Current Url Validation")
	public void companyDetailsPage_CurrentUrlTest() {
		test=extent.createTest("CompanyDetailsPage Current Url Validation");
		test.info("Validating Current Url Validation");
		String actual_CurrentUrl=companyDetailsPage.validating_companyDetailsPage_CurrentUrl();
		String expected_CurrentUrl="company/companyDetails";
		if(actual_CurrentUrl.contains(expected_CurrentUrl))
		{
			test.pass("CompanyDetailsPage Current Url Validation Successfull");
			Log.info("CompanyDetailsPage Current Url alidation Successfull - PASS");
		}
		else
		{
			Assert.fail("CompanyDetailsPage Current Url Validation Unsuccessfull");
			Log.info("CompanyDetailsPage Current Url Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 2, description = "CompanyDetailsPage Title Validation")
	public void companyDetailsPage_TitleValidation_Test() {
		test=extent.createTest("CompanyDetailsPage Title Validation");
		test.info("Validating Title Validation");
		String actual_Title=companyDetailsPage.validating_CompanyDetailsPage_Title();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title))
		{
			test.pass("CompanyDetailsPage Title Validation Successfull");
			Log.info("CompanyDetailsPage Title alidation Successfull - PASS");
		}
		else
		{
			Assert.fail("CompanyDetailsPage Title Validation Unsuccessfull");
			Log.info("CompanyDetailsPage Title Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 3, description = "CompanyDetailsPage Company Details Heading Label Text Validation")
	public void companyDetailsPage_HeadingLabelTextValidation_Test() {
		test=extent.createTest("CompanyDetailsPage Company Details Heading Label Text Validation");
		test.info("Validating Company Details Heading Label Text Validation");
		String actual_HeadingLabelText=companyDetailsPage.validating_CompanyDetailsPage_HeadingLabelText();
		String expected_HeadingLabelText="Company Details";
		if(actual_HeadingLabelText.equals(expected_HeadingLabelText))
		{
			test.pass("CompanyDetailsPage Heading Label Text Validation Successfull");
			Log.info("CompanyDetailsPage Heading Label Text alidation Successfull - PASS");
		}
		else
		{
			Assert.fail("CompanyDetailsPage Heading Label Text Validation Unsuccessfull");
			Log.info("CompanyDetailsPage Heading Label Text Validation Unsuccessfull - FAIL");
		}
	
	}
	
	@Test(priority = 4, description = "CompanyDetailsPage Company Data Validation")
	public void companyDetailsPage_CompanyDataValidation_Test() throws AWTException {
		List<Object>expected_CompanyDetailsData=new ArrayList<Object>();
		List<Object>actual_CompanyDetailsData=new ArrayList<Object>();
		
		
		test=extent.createTest("CompanyDetailsPage Company Data Validation");						
		test.info("Validating Company Data Validation");
		driver.navigate().back();
		//expected_CompanyDetailsData.add(0, );
		expected_CompanyDetailsData=companyListPage.validating_CompanyDetails(PropertiesClass.getProperties("CompanyDetails"));
		driver.navigate().forward();
		actual_CompanyDetailsData=companyDetailsPage.companyDetails_Validation();
		/*if(actual_CompanyDetailsData.equals(expected_CompanyDetailsData)) {
			test.pass("PASS");
			Log.info("PASS");
		}
		else
		{
			test.fail("FAIL");
			Log.info("FAIL");

		}*/
		
		if(actual_CompanyDetailsData.get(0).equals(expected_CompanyDetailsData.get(0))){
			System.out.println(actual_CompanyDetailsData.get(0));
			System.out.println(expected_CompanyDetailsData.get(0));
			test.pass("PASS");
			Log.info("PASS");
		}
		else
		{
			System.out.println(actual_CompanyDetailsData.get(0));
			System.out.println(expected_CompanyDetailsData.get(0));
			Assert.fail("FAIL");
			Log.info("FAIL");

		}
		
		if(actual_CompanyDetailsData.get(1).toString().equals(expected_CompanyDetailsData.get(1).toString())) {
			
		}
		else
		{
		

		}
		if(actual_CompanyDetailsData.get(2).toString().equals(expected_CompanyDetailsData.get(2).toString()))	{
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(3).toString().equals(expected_CompanyDetailsData.get(3).toString())) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(4).toString().equals(expected_CompanyDetailsData.get(4).toString())) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(5).toString().equals(expected_CompanyDetailsData.get(5).toString())) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(6).toString().equals(expected_CompanyDetailsData.get(6).toString())) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(7).equals(expected_CompanyDetailsData.get(7))) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(8).equals(expected_CompanyDetailsData.get(8))) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(9).equals(expected_CompanyDetailsData.get(9))) {
			
		}
		else
		{
			
		}
		if(actual_CompanyDetailsData.get(10).toString().equals(expected_CompanyDetailsData.get(10))) {
			
		}
		else
		{
			
		}
		/*if(actual_CompanyDetailsData.get(11).(expected_CompanyDetailsData.get(11))) {
			
		}
		else
		{
			
		}*/
		String title=actual_CompanyDetailsData.get(12).toString();
		
		//String titleContactName=+actual_CompanyDetailsData.get(13);
		
		//if().equals(expected_CompanyDetailsData.get(12)))
		
		
		
		
	}
	
	@Test
	public void test() {
		companyDetailsPage.vali("TCS");
		
	}
	
	
	@Test(priority = 5, description = "Company Details Page Back Button Validation")
	public void validating_BackButton_Test() {
		test=extent.createTest("CompanyDetailsPage Back Button Validation");
		test.info("Validating CompanyDetailsPage Back Button");
		String actual_CompaniesPageHEadingLabelText=companyListPage.validating_companyListPage_HeadingLabelText();
		String expected_CompaniesPageHeadingLabelText="Company List";
		if(actual_CompaniesPageHEadingLabelText.equals(expected_CompaniesPageHeadingLabelText)) {
			test.pass("CompanyDetailsPage Back Button Validation Successfull");
			test.info("CompanyDetailsPage Back Button Validation successfull");
		}
		else
		{
			Assert.fail("CompanyDetailaPage Back Button validation Unsuccessfull");
			test.info("CompanyDetailaPsPage Back Button Validation Unsuccessfull");
		}
	}
	
	
}
