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
    public WebElement addHomeworkSubModule;
  
    //Student Information Module
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    //Student Details
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsSubModule;

    //Student Admission
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionSubModule;

    //Disabled Students
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudentsSubModule;

    //Bulk Delete
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;

    //Student Categories
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategoriesSubModule;

    //Student House
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouseSubModule;

    //Disable Reason
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReasonSubModule;

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);}
}
