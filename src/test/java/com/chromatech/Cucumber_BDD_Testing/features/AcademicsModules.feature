Feature: AG1CP-8: Academics module

  @AG1CP-8 @Vannia @Regression
  Scenario: CTSMS Academics module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    When the user navigates to the Academics Module
    Then the Class Timetable "Class TimeTable" submodule is displayed
    Then the Teachers Timetable "Teachers Timetable" submodule is displayed
    Then the Assign Class Teacher "Assign Class Teacher" submodule is displayed
    Then the Promote Students "Promote Students" submodule is displayed
    Then the Subject Group "Subject Group" submodule is displayed
    Then the Subjects "Subjects" submodule is displayed
    Then the Class "Class" submodule is displayed
    Then the Sections "Sections" submodule is displayed