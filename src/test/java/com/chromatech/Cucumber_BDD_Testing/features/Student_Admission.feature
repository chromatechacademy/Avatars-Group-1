Feature: AG1CP-12: StudentAdmission

  @Regression @AG1CP-12 @StudentAdmission @Vlad
  Scenario: Student Admission (Flow: Create - Search - Delete)
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And user clicks on the "Student Information" module
    And within the expanded module, clicks on the "Student Admission" submodule
    Then user is on the Student Admission page "https://mexil.it/chroma/student/create"
    When user enters Unique Admission Number "42001"
    And user enters Roll Number "1001"
    And selects "SDET" for class drop down
    And selects "Cucumber Fundamentals" for section drop down
    And enters first name "FirstName"
    And enters last name "Last Name"
    And selects "Female" from gender drop down
    And selects "01/02/1991" for Date of Birth Calendar
    And selects "new" from category drop down
    And enters email "test@email.com"
    And enters admission date "04/20/2024"
    And selects "A+" from blood group drop down
    And enters As on Date "04/20/2024"
    And enters mobile number "6028808888"
    And enters height "6'3"
    And enters weight "9999"
    And enters father name "FatherName"
    And enters father phone "6028801111"
    And enters father occupation "Father Occupation"
    And enters mother name "MotherName"
    And enters mother phone "6028802222"
    And enters mother occupation "Mother Occupation"
    And selects "mother" radio button for If guardian is field
    And enters guardian name "Chroma"
    And enters guardian relation "Tech"
    And enters guardian email "guardian@email.com"
    And enters guardian phone "6028801020"
    And enters guardian occupation "Academy"
    And enters guardian address "1142 G Address"
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
    And user clicks on the search button
    And user clicks on the checkbox next to the record with the Admission Number "42001"
    And user clicks on the delete button and accept alert with text "Are you sure you want to delete this?"