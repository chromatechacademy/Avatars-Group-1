Feature: HumanResourseModule

  @regression @Dmytro @AG1CP-9
  Scenario: HumanResourseModule
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the "Human Resource" module Human Resource
    Then the first Submodule "Staff Directory" is displayed
    Then the second Submodule "Staff Attendance" is displayed
    Then the third Submodule "Payroll" is displayed
    Then the fourth Submodule "Approve Leave Request" is displayed
    Then the five Submodule "Apply Leave" is displayed
    Then the sixth Submodule "Leave Type" is displayed
    Then the seven Submodule "Teachers Rating" is displayed
    Then the eight Submodule "Department" is displayed
    Then the nine Submodule "Designation" is displayed
