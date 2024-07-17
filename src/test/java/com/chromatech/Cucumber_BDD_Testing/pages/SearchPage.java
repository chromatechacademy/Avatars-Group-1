package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }

    // Serch by Keyword Textbox
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement SearchByKeywordTextBox;

    // Search Button
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchButton;

    // Class Dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Section DropDown
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // Table Locator by Text
    public static WebElement tableLocatorByText(String text) {
        return driver.findElement(By.xpath("//td[contains(text(),'"+ text + "')]"));
    }

    // Dynamic Table Locator
    public static WebElement dynamicTableLocator(String text) {
        return driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]//parent::tr/td[2]"));
    }
}
