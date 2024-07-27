package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_To_Add_And_Delete_Classes_Steps extends
        PageInitializer {

    @When("user navigates to the Academics module")
    public void user_navigates_to_the_academics_module() {
        CommonMethods.click(dashboardPage.academicsModule);
    }

    @Then("navigates to the Class submodule")
    public void navigates_to_the_class_submodule() {
        CommonMethods.click(dashboardPage.classSubmodule);
    }

    @Then("the user is able to add class titled {string}")
    public void the_user_is_able_to_add_class_titled(String text) {
        CommonMethods.sendKeys(classPage.classTextBox, text);
    }

    @Then("selects section {string}")
    public void selects_section(String text) {
        StepsImplementation.selects_section(text);
    }

    @Then("saves submission on the class page")
    public void saves_submission_on_the_class_page() {
        CommonMethods.click(classPage.saveButton);
    }

    @Then("user clicks on delete button to remove class {string} and confirms")
    public void user_clicks_on_delete_button_to_remove_class_and_confirms(String classText) {
        StepsImplementation.user_clicks_on_delete_button_to_remove_class_and_confirms(classText);
    }

    @Then("make sure {string} does not exist, if yes remove it")
    public void make_sure_does_not_exist_if_yes_remove_it(String classText) {
        StepsImplementation.make_sure_does_not_exist_if_yes_remove_it(classText);
    }
}