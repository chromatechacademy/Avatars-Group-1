package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.SearchPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Search_Steps {

    SearchPage searchPage = new SearchPage();

    @Then("user is on the Student Details page {string}")
    public void user_is_on_the_student_details_page(String url) {
        CommonMethods.assertEquals(driver.getCurrentUrl(), url);
    }

    @When("the user selects {string} in the Class dropdown")
    public void the_user_selects_in_the_class_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.classDropDown);
    }

    @When("selects {string} in the Section dropdown")
    public void selects_in_the_section_dropdown(String text) {
        CommonMethods.selectDropDownValue(text, searchPage.sectionDropDown);
    }

    @Then("student's record {string} is displayed")
    public void student_s_record_is_displayed(String number) {
        CommonMethods.assertTrue(searchPage.tableLocatorByText(number).isDisplayed());
    }

    @When("user clicks on the student's name {string} on the card with Admission Number {string}")
    public void user_clicks_on_the_student_s_name_on_the_card_with_admission_number(String name, String number) {
        CommonMethods.assertTrue(searchPage.dynamicTableLocator(number).getText().contains(name));
        CommonMethods.click(searchPage.dynamicTableLocator(number));
    }
}