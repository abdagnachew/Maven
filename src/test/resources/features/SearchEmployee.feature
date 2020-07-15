@searchEmployee @sprint12
Feature: Employee Search

Background:
 Given user logged in with valid admin credentials
    And user navigate to employee list page 

  @working
  Scenario: Search employee id
    When user enters valid employe id
    And click on search button
    Then user see employee information is displayed
    Then user edit employee personal details
    Then user saves the edits
    

  @smoke
  Scenario: Search employee by name
    When user enters valid emp name and last name
    And click on search button
    Then user see employee information is displayed
