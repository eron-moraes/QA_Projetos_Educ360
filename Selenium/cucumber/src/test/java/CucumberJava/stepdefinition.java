package CucumberJava;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class stepdefinition {
   WebDriver driver = null;
	
   @Dado("^eu abra o browser$")
   public void openBrowser() {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\dgrazino\\Desktop\\selenium\\chromedriver.exe");
      driver = new ChromeDriver();
      driver.manage().window().maximize();
   }
	
   @Quando("^eu abro o site da educ360$")
   public void goToFacebook() {
	   driver.get("https://educ360.org/");
   }
	
   @Então("^valido que estou no site correto$")
   public void validaSite() {
   Assert.assertEquals("https://educ360.org/", driver.getCurrentUrl());
   driver.quit();

   }

}