Feature: HumanResourseModule

  @regression @Dmytro @AG1CP-9
  Scenario: HumanResourseModule
    Given a Chroma Tech Academy teacher or admin is on the login page "https://chroma.mexil.it/site/login"
    When the user enters username "general@teacher.com" in username text box
    When the user enters password "123456" in password text box
    And clicks on Sign In button
    Then the user is successfully directed to the dashboard page "https://mexil.it/chroma/admin/admin/dashboard"
    When the user clicks on the "Human Resource" module Human Resource
    Then the first "Staff Directory" is displayed
    Then the second "Staff Attendance" is displayed
    Then the third "Payroll" is displayed
    Then the fourth "Approve Leave Request" is displayed
    Then the five "Apply Leave" is displayed
    Then the sixth "Leave Type" is displayed
    Then the seven "Teachers Rating" is displayed
    Then the eight "Department" is displayed
    Then the nine "Designation" is displayed
