Feature: AG1CP-7: Expense Module

  @AG1CP-7 @Vannia @Regression
  Scenario: CTSMS Expenses module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    When the user clicks on Expenses
    Then the Add Expense "Add Expense" submodule is displayed
    Then the Search Expense "Search Expense" submodule is displayed
    Then the Expense Head "Expense Head" submodule is displayed
