Feature: AG1CP-5: Feed Collection Module

  @Vannia
  Scenario: CTSMS Fees Collection Module
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    When user clicks on Fees Collection
    Then the first submodule "Collect Fees" is displayed
    And the second submodule Search Fees Payment is displayed
    And the third submodule displays Search Due Fees
    And the fourth submodule Fees Master is displayed
    And the fifth submodule Fees Group displays
    And the sixth submodule Fees Type is displayed
    And the seven Fees Discount is displayed
    And the eight Fees Carry Forward is displayed
    And the last submodule Fees Reminder is displayed
    