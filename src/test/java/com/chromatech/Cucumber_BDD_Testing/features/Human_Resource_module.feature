Feature: HumanResourseModule

  @Regression @Dmytro @AG1CP-9 @homeResource
  Scenario: HumanResourseModule
    Given a CTSMS user is on the dashboard page
    When the user clicks on the Human Resource module
    Then the following submodules are displayed
