package com.chromatech.Cucumber_BDD_Testing.pages;

import com.chromatech.utils.WebDriverUtils;
import org.openqa.selenium.support.PageFactory;

public class EditingPage {

    public EditingPage() {
        PageFactory.initElements(WebDriverUtils.driver, this);
    }


}
