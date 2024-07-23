package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homework_Module_Page_steps {

    DashboardPage DashboardPage = new DashboardPage();

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_Homework_module() {
        CommonMethods.assertTrue(DashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.click(DashboardPage.StudentHomeworkModule);
    }

    @When("the {string} module is displays")
    public void the_module_is_displays(String HomeworkModuleText) {
        CommonMethods.assertTrue(DashboardPage.StudentHomeworkModule.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.StudentHomeworkModule.getText(), HomeworkModuleText);
    }

    @Then("the {string} submodule is displays")
    public void the_submodule_is_displays(String AddHomework) {
        CommonMethods.assertTrue(DashboardPage.addHomeworkSubModule.isDisplayed());
        CommonMethods.assertEquals(DashboardPage.addHomeworkSubModule.getText(), AddHomework);
    }
}



