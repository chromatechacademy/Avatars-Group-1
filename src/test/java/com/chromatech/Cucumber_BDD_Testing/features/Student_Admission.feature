Feature: AG1CP-12: StudentAdmission

  @Regression @AG1CP-12 @Vlad @StudentAdmission
  Scenario: Student Admission
    Given a CTSMS user is logged in to the main page "https://mexil.it/chroma/admin/admin/dashboard"
    When user goes to the "Disabled Students" page:
      | Module              | SubModule         | URL                                                 |
      | Student Information | Disabled Students | https://mexil.it/chroma/student/disablestudentslist |
    And user is searching for a student record based on parameters:
      | Class            | SDET                  |
      | Section          | Cucumber Fundamentals |
      | Admission Number | 33001                 |
    And make the record "33001" enabled if it is in the list
    When user goes to the "Bulk Delete" page:
      | Module              | SubModule   | URL                                        |
      | Student Information | Bulk Delete | https://mexil.it/chroma/student/bulkdelete |
    When if a student record already exists, the user deletes it:
      | Class | Section               | Admission Number | Alert Text                            |
      | SDET  | Cucumber Fundamentals | 33001            | Are you sure you want to delete this? |
    When user goes to the "Student Admission" page:
      | Module              | SubModule         | URL                                    |
      | Student Information | Student Admission | https://mexil.it/chroma/student/create |
    And user fills the first row:
      | Admission No | Roll Number | Class | Section               |
      | 33001        | 10013333    | SDET  | Cucumber Fundamentals |
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
    And user adds mothers's information:
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
      | Admission Number | 33001                 |
    Then make sure the entry "33001" is in the list and verify data
      | Admission Number | 33001                       |
      | Student Name     | Vlad Islav                  |
      | Class(Section)   | SDET(Cucumber Fundamentals) |
      | Father Name      | Leaha Petrov                |
      | Date of Birth    | 01/02/1991                  |
      | Gender           | Male                        |
      | Category         | new                         |
      | Mobile Number    | 6028808888                  |
      | Height           | 6'3                         |
      | Weight           | 9999                        |
    When user goes to the "Bulk Delete" page:
      | Module              | SubModule   | URL                                        |
      | Student Information | Bulk Delete | https://mexil.it/chroma/student/bulkdelete |
    When if a student record already exists, the user deletes it:
      | Class | Section               | Admission Number | Alert Text                            |
      | SDET  | Cucumber Fundamentals | 33001            | Are you sure you want to delete this? |