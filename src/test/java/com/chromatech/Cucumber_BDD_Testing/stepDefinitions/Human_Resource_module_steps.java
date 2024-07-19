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
        CommonMethods.sleep(3000);

    }
}

