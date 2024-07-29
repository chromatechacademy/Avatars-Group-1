Feature: Ability to add and delete classes

  @Regression @AG1CP-18 @Vero @AbilityToAddAndDeleteClasses
  Scenario: Ability to add and delete classes
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    And the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When user navigates to the Academics module
    Then navigates to the Class submodule
    Then make sure "Avatars Group 1" does not exist, if yes remove it
    Then the user is able to add class titled "Avatars Group 1"
    Then selects section "Selenium Test Automation"
    And saves submission on the class page
    And user clicks on delete button to remove class "Avatars Group 1" and confirms
    Then make sure "Avatars Group 1" does not exist, if yes remove it
