Feature: AG1CP-19 - Admitting multiple students

  @Regression @AG1CP-19 @AdmittingMultipleStudents  @Vlad
  Scenario Outline: Admitting multiple students
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And User clicks on the "Student Information" module
    And within the expanded module, clicks on the "Student Admission" submodule
    Then user is on the Student Admission page "https://mexil.it/chroma/student/create"
    When user enters Unique Admission Number '<Admission Number>'
    And user enters Roll Number '<Roll Number>'
    And selects SDET for class drop down '<Class>'
    And selects '<Section>' for section drop down
    And enters first name '<First Name>'
    And enters last name '<Last Name>'
    And select '<Gender>' from gender drop down
    And selects '<Date of Birth>' for Date of Birth Calendar
    And select '<Category>' from category drop down
    And enter father name '<Father Name>'
    And selects Father radio button for If guardian is field
    And enter guardian phone number '<Guardian Phone Number>'
    And saves submission
    Then user sees a message about successful card creation "Record Saved Successfully"
    When user clicks on the "Student Details" submodule
    And the user navigates to the student search page "https://mexil.it/chroma/student/search"
    When the user selects '<Class>' in the Class dropdown
    And selects '<Section>' in the Section dropdown
    And enters the Admission Number '<Admission Number>' in the Search By Keyword field
    And clicks the search button
    Then make sure the entry '<Admission Number>' is in the list
    When user clicks on the submodule "Bulk Delete" to delete a student record
    Then user is on the page for deleting records "https://mexil.it/chroma/student/bulkdelete"
    When user selects the student's class '<Class>' from the dropdown list
    And user selects the student's section '<Section>' from the dropdown list
    And user click on the search button
    And user clicks on the checkbox next to the record with the Admission Number '<Admission Number>'
    And user clicks on the delete button and accept alert with text "Are you sure you want to delete this?"

    Examples:
      | Admission Number | Roll Number | Class          | Section               | First Name | Last Name | Gender | Date of Birth | Father Name | Guardian Phone Number |
      | 42002            | 0002        | SDET           | Cucumber Fundamentals | Vlad1      | Islav10   | Female | 01/01/1990    | Vasya1      | 6028800001            |
      | 42003            | 0003        | SDET           | Cucumber Fundamentals | Vlad2      | Islav9    | Male   | 01/01/1999    | Vasya2      | 6028800002            |
      | 42004            | 0004        | SDET           | Cucumber Fundamentals | Vlad3      | Islav8    | Female | 01/01/1992    | Vasya3      | 6028800003            |
      | 42005            | 0005        | SDET           | Cucumber Fundamentals | Vlad4      | Islav7    | Male   | 01/01/1993    | Vasya4      | 6028800004            |
      | 42006            | 0006        | SDET           | Cucumber Fundamentals | Vlad5      | Islav6    | Female | 01/01/1994    | Vasya5      | 6028800005            |
      | 42007            | 0007        | Cyber Security | API Testing           | Vlad6      | Islav5    | Male   | 01/01/1995    | Vasya6      | 6028800006            |
      | 42008            | 0008        | Cyber Security | API Testing           | Vlad7      | Islav4    | Female | 01/01/1996    | Vasya7      | 6028800007            |
      | 42009            | 0009        | Cyber Security | API Testing           | Vlad8      | Islav3    | Male   | 01/01/1997    | Vasya8      | 6028800008            |
      | 42010            | 0010        | Cyber Security | API Testing           | Vlad9      | Islav2    | Female | 01/01/1998    | Vasya9      | 6028800009            |
      | 42011            | 0011        | Cyber Security | API Testing           | Vlad10     | Islav1    | Male   | 01/01/1999    | Vasya10     | 6028800010            |