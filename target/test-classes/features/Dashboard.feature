#Author Abe

@sprint4 

Feature: Dashboard

@smoke
  Scenario: Dashboard menu view for admin
    When user logged in with valid admin credentials
    Then user see dashboard menu is displayed
      | Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |