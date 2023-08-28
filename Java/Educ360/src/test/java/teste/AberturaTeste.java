package teste;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AberturaTeste {

	WebDriver driver;

	@Before

	public void abreBrowser() {

		driver = new ChromeDriver();

		driver.get("https://educ360dev.com.br/qa-test/admin/login");

	}

	@Test

	public void testConfereConfigProjetoOK() throws InterruptedException {

		Assert.assertEquals("https://educ360dev.com.br/qa-test/admin/login", driver.getCurrentUrl());

	}

	@After

	public void fechaBrowser() {

	driver.quit();

}
}
