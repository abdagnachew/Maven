package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class ContactPage extends CommonMethods {
	@Then("user edit employee contact details")
	public void user_edit_employee_contact_details() {
	    jsClick(doContact.saveitBtn);
	    sendText(doContact.empAddress, "5217 Hill Dr");
	    sendText(doContact.empState, "VA");
	    selectDdValue(doContact.empCountry, "American");
	    
	}
	
	
	
	

}
