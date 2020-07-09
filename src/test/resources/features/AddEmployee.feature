Feature: Add new Employee

  Background: 
    Given user logged in with valid admin credentials
    And user navigates to AddEmployeePage

  @smoke
  Scenario: Add Employee with first and lastname
    And user navigates to AddEmployeePage
    When user enters employees "John" and "Doe"
    And user clicks save button
    Then "John Doe" is added successfully

  @regression
  Scenario: Add Employee without employee id
    Given user logged in with valid admin credentials
    When user enters employees "Jane" and "Smith"
    And user deletes employee id
    And user clicks save button
    Then "Jane Smith" is added successfully

  @smoke
  Scenario: AddEmployee and create Login Credentials
    Given user logged in with valid admin credentials
    When user enters employees "James" and "Smith"
    And user clicks on create login checkbox
    And user enters login credentials as "James123" and "James123.."
    And user clicks save button
    Then "James Smith" is added successfully
