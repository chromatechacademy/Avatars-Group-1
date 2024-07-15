package Hooks;

import com.chromatech.Cucumber_BDD_Testing.appsCommon.PageInitializer;
import com.chromatech.utils.CucumberLogUtils;
import com.chromatech.utils.WebDriverUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

    @Before
    public void start(Scenario scenario) {
        CucumberLogUtils.scenario = scenario;
        PageInitializer.initializeAllPages();
        WebDriverUtils.setUp();
    }

    @After
    public void end() {
        WebDriverUtils.tearDown();
    }
}
