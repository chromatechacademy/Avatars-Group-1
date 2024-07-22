package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

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

    // Dynamic xpath: Find module by text
    public WebElement findModuleByText(String text) {
        return driver.findElement(By.xpath("//span[text()='" + text + "']"));
    }

    // Student Details subModule
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsSubModule;


    // Dynamic submodule by name
    public WebElement findSubModuleByText(String subModuleName) {
        return driver.findElement(By.xpath("//a[text()=' " + subModuleName + "']"));
    }

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

    public DashboardPage() {
        PageFactory.initElements(driver, this);}
}
