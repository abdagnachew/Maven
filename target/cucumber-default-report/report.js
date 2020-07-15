$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployee.feature");
formatter.feature({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.LoginSteps.user_logged_in_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.user_navigates_to_AddEmployeePage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees from excel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@excel"
    }
  ]
});
formatter.step({
  "name": "user enters employee data from \"AddReports\" excel sheet then employee is added",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmployeeSteps.user_enters_employee_data_from_excel_sheet_then_employee_is_added(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});