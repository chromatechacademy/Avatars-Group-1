Feature: Student Information Module

  @AG1CP-4 @vero @Regression
  Scenario: Student Information Module
    Given a CTSMS user is on the dashboard page
    When the user clicks on Student Information module
    Then the following submodules display:
    * Student Details
    * Student Admission
    * Disabled Students
    * Bulk Delete
    * Student Categories
    * Student House
    * Disable Reason