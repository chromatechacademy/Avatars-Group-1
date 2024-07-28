package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class CategoryPage {

    public CategoryPage() {
        PageFactory.initElements(driver, this);
    }

    // User Name
    @FindBy(xpath = "//input[@name='category']")
    public WebElement userName;

    // Save Button
    @FindBy(xpath = "//button[@type='submit'][normalize-space()='Save']")
    public WebElement saveButton;

    //Record Saved Successfully
    @FindBy(xpath = "//div[@class='alert alert-success text-left']")
    public WebElement recordSavedSuccessfully;

    //Delete Button
    @FindBy(xpath = "//body[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/a[2]/i[1]")
    public WebElement deleteButton;

    public static WebElement dynamicDeleteRecordLocator(String text) {
        return WebDriverUtils.driver.findElement(By.xpath("//td[text()='" + text + "']//parent::tr/td[3]/a[2]/i"));
    }
}