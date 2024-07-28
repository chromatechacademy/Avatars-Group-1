package com.chromatech.Cucumber_BDD_Testing.appsCommon;

import com.chromatech.Cucumber_BDD_Testing.pages.*;

public class PageInitializer {

    /**
     * THIS PAGE WILL BE USED TO INITIALIZE ALL
     * PAGE OBJECTS
     */
    public static SearchPage searchPage;
    public static EditPage editPage;
    public static DashboardPage dashboardPage;
    public static AddExpensePage addExpensePage;
    public static LoginPage loginPage;
    public static BulkDeletePage bulkDeletePage;
    public static StudentAdmissionPage studentAdmissionPage;
    public static ClassPage classPage;

    public static void initializeAllPages() {
        searchPage = new SearchPage();
        editPage = new EditPage();
        dashboardPage = new DashboardPage();
        addExpensePage = new AddExpensePage();
        loginPage = new LoginPage();
        bulkDeletePage = new BulkDeletePage();
        studentAdmissionPage = new StudentAdmissionPage();
        classPage = new ClassPage();
    }
}