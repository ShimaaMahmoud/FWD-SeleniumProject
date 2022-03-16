package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/resources/features",glue="Steps",
tags = "@t")
public class TestRunner extends AbstractTestNGCucumberTests  {
}
