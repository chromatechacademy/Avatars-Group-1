Feature: AG1CP-28: Adding Expenses

  @Regression @Hasnaa @AG1CP-28
  Scenario: Adding Expenses
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    And the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the "Expenses" module Expenses
    When the user clicks on the " Add Expense " submodule Add Expense
    Then the user is on the Add Expense page "https://mexil.it/chroma/admin/expense"
    When the user  selects "test" for Expense Head drop down
    And enters "Silya" in Name text box
    And enters "202030" in Invoice Number text box
    And selects "2/07/2024" for Date of Calendar
    And enters "200$" in Amount text box
    And attach file in Attach Document file
    And add "Student Material invoice" in Description text box
    And saves Expense submission
    Then the user clicks on search button and enters "Silya" Name
    Then the expense  with "Silya"  name displays as expected
    Then the expense record with "Silya" Name is deleted
