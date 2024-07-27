package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class DashboardPage {

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }

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
    public static WebElement findModuleByText(String text) {
        return driver.findElement(By.xpath("//span[text()='" + text + "']"));
    }

    // Student Details subModule
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetailsSubModule;

    // Dynamic submodule by name
    public WebElement findSubModuleByText(String subModuleName) {
        return driver.findElement(By.xpath("//ul[@class='treeview-menu']/li/a[contains(text(), '" + subModuleName + "')]"));
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

    // Human Resource module
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    // Staff Directory subModule
    @FindBy(xpath = "(//a[@href='https://mexil.it/chroma/admin/staff'])[2]")
    public WebElement humanResourceModuleStaffDirectory;

    // Staff Attendance subModule
    @FindBy(xpath = "(//a[normalize-space()='Staff Attendance'])[2]")
    public WebElement humanResourceModuleStaffAttendence;

    // Payroll subModule
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement humanResourceModulePayroll;

    // Approve Leave Reques subModule
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public WebElement humanResourceModuleApproveLeaveRequest;

    // Apply Leave subModule
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement humanResourceModuleApplyLeave;

    // Leave Type subModule
    @FindBy(xpath = "//a[normalize-space()='Leave Type']")
    public WebElement humanResourceModuleLeaveType;

    // Teachers Rating subModule
    @FindBy(xpath = "//a[normalize-space()='Teachers Rating']")
    public WebElement humanResourceModuleTeachersRating;

    // Department subModule
    @FindBy(xpath = "//a[normalize-space()='Department']")
    public WebElement humanResourceModuleDepartment;

    // Designation subModule
    @FindBy(xpath = "//a[normalize-space()='Designation']")
    public WebElement humanResourceModuleDesignation;

    // Income Module
    @FindBy(xpath = "//span[normalize-space()='Income']")
    public WebElement incomeModule;

    // Add Income subModule
    @FindBy(xpath = "(//a[@href='https://mexil.it/chroma/admin/income'])[2]")
    public WebElement addIncomeSubModule;

    // Search Income subModule
    @FindBy(xpath = "//a[normalize-space()='Search Income']")
    public WebElement searchIncomeSubModule;

    // Income Head subModule
    @FindBy(xpath = "//a[normalize-space()='Income Head']")
    public WebElement incomeHeadSubModule;

    //Expenses Module
    @FindBy(xpath = "//span[normalize-space()='Expenses']")
    public WebElement expenseModule;

    //Add expense Submodule
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Add Expense']")
    public WebElement addExpenseSubmodule;
}