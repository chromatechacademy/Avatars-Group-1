Feature: HumanResourseModule

  @Regression @Dmytro @AG1CP-9 @homeResource
  Scenario: HumanResourseModule
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the "Human Resource" module Human Resource
    Then the following submodules are displayed
