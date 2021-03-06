package com.hrms.pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpFirstName']")
	public WebElement firstnameGroup;
	
	@FindBy(xpath = "//input[@id='personal_txtEmpLastName']")
	public WebElement lastnameGroup;
	
	//@FindBy(xpath = "//div[@id='profile-pic']//following-sibling::img")
	//public WebElement verifyprofilePictureGroup;
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;
	
	@FindBy(id = "btnSave")
	public WebElement saveitBtn;
	
	@FindBy(xpath= "//input[@id='personal_txtNICNo']")
	public WebElement SSN;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}