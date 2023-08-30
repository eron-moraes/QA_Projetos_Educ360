package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Login;


public class Utils {
  
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
      
    }
    
    @Test
    public void testLogin() {
        Login login = new Login(driver);
        login.acessarPaginaDeLogin();
        login.preencherEmail();
        login.preencherSenha();
        login.clicarEntrar();
        Assert.assertEquals("QA Test", driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1/small")).getText());

    }

    @After

    public void fechaBrowser() {
        driver.quit();

    }
}