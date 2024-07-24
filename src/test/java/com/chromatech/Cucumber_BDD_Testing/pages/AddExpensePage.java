package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddExpensePage {

    //Expense Head DropDown
    @FindBy(xpath = "//select[@name='exp_head_id']")
    public WebElement selectHeadDropDown;

    //Expense Name TextBox
    @FindBy(xpath = "//input[@name='name']")
    public WebElement expenseNameTextBox;

    //InvoiceNumber TextBox
    @FindBy(xpath = "//input[@name='invoice_no']")
    public WebElement invoiceNumberTextBox;

    //Expense Date
    @FindBy(xpath = "//input[@name='date']")
    public WebElement expenseDateCalendar;

    //Expense Amount
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement expenseAmount;

    //Attach Expense File
    @FindBy(xpath = "//p[normalize-space()='Drag and drop a file here or click']")
    public WebElement attachFile;




    public AddExpensePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
