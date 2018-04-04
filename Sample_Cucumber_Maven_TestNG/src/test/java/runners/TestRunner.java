package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/FeatureFile",
glue={"classpath:stepDefinition"},
dryRun=false,
monochrome=true,
plugin={"pretty"})
public class TestRunner extends AbstractTestNGCucumberTests {

}
