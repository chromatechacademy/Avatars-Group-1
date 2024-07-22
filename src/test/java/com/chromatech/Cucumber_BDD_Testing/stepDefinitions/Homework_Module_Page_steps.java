package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homework_Module_Page_steps {

    DashboardPage dashboardPage = new DashboardPage();

    @Then("the Homework module is displays")
    public void the_homework_module_is_displays() {
        CommonMethods.assertTrue(dashboardPage.studentHomeworkModule.isDisplayed());
    }

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_Homework_module() {
        CommonMethods.click(dashboardPage.studentHomeworkModule);
    }

    @Then("the Add homework submodule is displays")
    public void add_homework() {
        CommonMethods.assertTrue(dashboardPage.addHomework.isDisplayed());
    }
}