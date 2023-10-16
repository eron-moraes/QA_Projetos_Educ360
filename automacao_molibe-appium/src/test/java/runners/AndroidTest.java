package runners;

ns;
import cucumber.api.junit.Cucumber

.junit.runner.RunWith;

import configuration.DriverFactory;
import cucumber.api.CucumberOpt

import java.net.MalformedURLException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import or;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumberHtmlReport"}, dryRun = false,
        features = {"src/test/resources/feature"}, glue = "Steps", tags = {"~@ignore", "@soma"})
public class AndroidTest {
    @BeforeClass
    public static void setUp() throws MalformedURLException {
        DriverFactory.createDriverByParameter("Android");
    }
@AfterClass
    public static void tearDown(){
        DriverFactory.quiDriver();
}
}
