package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class ExpenseHeadPage {

    public ExpenseHeadPage() {
        PageFactory.initElements(driver, this);
    }

    //Expense Module Tab
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expenseModuleTab;

    //Expense Head Tab
    @FindBy(xpath = "//a[normalize-space()='Expense Head']")
    public WebElement expenseHeadTab;

    //Expense Head Page
    @FindBy(xpath = "//h3[normalize-space()='Expense Head']")
    public WebElement expenseHeadPage;

    //Expense Head Text Box
    @FindBy(xpath = "//input[@id='expensehead']")
    public WebElement expenseHeadTextBox;

    //Expense Head Save Button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement expenseHeadSaveBtn;

    //Expense Added Displays
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement expenseAddedDisplays;

    //Expense Head Bill
    @FindBy(xpath = "//a[normalize-space()='Bill']//ancestor::tr")
    public WebElement expenseHeadBill;

    //Expense Head X Button
    @FindBy(xpath = "//a[contains(text(), 'Bill')]//parent::td//parent::tr/td[2]/a[2]/i")
    public WebElement expenseHeadXBtn;



}
