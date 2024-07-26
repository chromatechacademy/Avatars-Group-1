Feature: AG1CP-6: Income Module

  @Regression @IncomeModule  @AG1CP-6
  Scenario: CTSMS Income Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    When user clicks on Income module
    Then the following submodule "Add Income" is displayed
    And the submodule "Search Income" is displayed
    And the following Income Head submodule "Income Head" is displayed