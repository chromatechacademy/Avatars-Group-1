Feature: Ability to edit student records

  @Regression @Antony @AG1CP-14
  Scenario: Ability to edit student records
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    And the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on Student Information module
    And user clicks on Student Admission
    When user enters admission number field to the "42990"
    When the user selects "SDET" in the Class dropdown
    And selects "Cucumber Fundamentals" in the Section dropdown
    And user enters first name field to "Bo$$"
    And user selects gender field drop down to "Female"
    And user selects date of birth field to "05/05/2005"
    And user selects on "Father" radio button
    And And user enters Guardian Name to "$uper D@d"
    And user user Guardian Phone to "777989898989898989"
    Then user clicks on the save button
    And clicks on the student details
    And the user navigates to the student search page "https://mexil.it/chroma/student/search"
    When the user selects "SDET" in the Class dropdown in edit page
    And selects "Cucumber Fundamentals" in the Section dropdown in edit page
    And enters the Admission Number "42990" in the Search By Keyword field
    And clicks the search button
    Then make sure the entry "42990" is in the list
    When user clicks on the name of student record with admission number "42990"
    And clicks on edit button located near top right pencil icon
    And user edits roll number field to "42222"
    And user edits first name field to "Mr.Bo$$"
    And user edits last name field to "R@dio Head"
    And user edits gender field drop down to "Male"
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
    And user edits Father Photo field to "src/main/resources/files/clearbeach.jpg"
    And user edits Mother Name field to "B!G MOMMA"
    And user edits Mother Phone field to "703&703$55"
    And user edits Mother Occupation field to "FBI"
    And user edits Mother Photo field to "src/main/resources/files/clearbeach.jpg"
    And user selects on "Father" radio button on edit page
    And user edits Guardian Name to "$uper D@d"
    And user edits Guardian Relation to "Mother"
    And user edits Guardian Email to "YoMomma@email.com"
    And user edits Guardian Photo to "src/main/resources/files/clearbeach.jpg"
    And user edits Guardian Phone to "777989898989898989"
    And user edits Guardian Occupation to "Noneya"
    And user edits Guardian Address "4431 Homies Only Ave, Gangster, VA 777777"
    Then user clicks on the save button on edit page
    And user clicks on the bulk delete button
    And user selects the class drop down "SDET"
    And user selects the section drop down "Cucumber Fundamentals"
    And user clicks on search button
    And user selects "42990" student admission number and deletes it