Feature: Ability to edit student records

  @Regression @Antony @AG1CP-14
  Scenario: Ability to edit student records
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And a CTSMS user clicks on the student information tab
    And clicks on the student details
    And types in "3453566" in search by keyword field
    And opens the student record by clicking the student's name
    And clicks on edit button located near top right (pencil logo)
    And enters "Stacy" in the mother's name field
    And making and saving changes to the student information by clicking on the save button
    Then the student information is successfully saved

