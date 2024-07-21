package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    // Student Homework module
    @FindBy(xpath = "//span[normalize-space()='Homework']")
    public WebElement StudentHomeworkModule;

    // Add Homework subModule
    @FindBy(xpath = "//a[normalize-space()='Add Homework']")
    public WebElement AddHomework;

    // Student Information Module
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationModule;

    // Student Details subModule
    @FindBy(xpath = "//ul[@class='treeview-menu menu-open']//a[normalize-space()='Student Details']")
    public WebElement studentDetails;

    // Student Admission subModule
    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmission;

    // Disabled Students subModule
    @FindBy(xpath = "//a[normalize-space()='Disabled Students']")
    public WebElement disabledStudents;

    // Bulk Delete subModule
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDelete;

    // Student Categories subModule
    @FindBy(xpath = "//a[normalize-space()='Student Categories']")
    public WebElement studentCategories;

    // Student House subModule
    @FindBy(xpath = "//a[normalize-space()='Student House']")
    public WebElement studentHouse;

    // Disable Reason subModule
    @FindBy(xpath = "//a[normalize-space()='Disable Reason']")
    public WebElement disableReason;

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

    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }
}
