#Author Abe
@sprint5
Feature: Contact Page Details

  Background: 
    Given user logged in with valid admin credentials
    And user navigate to employee list page
@contact
  Scenario: 
    When user enters valid employe id
    And click on search button
    Then user see employee information is displayed
    Then user edit employee contact details
    Then user saves the edits
