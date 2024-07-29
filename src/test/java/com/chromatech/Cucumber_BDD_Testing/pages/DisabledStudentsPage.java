package com.chromatech.Cucumber_BDD_Testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import static com.chromatech.utils.WebDriverUtils.driver;

public class DisabledStudentsPage {

    public DisabledStudentsPage() {
        PageFactory.initElements(driver, this);
    }

    // Dynamic xpath for fing a student record by Admission Number
    public static WebElement dynamicXpathFindByNumber(String number) {
        return driver.findElement(By.xpath("//td[text()='" + number + "']"));
    }

    // Dynamic xpath for fing a student name in the record by Admission Number
    public static WebElement dynamicXpathFindNameByNumber(String number) {
        return driver.findElement(By.xpath("//td[text()='" + number + "']/following-sibling::td[1]/a"));
    }
}
