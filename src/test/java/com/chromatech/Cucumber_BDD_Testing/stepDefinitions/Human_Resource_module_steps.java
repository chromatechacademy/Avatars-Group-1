package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.When;

public class Human_Resource_module_steps {

    DashboardPage DashboardPage = new DashboardPage();

    @When("CTSMS user is on the dashboard page")
    public void the_user_clicks_on_the_Human_Resource_module() {
        CommonMethods.assertTrue(DashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.click(DashboardPage.StudentHomeworkModule);
    }