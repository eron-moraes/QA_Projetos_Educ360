package screens;


import static configuration.DriverFactory.getDriver;

import javax.xml.datatype.DatatypeFactory;

public class BasePage {
	public BasePage() {
		DatatypeFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
	}
}
