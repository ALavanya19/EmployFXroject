package com.WebPages;



import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.Base;

public class BusinessCategoriesPage extends Base{

	public BusinessCategoriesPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Object Repository
	
	//Business Categories Element
	@FindBy(xpath="//h1[text()='Business Categories']")
	WebElement businessCategoriesLebelText;
	
	//Search Options
	@FindBy(xpath="//*[@id='filter-text-box']")
	WebElement searchOptionE;
	
	//Business Category Page after search
	@FindBy(xpath="")
	List<WebElement>businessCategoryTableDataAfterSearchE;
	
	     //Business Category table  sorting as per Name
	     @FindBy(xpath="//*[@class='ag-center-cols-container' and @unselectable='on']//*[@role='row']//*[@col-id='name']")
	     List<WebElement>businessCategoryTableDataAsPerName;
	    
	     //Business Category table sorting as per Description
	     @FindBy(xpath="//*[@class='ag-center-cols-container' and @unselectable='on']//*[@role='row']//*[@col-id='description']")
	     List<WebElement>businessCategoryTableDataAsPerDescription;
	     
	     //Business Category table sorting as per Status
	     @FindBy(xpath="//*[@class='ag-center-cols-container' and @unselectable='on']//*[@role='row']//*[@col-id='status']")
	     List<WebElement>businessCategoryTableDataAsPerStatus;
	     
	     //Business Category Table sorting as per Created At
	     @FindBy(xpath="//*[@class='ag-center-cols-container' and @unselectable='on']//*[@role='row']//*[@col-id='created_at']")
	     List<WebElement>businessCategoryTableDataAsPerCreatedAt;
	     
	     //Business Category Table sorting as per Updated At
	     @FindBy(xpath="//*[@class='ag-center-cols-container' and @unselectable='on']//*[@role='row']//*[@col-id='updated_at']")
	     List<WebElement>businessCategoryTableDataAsPerUpdatedAt;
	     
	
	@FindBy(xpath="//*[text()=' Add Category']")
	WebElement addCategoryE;
	
	@FindBy(xpath="//*[@class='ag-header-cell ag-header-cell-sortable ag-focus-managed' and @aria-colindex=1]")
	WebElement nameE;
	
	@FindBy(xpath="//*[@class='ag-header-cell ag-header-cell-sortable ag-focus-managed' and @aria-colindex=2]")
	WebElement descriptionE;
	
	@FindBy(xpath="//*[@class='ag-header-cell ag-header-cell-sortable ag-focus-managed' and @aria-colindex=3]")
	WebElement statusE;
	
	@FindBy(xpath="//*[@class='ag-header-cell ag-header-cell-sortable ag-focus-managed' and @aria-colindex=4]")
	WebElement createdAtE;
	
	@FindBy(xpath="//*[@class='ag-header-cell ag-header-cell-sortable ag-focus-managed' and @aria-colindex=5]")
	WebElement updatedAtE;
	
	@FindBy(xpath="//h2[text()='Add Business Category']")
	WebElement addBusinessCategoryPopUpHeadingLabelText;
	
	@FindBy(xpath="//*[contains(@type,'text') and @formcontrolname='name']")
	WebElement addBusinessCategoryPopUpNameE;
	
	@FindBy(xpath="//*[@formcontrolname='description']")
	WebElement addBusinessCategoryPopUpDescriptionE;
	
	@FindBy(xpath="//*[@formcontrolname='status']")
	WebElement addBusinessCategoryPopUpStatusE;
	
	@FindBy(xpath="//*[@role='option']")
	List<WebElement>addBusinessCategoryStatusOptionsE;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement cancelE;
	
