package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static configuration.DriverFactory.getDriver;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }
}
