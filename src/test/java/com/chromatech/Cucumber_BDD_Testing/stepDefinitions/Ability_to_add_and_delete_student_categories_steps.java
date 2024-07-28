package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ability_to_add_and_delete_student_categories_steps extends PageInitializer {

    @When("the user click on {string} module")
    public void the_user_click_on_module(String StudentInformation) {
        CommonMethods.click(dashboardPage.studentInformationModule);
    }

    @When("click to the {string} submodule")
    public void click_to_the_submodule(String StudentCategories) {
        CommonMethods.click(dashboardPage.studentCategoriesSubModule);
    }

    @Then("user enter {string} name in category text box")
    public void user_enter_name_in_category_text_box(String Oksana) {
        categoryPage.userName.sendKeys(Oksana);
    }

    @Then("the user click on save button")
    public void the_user_click_on_save_button() {
        categoryPage.saveButton.click();
    }

    @Then("the record saved successfully")
    public void the_record_saved_successfully() {
        CommonMethods.assertTrue(categoryPage.recordSavedSuccessfully.isDisplayed());
    }

    @Then("user click on delete button to remove {string} name and confirm")
    public void user_click_on_delete_button_to_remove_name_and_confirm(String Oksana) {
        stepImplementation.user_click_on_delete_button_to_remove_name_and_confirm(Oksana);
    }
}