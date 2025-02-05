package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homework_Module_Page_steps extends PageInitializer {

    @Then("the {string} module is displays")
    public void the_module_is_displays(String expectedHomeworkModuleText) {
        StepsImplementation.the_module_is_displays(expectedHomeworkModuleText);
    }

    @When("the user clicks on the Homework module")
    public void the_user_clicks_on_the_Homework_module() {
        StepsImplementation.the_user_clicks_on_the_Homework_module();
    }

    @Then("the {string} submodule is displays")
    public void the_submodule_is_displays(String expectedAddHomeworkSubmoduleText) {
        StepsImplementation.the_submodule_is_displays(expectedAddHomeworkSubmoduleText);
    }
}