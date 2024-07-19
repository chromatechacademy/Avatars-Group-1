package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homework_Module_Page_steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_Homework_module() {
        CommonMethods.assertTrue(dashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.click(dashboardPage.StudentHomeworkModule);
    }

    @Then("the following module displays:")
    public void the_following_module_displays() {
        CommonMethods.assertTrue(dashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.click(dashboardPage.StudentHomeworkModule);
    }

    @Then("Add homework")
    public void add_homework() {
        CommonMethods.assertTrue(dashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.click(dashboardPage.StudentHomeworkModule);
    }
}

