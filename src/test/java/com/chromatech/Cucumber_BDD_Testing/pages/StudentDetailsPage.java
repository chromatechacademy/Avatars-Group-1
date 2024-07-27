package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import static com.chromatech.utils.WebDriverUtils.driver;

public class StudentDetailsPage {

    public StudentDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    // Student Name text
    @FindBy(xpath = "//h3[@class='profile-username text-center']")
    public static WebElement studentNametext;

    // Sibling Name text
    @FindBy(xpath = "//div[@class='box box-widget widget-user-2']/div[1]/h4/a")
    public static WebElement siblungNameText;

    // Profile Tab
    @FindBy(xpath = "(//a[text()='Profile'])[2]")
    public static WebElement profileTab;

    // Address block header
    @FindBy(xpath = "//h3[contains(text(), 'Address')]")
    public static WebElement addressBlockHeader;

    // Parent / Guardian Details block header
    @FindBy(xpath = "//h3[contains(text(), 'Parent / Guardian Details')]")
    public static WebElement parentOrGuardianBlockHeader;

    // Miscellaneous Details block header
    @FindBy(xpath = "//h3[contains(text(), 'Miscellaneous Details')]")
    public static WebElement miscallaneousDetailsBlockHeafer;

    // Sibling header text
    @FindBy(xpath = "//h3[text()='Sibling']")
    public WebElement siblingHeaderText;

    // Dynamic xpath for the Student Name block
    public static WebElement dynamicXpathForTheStudentNameBlock(String studentName, int i) {
        return driver.findElement(By.xpath("//h3[text()='" + studentName + "']/following-sibling::ul/li[" + (i + 1) + "]/a"));
    }

    // Dynamic xpath for the Sibling block
    public static WebElement dynamicXpathForTheSiblingBlock(int i) {
        return driver.findElement(By.xpath("//div[@class='box box-widget widget-user-2']/div[2]/ul/li[" + (i + 1) + "]/a"));
    }

    // Dynamic xpath for the first block of the Profile tab
    public static WebElement dynamicXpathFirstBlockProfile(int i) {
        return driver.findElement(By.xpath("//tbody/tr[" + (i + 1) + "]/td[2]"));
    }

    // Dynamic xapth for the second block og the Profile tab
    public static WebElement dynamicXpathSecondBlockProfile(String blockName, int i) {
        return driver.findElement(By.xpath("//h3[contains(text(), '" + blockName + "')]/following-sibling::div/table/tbody/tr[" + i + "]/td[2]"));
    }

    // Dynamic xpath for the third block of the Profile tab
    public static WebElement dynamicXpathThirdBlockProfile(String blockName, int i) {
        return driver.findElement(By.xpath("//h3[contains(text(), '" + blockName + "')]/following-sibling::div/table/tbody/tr[" + i + "]/td[2]"));
    }

    // Dynamic xpath for the fourth block of the Profile tab
    public static WebElement dynamicXpathFourthBlockProfile(String blockName, int i) {
        return driver.findElement(By.xpath("//h3[contains(text(), '" + blockName + "')]/following-sibling::div/table/tbody/tr[" + i + "]/td[2]"));
    }

    // Disabling button
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-down']")
    public WebElement disableButton;

    // Reason selector
    @FindBy(xpath = "//select[@name='reason']")
    public WebElement reasonSelector;

    // Note textBox
    @FindBy(xpath = "//textarea[@name='note']")
    public WebElement noteTextBox;

    // Save button in the modal dialog
    @FindBy(xpath = "(//button[text()='Save'])[3]")
    public WebElement saveButtonModalDialog;

    // Dynamic xpath for disabling information
    public static List<WebElement> disablingInformation() {
        return driver.findElements(By.xpath("//ul[@class='list-group list-group-unbordered']/li/span"));
    }

    // Enabling button
    @FindBy(xpath = "//i[@class='fa fa-thumbs-o-up']")
    public WebElement enableButton;

    // Disable Student modal dialog header text
    @FindBy(xpath = "//h4[@class='box-title']")
    public WebElement disableStudentModalDialogHeaderText;

    // Disable Reason text
    @FindBy(xpath = "(//span[@class='pull-right text-aqua'])[1]")
    public WebElement disableReasonText;

    // Disable Note text
    @FindBy(xpath = "(//span[@class='pull-right text-aqua'])[2]")
    public WebElement disableNoteText;
}
