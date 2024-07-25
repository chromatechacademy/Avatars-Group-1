package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.ExpenseHeadPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;

public class Ability_To_Add_And_Remove_Expense_Heads_Steps {

    ExpenseHeadPage expenseHeadPage = new ExpenseHeadPage();

    @When("the user clicks on the Expenses Module")
    public void the_user_clicks_on_the_expenses_module() {
        expenseHeadPage.expenseModuleTab.click();
    }

    @When("the user clicks on Expense Head")
    public void the_user_clicks_on_expense_head() {
        expenseHeadPage.expenseHeadTab.click();
    }

    @When("the user is on the Expense Head page")
    public void the_user_is_on_the_expense_head_page() {
        CommonMethods.assertTrue(expenseHeadPage.expenseHeadPage.isDisplayed());
    }

    @When("the user enters {string} in the expense head field")
    public void the_user_enters_in_the_expense_head_field(String text) {
        CommonMethods.sendKeys(expenseHeadPage.expenseHeadTextBox, text);
    }

    @When("the user clicks on the Save button")
    public void the_user_clicks_on_the_save_button() {
        expenseHeadPage.expenseHeadSaveBtn.click();
    }

    @Then("the expense added displays as expected")
    public void the_expense_added_displays_as_expected() {
        CommonMethods.assertTrue(expenseHeadPage.expenseAddedDisplays.isDisplayed());
    }

    @And("the user clicks on the x button to delete")
    public void the_user_clicks_on_the_x_button_to_delete() {
        JavascriptMethods.scrollIntoView(expenseHeadPage.expenseHeadBill);
        expenseHeadPage.expenseHeadXBtn.click();
    }

    @And("clicks OK on the alert message")
    public void clicks_ok_on_the_alert_message() {
        CommonMethods.sleep(2000);
        CommonMethods.acceptAlert();
    }
}
