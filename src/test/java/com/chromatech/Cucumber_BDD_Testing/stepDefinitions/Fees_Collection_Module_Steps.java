package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fees_Collection_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("user clicks on Fees Collection")
    public void user_clicks_on_fees_collection() {
        CommonMethods.click(dashboardPage.feesCollectionModule);
    }
    @Then("the Collect Fees submodule {string} is displayed")
    public void the_collect_fees_submodule_is_displayed(String expectedCollectFees) {
      CommonMethods.assertTrue(dashboardPage.collectFeesSubModule.isDisplayed());
      CommonMethods.assertEquals(dashboardPage.collectFeesSubModule.getText(), expectedCollectFees);
    }
    @Then("the Search Fees Payment submodule {string} is displayed")
    public void the_search_fees_payment_submodule_is_displayed(String expectedSearchFees) {
        CommonMethods.assertTrue(dashboardPage.searchFeesPaymentSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.searchFeesPaymentSubModule.getText(), expectedSearchFees);
    }
    @Then("the Search Due Fees submodule {string} is displayed")
    public void the_search_due_fees_submodule_is_displayed(String expectedSearchDueFees) {
        CommonMethods.assertTrue(dashboardPage.searchDueFeesSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.searchDueFeesSubModule.getText(), expectedSearchDueFees);
    }
    @Then("the Fees Master submodule {string} is displayed")
    public void the_fees_master_submodule_is_displayed(String expectedFeesMaster) {
        CommonMethods.assertTrue(dashboardPage.feesMasterSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesMasterSubModule.getText(), expectedFeesMaster);
    }
    @Then("the Fees Group submodule {string} is displayed")
    public void the_fees_group_submodule_is_displayed(String expectedFeesGroup) {
        CommonMethods.assertTrue(dashboardPage.feesGroupSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesGroupSubModule.getText(), expectedFeesGroup);
    }
    @Then("the Fees Type submodule {string} is displayed")
    public void the_fees_type_submodule_is_displayed(String expectedFeesType) {
        CommonMethods.assertTrue(dashboardPage.feesTypeSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesTypeSubModule.getText(), expectedFeesType);
    }
    @Then("the Fees Discount submodule {string} is displayed")
    public void the_fees_discount_submodule_is_displayed(String expectedFeesDiscount) {
        CommonMethods.assertTrue(dashboardPage.feesDiscountSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesDiscountSubModule.getText(), expectedFeesDiscount);
    }
    @Then("the Fees Carry Forward submodule {string} is displayed")
    public void the_fees_carry_forward_submodule_is_displayed(String expectedFeesCarryForward) {
        CommonMethods.assertTrue(dashboardPage.feesCarryForwardSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesCarryForwardSubModule.getText(), expectedFeesCarryForward);
    }
    @Then("the Fees Reminder submodule {string} is displayed")
    public void the_fees_reminder_submodule_is_displayed(String expectedFeesReminder) {
        CommonMethods.assertTrue(dashboardPage.feesReminderSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.feesReminderSubModule.getText(), expectedFeesReminder);
    }
    }
