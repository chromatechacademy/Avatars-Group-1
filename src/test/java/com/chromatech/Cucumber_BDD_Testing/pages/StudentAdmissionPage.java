package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class StudentAdmissionPage {

    public StudentAdmissionPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }


}
