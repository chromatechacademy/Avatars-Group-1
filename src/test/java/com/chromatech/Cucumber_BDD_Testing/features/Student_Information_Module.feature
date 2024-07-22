Feature: AG1CP-4: Student Information Module

  @Regression @AG1CP-4 @Vero @StudentInformationModule
  Scenario: Student Information Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    And the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on Student Information module
    Then the first submodule "Student Details" is displayed
    And the second submodule is displayed "Student Admission"
    And the third submodule displays "Disabled Students"
    And thgie fourth submodule "Bulk Delete" is displayed
    And the fifth submodule "Student Categories" displays
    And the sixth submodule "Student House" is displayed
    And the last submodule "Disable Reason" is displayed