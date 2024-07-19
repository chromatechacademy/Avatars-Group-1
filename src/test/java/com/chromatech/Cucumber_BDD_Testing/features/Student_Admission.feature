Feature: StudentAdmission

  @Regression @AG1CP-12 @StudentAdmission @Vlad
  Scenario: Student Admission (Flow: Create - Search - Delete)
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And User clicks on the "Student Information" module
    And within the expanded module, clicks on the "Student Admission" submodule
    Then user is on the Student Admission page "https://mexil.it/chroma/student/create"
    When user enters Unique Admission Number "42001"
    And user enters Roll Number "0001"
    And selects SDET for class drop down "SDET"
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "FirstName"
    And enters last name "Last Name"
    And select "Female" from gender drop down
    And selects "01/02/1991" for Date of Birth Calendar
    And select "new" from category drop down
    And enters email "test@email.com"
    And enters admission date "04/20/2024"
    And select "A+" from blood group drop down
    And enters As on Date "04/20/2024"
    And enters mobile number "6028808888"
    And enters height "6'3"
    And enters weight "9999"
    And enter father name "FatherName"
    And enters father phone "6028801111"
    And enter father occupation "Father Occupation"
    And enter mother name "MotherName"
    And enters mother phone "6028802222"
    And enter mother occupation "Mother Occupation"
    And selects Father radio button for If guardian is field
    And enter guardian email "guardian@email.com"
    And enter guardian address "1142 G Address"
    And saves submission
    Then user sees a message about successful card creation "Record Saved Successfully"
    When user clicks on the "Student Details" submodule
    And the user navigates to the student search page "https://mexil.it/chroma/student/search"
    When the user selects "SDET" in the Class dropdown
    And selects "Cucumber Fundamentals" in the Section dropdown
    And enters the Admission Number "42001" in the Search By Keyword field
    And clicks the search button
    Then make sure the entry "42001" is in the list
    When user clicks on the submodule "Bulk Delete" to delete a student record
    Then user is on the page for deleting records "https://mexil.it/chroma/student/bulkdelete"
    When user selects the student's class "SDET" from the dropdown list
    And user selects the student's section "Cucumber Fundamentals" from the dropdown list
    And user click on the search button
    And user clicks on the checkbox next to the record with the Admission Number "42001"
    And user clicks on the delete button and accept alert with text "Are you sure you want to delete this?"