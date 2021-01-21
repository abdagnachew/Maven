package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class ContactPageElements extends CommonMethods {

	@FindBy(id = "contact_street1")
	public WebElement empAddress;

	@FindBy(xpath = "//select[@id='contact_country']")
	public WebElement empCountry;

	@FindBy(id = "contact_province")
	public WebElement empState;

	@FindBy(id = "contact_city")
	public WebElement empCity;

	@FindBy(id = "btnSave")
	public WebElement saveitBtn;

	public ContactPageElements() {
		PageFactory.initElements(driver, this);
	}

}
