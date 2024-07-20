package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Human_Resource_module_steps {

    DashboardPage DashboardPage = new DashboardPage();

    @When("CTSMS user is on the dashboard page")
    public void the_user_clicks_on_the_Human_Resource_module() {
        CommonMethods.assertTrue(DashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.click(DashboardPage.StudentHomeworkModule);
    }

    @When("the user clicks on the {string} module Human Resource")
    public void the_user_clicks_on_the_human_resource_module(String text) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModule.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModule.getText(), text);
        CommonMethods.click(DashboardPage.humanResourceModule);
        CommonMethods.sleep(3000);

    }

    @Then("the first Submodule {string} is displayed")
    public void the_first_submodule_is_displayed(String staffDirectory) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleStaffDirectory.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleStaffDirectory.getText(), staffDirectory);

    }

    @Then("the second Submodule {string} is displayed")
    public void the_second_submodule_is_displayed(String staffAttendance) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleStaffAttendence.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleStaffAttendence.getText(), staffAttendance);
        CommonMethods.sleep(3000);

    }

    @Then("the third Submodule {string} is displayed")
    public void the_third_submodule_is_displayed(String Payroll) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModulePayroll.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModulePayroll.getText(), Payroll);
        CommonMethods.sleep(3000);

    }

    @Then("the fourth Submodule {string} is displayed")
    public void the_fourth_submodule_is_displayed(String approveLeaveRequest) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleApproveLeaveRequest.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleApproveLeaveRequest.getText(), approveLeaveRequest);
        CommonMethods.sleep(3000);

    }
    @Then("the five Submodule {string} is displayed")
    public void the_five_submodule_is_displayed(String applyLeave) {
        CommonMethods.assertTrue(DashboardPage.humanResourceModuleApplyLeave.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.humanResourceModuleApplyLeave.getText(), applyLeave);
        CommonMethods.sleep(3000);

    }
}