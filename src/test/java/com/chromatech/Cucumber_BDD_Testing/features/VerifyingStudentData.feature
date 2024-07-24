Feature:  Verifying Student Data


  Scenario:  Verifying Student Data
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Given a student has been admitted
    When an user navigates to the student details tab and selects class criteria
    And when user selects section dropdown
    And user enters "AG1CP-1142" in Search by Keyword
    Then all data submitted with the record should display as expected