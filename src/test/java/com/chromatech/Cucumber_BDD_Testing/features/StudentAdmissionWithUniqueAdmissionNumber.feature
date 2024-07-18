Feature: Student Admission with Unique Admission Number

  @Regression @Vlad @AG1CP-13 @StudentAdmissionWithUniqueAdmissionNumber
    Scenario: Student Admission with Unique Admission Number
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When User clicks on the "Student Information" module
    And user clicks on the "Student Details" submodule
    Then the user navigates to the student search page "https://mexil.it/chroma/student/search"
    When the user selects "SDET" in the Class dropdown
    And selects "Cucumber Fundamentals" in the Section dropdown
    And enters the Admission Number "42001" in the Search By Keyword field
    And clicks the search button
    Then make sure the entry "42001" is in the list
    When within the expanded module, clicks on the "Student Admission" submodule
    Then user is on the Student Admission page "https://mexil.it/chroma/student/create"
    When user enters Unique Admission Number "42001"
    And selects SDET for class drop down "SDET"
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "FirstName"
    And enters last name "Last Name"
    And select "Female" from gender drop down
    And selects "01/01/1991" for Date of Birth Calendar
    And enter father name "FatherName"
    And selects Father radio button for If guardian is field
    And enter guardian name "Guardian Name"
    And enter guardian phone number "6028800001"
    And saves submission
    Then user sees error message "The Admission No field must contain a unique value."
