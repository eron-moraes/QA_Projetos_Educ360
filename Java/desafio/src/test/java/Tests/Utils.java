package Tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import desafio.Desafio;


public class Utils {
  
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
        driver = new ChromeDriver();
      
    }
    
    @Test
    public void testFluxo() {
        Desafio desafio = new Desafio(driver);
        desafio.acessa();
    }

    @After

    public void fechaBrowser() {
        driver.quit();

    }
}
