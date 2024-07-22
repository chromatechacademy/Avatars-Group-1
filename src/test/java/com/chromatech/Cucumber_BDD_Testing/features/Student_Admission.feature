Feature: AG1CP-12: StudentAdmission

  @Regression @AG1CP-12 @Vlad @StudentAdmission
  Scenario: Student Admission (Flow: Create - Search - Delete)
    Given a CTSMS user is logged in to the main page "https://mexil.it/chroma/admin/admin/dashboard"
    When if a student record already exists, the user deletes it:
      | Module              | SubModule   | Class | Section               | Admission Number | Alert Text                            | URL                                        |
      | Student Information | Bulk Delete | SDET  | Cucumber Fundamentals | 42001abc         | Are you sure you want to delete this? | https://mexil.it/chroma/student/bulkdelete |
    When user fills in the fields in the "Student Admission" section:
      | Module              | SubModule         | Admission No | Roll Number | Class | Section               | First Name | Last Name | Gender | Date of Birth | Category | Email                   | Admission Date | Student Photo     | Blood Group | As on Date | Mobile Number | Height | Weight | URL                                    |
      | Student Information | Student Admission | 42001abc     | 1001        | SDET  | Cucumber Fundamentals | Vlad       | Islav     | Male   | 01/02/1991    | new      | vladislav1142@gmail.com | 04/20/2024     | Student_Photo.png | A+          | 04/20/2024 | 6028808888    | 6'3    | 9999   | https://mexil.it/chroma/student/create |
    And user adds a sibling using the "Add Sibling" button:
      | Sibling Class | Sibling Section       | Sibling First Name | Sibling Last Name | Sibling Roll Number |
      | SDET          | Cucumber Fundamentals | Vasya              | Petrov            | 1142                |
    And user adds father's information:
      | Father Name  | Father Phone | Father Occupation | Father Photo     |
      | Leaha Petrov | 6028801111   | Father Occupation | Father_Photo.png |
    And user adds mothers's information:
      | Mother Name     | Mother Phone         | Mother Occupation | Mother Photo     |
      | Tamaria Petrova | 60288602880222201111 | Mother Occupation | Mother_Photo.png |
    And user adds guardian's information:
      | If Guardian Is | Guardian Name | Guardian Relation | Guardian Email              | Guardian Photo     | Guardian Phone | Guardian Occupation | Guardian Address                                       |
      | Mother         | Chroma        | Tech              | charomatechacademy@the.best | Guardian_Photo.png | 6028801020     | Academy             | Monsters Street 3587, East Worcester, Guernsey, 497905 |
    And user addis information in the "Student Address Details" block:
      | If Guardian Address is Current Address | Current Address                                      | If Permanent Address is Current Address | Permanent Address                                        |
      | true                                   | Accountability Street 6348, Vader, Lithuania, 076645 | true                                    | Terms Street 6744, Siletz, Saint Kitts And Nevis, 459138 |
    And user addins information in the "Miscellaneous Details" section:
      | Bank Account Number | Bank Name   | IFSC Code | National Identification Number | Local Identification Number | RTE | Previous School Details             | Note                                        |
      | 1301822             | GraphicBank | 395       | 122101706                      | 121000358                   | Yes | https://jurisdictionkooif9oevxks.qp | At least here, can we not make up the text? |
    And fills out all text fields and uploads files in the "Upload Documents" section:
      | Title #1 | Document #1 | Title #2 | Document #2 | Title #3 | Document #3 | Title #4 | Document #4 |
      | Vander   | Vander.png  | Medarda  | Medarda.png | Victor   | Victor.png  | Jayce    | Jayce.png   |
    And saves submission
    And user is searching for a student record based on parameters:
      | Module              | SubModule       | Class | Section               | Admission Number | URL                                    |
      | Student Information | Student Details | SDET  | Cucumber Fundamentals | 42001abc         | https://mexil.it/chroma/student/search |
    Then make sure the entry "42001abc" is in the list:
      | Admission Number | Student Name | Class(Section)                       | Father Name  | Date of Birth | Gender | Category | Mobile Number | Height | Weight | Add Fees |
      | 42001abc         | Vlad Islav   | SDET(Cucumber Fundamentals) | Leaha Petrov | 01/02/1991    | Male   | new      | 6028808888    | 6'3    | 9999   | $        |
    When if a student record already exists, the user deletes it:
      | Module              | SubModule   | Class | Section               | Admission Number | Alert Text                            | URL                                        |
      | Student Information | Bulk Delete | SDET  | Cucumber Fundamentals | 42001abc         | Are you sure you want to delete this? | https://mexil.it/chroma/student/bulkdelete |