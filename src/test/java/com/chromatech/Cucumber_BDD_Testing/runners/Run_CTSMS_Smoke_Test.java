package com.chromatech.Cucumber_BDD_Testing.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "html:target/cucumber-reports/cucumber-html-report.html","json:target/cucumber.json",
        "rerun:target/failed.txt",
        "pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/java/com/chromatech/Cucumber_BDD_Testing/features",
        glue = "com.chromatech.Cucumber_BDD_Testing.stepDefinitions",
        tags = "@Smoke",
        dryRun = false
)

public class Run_CTSMS_Smoke_Test extends AbstractTestNGCucumberTests {

}