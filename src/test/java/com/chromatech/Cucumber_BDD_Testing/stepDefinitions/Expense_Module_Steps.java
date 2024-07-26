package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Expense_Module_Steps {

    DashboardPage dashboardPage = new DashboardPage();

    @When("the user clicks on Expenses")
    public void the_user_clicks_on_expenses() {
        CommonMethods.click(dashboardPage.expensesModule);
    }
    @Then("the Add Expense {string} submodule is displayed")
    public void the_add_expense_submodule_is_displayed(String expectedAddExpense) {
      CommonMethods.assertTrue(dashboardPage.addExpenseSubModule.isDisplayed());
      CommonMethods.assertEquals(dashboardPage.addExpenseSubModule.getText(), expectedAddExpense );
    }
    @Then("the Search Expense {string} submodule is displayed")
    public void the_search_expense_submodule_is_displayed(String expectedSearchExpense) {
        CommonMethods.assertTrue(dashboardPage.searchExpenseSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.searchExpenseSubModule.getText(), expectedSearchExpense);
    }
    @Then("the Expense Head {string} submodule is displayed")
    public void the_expense_head_submodule_is_displayed(String expectedExpenseHead) {
        CommonMethods.assertTrue(dashboardPage.expenseHeadSubModule.isDisplayed());
        CommonMethods.assertEquals(dashboardPage.expenseHeadSubModule.getText(), expectedExpenseHead );

    }
}
