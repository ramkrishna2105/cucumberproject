package myTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="E:/Newgen Data/Automation Practice/CucumberProject/Features/MyAccount-Login.Feature",
		glue="stepDefinitions",
		dryRun= true
		)
public class TestRunner {

}
