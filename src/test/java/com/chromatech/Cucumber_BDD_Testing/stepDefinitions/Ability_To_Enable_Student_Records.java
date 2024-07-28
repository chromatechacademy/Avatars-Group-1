package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.Cucumber_BDD_Testing.appsCommon.StepsImplementation;
import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.chromatech.utils.WebDriverUtils.driver;

public class Ability_To_Enable_Student_Records extends PageInitializer {

    @When("user clicks on the student's name {string}")
    public void user_clicks_on_the_student_s_name(String number) {
        CommonMethods.click(SearchPage.studentNameByAdmissionNumber(number));
    }

    @Then("user navigates to the Student Details page {string}")
    public void user_navigates_to_the_student_details_page(String url) {
        CommonMethods.assertTrue(driver.getCurrentUrl().contains(url));
    }

    @When("user clicks on the enabling button")
    public void user_clicks_on_the_enabling_button() {
        StepsImplementation.click_enabling_button_if_visible();
    }

    @When("accepts alert with text {string}")
    public void accepts_alert_with_text(String text) {
        StepsImplementation.accepts_alert_with_text(text);
    }

    @Then("the enable button is not displayed on the student’s card")
    public void the_enable_button_is_not_displayed_on_the_student_s_card() {
        StepsImplementation.click_enabling_button_if_visible();
    }

    @Then("disabling information is not displayed")
    public void disalbing_information_is_not_dislayed(DataTable dataTable) {
        StepsImplementation.verifies_the_information_about_disabled_student_in_the_student_name_block(dataTable);
    }

    @Then("make sure the entry {string} is not in the list and enable if yes")
    public void make_sure_the_entry_is_not_in_the_list_and_enable_if_yes(String number) {
        StepsImplementation.make_sure_the_entry_is_not_in_the_list_and_enable_if_yes(number);
    }
}
