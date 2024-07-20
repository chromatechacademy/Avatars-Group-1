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

    // Human Resource Module
    @FindBy(xpath = "//span[normalize-space()='Human Resource']")
    public WebElement humanResourceModule;

    //Human Resource Module Staff Directory
    @FindBy(xpath = "//li[@class='active']//a[normalize-space()='Staff Directory']")
    public WebElement humanResourceModuleStaffDirectory;

    //Human Resource Module Staff Attendance
    @FindBy(xpath = "//li[@class='active']//a[normalize-space()='Staff Attendance']")
    public WebElement humanResourceModuleStaffAttendence;

    //Human Resource Module Payroll
    @FindBy(xpath = "//a[normalize-space()='Payroll']")
    public WebElement humanResourceModulePayroll;

    //Human Resource Module Approve Leave Reques
    @FindBy(xpath = "//a[normalize-space()='Approve Leave Request']")
    public  WebElement humanResourceModuleApproveLeaveRequest;

    //Human Resource Module Apply Leave
    @FindBy(xpath = "//a[normalize-space()='Apply Leave']")
    public WebElement humanResourceModuleApplyLeave;


    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);}
}
