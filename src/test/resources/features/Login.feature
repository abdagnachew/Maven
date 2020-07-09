@Login @sprint11

Feature: Login

@smoke
  Scenario: valid admin login
    When user enter valid admin username and password
    And user click on login button
    Then admin is successfully logged in
@smoke
  Scenario: valid ess login
    When user enters valid ess username and password
    And user will click on login button
    Then ess user is successfully logged in
@smoke
  Scenario: Login with valid username and invalid password
    When the user enters valid username and invalid password
    And user clicks on the login button
    Then User sees Invalid Credentials text on the page
