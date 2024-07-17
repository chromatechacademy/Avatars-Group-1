package Hooks;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
//Before to run the test, we want the browser to open and maximize
//we want to execute before and after each scenario
    @Before
    public void start(Scenario scenario) {
        CucumberLogUtils.scenario = scenario;
        PageInitializer.initializeAllPages();
        WebDriverUtils.setUp();
    }
    //we want selenium to do driver.quit
    @After
    public void end() {
        WebDriverUtils.tearDown();
    }
}
