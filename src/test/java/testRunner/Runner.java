package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features=".//Features/",
		glue={"stepDefinitions"},
		dryRun=false,
		monochrome=true,
		publish=true,
		plugin = { "pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
				"junit:target/cucumber-reports/Cucumber.xml","json:target/cucumber-reports/Cucumber.json",
				"html:target/cucumber-reports-htmls"}
		)

public class Runner {

}
