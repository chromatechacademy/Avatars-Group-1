package com.chromatech.Cucumber_BDD_Testing.stepDefinitions;

import com.chromatech.Cucumber_BDD_Testing.pages.AddExpensePage;
import com.chromatech.Cucumber_BDD_Testing.pages.DashboardPage;
import com.chromatech.utils.CommonMethods;
import com.chromatech.utils.JavascriptMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.chromatech.utils.WebDriverUtils.driver;

public class Add_Expense_Steps {
    DashboardPage dashboardPage = new DashboardPage();
    AddExpensePage addExpensePage = new AddExpensePage();

    @When("the user clicks on the {string} module Expenses")
    public void the_user_clicks_on_the_module_expenses(String expense) {
        dashboardPage.expenseModule.click();
    }

    @When("the user clicks on the {string} submodule Add Expense")
    public void the_user_clicks_on_the_submodule_add_expense(String addExpense) {
        dashboardPage.addExpenseSubmodule.click();
    }

    @Then("the user is on the Add Expense page {string}")
    public void the_user_is_on_the_add_expense_page(String expectedAddExpensePageUrl) {
        CommonMethods.assertEquals(driver.getCurrentUrl(),expectedAddExpensePageUrl);
    }
    @When("the user  selects {string} for Expense Head drop down")
    public void the_user_selects_for_expense_head_drop_down(String expenseHeadDropDown) {
        CommonMethods.selectDropDownValue(expenseHeadDropDown,addExpensePage.selectHeadDropDown);
    }

    @When("enters {string} in Name text box")
    public void enters_in_name_text_box(String expenseName) {
        addExpensePage.expenseNameTextBox.sendKeys(expenseName);
    }

    @When("enters {string} in Invoice Number text box")
    public void enters_in_invoice_number_text_box(String invoiceNumber) {
        addExpensePage.invoiceNumberTextBox.sendKeys(invoiceNumber);
    }

    @When("selects {string} for Date of Calendar")
    public void selects_for_date_of_calendar(String date) {
        JavascriptMethods.selectDateByJS(addExpensePage.expenseDateCalendar,date);
    }

    @When("enters {string} in Amount text box")
    public void enters_in_amount_text_box(String amount) {
       addExpensePage.expenseAmount.sendKeys(amount);
    }

    @When("attach {string} in Attach Document file")
    public void attach_in_attach_document_file(String expenseFile) {
    }


}