	@FindBy(xpath="//button[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement saveE;
	
	@FindBy(xpath="//*[@class='close']")
	WebElement closeE;
	
	
	//Edit Button Element
	@FindBy(xpath="//*[@class='fa-edit fas']")
	WebElement editButtonE;
		
	//Edit Category Pop Up Heading
	@FindBy(xpath="//h2[text()='Edit Business Category']")
	WebElement editBusinessCategoryPopUpHeadingLabelText;
	
	//Edit Category name Element
	@FindBy(xpath="//*[@formcontrolname='name']")
	WebElement editBusinessCategoryPopUpNameE;
	
	//Edit Cateory description Element
	@FindBy(xpath="//*[@formcontrolname='description']")
	WebElement editBusinessCategoryPopUpDescriptionE;
	
	//Edit Category Status Element
	@FindBy(xpath="//*[@formcontrolname='status']")
	WebElement editBusinessCategoryPopupStatusE;
	
	//Edit Category Status List
	@FindBy(xpath="/html/body/div[2]/div[4]/div/div/div/mat-option/span")
	List<WebElement>editBusinessCategoryPopupStatusList;
	
	//Edit Category Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement editCancelButtonE;
	
	//Edit Category Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement editSaveButtonE;
	
	//Edit Category close button
	@FindBy(xpath="//*[@class='far fa-times-circle']")
	WebElement editCloseButton;
	
	
	//Delete Button 
	@FindBy(xpath="//*[@class='fa-trash-alt far']")
	WebElement deleteButtonE;
	
	
	//Delete Category Pop up Heading
	@FindBy(xpath="//*[text()='Do you want to delete this business category?']")
	WebElement deletePopUpHeading;
	
	//Delete Category Cancel Button
	@FindBy(xpath="//*[@class='mat-focus-indicator mat-stroked-button mat-button-base']")
	WebElement deletePopUpCancelButton;
	
	//Delete Category Save Button
	@FindBy(xpath="//*[@class='mat-focus-indicator btn-primary mt-l-12 mat-raised-button mat-button-base']")
	WebElement deleteOpUpSaveButton;
	
	
	//Business Logic
	//Current URl
	public String validating_CurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	//Title
	public String validating_Title() {
		return driver.getTitle();
	}
	
	//Heading Label
	public String validating_HeadingLabelText() {
		return businessCategoriesLebelText.getText();
	}
	
	//Search Option
	public int validating_SearchOption(String searchOption) {
		searchOptionE.sendKeys(searchOption);
		return validating_BusinessCatgoriesTable();
	}
	
	//Business Categories Table after search
	public int validating_BusinessCatgoriesTable() {
		return businessCategoryTableDataAfterSearchE.size();
	}
	
	
	//Add Category Button
	public void validating_AddCategoryButton() {
		addCategoryE.click();
	}
	
	//Add Category Pop Up Heading Label Text
		public String validating_AddCategoryHeadingLabelText() {
			return addBusinessCategoryPopUpHeadingLabelText.getText();
		}
		
	//Sorting with Name
	public void validating_SortingNameE() {
		nameE.click();
		
		for(int record=0;record<businessCategoryTableDataAsPerName.size();record++) {
			
		}
	}
	
	  //Sorting Business Catergory table as per Name
		public Object[] validating_BusinessCategoryTableAsPerName() {
			Object[] before_Sorting=new Object[businessCategoryTableDataAsPerName.size()];
			for(int record=0;record<businessCategoryTableDataAsPerName.size();record++) 
			{
				before_Sorting[record]=businessCategoryTableDataAsPerName.get(record).getText();
			}
			return before_Sorting;
			
		}
		
		
	
	//Sorting with Description
	public void validating_SortingDescription() {
		descriptionE.click();
	}
	
	     //Sorting Business Catergory table as per Name
	     public Object[] validating_BusinessCategoryTableAsPerDescription() {
		 Object[] before_Sorting=new Object[businessCategoryTableDataAsPerDescription.size()];
		 for(int record=0;record<businessCategoryTableDataAsPerDescription.size();record++) 
		 {
		    	before_Sorting[record]=businessCategoryTableDataAsPerDescription.get(record).getText();
		 }
	    	return before_Sorting;
		
	}
	//Sorting with Status
	public void validating_SortingStatus(){
		statusE.click();
	}
		
	     //Sorting Business Catergory table as per Name
	     public Object[] validating_BusinessCategoryTableAsPerStatus() {
		 Object[] before_Sorting=new Object[businessCategoryTableDataAsPerStatus.size()];
		 for(int record=0;record<businessCategoryTableDataAsPerStatus.size();record++) 
		  {
			 before_Sorting[record]=businessCategoryTableDataAsPerStatus.get(record).getText();
		  }
		  return before_Sorting;
		
	      }
	
	
	//Sorting with Created At
	public void validating_SortingCreatedAt() {
		createdAtE.click();
	}
	
	 //Sorting Business Catergory table as per Name
	public Object[] validating_BusinessCategoryTableAsPerCreatedAt() {
		Object[] before_Sorting=new Object[businessCategoryTableDataAsPerCreatedAt.size()];
		for(int record=0;record<businessCategoryTableDataAsPerCreatedAt.size();record++) 
		{
			before_Sorting[record]=businessCategoryTableDataAsPerCreatedAt.get(record).getText();
		}
		return before_Sorting;
		
	}
	
	//Sorting with updatedAt
	public void validating_SortingUpdatedAt() {
		updatedAtE.click();
	}
	
	 //Sorting Business Catergory table as per Name
	public Object[] validating_BusinessCategoryTableAsPerUpdatedAt() {
		Object[] before_Sorting=new Object[businessCategoryTableDataAsPerUpdatedAt.size()];
		for(int record=0;record<businessCategoryTableDataAsPerUpdatedAt.size();record++) 
		{
			before_Sorting[record]=businessCategoryTableDataAsPerUpdatedAt.get(record).getText();
		}
		return before_Sorting;
		
	}
	
	
	//Validating Save Button with details
	public void validating_SaveButtonWithDetails(String name, String description, int statusOption) {
		addBusinessCategoryPopUpNameE.sendKeys(name);
		addBusinessCategoryPopUpStatusE.click();
		addBusinessCategoryStatusOptionsE.get(statusOption).click();		
		addBusinessCategoryPopUpDescriptionE.sendKeys(description);
		saveE.click();
		
	}
	
	//Validating Cancel Button with details
	public void validating_CancelButtonWithDetails(String name, String description, int statusOption) {
		addBusinessCategoryPopUpNameE.sendKeys(name);
		addBusinessCategoryPopUpStatusE.click();
		addBusinessCategoryStatusOptionsE.get(statusOption).click();
		addBusinessCategoryPopUpDescriptionE.sendKeys(description);
		cancelE.click();
	}
	
	
	//Validating Cancel button with out details
	public void validating_CancelButtonWithOutDetails() {
		cancelE.click();
	}
	
	//validating close Button With details
	public void validating_CloseButtonWithDetails(String name, String description, int statusOption) {
		addBusinessCategoryPopUpNameE.sendKeys(name);
		addBusinessCategoryPopUpStatusE.click();
		addBusinessCategoryStatusOptionsE.get(statusOption).click();
		addBusinessCategoryPopUpDescriptionE.sendKeys(description);
		closeE.click();
	}
	
	//Validating Close button with out details
	public void validating_CloseButtonWithoutDetails() {
		closeE.click();
	}
	
	
	//Validating Existing Category Name with save button
	public void validating_ExistingCategoryName(String existingCategoryName, String description, int statusOption) {
		addBusinessCategoryPopUpNameE.sendKeys(existingCategoryName);
		addBusinessCategoryPopUpStatusE.click();
		addBusinessCategoryStatusOptionsE.get(statusOption).click();
		addBusinessCategoryPopUpDescriptionE.sendKeys(description);
		saveE.click();
	}
	
	//Validating Deleted Category Name with save Button
	public void validating_DeletedCategoryName(String deletedCategoryName, String description, int statusOption) {

		addBusinessCategoryPopUpNameE.sendKeys(deletedCategoryName);
		addBusinessCategoryPopUpStatusE.click();
		addBusinessCategoryStatusOptionsE.get(statusOption).click();
		addBusinessCategoryPopUpDescriptionE.sendKeys(description);
		saveE.click();
	}
	
	public Object[] validating_TotalNumberOfCategories() {
		Object[] categoryName=new Object[businessCategoryTableDataAsPerName.size()];
		for(int i=0;i<businessCategoryTableDataAsPerName.size();i++) {
			categoryName[i]=businessCategoryTableDataAsPerName.get(i).getText();
		}
		 return categoryName;
	}
	
	public void validating_EditCategoryButton() {
		editButtonE.click();
	}
	
	public void validating_EditCategoryPopUp() {
		validating_EditCategoryButton();
		
	}
	
	public String validating_EditCategoryHeadingValidation() {
		return editBusinessCategoryPopUpHeadingLabelText.getText();
	}

	//Validating Save Button with details
	public void validating_EditCategoryPopUpSaveButtonWithDetails(String name, String description, int statusOption) {
		if(name.isEmpty())
		{
			editBusinessCategoryPopUpNameE.sendKeys(name);
		}
		else
		{
		   	editBusinessCategoryPopUpNameE.clear();
		   	editBusinessCategoryPopUpNameE.sendKeys(name);
		}
		
		if(statusOption==-1)
		{
			editBusinessCategoryPopupStatusE.click();
		}
		else
		{
			editBusinessCategoryPopupStatusE.click();
			editBusinessCategoryPopupStatusList.get(statusOption).click();
		}
		
		if(description.isEmpty())
		{
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		else
		{
			editBusinessCategoryPopUpDescriptionE.clear();
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		
		editSaveButtonE.click();
			
	}
		
	//Validating Cancel Button with details
	public void validating_EditCategoryPopUpCancelButtonWithDetails(String name, String description, int statusOption) {
		
		if(name.isEmpty())
		{
			editBusinessCategoryPopUpNameE.sendKeys(name);
		}
		else
		{
		   	editBusinessCategoryPopUpNameE.clear();
		   	editBusinessCategoryPopUpNameE.sendKeys(name);
		}
		
		if(statusOption==-1)
		{
			editBusinessCategoryPopupStatusE.click();
		}
		else
		{
			editBusinessCategoryPopupStatusE.click();
			editBusinessCategoryPopupStatusList.get(statusOption).click();
		}
		
		if(description.isEmpty())
		{
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		else
		{
			editBusinessCategoryPopUpDescriptionE.clear();
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		editCancelButtonE.click();
	}
		
		
	//Validating Cancel button with out details
	public void validating_EditCategoryCancelButtonWithOutDetails() {
		editCancelButtonE.click();
	}
		
	//validating close Button With details
	public void validating_EditCategoryCloseButtonWithDetails(String name, String description, int statusOption) {
		if(name.isEmpty())
		{
			editBusinessCategoryPopUpNameE.sendKeys(name);
		}
		else
		{
		   	editBusinessCategoryPopUpNameE.clear();
		   	editBusinessCategoryPopUpNameE.sendKeys(name);
		}
		
		if(statusOption==-1)
		{
			editBusinessCategoryPopupStatusE.click();
		}
		else
		{
			editBusinessCategoryPopupStatusE.click();
			editBusinessCategoryPopupStatusList.get(statusOption).click();
		}
		
		if(description.isEmpty())
		{
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		else
		{
			editBusinessCategoryPopUpDescriptionE.clear();
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		editCloseButton.click();
	}
		
	//Validating Close button with out details
	public void validating_EditCategoryCloseButtonWithoutDetails() {
		editCloseButton.click();
	}
		
		
	//Validating Existing Category Name with save button
	public void validating_EditCategoryExistingCategoryName(String existingCategoryName, String description, int statusOption) {
		
		if(existingCategoryName.isEmpty())
		{
			editBusinessCategoryPopUpNameE.sendKeys(existingCategoryName);
		}
		else
		{
		   	editBusinessCategoryPopUpNameE.clear();
		   	editBusinessCategoryPopUpNameE.sendKeys(existingCategoryName);
		}
		
		if(statusOption==-1)
		{
			editBusinessCategoryPopupStatusE.click();
		}
		else
		{
			editBusinessCategoryPopupStatusE.click();
			editBusinessCategoryPopupStatusList.get(statusOption).click();
		}
		
		if(description.isEmpty())
		{
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		else
		{
			editBusinessCategoryPopUpDescriptionE.clear();
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		editSaveButtonE.click();
	}
		
	//Validating Deleted Category Name with save Button
	public void validating_EditCategoryDeletedCategoryName(String deletedCategoryName, String description, int statusOption) {

		if(deletedCategoryName.isEmpty())
		{
			editBusinessCategoryPopUpNameE.sendKeys(deletedCategoryName);
		}
		else
		{
		   	editBusinessCategoryPopUpNameE.clear();
		   	editBusinessCategoryPopUpNameE.sendKeys(deletedCategoryName);
		}
		
		if(statusOption==-1)
		{
			editBusinessCategoryPopupStatusE.click();
		}
		else
		{
			editBusinessCategoryPopupStatusE.click();
			editBusinessCategoryPopupStatusList.get(statusOption).click();
		}
		
		if(description.isEmpty())
		{
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		else
		{
			editBusinessCategoryPopUpDescriptionE.clear();
			editBusinessCategoryPopUpDescriptionE.sendKeys(description);
		}
		editSaveButtonE.click();
	}

	//Delete Pop Up Validation
	public void deletePopUp_Validation() {
		deleteButtonE.click();
	}
	
	//delete pop up heading validation
	public String deletePopUp_Heading_Validation() {
		return deletePopUpHeading.getText();
	}
	
	//Delete Pop Up Cancel Button
	public void deletePopUp_CancelButton_Validation() {
		deletePopUpCancelButton.click();
	}
	
	//Delete Pop Up Save Button
	public void deletePopUp_SaveButton_Validation() {
		deleteOpUpSaveButton.click();
	}
	
	//Delete Business Category
	public void deleteBusinessCategory_Validation() {
		deleteButtonE.click();
		deleteOpUpSaveButton.click();
	}
	
	
	
	
}
