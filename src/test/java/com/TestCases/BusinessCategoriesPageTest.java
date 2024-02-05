package com.TestCases;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.CommonActions.CommonActions;
import com.Config.PropertiesClass;
import com.Log.Log;
import com.WebPages.BusinessCategoriesPage;
import com.WebPages.DashboardPage;
import com.WebPages.LoginPage;
import com.aventstack.extentreports.ExtentTest;
import com.beust.jcommander.JCommander.Builder;

public class BusinessCategoriesPageTest extends Base {

	LoginPage loginPage;
	DashboardPage dashbardPage;
	BusinessCategoriesPage businessCategoryPage;
	
	@BeforeMethod
	public void businessCategoriesPage_SetUp() {
		setUp();
		loginPage=new LoginPage();
		dashbardPage=loginPage.superAdminLogin(PropertiesClass.getProperties("superAdminEmail"), PropertiesClass.getProperties("superAdminPassword"));
		businessCategoryPage=dashbardPage.validating_BusinessCategories();
		
	}
	
	@AfterMethod
	public void businessCategoriesPage_TearDown() {
		extent.flush();
		tearDown();
	}
	
	@Test(priority = 1, description = "Business Categories Page Current Url Validation")
	public void validating_CurrentUrl_Test() {
		test=extent.createTest("Business Categories Page Current Url Validation");
		test.info("Validating Business Categories Current URL");
		String actual_CurrentURL=businessCategoryPage.validating_CurrentUrl();
		String expected_CurrentURL="superAdmin";
		if(actual_CurrentURL.contains(expected_CurrentURL))
		{
			test.pass("BusinessCategories Page Current URL Validation Successfull");
			Log.info("BusinessCategories Page Current URL Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("BusinessCategories Page Current URL Validation Unsuccessfull");
			Log.info("BusinessCategories Page Current URL Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 2, description = "Business Categories Page Title Validation")
	public void validating_Title_Test() {
		test=extent.createTest("Business Categories Page Title Validation");
		test.info("Validating Business Categories Page Title");
		String actual_Title=businessCategoryPage.validating_Title();
		String expected_Title="EmployFX - Employee Management";
		if(actual_Title.equals(expected_Title))
		{
			test.pass("Business Categories Page Title Validation Successfull");
			Log.info("Business Categories Page Title Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Business Categories Page Title Validation Unsuccessfull");
			Log.info("Business Categories Page Title Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 3, description = "Business Categories Page Heading Label Text Validation")
	public void validating_HeadingLabelText_Test() {
		test=extent.createTest("Business Categories Page Heading Label Text Validation");
		test.info("Validating Business Categories Page Heading Label Text");
		String actual_HeadingLabelText=businessCategoryPage.validating_HeadingLabelText();
		String expected_HeadingLabelText="Business Categories";
		if(actual_HeadingLabelText.equals(expected_HeadingLabelText))
		{
			test.pass("Business Categories Page Heading Label Text Validation Successfull");
			Log.info("Business Categories Page Heading Label Text Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Business Categories Page Heading Label Text Validation Unsuccessfull");
			Log.info("Business Categories Page Heading Label Text Validation Unsuccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 4, description = "Business Categories Page Search Option Validation")
	public void validating_SearchOption_Test() {
		test=extent.createTest("Business Categories Page Search Option Validation");
		test.info("Validating Business Categories Page Search Option");
		int totalNumberOfRecords=businessCategoryPage.validating_SearchOption("Dental");
		if(totalNumberOfRecords==-1)
		{
			Assert.fail("Business Categories Page Search Option Validation Unsuccessfull & No Records Found");
			Log.info("Business Categories Page Search Option Validation Unsuccessfull & No Records Found - FAIL");
		}
		else if(totalNumberOfRecords==0)
		{
			Assert.fail("Business Categories Page Search Option Validation Successfull & No Records Found");
			Log.info("Business Categories Page Search Option Validation Successfull & No Records Found - PASS");
		}
		else
		{
			test.pass("Business Categories Page Search Option Validation Successfull & Total number of records displayed");
			Log.info("Business Categories Page Search Option Validation Successfull & Total number of records displayed - PASS");
		}
	
	}
	
	@Test(priority = 5, description = "Business Categories Page Add Category Button Validation")
	public void validating_AddCategoryButton_Test() {
		test=extent.createTest("Business Categories Page Add Category Button Validation");
		test.info("Validating Business Categories Page Ass Category Button");
		businessCategoryPage.validating_AddCategoryButton();
		String actual_AddBusinessCategoryHeadingLabelText=businessCategoryPage.validating_AddCategoryHeadingLabelText();
		String expected_AddBusinessCategoryHeadingLabelText="Add Business Category";
		if(actual_AddBusinessCategoryHeadingLabelText.equals(expected_AddBusinessCategoryHeadingLabelText))
		{
			test.pass("Navigated to Add Business Category Pop Up Successfully");
			Log.info(" Navigated to Add Business Category Pop Up Successfully - PASS");
		}
		else
		{
			Assert.fail("Navigated to Add Business Category Pop Up Unsuccessfully");
			Log.info("Navigated to Add Business Category Pop Up Unsuccessfully - FAIL");
		}
		
	}
	
	@Test(priority = 6, description = "Business Categories Page Add Business Category pop up Heading Validation")
	public void validating_AddCategoryHeadingLabelText_Test() {
		test=extent.createTest("Business Categories Page Add Business Category Headling Validation");
		test.info("Validation Business Categories Page Add Business Category Headling");
		businessCategoryPage.validating_AddCategoryButton();
		String actual_AddBusinessCategoryHeadingLabelText=businessCategoryPage.validating_AddCategoryHeadingLabelText();
		String expected_AddBusinessCategoryHeadingLabelText="Add Business Category";
		if(actual_AddBusinessCategoryHeadingLabelText.equals(expected_AddBusinessCategoryHeadingLabelText))
		{
			test.pass("Business Categories Page Add Business Category Pop Up Heading Validation Successfull");
			Log.info("Business Categories Page Add Business Category Pop Up Heading Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Business Categories Page Add Business Category Pop Up Heading Validation Unsuccessfull");
			Log.info("Business Categories Page Add Business Category Pop Up Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	/*@Test(priority = 7, description = "Business Categories Page Sorting as per Name Validation")
	public void validating_SortingNameE_Test() throws InterruptedException {
		test=extent.createTest("Business Categories Page Sorting as per Name Validation");
		test.info("Validation of Business Categories Page Sorting as per Name");
		Object[] beforeSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerName();
		Arrays.sort(beforeSorting);
		businessCategoryPage.validating_SortingNameE();
		Object[] afterSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerName();
	
		int count=0;
		for(int num=0;num<afterSorting.length;num++) {
			if(beforeSorting[num].equals(afterSorting[num]))
			{
				count=1;
			}
			else
			{
				count=0;
			}
		}		
		if(count==0)
		{
			test.fail("Business Category Page Sorted as per Name Validation Unsuccesfully - FAIL");
			Log.info("Business Category Page Sorted as per Name Validation Unsuccesfully - FAIL");
		}
		else
		{
			test.pass("Business Category Table Sorted as per Name Validation successfully - PASS");
			Log.info("Business Category Table Sorted as per Name Validation successfully - PASS");
		}
	}
	
	@Test(priority = 8, description = "Business Categories Page Sorting as per Description Validation")
	public void validating_SortingDescriptionE_Test() {
		test=extent.createTest("Business Categories Page Sorting as per Description Validation");
		test.info("Validation of Business Categories Page Sorting as per Description");
		Object[] beforeSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerDescription();
		businessCategoryPage.validating_SortingDescription();
		Object[] afterSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerDescription();
		int count=0;
		for(int num=0;num<afterSorting.length;num++) {
			if(beforeSorting[num].equals(afterSorting[num]))
			{
				count=1;
			}
			else
			{
				count=0;
			}
		}		
		if(count==0)
		{
			test.fail("Business Category Page Sorted as per Description Validation Unsuccesfully - FAIL");
			Log.info("Business Category Page Sorted as per Description Validation Unsuccesfully - FAIL");
		}
		else
		{
			test.pass("Business Category Table Sorted as per Deescription Validation successfully - PASS");
			Log.info("Business Category Table Sorted as per Description Validation successfully - PASS");
		}
	}
	
	@Test(priority = 9, description = "Business Categories Page Sorting as per Status Validation")
	public void validating_SortingStatus_Test() {
		test=extent.createTest("Business Categories Page Sorting as per Status Validation");
		test.info("Validation of Business Categories Page Sorting as per Status");
		Object[] beforeSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerStatus();
		businessCategoryPage.validating_SortingStatus();
		Object[] afterSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerStatus();
		int count=0;
		for(int num=0;num<afterSorting.length;num++) {
			if(beforeSorting[num].equals(afterSorting[num]))
			{
				count=1;
			}
			else
			{
				count=0;
			}
		}		
		if(count==0)
		{
			test.fail("Business Category Page Sorted as per Status Validation Unsuccesfully - FAIL");
			Log.info("Business Category Page Sorted as per Status Validation Unsuccesfully - FAIL");
		}
		else
		{
			test.pass("Business Category Table Sorted as per Status Validation successfully - PASS");
			Log.info("Business Category Table Sorted as per Status Validation successfully - PASS");
		}
		
	}
	
	@Test(priority = 10, description = "Business Categories Page Sorting as per Name Created At Validation")
	public void validating_SortingCreatedAt_Test() {
		test=extent.createTest("Business Categories Page Sorting as per Created At Validation");
		test.info("Validation of Business Categories Page Sorting as per Created At");
		Object[] beforeSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerCreatedAt();
		businessCategoryPage.validating_SortingCreatedAt();
		Object[] afterSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerCreatedAt();
		int count=0;
		for(int num=0;num<afterSorting.length;num++) {
			if(beforeSorting[num].equals(afterSorting[num]))
			{
				count=1;
			}
			else
			{
				count=0;
			}
		}		
		if(count==0)
		{
			test.fail("Business Category Page Sorted as per Created At Validation Unsuccesfully - FAIL");
			Log.info("Business Category Page Sorted as per Created At Validation Unsuccesfully - FAIL");
		}
		else
		{
			test.pass("Business Category Table Sorted as per Created At Validation successfully - PASS");
			Log.info("Business Category Table Sorted as per Created At Validation successfully - PASS");
		}
			
		
		
	}
	
	@Test(priority = 11, description = "Business Categories Page Sorting as per Updated At Validation")
	public void validating_SortingUpdatedAt_Test() {
		test=extent.createTest("Business Categories Page Sorting as per Updated At Validation");
		test.info("Validation of Business Categories Page Sorting as per Updated At");
		Object[] beforeSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerUpdatedAt();
		businessCategoryPage.validating_SortingUpdatedAt();
		Object[] afterSorting=businessCategoryPage.validating_BusinessCategoryTableAsPerUpdatedAt();
		int count=0;
		for(int num=0;num<afterSorting.length;num++) {
			if(beforeSorting[num].equals(afterSorting[num]))
			{
				count=1;
			}
			else
			{
				count=0;
			}
		}		
		if(count==0)
		{
			test.fail("Business Category Page Sorted as per Updated At Validation Unsuccesfully - FAIL");
			Log.info("Business Category Page Sorted as per Updated Validation Unsuccesfully - FAIL");
		}
		else
		{
			test.pass("Business Category Table Sorted as per Updated At Validation successfully - PASS");
			Log.info("Business Category Table Sorted as per Updated At Validation successfully - PASS");
		}
		
	}*/
	
	@Test(priority = 7, description = "Business Categories Page Save Button With details Validation")
	public void validating_SaveButtonWithDetails_Test() {
		test=extent.createTest("Business Categories Page Save Button With Details Validation");
		test.info("Validation of Business Categories Page Save Button With Details");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_SaveButtonWithDetails("Building  Materials & Supplies", " material used for construction", 0);
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Business Category Added Successfully");
			Log.info("Business Category Added Successfully - PASS");
		}
		else
		{
			Assert.fail("Business Category Added Unsuccessfully");
			Log.info("Business Category Added Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 8, description = "Business Categories Page Add Business Cateory Pop Up Cancel Button With details validation")
	public void validating_CancelButtonWithDetails_Test() {
		test=extent.createTest("Business Categories Page Add Business Cateory Pop Up Cancel Button With details validation");
		test.info("Validation of Business Categories Page Add Business Cateory Pop Up Cancel Button With details");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_CancelButtonWithDetails("cfvgbhjnk", "xcfvhbj", 1);
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Cancelled & Navigated to Business CategoriesPage Successfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Cancelled & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 9, description = "Business Categories Page Add Business Cateory Pop Up Cancel Button With out details validation")
	public void validating_CancelButtonWithOutDetails_Test() {
		test=extent.createTest("Business Categories Page Add Business Cateory Pop Up Cancel Button With details validation");
		test.info("Validation of Business Categories Page Add Business Cateory Pop Up Cancel Button With details");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_CancelButtonWithOutDetails();
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Cancelled & Navigated to Business CategoriesPage Successfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Cancelled & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 10, description = "Business Categories Page Add Business Category Pop Up Close Button with details Validation")
	public void validating_CloseButtonWithDetails_Test() {
		test=extent.createTest("Business Categories Page Add Business Cateory Pop Up Close Button With details validation");
		test.info("Validation of Business Categories Page Add Business Cateory Pop Up Close Button With details");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_CloseButtonWithDetails("dcfvgbh","ffcgvh", 0);
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Closed & Navigated to Business CategoriesPage Successfully");
			Log.info("Closed & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Closed & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Closed & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 11, description = "Business Categories Page Add Business Category Pop Up Close Button with out details Validation")
	public void validating_CloseButtonWithOutDetails_Test() {
		test=extent.createTest("Business Categories Page Add Business Cateory Pop Up Close Button With out details validation");
		test.info("Validation of Business Categories Page Add Business Cateory Pop Up Close Button With out details");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_CloseButtonWithoutDetails();
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Closed & Navigated to Business CategoriesPage Successfully");
			Log.info("Closed & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Closed & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Closed & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 12, description = "Business Categories Page Add Business Category Pop Up Existing Category Validation")
	public void validating_ExistingCategoryName_Test() {
		test=extent.createTest("Business Categories Page Add Business Category Pop up Existing Category Validation");
		test.info("Validation of Business Categories Page Add Business Category Pop up Existing Category");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_SaveButtonWithDetails("Building  Materials & Supplies", "material used for construction", 0);
		String actual_AddBusinessCategoryHeadingLabelText=businessCategoryPage.validating_AddCategoryHeadingLabelText();
		String expected_AddBusinessCategoryHeadingLabelText="Add Business Category";
		if(actual_AddBusinessCategoryHeadingLabelText.equals(expected_AddBusinessCategoryHeadingLabelText))
		{
			test.pass("Category Already Exist Validation Successfull");
			Log.info("Category Already Exist Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Category Created Successfully &  Validation Unsuccessfull");
			Log.info("Category Created Successfully &  Validation Unsuccessfull - FAIL");
			CommonActions.screenShot("Building  Materials & Supplies");
		}
	}
	
	@Test(priority = 13, description = "Business Categories Page Add Business Category Pop up Deleted Category Validation")
	public void validating_DeletedCategoryName_Test() {
		test=extent.createTest("Business Categories Page Add Business Category Pop Up Deleted Category Validation");
		test.info("Validation for Business Categories Page Add Business Category Pop Up Deleted Category");
		businessCategoryPage.validating_AddCategoryButton();
		businessCategoryPage.validating_SaveButtonWithDetails("Building  Materials & Supplies", "material used for construction", 0);
		String actual_AddBusinessCategoryHeadingLabelText=businessCategoryPage.validating_AddCategoryHeadingLabelText();
		String expected_AddBusinessCategoryHeadingLabelText="Add Business Category";
		if(actual_AddBusinessCategoryHeadingLabelText.equals(expected_AddBusinessCategoryHeadingLabelText))
		{
			test.pass("Category Already Exist Validation Successfull");
			Log.info("Category Already Exist Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Category Created Successfully &  Validation Unsuccessfull");
			Log.info("Category Created Successfully &  Validation Unsuccessfull - FAIL");
			CommonActions.screenShot("Building  Materials & Supplies");
		}
	}
	
	
	@Test(priority = 14, description = "Business Categories Page Edit Category Pop Up Validation")
	public void validating_EditCategoryPopUp_Test() {
		test=extent.createTest("Business Categories Page Edit Category Pop Up Validation");
		test.info("Validating Business Categories Page Edit Category Pop Up");
		businessCategoryPage.validating_EditCategoryButton();
		String actual_EditBusinessCategoryHeadingLabelText=businessCategoryPage.validating_EditCategoryHeadingValidation();
		String expected_EditBusinessCategoryHeadingLabelText="Edit Business Category";
		if(actual_EditBusinessCategoryHeadingLabelText.equals(expected_EditBusinessCategoryHeadingLabelText))
		{
			test.pass("Navigated to Edit Business Category Pop Up Successfully");
			Log.info(" Navigated to Edit Business Category Pop Up Successfully - PASS");
		}
		else
		{
			Assert.fail("Navigated to Edit Business Category Pop Up Unsuccessfully");
			Log.info("Navigated to Edit Business Category Pop Up Unsuccessfully - FAIL");
		}
		
	}
	
	@Test(priority = 15, description = "Business Categories Page Edit Business Category pop up Heading Validation")
	public void validating_EditCategoryHeadingLabelText_Test() {
		test=extent.createTest("Business Categories Page Edit Business Category Headling Validation");
		test.info("Validation Business Categories Page Edit Business Category Headling");
		businessCategoryPage.validating_EditCategoryButton();
		String actual_EditBusinessCategoryHeadingLabelText=businessCategoryPage.validating_EditCategoryHeadingValidation();
		String expected_EditBusinessCategoryHeadingLabelText="Edit Business Category";
		if(actual_EditBusinessCategoryHeadingLabelText.equals(expected_EditBusinessCategoryHeadingLabelText))
		{
			test.pass("Business Categories Page Edit Business Category Pop Up Heading Validation Successfull");
			Log.info("Business Categories Page Edit Business Category Pop Up Heading Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Business Categories Page Edit Business Category Pop Up Heading Validation Unsuccessfull");
			Log.info("Business Categories Page Edit Business Category Pop Up Heading Validation Unsuccessfull - FAIL");
		}
	}
	
	@Test(priority = 16, description = "Business Categories Page Edit Category Pop Up Save Button With details Validation")
	public void validating_EditCategoryPopUpSaveButtonWithDetails_Test() {
		test=extent.createTest("Business Categories Page Edit Category PopUp Save Button With Details Validation");
		test.info("Validation of Business Categories Page Edit Category PopUp Save Button With Details");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryPopUpSaveButtonWithDetails("Building  Materials & Supplies", " material used for construction", 0);
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Business Category Edited Successfully");
			Log.info("Business Category Edited Successfully - PASS");
		}
		else
		{
			Assert.fail("Business Category Edited Unsuccessfully");
			Log.info("Business Category Edited Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 17, description = "Business Categories Page Edit Business Cateory Pop Up Cancel Button With details validation")
	public void validating_EditCategoryPopUpCancelButtonWithDetails_Test() {
		test=extent.createTest("Business Categories Page Edit Business Cateory Pop Up Cancel Button With details validation");
		test.info("Validation of Business Categories Page Edit Business Cateory Pop Up Cancel Button With details");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryCloseButtonWithDetails("cfvgbhjnk", "xcfvhbj", 1);
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Cancelled & Navigated to Business CategoriesPage Successfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Cancelled & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 18, description = "Business Categories Page Edit Business Cateory Pop Up Cancel Button With out details validation")
	public void validating_EditCategoryPopUpCancelButtonWithOutDetails_Test() {
		test=extent.createTest("Business Categories Page Edit Business Cateory Pop Up Cancel Button With details validation");
		test.info("Validation of Business Categories Page Edit Business Cateory Pop Up Cancel Button With details");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryCancelButtonWithOutDetails();
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Cancelled & Navigated to Business CategoriesPage Successfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Cancelled & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Cancelled & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 19, description = "Business Categories Page Edit Business Category Pop Up Close Button with details Validation")
	public void validating_EditCategoryPopUpCloseButtonWithDetails_Test() {
		test=extent.createTest("Business Categories Page Edit Business Cateory Pop Up Close Button With details validation");
		test.info("Validation of Business Categories Page Edit Business Cateory Pop Up Close Button With details");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryCloseButtonWithDetails("dcfvgbh","ffcgvh", 0);
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Closed & Navigated to Business CategoriesPage Successfully");
			Log.info("Closed & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Closed & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Closed & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 20, description = "Business Categories Page Edit Business Category Pop Up Close Button with out details Validation")
	public void validating_EditCategoryPopUpCloseButtonWithOutDetails_Test() {
		test=extent.createTest("Business Categories Page Edit Business Cateory Pop Up Close Button With out details validation");
		test.info("Validation of Business Categories Page Edit Business Cateory Pop Up Close Button With out details");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryCancelButtonWithOutDetails();
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Closed & Navigated to Business CategoriesPage Successfully");
			Log.info("Closed & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Closed & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Closed & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 21, description = "Business Categories Page Edit Business Category Pop Up Existing Category Validation")
	public void validating_EditCategoryPopUpExistingCategoryName_Test() {
		test=extent.createTest("Business Categories Page Edit Business Category Pop up Existing Category Validation");
		test.info("Validation of Business Categories Page Edit Business Category Pop up Existing Category");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryExistingCategoryName("Building  Materials & Supplies", "material used for construction", 0);
		String actual_AddBusinessCategoryHeadingLabelText=businessCategoryPage.validating_EditCategoryHeadingValidation();
		String expected_AddBusinessCategoryHeadingLabelText="Edit Business Category";
		if(actual_AddBusinessCategoryHeadingLabelText.equals(expected_AddBusinessCategoryHeadingLabelText))
		{
			test.pass("Category Already Exist Validation Successfull");
			Log.info("Category Already Exist Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Category Created Successfully &  Validation Unsuccessfull");
			Log.info("Category Created Successfully &  Validation Unsuccessfull - FAIL");
			CommonActions.screenShot("Building  Materials & Supplies");
		}
	}
	
	@Test(priority = 22, description = "Business Categories Page Edit Business Category Pop up Deleted Category Validation")
	public void validating_EditCategoryPopUpDeletedCategoryName_Test() {
		test=extent.createTest("Business Categories Page Edit Business Category Pop Up Deleted Category Validation");
		test.info("Validation for Business Categories Page Edit Business Category Pop Up Deleted Category");
		businessCategoryPage.validating_EditCategoryButton();
		businessCategoryPage.validating_EditCategoryDeletedCategoryName("Building  Materials & Supplies", "material used for construction", 0);
		String actual_EditBusinessCategoryHeadingLabelText=businessCategoryPage.validating_EditCategoryHeadingValidation();
		String expected_EditBusinessCategoryHeadingLabelText="Edit Business Category";
		if(actual_EditBusinessCategoryHeadingLabelText.equals(expected_EditBusinessCategoryHeadingLabelText))
		{
			test.pass("Category Already Exist Validation Successfull");
			Log.info("Category Already Exist Validation Successfull - PASS");
		}
		else
		{
			Assert.fail("Category Created Successfully &  Validation Unsuccessfull");
			Log.info("Category Created Successfully &  Validation Unsuccessfull - FAIL");
			CommonActions.screenShot("Building  Materials & Supplies");
		}
	}
	
	@Test(priority = 23, description = "Business Category Page Delete Pop Up Validation")
	public void validating_DeletePopUp_Validation_Test() {
		test=extent.createTest("Business Category Page Delete Pop Up Validation");
		test.info("Validation for Business Category Page Delete Pop Up");
		businessCategoryPage.deletePopUp_Validation();
		String actual_DeletePopUpHeading=businessCategoryPage.deletePopUp_Heading_Validation();
		String expected_DeletePopUpHeading="Do you want to delete this business category?";
		if(actual_DeletePopUpHeading.equals(expected_DeletePopUpHeading))
		{
			test.pass("Business Category Page Delete Pop Up Validation Successfull");
			Log.info("Business Category Page Delete Pop Up Validation Successfull - PASS ");
		}
		else
		{
			Assert.fail("Business Category Page Delete Pop Up Validation Unsuccessfull");
			Log.info("Business Category Page Delete Pop Up Validation Unsuccessfull - FAIL ");
		}
		
	}
	
	@Test(priority = 24, description = "Business Category Page Delete PopUp Cancel category deletion validation")
	public void validating_DeletePopUp_CancelButton_Validation_Test() {
		test=extent.createTest("Business Category Page Delete PopUp Cancel Category Deletion Validation ");
		test.info("Validating Business Category Page Delete PopUp Cancel Category Deletion");
		businessCategoryPage.deletePopUp_Validation();
		businessCategoryPage.deletePopUp_CancelButton_Validation();
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Deletion Cancelled  & Navigated to Business CategoriesPage Successfully");
			Log.info("Deletion Cancelled & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Deletion Cancelled & Navigated to Business CategoriesPage Unsuccessfully");
			Log.info("Deletion Cancelled & Navigated to Business CategoriesPage Unsuccessfully - FAIL");
		}
	}
	
	@Test(priority = 25, description = "Business Category Page Delete PopUp Category Deletion Validation")
	public void validating_DeletePopUp_SaveButton_Validation_Test() {
		test=extent.createTest("Business Category Page Delete Pop Category Deletion Validation");
		test.info("Validating Business Category Page Delete Pop Up Category Deletion");
		businessCategoryPage.deletePopUp_Validation();
		businessCategoryPage.deletePopUp_SaveButton_Validation();
		String actual_BusinessCategoryHeadingLabelText=businessCategoryPage.validating_HeadingLabelText();		
		String expected_BusinessCategoryHeadingLabelText="Business Categories";
		if(actual_BusinessCategoryHeadingLabelText.equals(expected_BusinessCategoryHeadingLabelText))
		{
			test.pass("Category Deleted Successfully  & Navigated to Business CategoriesPage Successfully");
			Log.info("Category Deleted Successfully & Navigated to Business CategoriesPage Successfully - PASS");
		}
		else
		{
			Assert.fail("Category not Deleted");
			Log.info("Category not Deleted - FAIL");
		}
	}
	

	@Test(priority = 26, description = "BusinessCategoryPage Logging into the Application and browsing back using Browser back button validaion")
	public void businessCategoryPage_ValidatingBrowserBackButton_Test() {
		test=extent.createTest("BusinessCategoryPage Logging into the Application and browsing back using Browser back button validaion");
		test.info("Validating of BusinessCategoryPage Logging into the Application and browsing back using Browser back button");
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
			Assert.fail("401 - Page not Found error is not Showing Unsccessfull");
			Log.info("401 - Page not Found error is not Showing UnSccessfull - FAIL");
		}
		
	}
	
	@Test(priority = 27, description = "BusinessCategoryPage Loggingout from the Application and browsing back using Browser back button Validation")
	public void businessCategoryPage_ValidatingLoggingOutBackButon_Test() {
		test=extent.createTest("BusinessCategoryPage Loggingout from the Application and browsing back using Browser back button Validation");
		test.info("Validating for BusinessCategoryPage Loggingout from the Application and browsing back using Browser back button");
		dashbardPage.validating_UserDropDown();
		dashbardPage.validating_LogOut();
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
