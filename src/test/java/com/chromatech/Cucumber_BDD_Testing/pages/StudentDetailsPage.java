package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentDetailsPage {

    public StudentDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    // Student Name text
    @FindBy(xpath = "//h3[@class='profile-username text-center']")
    public WebElement studentNametext;

    // Sibling block header
    @FindBy(xpath = "//h3[text()='Sibling']")
    public WebElement siblingBlockHeader;

    // Sibling Name text
    @FindBy(xpath = "//div[@class='box box-widget widget-user-2']/div[1]/h4/a")
    public WebElement siblungNameText;

    // Profile Tab
    @FindBy(xpath = "(//a[text()='Profile'])[2]")
    public WebElement profileTab;

    // Address block header
    @FindBy(xpath = "//h3[contains(text(), 'Address')]")
    public WebElement addressBlockHeader;

    // Parent / Guardian Details block header
    @FindBy(xpath = "//h3[contains(text(), 'Parent / Guardian Details')]")
    public WebElement parentOrGuardianBlockHeader;

    // Miscellaneous Details block header
    @FindBy(xpath = "//h3[contains(text(), 'Miscellaneous Details')]")
    public WebElement miscallaneousDetailsBlockHeafer;
}
