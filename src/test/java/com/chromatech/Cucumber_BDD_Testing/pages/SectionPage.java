package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.chromatech.utils.WebDriverUtils.driver;

public class SectionPage {
    public SectionPage() {
        PageFactory.initElements(driver, this);
    }

    // DynamicXpath Find element by text
    public WebElement dynamicXpath_Find_element_by_text(String text){
        return driver.findElement(By.xpath("//td[text()='"+text+"']"));
    }

    //Dynamic XPath Find Delete Button By text
    public WebElement dynamicXpath_Find_Delete_Button_By_text(String text){
        return driver.findElement(By.xpath("//td[text()='"+text+"']//parent::tr/td[2]/a[2]/i"));
    }
}
