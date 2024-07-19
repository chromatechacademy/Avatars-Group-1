Feature: AG1CP-19: Admitting multiple students

  @Regression @AG1CP-19 @Vlad @AdmittingMultipleStudents
  Scenario Outline: Admitting multiple students
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    And user clicks on the "Student Information" module
    And within the expanded module, clicks on the "Student Admission" submodule
    Then user is on the Student Admission page "https://mexil.it/chroma/student/create"
    When user enters Unique Admission Number '<Admission Number>'
    And user enters Roll Number '<Roll Number>'
    And selects '<Class>' for class drop down
    And selects '<Section>' for section drop down
    And enters first name '<First Name>'
    And enters last name '<Last Name>'
    And selects '<Gender>' from gender drop down
    And selects '<Date of Birth>' for Date of Birth Calendar
    And selects '<Category>' from category drop down
    And enters email '<Email>'
    And enters admission date '<Admission Date>'
    And selects '<Blood Group>' from blood group drop down
    And enters As on Date '<As on Date>'
    And enters mobile number '<Mobile Number>'
    And enters height '<Height>'
    And enters weight '<Weight>'
    And enters father name '<Father Name>'
    And enters father phone '<Father Phone>'
    And enters father occupation '<Father Occupation>'
    And enters mother name '<MotherName>'
    And enters mother phone '<Mother Phone>'
    And enters mother occupation '<Mother Occupation>'
    And selects '<Guardian Is>' radio button for If guardian is field
    And enters guardian name '<Guardian Name>'
    And enters guardian relation '<Guardian Relation>'
    And enters guardian email '<Guardian Email>'
    And enters guardian phone '<Guardian Phone>'
    And enters guardian occupation '<Guardian Occupation>'
    And enters guardian address '<Guardian Address>'
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
    And user clicks on the search button
    And user clicks on the checkbox next to the record with the Admission Number '<Admission Number>'
    And user clicks on the delete button and accept alert with text "Are you sure you want to delete this?"

    Examples:
      | Admission Number | Roll Number | Class          | Section               | First Name | Last Name | Gender | Date of Birth | Category | Email            | Admission Date | Blood Group | As on Date | Mobile Number | Height | Weight | Father Name | Father Phone | Father Occupation   | MotherName   | Mother Phone | Mother Occupation   | Guardian Is | Guardian Name | Guardian Relation | Guardian Phone | Guardian Occupation | Guardian Email | Guardian Address |
      | 42002            | 0002        | SDET           | Cucumber Fundamentals | Vlad1      | Islav10   | Female | 01/01/1990    | Selenium | test1@email.com  | 04/20/2001     | B+          | 11/03/2002 | 6028808881    | 5.1    | 888    | Vasya1      | 602802771    | Father Occupation1  | MotherName1  | 6028803331   | Mother Occupation1  | father      | Chroma1       | Tech1             | 6028801021     | Academy1            | gg1@gmail.com  | 123 N Street     |
      | 42003            | 0003        | SDET           | Cucumber Fundamentals | Vlad2      | Islav9    | Male   | 01/01/1999    | new      | test2@email.com  | 04/20/2002     | B+          | 11/03/2003 | 6028808882    | 5.2    | 888    | Vasya2      | 602802772    | Father Occupation2  | MotherName2  | 6028803332   | Mother Occupation2  | mother      | Chroma2       | Tech2             | 6028801022     | Academy2            | gg2@gmail.com  | 124 N Street     |
      | 42004            | 0004        | SDET           | Cucumber Fundamentals | Vlad3      | Islav8    | Female | 01/01/1992    | Selenium | test3@email.com  | 04/20/2003     | B+          | 11/03/2004 | 6028808883    | 5.3    | 888    | Vasya3      | 602802773    | Father Occupation3  | MotherName3  | 6028803333   | Mother Occupation3  | other       | Chroma3       | Tech3             | 6028801023     | Academy3            | gg3@gmail.com  | 125 N Street     |
      | 42005            | 0005        | SDET           | Cucumber Fundamentals | Vlad4      | Islav7    | Male   | 01/01/1993    | new      | test4@email.com  | 04/20/2004     | B+          | 11/03/2005 | 6028808884    | 5.4    | 888    | Vasya4      | 602802774    | Father Occupation4  | MotherName4  | 6028803334   | Mother Occupation4  | father      | Chroma4       | Tech4             | 6028801024     | Academy4            | gg4@gmail.com  | 126 N Street     |
      | 42006            | 0006        | SDET           | Cucumber Fundamentals | Vlad5      | Islav6    | Female | 01/01/1994    | Selenium | test5@email.com  | 04/20/2005     | B+          | 11/03/2006 | 6028808885    | 5.5    | 888    | Vasya5      | 602802775    | Father Occupation5  | MotherName5  | 6028803335   | Mother Occupation5  | mother      | Chroma5       | Tech5             | 6028801025     | Academy5            | gg5@gmail.com  | 127 N Street     |
      | 42007            | 0007        | Cyber Security | API Testing           | Vlad6      | Islav5    | Male   | 01/01/1995    | new      | test6@email.com  | 04/20/2006     | B+          | 11/03/2007 | 6028808886    | 5.6    | 888    | Vasya6      | 602802776    | Father Occupation6  | MotherName6  | 6028803336   | Mother Occupation6  | other       | Chroma6       | Tech6             | 6028801026     | Academy6            | gg6@gmail.com  | 128 N Street     |
      | 42008            | 0008        | Cyber Security | API Testing           | Vlad7      | Islav4    | Female | 01/01/1996    | Selenium | test7@email.com  | 04/20/2007     | B+          | 11/03/2008 | 6028808887    | 5.7    | 888    | Vasya7      | 602802777    | Father Occupation7  | MotherName7  | 6028803337   | Mother Occupation7  | father      | Chroma7       | Tech7             | 6028801027     | Academy7            | gg7@gmail.com  | 129 N Street     |
      | 42009            | 0009        | Cyber Security | API Testing           | Vlad8      | Islav3    | Male   | 01/01/1997    | new      | test8@email.com  | 04/20/2008     | B+          | 11/03/2009 | 6028808888    | 5.8    | 888    | Vasya8      | 602802778    | Father Occupation8  | MotherName8  | 6028803338   | Mother Occupation8  | mother      | Chroma8       | Tech8             | 6028801028     | Academy8            | gg8@gmail.com  | 130 N Street     |
      | 42010            | 0010        | Cyber Security | API Testing           | Vlad9      | Islav2    | Female | 01/01/1998    | Selenium | test9@email.com  | 04/20/2009     | B+          | 11/03/2010 | 6028808889    | 5.9    | 888    | Vasya9      | 602802779    | Father Occupation9  | MotherName9  | 6028803339   | Mother Occupation9  | other       | Chroma9       | Tech9             | 6028801029     | Academy9            | gg9@gmail.com  | 131 N Street     |
      | 42011            | 0011        | Cyber Security | API Testing           | Vlad10     | Islav1    | Male   | 01/01/1999    | new      | test10@email.com | 04/20/2010     | B+          | 11/03/2011 | 6028808810    | 6.0    | 888    | Vasya10     | 602802710    | Father Occupation10 | MotherName10 | 6028803310   | Mother Occupation10 | father      | Chroma10      | Tech10            | 6028801030     | Academy10           | gg10@gmail.com | 132 N Street     |