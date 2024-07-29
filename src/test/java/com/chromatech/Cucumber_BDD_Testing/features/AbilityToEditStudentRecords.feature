Feature: Ability to edit student records

  @Regression @Antony @AG1CP-14 @AbilityToEditStudentRecords @Smoke
  Scenario: Ability to edit student records
    Given a CTSMS user is logged in to the main page "https://mexil.it/chroma/admin/admin/dashboard"
    When user goes to the "Disabled Students" page:
      | Module              | SubModule         | URL                                                 |
      | Student Information | Disabled Students | https://mexil.it/chroma/student/disablestudentslist |
    And user is searching for a student record based on parameters:
      | Class            | SDET                  |
      | Section          | Cucumber Fundamentals |
      | Admission Number | 33445                 |
    And make the record "33445" enabled if it is in the list
    When user goes to the "Bulk Delete" page:
      | Module              | SubModule   | URL                                        |
      | Student Information | Bulk Delete | https://mexil.it/chroma/student/bulkdelete |
    When if a student record already exists, the user deletes it:
      | Class | Section               | Admission Number | Alert Text                            |
      | SDET  | Cucumber Fundamentals | 33445            | Are you sure you want to delete this? |
    When user goes to the student admission page
      | Module              | SubModule         | URL                                    |
      | Student Information | Student Admission | https://mexil.it/chroma/student/create |
    And user fills the first row:
      | Admission No | Roll Number | Class | Section               |
      | 33445        | 10017777    | SDET  | Cucumber Fundamentals |
    And user fills the second row:
      | First Name | Last Name | Gender | Date of Birth |
      | Vlad       | Islav     | Male   | 01/02/1991    |
    And user fills the third row:
      | Category | Email                   |
      | new      | vladislav1142@gmail.com |
    And user fills the fourth row:
      | Admission Date | Blood Group | As on Date |
      | 04/20/2024     | A+          | 04/20/2024 |
    And user fills the fifth row:
      | Mobile Number | Height | Weight |
      | 6028808888    | 6'3    | 9999   |
    And user adds father's information:
      | Father Name  | Father Phone | Father Occupation |
      | Leaha Petrov | 6028801111   | Father Occupation |
    And user adds mother's information:
      | Mother Name     | Mother Phone         | Mother Occupation |
      | Tamaria Petrova | 60288602880222201111 | Mother Occupation |
    And user selects "Mother" in If Guardian Is radiobuttons
    And user adds the first row of guardian's information:
      | Guardian Name | Guardian Relation | Guardian Email              |
      | Chroma        | Tech              | charomatechacademy@the.best |
    And user adds the second row of guardian's information:
      | Guardian Phone | Guardian Occupation | Guardian Address                                       |
      | 6028801020     | Academy             | Monsters Street 3587, East Worcester, Guernsey, 497905 |
    And user adds information in the "Student Address Details" block:
      | If Guardian Address is Current Address  | true                                                     |
      | Current Address                         | Accountability Street 6348, Vader, Lithuania, 076645     |
      | If Permanent Address is Current Address | true                                                     |
      | Permanent Address                       | Terms Street 6744, Siletz, Saint Kitts And Nevis, 459138 |
    And user adds information in the first row of the "Miscellaneous Details" section:
      | Bank Account Number | Bank Name   | IFSC Code |
      | 1301822             | GraphicBank | 395       |
    And user adds information in the second row of the "Miscellaneous Details" section:
      | National Identification Number | Local Identification Number | RTE |
      | 122101706                      | 121000358                   | Yes |
    And user adds information in the third row of the "Miscellaneous Details" section:
      | Previous School Details             | Note                                        |
      | https://jurisdictionkooif9oevxks.qp | At least here, can we not make up the text? |
    And fills out all text fields and uploads files in the "Upload Documents" section:
      | Title #1 | Title #2 | Title #3 | Title #4 |
      | Vander   | Medarda  | Victor   | Jayce    |
    And saves submission
    Then user receives a message of success "Record Saved Successfully"
    When user goes to the "Student Details" page:
      | Module              | SubModule       | URL                                    |
      | Student Information | Student Details | https://mexil.it/chroma/student/search |
    And user is searching for a student record based on parameters:
      | Class            | SDET                  |
      | Section          | Cucumber Fundamentals |
      | Admission Number | 33445                 |
    Then make sure the entry "33445" is in the list and verify data
      | Admission Number | 33445                       |
      | Student Name     | Vlad Islav                  |
      | Class(Section)   | SDET(Cucumber Fundamentals) |
      | Father Name      | Leaha Petrov                |
      | Date of Birth    | 01/02/1991                  |
      | Gender           | Male                        |
      | Category         | new                         |
      | Mobile Number    | 6028808888                  |
      | Height           | 6'3                         |
      | Weight           | 9999                        |
    When user clicks on the name of student record with admission number "33445"
    And clicks on edit button located near top right pencil icon
    And user edits roll number field to "10019999"
    And user edits first name field to "Vova"
    And user edits last name field to "Hook"
    And user edits gender field drop down to "Male"
    And user edits DOB field to "05/05/2005"
    And user edits category field to "Selenium"
    And user edits email field to "thisismyemail@hmail.com"
    And user edits Admission Date field to "06/06/2024"
    And user edits Student Photo field
    And user edits Blood Group field to "B-"
    And user edits As On Date field to "04/21/2024"
    And user edits Mobile Number field to "1234567890"
    And user edits Height field to "5'6"
    And user edits Weight field to "562300"
    And user edits Father Name field to "Misha"
    And user edits Phone No field to "0987654321"
    And user edits Father Occupation field to "Nail and Hair Specialist"
    And user edits Father Photo field
    And user edits Mother Name field to "Anna"
    And user edits Mother Phone field to "6028801122"
    And user edits Mother Occupation field to "FBI"
    And user edits Mother Photo field
    And user selects on the father radio button on edit page
    And user edits Guardian Name to "Misha"
    And user edits Guardian Relation to "Father"
    And user edits Guardian Email to "anemail@email.com"
    And user edits Guardian Photo
    And user edits Guardian Phone to "777989898989898989"
    And user edits Guardian Occupation to "Guardian Occupation"
    And user edits Guardian Address "Functioning Road 314, Bridgeton, Palau, 508603"
    Then user clicks on the save button on edit page
    When user goes to the "Bulk Delete" page:
      | Module              | SubModule   | URL                                        |
      | Student Information | Bulk Delete | https://mexil.it/chroma/student/bulkdelete |
    When if a student record already exists, the user deletes it:
      | Class | Section               | Admission Number | Alert Text                            |
      | SDET  | Cucumber Fundamentals | 33445            | Are you sure you want to delete this? |