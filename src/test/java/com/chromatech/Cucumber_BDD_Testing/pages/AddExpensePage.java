package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
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

    //Invoice Number TextBox
    @FindBy(xpath = "//input[@name='invoice_no']")
    public WebElement invoiceNumberTextBox;

    //Expense Date
    @FindBy(xpath = "//input[@name='date']")
    public WebElement expenseDateCalendar;

    //Expense Amount
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement expenseAmount;

    //Attach Expense File
    @FindBy(xpath = "//input[@name='documents']")
    public WebElement attachFile;

    //Description Text Box
    @FindBy(xpath = "//textarea[@name='description']")
    public WebElement descriptionTextBox;

    //Save Button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    //Search Button
    @FindBy(xpath = "//input[@placeholder='Search...']")
    public WebElement searchButton;

    //Expense is displayed
    @FindBy(xpath = "//tbody/tr[1]/td[1]")
    public WebElement enteredExpense;

    // Delete Button
    @FindBy(xpath = "//tbody/tr[1]/td[6]/a[2]")
    public WebElement deleteButton;

    /**
     * This method returns the WebElement for dynamically locating the delete record button based on the given text.
     *
     * @param text the text used for locating the delete record button
     * @return the WebElement representing the delete record button
     */
    public static WebElement dynamicDeleteRecordLocator (String text){
        return  WebDriverUtils.driver.findElement(By.xpath("//a[(text()='"+ text +"')]//parent::td//parent::tr/td[6]/a[2]/i"));
    }

    public AddExpensePage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}