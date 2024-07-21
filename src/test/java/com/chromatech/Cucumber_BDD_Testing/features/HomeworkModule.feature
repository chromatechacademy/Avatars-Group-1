Feature: AG1CP-10: HomeworkModule

  @Regression @AG1CP-10 @Oksana @HomeworkModule
  Scenario: HomeworkModule
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the Homework module
    And the Homework module is displays
    Then the Add homework submodule is displays