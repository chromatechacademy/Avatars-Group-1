Feature: Ability to edit student records

  @Regression @Antony @AG1CP-14
  Scenario: Ability to edit student records
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on Student Information module
    And clicks on the student details
    And the user navigates to the student search page "https://mexil.it/chroma/student/search"
    When the user selects "SDET" in the Class dropdown
    And selects "Cucumber Fundamentals" in the Section dropdown
    And enters the Admission Number "42999" in the Search By Keyword field
    And clicks the search button
    Then make sure the entry "42999" is in the list
    When user clicks on the name of student record with admission number "42999"
    And clicks on edit button located near top right pencil icon
    Then user is on the "Edit Student" page
    When user edits admission number field to the "42990"
    And user edits roll number field to "42222"
    And user edits class drop down to "Cyber Security"
    And user edit section drop down to "Cucumber Fundamentals"