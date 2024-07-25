package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Human_Resource_module_steps {

    DashboardPage DashboardPage = new DashboardPage();

    @When("the user clicks on the {string} module Human Resource")
    public void the_user_clicks_on_the_human_resource_module(String humanResource) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModule.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModule.getText(), humanResource);
        CommonMethods.click(DashboardPage.humanResourceModule);
    }

    @Then("the first {string} is displayed")
    public void the_first_is_displayed(String staffDirectory) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleStaffDirectory.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleStaffDirectory.getText(), "Staff Directory");
    }

    @Then("the second {string} is displayed")
    public void the_second_is_displayed(String staffAttendance) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleStaffAttendence.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleStaffAttendence.getText(), staffAttendance);
    }

    @Then("the third {string} is displayed")
    public void the_third_is_displayed(String payroll) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModulePayroll.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModulePayroll.getText(), payroll);
    }

    @Then("the fourth {string} is displayed")
    public void the_fourth_is_displayed(String approveLeaveRequest) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleApproveLeaveRequest.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleApproveLeaveRequest.getText(), approveLeaveRequest);
    }

    @Then("the five {string} is displayed")
    public void the_five_is_displayed(String applyLeave) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleApplyLeave.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleApplyLeave.getText(), applyLeave);
    }

    @Then("the sixth {string} is displayed")
    public void the_sixth_is_displayed(String leaveType) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleLeaveType.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleLeaveType.getText(), leaveType);
    }

    @Then("the seven {string} is displayed")
    public void the_seven_is_displayed(String teachersRating) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleTeachersRating.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleTeachersRating.getText(), teachersRating);
    }

    @Then("the eight {string} is displayed")
    public void the_eight_is_displayed(String department) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleDepartment.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleDepartment.getText(), department);
    }

    @Then("the nine {string} is displayed")
    public void the_nine_is_displayed(String designation) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleDesignation.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleDesignation.getText(), designation);
    }
}
