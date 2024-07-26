Feature: AG1CP-5: Fees Collection Module

@AG1CP-5 @Vannia @Regression
  Scenario: CTSMS Fees Collection Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    When user clicks on Fees Collection
    Then the Collect Fees submodule "Collect Fees" is displayed
    And the Search Fees Payment submodule "Search Fee Payment" is displayed
    And the Search Due Fees submodule "Search Due Fees" is displayed
    And the Fees Master submodule "Fees Master" is displayed
    And the Fees Group submodule "Fees Group" is displayed
    And the Fees Type submodule "Fees Type" is displayed
    And the Fees Discount submodule "Fees Discount" is displayed
    And the Fees Carry Forward submodule "Fees Carry Forward" is displayed
    And the Fees Reminder submodule "Fees Reminder" is displayed
    