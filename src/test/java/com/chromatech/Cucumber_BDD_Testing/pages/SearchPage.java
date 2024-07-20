package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static com.chromatech.utils.WebDriverUtils.driver;

public class SearchPage {

    // Search by Keyword textbox
    @FindBy(xpath = "//input[@class='form-control']")
    public WebElement searchByKeywordTextBox;

    // Search button
    @FindBy(xpath = "//button[@value='search_full']")
    public WebElement searchButton;

    // Class dropdown
    @FindBy(xpath = "//select[@id='class_id']")
    public WebElement classDropDown;

    // Section Drop Down
    @FindBy(xpath = "//select[@id='section_id']")
    public WebElement sectionDropDown;

    // Table Locator by Text
    public static WebElement tableLocatorByText(String text) {
        return driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]"));
    }

    // Edit Icon Button
    @FindBy(xpath="//i[@class='fa fa-pencil']")
    public WebElement editIconButton;

    // Dynamic Table Locator
    public static WebElement dynamicTableLocator(String text) {
        return driver.findElement(By.xpath("//td[contains(text(),'" + text + "')]//parent::tr/td[2]"));
    }

    // Bulk Delete subModule
    @FindBy(xpath = "//a[normalize-space()='Bulk Delete']")
    public WebElement bulkDeleteSubModule;
}
