#Author Abe

Feature: Login

  @smoke
  Scenario Outline: 
    When user enter "<Username>" and "<Password>"
    And user click on login button
    Then "<FirstName>" is successfully logged in

    Examples: 
      |Username   |Password          | FirstName |
      |Abdag      |BankAccount1992!!!| Lobby     |

  @smoke
  Scenario Outline: Error message validation while invalid login
    When user enter "<Username>" and "<Password>"
    And user click on login button
    Then user see "<ErrorMessage>"

    Examples: 
      | Username | Password   | ErrorMessage             |
      | Admin    | Admin123   | Invalid credentials      |
      | Hello    | Syntax123! | Invalid credentials      |
      | Admin    |            | Password cannot be empty |
      |          | Syntax123! | Username cannot be empty |
