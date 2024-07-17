Feature: AG1CP

  # AG1CP - 1
  @Login
  Scenario: Valid Credentials Login
    Given a Chroma Tech Academy teacher or admin is on the login page "https://mexil.it/chroma/site/login"
    When the user logs in with valid credentials "general@teacher.com" and "123456"
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"

  # AG1CP - 12
  @StudentAdmission
  Scenario: Student Admission
    Given a Chroma Tech Academy teacher or admin is on the login page "https://mexil.it/chroma/site/login"
    When the user logs in with valid credentials "general@teacher.com" and "123456"
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When a CTSMS user is logged in to the Student Admission page "https://mexil.it/chroma/student/create"
    And enters Unique Admission Number "42001"
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
    Then the student is successfully admitted

#  # AG1CP - 4
#  @StudentInformationModule
#  Scenario: Student Information module
#    Given a CTSMS user is on the dashboard page
#    When the user clicks on Student Information module
#    Then the following submodules display:
#    * Student Details
#    * Student Admission
#    * Disabled Students
#    * Bulk Delete
#    * Student Categories
#    * Student House
#    * Disable Reason
#
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

  # AG1CP - 13
  @StudentAdmissionWithUniqueAdmissionNumber
  Scenario: Student Admission with Unique Admission Number
    Given a Chroma Tech Academy teacher or admin is on the login page "https://mexil.it/chroma/site/login"
    When the user logs in with valid credentials "general@teacher.com" and "123456"
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When a CTSMS user is logged in to the Student Admission page "https://mexil.it/chroma/student/create"
    And enters Unique Admission Number "42001"
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
#  @SeacrhStudentsRecords
#  Scenario: Ability to search students records
#    Given a CTSMS user is on the Student Details page
#    When the user selects value in the Class dropdown
#    And selects value in the Section dropdown
#    And enter admission number in Search By Keyword field
#    And clicks the search button
#    Then student's record is displayed