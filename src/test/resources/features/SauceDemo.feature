Feature: Sace Demo login
  
  Description: US-3421  The purpose of this feature file is
  						to automate sacue demo app login feature with valid and
  						invalid credential
  Acceptance Criteria: I want to automate sauce demo login functionlity

  Background: 
    Given user is on login page
    When user enter invalid username
@sauce
  Scenario: invalid login
    Given user is on login page
    When user enter invalid username
    And user enter invalid password
    And click on login button
    Then user should see the error message
@sauce
  Scenario: invalid login
    Given user is on login page
    When user enter invalid username as "admin"
    And user enter invalid password as "admin@123"
    And click on login button
    Then user should see the error message
@sauce
  Scenario: invalid login
    Given user is on login page
    When user enter invalid username as "admin"
    And user enter invalid password as "admin@123"
    And click on login button
    Then user should see the error message