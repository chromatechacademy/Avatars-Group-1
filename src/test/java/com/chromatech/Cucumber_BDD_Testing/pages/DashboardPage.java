package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    // Student Homework module
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement studentHomeworkModule;

    // Add Homework subModule
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement addHomework;

    // Student Information module
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    // Student Details subModule
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsSubModule;

    // Student Admission subModule
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubModule;

    // Disabled Students subModule
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentsSubModule;

    // Bulk Delete subModule
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    // Student Categories subModule
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategoriesSubModule;

    // Student House subModule
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouseSubModule;

    // Disable Reason subModule
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReasonSubModule;

    // Income Module
    @FindBy (xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    // Add Income subModule
    @FindBy (xpath = "(//a[@href='https://mexil.it/chroma/admin/income'])[2]")
    public WebElement addIncomeSubModule;

    // Search Income subModule
    @FindBy (xpath = "//a[normalize-space()='Search Income']")
    public WebElement searchIncomeSubModule;

    // Income Head subModule
    @FindBy (xpath ="//a[normalize-space()='Income Head']")
    public WebElement incomeHeadSubModule;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);}
}
