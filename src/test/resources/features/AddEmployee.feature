Feature: Add new Employee

  Background: 
    Given user logged in with valid admin credentials
    And user navigates to AddEmployeePage

  @regression
  Scenario: Add Employee with first and lastname
    When user enters employees "Booshay" and "Dagnachew"
    And user clicks save button
    Then employee is added successfully

  @regression
  Scenario: Add Employee without employee id
    When user enters employees first and lastname
    And user deletes employee id
    And user clicks save button
    Then employee is added successfully

  @regression
  Scenario: AddEmployee and create Login Credentials
    When user enters employees "Jane" and "Doe"
    And user clicks on create login checkbox
    And user can enters login credentials as "BradPittt10011992" and "Bank!@#Account1992"
    And user clicks save button
    Then "Jane Doe" is added successfully

  #to perform DDT in cucumber we use Scenario Outline with Examples
  @regression
  Scenario Outline: Adding multiple employees
    When user enter employees "<FirstName>", "<MiddleName>" and "<LastName>"
    And user clicks save button
    Then "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully

    Examples: 
      | FirstName | MiddleName | LastName |
      | Nizarteh  | J          | Alamine  |
      | Abrahamt  | F          | Sakhit   |
      | Sohiltt   | S          | Raj      |
      | Yunuss    | Emre       | Sanoone  |

  #adding multiple employees using Cucumber DataTable
  @regression
  Scenario: Adding multiple employees
    When user enters employee details and click on save then employee is added
      | FirstName | MiddleName | LastName |
      | John      | J          | Doe      |
      | Jane      | J          | Smith    |
@excel
  Scenario: Adding multiple employees from excel
    When user enters employee data from "AddReports" excel sheet then employee is added
