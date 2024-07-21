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
    And user edits section drop down to "Cucumber Fundamentals"
    And user edits first name field to "Bo$$"
    And user edits last name field to "R@dio"
    And user edits gender field drop down to "Female"
    And user edits DOB field to "05/05/2005"
    And user edits category field to "Selenium"
    And user edits email field to "wh@atsup<3"
    And user edits Admission Date field to "06/06/2024"
    And user edits Student Photo field to "src/main/resources/files/clearbeach.jpg"
    And user edits Blood Group field to "B-"
    And user edits As On Date field to "04/21/2024"
    And user edits Mobile Number field to "1234567890"
    And user edits Height field to "23'6"
    And user edits Weight field to "562300"
    And user edits Father Name field to "B!G DAWG"
    And user edits Phone No field to "0987654321"
    And user edits Father Occupation field to "Nail and Hair Specialist"
    #And user edits Father Photo field to ""
    And user edits Mother Name field to "B!G MOMMA"
    And user edits Mother Phone field to "703&703$55"
    And user edits Mother Occupation field to "FBI"
    #And user edits Mother Photo field to ""
    And user selects on "Father" radio button
    And user edits Guardian Name to "$uper D@d"
    And user edits Guardian Relation to "Mother"
    And user edits Guardian Email to "YoMomma@email.com"
    #And user edits Guardian Photo to ""
    And user edits Guardian Phone to "777989898989898989"
    And user edits Guardian Occupation to "Noneya"
    And user edits Guardian Address "4431 Homies Only Ave, Gangster, VA 777777"
