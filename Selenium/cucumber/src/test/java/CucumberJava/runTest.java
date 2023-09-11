package CucumberJava;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/automacaoCucumber.feature", glue = {
		"stepdefinition" }, monochrome = true, dryRun = false)

public class runTest {

}