Feature: AG1CP-27: Verifying Student Data

  @Regression @AG1CP-27 @Vannia
  Scenario: Verifying Student Data
    Given a CTSMS user is logged in to the main page "https://mexil.it/chroma/admin/admin/dashboard"
    When user goes to the "Student Details" page:
      | Module              | SubModule       | URL                                    |
      | Student Information | Student Details | https://mexil.it/chroma/student/search |
    And user is searching for a student record based on parameters:
      | Class            | SDET                  |
      | Section          | Cucumber Fundamentals |
      | Admission Number | 42001-sibling         |
    Then make sure the entry "42001-sibling" is in the list:
      | Admission Number | 42001-sibling               |
      | Student Name     | Vlad Islav                  |
      | Class(Section)   | SDET(Cucumber Fundamentals) |
      | Father Name      | Leaha Petrov                |
      | Date of Birth    | 01/02/1991                  |
      | Gender           | Male                        |
      | Category         | new                         |
      | Mobile Number    | 6028808888                  |
      | Height           | 6'3                         |
      | Weight           | 9999                        |
    When the user navigates to the detailed student information page "42001-sibling"
    And verifies the information in the student name block:
      | Student Name     | Vlad Islav            |
      | Admission Number | 42001-sibling         |
      | Roll Number      | 10011001              |
      | Class            | SDET (2020-21)        |
      | Section          | Cucumber Fundamentals |
      | RTE              | Yes                   |
      | Gender           | Male                  |
    And if the "Sibling" block is displayed, verifies the data from that block:
      | Sibling Name             | Vlad Islav            |
      | Sibling Admission Number | 42001                 |
      | Sibling Class            | SDET                  |
      | Sibling Section          | Cucumber Fundamentals |
    And checks the data from the first block under the "Profile" tab:
      | Admission Date | 04/20/2024              |
      | Date of Birth  | 01/02/1991              |
      | Category       | new                     |
      | Email          | vladislav1142@gmail.com |
      | Mobile Number  | 6028808888              |
      | Height         | 6'3                     |
      | Weight         | 9999                    |
    And checks the data from the seconds block "Address":
      | Current Address   | Accountability Street 6348, Vader, Lithuania, 076645     |
      | Permanent Address | Terms Street 6744, Siletz, Saint Kitts And Nevis, 459138 |
    And checks the data from the third block "Parent / Guardian Details":
      | Father Name         | Leaha Petrov                                           |
      | Father Phone        | 6028801111                                             |
      | Father Occupation   | Father Occupation                                      |
      | Mother Name         | Tamaria Petrova                                        |
      | Mother Phone        | 60288602880222201111                                   |
      | Mother Occupation   | Mother Occupation                                      |
      | Guardian Name       | Chroma                                                 |
      | Guardian Email      | charomatechacademy@the.best                            |
      | Guardian Relation   | Tech                                                   |
      | Guardian Phone      | 6028801020                                             |
      | Guardian Occupation | Academy                                                |
      | Guardian Address    | Monsters Street 3587, East Worcester, Guernsey, 497905 |
    And checks the data from the fourth block "Miscellaneous Details":
      | Blood Group                    | A+                                  |
      | As on Date                     | 04/20/2024                          |
      | Previous School Details        | https://jurisdictionkooif9oevxks.qp |
      | National Identification Number | 122101706                           |
      | Local Identification Number    | 121000358                           |
      | Bank Account Number            | 1301822                             |
      | Bank Name                      | GraphicBank                         |
      | IFSC Code                      | 395                                 |