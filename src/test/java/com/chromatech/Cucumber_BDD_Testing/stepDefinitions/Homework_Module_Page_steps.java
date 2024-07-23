package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homework_Module_Page_steps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the {string} module is displays")
    public void the_module_is_displays(String expectedHomeworkModuleText) {
        CommonMethods.assertTrue(dashboardPage.studentHomeworkModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.studentHomeworkModule.getText(), expectedHomeworkModuleText);
    }

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_Homework_module() {
        CommonMethods.click(dashboardPage.studentHomeworkModule);
    }

    @Then("the {string} submodule is displays")
    public void the_submodule_is_displays(String expectedAddHomeworkSubmoduleText) {
        CommonMethods.assertTrue(dashboardPage.addHomework.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.addHomework.getText().trim(), expectedAddHomeworkSubmoduleText);
    }
}