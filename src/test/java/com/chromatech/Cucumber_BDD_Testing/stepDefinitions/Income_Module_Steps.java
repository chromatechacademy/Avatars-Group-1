package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class  Income_Module_Steps extends PageInitializer {

    @When("user clicks on Income module")
    public void user_clicks_on_income_module() {
        CommonMethods.click(dashboardPage.incomeModule);
    }

    @Then("the following submodule {string} is displayed")
    public void the_following_submodule_is_displayed(String expectedText) {
        CommonMethods.assertTrue(dashboardPage.addIncomeSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.addIncomeSubModule.getText(), expectedText);
    }

    @Then("the submodule {string} is displayed")
    public void the_submodule_is_displayed(String expectedSearchIncome) {
        CommonMethods.assertTrue(dashboardPage.searchIncomeSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.searchIncomeSubModule.getText(), expectedSearchIncome);
    }

    @Then("the following Income Head submodule {string} is displayed")
    public void the_following_income_head_submodule_is_displayed(String expectedIncomeHead) {
        CommonMethods.assertTrue(dashboardPage.incomeHeadSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.incomeHeadSubModule.getText(), expectedIncomeHead);
    }
}