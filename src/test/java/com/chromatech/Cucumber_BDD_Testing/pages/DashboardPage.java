package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    // Student Homework Module
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement StudentHomeworkModule;

    // Add Homework
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement AddHomework;

    //Student Information Module
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    //Student Details
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetails;

    //Student Admission
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmission;

    //Disabled Students
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudents;

    //Bulk Delete
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    //Student Categories
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategories;

    //Student House
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouse;

    //Disable Reason
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReason;

    // *INCOME MODULE*
    @FindBy (xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    // *SUBMODULE: ADD INCOME*
    @FindBy (xpath = "(//a[@href='https://mexil.it/chroma/admin/income'])[2]")
    public WebElement addIncomeSubModule;

    // *SUBMODULE: SEARCH INCOME*
    @FindBy (xpath = "//a[normalize-space()='Search Income']")
    public WebElement searchIncomeSubModule;

    //*SUBMODULE: INCOME HEAD*
    @FindBy (xpath ="//a[normalize-space()='Income Head']")
    public WebElement incomeHeadSubModule;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);}
}
