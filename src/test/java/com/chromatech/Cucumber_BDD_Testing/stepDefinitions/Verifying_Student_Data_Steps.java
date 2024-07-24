package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.Cucumber_BDD_Testing.pages.EditPage;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verifying_Student_Data_Steps {
    SearchPage searchPage = new SearchPage();
    EditPage editPage = new EditPage();
    DashboardPage dashboardPage = new DashboardPage();


    @Given("a student has been admitted")
    public void a_student_has_been_admitted() {

    }
    @When("an user navigates to the student details tab and selects class criteria")
    public void an_user_navigates_to_the_student_details_tab_and_selects_class_criteria() {

    }
    @When("when user selects section dropdown")
    public void when_user_selects_section_dropdown() {

    }
    @When("user enters {string} in Search by Keyword")
    public void user_enters_in_search_by_keyword(String string) {

    }

    @Then("all data submitted with the record should display as expected")
    public void all_data_submitted_with_the_record_should_display_as_expected() {

    }
}
