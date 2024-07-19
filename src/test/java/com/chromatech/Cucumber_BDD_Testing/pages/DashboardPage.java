package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {


    public DashboardPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);}

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
}
