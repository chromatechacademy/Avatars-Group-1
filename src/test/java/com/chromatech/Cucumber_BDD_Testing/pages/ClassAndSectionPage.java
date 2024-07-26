package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class ClassAndSectionPage {

    public ClassAndSectionPage() { PageFactory.initElements(driver, this); }

    //Dashboard Page Header
    @FindBy(xpath = "//span[@class='sidebar-session']")
    public WebElement dashBoardPageHeader;

    //Academics Module Tab
    @FindBy(xpath = "(//a[@href='#'])[8]")
    public WebElement academicsModuleTab;

    //Class Submodule
    @FindBy(xpath = "(//a[normalize-space()='Class'])[1]")
    public WebElement classSubmodule;

    //SDET Class
    @FindBy(xpath = "//td[normalize-space()='SDET']")
    public WebElement sdetClass;

    //Cyber Security Class
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    public WebElement cyberSecurity;


}
