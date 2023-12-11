package runners;

import java.net.MalformedURLException;

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
