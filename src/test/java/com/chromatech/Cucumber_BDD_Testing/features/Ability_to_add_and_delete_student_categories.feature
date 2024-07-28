Feature: Ability to add and delete student categories

  @Regression @Oksana @AG1CP-20
  Scenario:  Ability to add and delete student categories
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user click on "Student Information" module
    And click to the "Student Categories" submodule
    Then user enter "Oksana" name in category text box
    Then the user click on save button
    Then the record saved successfully
    Then user click on delete button to remove "Oksana" name and confirm