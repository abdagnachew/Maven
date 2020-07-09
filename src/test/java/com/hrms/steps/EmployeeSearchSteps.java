package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}

	@When("user enters valid employe id")
	public void user_enters_valid_employe_id() {
		sendText(viewEmp.empID, "14493");
	}

	@When("click on search button")
	public void click_on_search_button() {
		jsClick(viewEmp.searchBtn);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
		jsClick(viewEmp.searchTable);
		System.out.println("Emp Visible");

	}

	@Then("user edit employee personal details")
	public void user_edit_employee_personal_details() {
		jsClick(pdetails.editPD);
		clickRadioOrCheckbox(pdetails.genderRadioGroup, "Male");
		selectDdValue(pdetails.nationalityDD, "American");
		jsClick(pdetails.editPD);
	}

	@When("user enters valid emp name and last name")
	public void user_enters_valid_emp_name_and_last_name() {
		sendText(viewEmp.empName, "Ahleed");
	}

}