package com.hrms.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class ViewEmployeePageElements extends CommonMethods {
	
	@FindBy(id = "empsearch_employee_name_empName")
	public WebElement empName;

	@FindBy(id = "empsearch_id")
	public WebElement empID;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath= "//table[@id='resultTable']/tbody/tr/td/a[1]")
	public WebElement searchTable;
	
	@FindBy(xpath = "//input[@id='personal_txtLicExpDate']//following::img[1]")
	public List<WebElement> calendarRun;
	
	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
