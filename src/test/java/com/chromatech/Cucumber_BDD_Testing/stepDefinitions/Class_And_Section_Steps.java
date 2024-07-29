package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Class_And_Section_Steps extends PageInitializer {

    @Given("a Chroma Tech user is on the dashboard page")
    public void a_chroma_tech_user_is_on_the_dashboard_page() {
        StepsImplementation.a_chroma_tech_user_is_on_the_dashboard_page();
    }

    @When("the user navigates to the Class submodule")
    public void the_user_navigates_to_the_class_submodule() {
        StepsImplementation.the_user_navigates_to_the_class_submodule();
    }

    @Then("there are two classes, {string} and {string} displayed with the following sections:")
    public void there_are_two_classes_and_displayed_with_the_following_sections(String class1, String section1, io.cucumber.datatable.DataTable dataTable) {
        StepsImplementation.there_are_two_classes_sdet_and_cyber_security_displayed_with_the_following_sections(class1, section1, dataTable);
    }
}