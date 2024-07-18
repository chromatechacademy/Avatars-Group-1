Feature: StudentAdmission

  @StudentAdmission @Regression @Vlad @AG1CP-12
  Scenario: Student Admission
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And User clicks on the "Student Information" module
    And within the expanded module, clicks on the "Student Admission" submodule
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
    Then user sees a message about successful card creation "Record Saved Successfully"
    When user clicks on the "Student Details" submodule
    And the user navigates to the student search page "https://mexil.it/chroma/student/search"
    When the user selects "SDET" in the Class dropdown
    And selects "Cucumber Fundamentals" in the Section dropdown
    And enters the Admission Number "42001" in the Search By Keyword field
    And clicks the search button
    Then make sure the entry "42001" is in the list

#  # AG1CP - 4
#  @StudentInformationModule
#  Scenario: Student Information module
#    Given a Chroma Tech Academy teacher or admin is on the login page "https://mexil.it/chroma/site/login"
#    When user enters "general@teacher.com" in the login field
#    And enters "123456" in the password field
#    And clicks on the Sing In button
#    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
#    When the user clicks on Student Information module
#    Then the following submodules display:
#    And "Student Details" submodule is displayed
#    And "Student Admission" submodule is displayed
#    And "Disabled Students"  submodule is displayed
#    And "Bulk Delete" submodule is displayed
#    And "Student Categories" submodule is displayed
#    And "Student House" submodule is displayed
#    And "Disable Reason" submodule is displayed

#  # AG1CP - 2
#  @SecurityMechanismToPreventInvalidCredentialsLogin
#  Scenario: Security mechanism to prevent invalid credentials login
#    Given a user is on the Chroma Tech login page
#    When the user attempts to log in with invalid credentials
#    Then the application should not allow user to log in
#
#  # AG1CP - 19
#  @AdmittingmMultipleStudents
#  Scenario Outline: Admitting multiple students
#    Given a CTSMS admin or faculty member is on the student admission page
#    Then the user should be able to admit multiple students with unique admission numbers
#  Examples:

#  # AG1CP - 14
#  @AbilityToEditStudentRecords
#  Scenario: Ability to edit student records
#    Given a CTSMS user opens a student record
#    When making and saving changes to the student information
#    Then the student information is successfully saved
#
#  # AG1CP - 10
#  @HomeworkModule
#  Scenario: Homework module
#    Given a CTSMS user is on the dashboard page
#    When the user clicks on the Homework module
#    Then the following module displays:
#    * Add homework
#
#  # AG1CP - 9
#  @HumanResourceModule
#  Scenario: Human Resource module
#    Given a CTSMS user is on the dashboard page
#    When the user clicks on the Human Resource module
#    Then the following submodules are displayed:
#    * Staff Directory
#    * Staff Attendance
#    * Payroll
#    * Approve Leave Request
#    * Apply Leave
#    * Leave Type
#    * Teachers Rating
#    * Department
#    * Designation
#
  @SeacrhStudentsRecords
  Scenario: Ability to search students records
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When User clicks on the "Student Information" module
    When user clicks on the "Student Details" submodule
    Then user is on the Student Details page "https://mexil.it/chroma/student/search"
    When the user selects "SDET" in the Class dropdown
    And selects "Cucumber Fundamentals" in the Section dropdown
    And enters the Admission Number "42001" in the Search By Keyword field
    And clicks the search button
    Then make sure the entry "42001" is in the list