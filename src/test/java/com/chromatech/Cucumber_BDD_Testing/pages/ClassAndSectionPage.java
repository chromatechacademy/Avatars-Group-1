package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class ClassAndSectionPage extends PageInitializer {

    public ClassAndSectionPage() {
        PageFactory.initElements(driver, this);
    }

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

    //Testing Fundamentals
    @FindBy(xpath = "//div[contains(text(), 'Testing Fundamentals')]//parent::td//parent::tr")
    public WebElement testingFundamentals;

    //SDLC Methodologies
    @FindBy(xpath = "//div[contains(text(), 'SDLC Methodologies')]//parent::td//parent::tr")
    public WebElement sdlcMethodogies;

    //Selenium Test Automation
    @FindBy(xpath = "//div[contains(text(), 'Selenium Test Automation')]//parent::td//parent::tr")
    public WebElement seleniumTestAutomation;

    //Cucumber Fundamentals
    @FindBy(xpath = "//div[contains(text(), 'Cucumber Fundamentals')]//parent::td//parent::tr")
    public WebElement cucumberFundamentals;

    //API Testing
    @FindBy(xpath = "//div[contains(text(), 'API Testing')]//parent::td//parent::tr")
    public WebElement apiTesting;

    //Git/GitHub
    @FindBy(xpath = "//div[contains(text(), 'Git/GitHub')]//parent::td//parent::tr")
    public WebElement gitgithub;

    //Java 11 for Cool People
    @FindBy(xpath = "//div[contains(text(), 'Java 11 for Cool People')]//parent::td//parent::tr")
    public WebElement java11ForCoolPeople;

    //Mobile Test Automation
    @FindBy(xpath = "//div[contains(text(), 'Mobile Test Automation')]//parent::td//parent::tr")
    public WebElement mobileTestAutomation;

    //Accessibility Testing
    @FindBy(xpath = "//div[contains(text(), 'Accessibility Testing')]//parent::td//parent::tr")
    public WebElement accessiblityTesting;

    //Database Testing
    @FindBy(xpath = "//div[contains(text(), 'Database Testing')]//parent::td//parent::tr")
    public WebElement databaseTesting;

    //Cyber Security Class
    @FindBy(xpath = "//td[normalize-space()='Cyber Security']")
    public WebElement cyberSecurityClass;

    //Networking Fundamentals
    @FindBy(xpath = "//div[contains(text(), 'Networking Fundamentals')]")
    public WebElement networkingFundamentals;

    //Linux Fundamentals
    @FindBy(xpath = "//div[contains(text(), 'Linux Fundamentals')]")
    public WebElement linuxFundamentals;

    //CIA Triad
    @FindBy(xpath = "//div[contains(text(), 'CIA Triad')]")
    public WebElement ciaTriad;

    //Penetration Testing/Ethical Hacking
    @FindBy(xpath = "//div[contains(text(), 'Penetration Testing/Ethical Hacking')]")
    public WebElement penetrationTestingEthicalHacking;
}