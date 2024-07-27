package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Human_Resource_module_steps extends PageInitializer {

    @When("the user clicks on the {string} module Human Resource")
    public void the_user_clicks_on_the_human_resource_module(String humanResource) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModule.getText(), humanResource);
        CommonMethods.click(dashboardPage.humanResourceModule);
    }

    @Then("the first {string} is displayed")
    public void the_first_is_displayed(String staffDirectory) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleStaffDirectory.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleStaffDirectory.getText(), staffDirectory);
    }

    @Then("the second {string} is displayed")
    public void the_second_is_displayed(String staffAttendance) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleStaffAttendence.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleStaffAttendence.getText(), staffAttendance);
    }

    @Then("the third {string} is displayed")
    public void the_third_is_displayed(String payroll) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModulePayroll.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModulePayroll.getText(), payroll);
    }

    @Then("the fourth {string} is displayed")
    public void the_fourth_is_displayed(String approveLeaveRequest) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleApproveLeaveRequest.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleApproveLeaveRequest.getText(), approveLeaveRequest);
    }

    @Then("the five {string} is displayed")
    public void the_five_is_displayed(String applyLeave) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleApplyLeave.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleApplyLeave.getText(), applyLeave);
    }

    @Then("the sixth {string} is displayed")
    public void the_sixth_is_displayed(String leaveType) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleLeaveType.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleLeaveType.getText(), leaveType);
    }

    @Then("the seven {string} is displayed")
    public void the_seven_is_displayed(String teachersRating) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleTeachersRating.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleTeachersRating.getText(), teachersRating);
    }

    @Then("the eight {string} is displayed")
    public void the_eight_is_displayed(String department) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleDepartment.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleDepartment.getText(), department);
    }

    @Then("the nine {string} is displayed")
    public void the_nine_is_displayed(String designation) {
        CommonMethods.assertTrue(dashboardPage.humanResourceModuleDesignation.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.humanResourceModuleDesignation.getText(), designation);
    }
}