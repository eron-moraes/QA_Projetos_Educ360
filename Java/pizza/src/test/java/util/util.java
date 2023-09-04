package util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.CadastrarCliente;
import Pages.DuplicarCliente;
import Pages.LoginInvalido;
import Pages.LoginValido;

public class util {

	private WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void loginValido() {
		LoginValido login = new LoginValido(driver);
		login.acessarPaginaDeLogin();
		login.preencherEmail();
		login.preencherSenha();
		login.clicarEntrar();
	}

	@Test
	public void loginInvalido() {
		LoginInvalido login = new LoginInvalido(driver);
		login.acessarPaginaDeLogin();
		login.preencherEmail();
		login.preencherSenha();
		login.clicarEntrar();
		Assert.assertEquals("Usuário ou senha inválidos", 
				 driver.findElement(By.cssSelector(".global_messages > .text-center")).getText());
		
	}

	@Test
	public void testLogin() {
		CadastrarCliente login = new CadastrarCliente(driver);
		login.acessarPaginaDeLogin();
		login.preencherEmail();
		login.preencherSenha();
		login.clicarEntrar();
		Assert.assertEquals("QA Test", driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1/small")).getText());
		login.testCadastroCliente();

	}
	
	@Test
	public void duplicarCliente() {
		DuplicarCliente login = new DuplicarCliente(driver);
		login.acessarPaginaDeLogin();
		login.preencherEmail();
		login.preencherSenha();
		login.clicarEntrar();
		login.clica1();
		login.clica2();
		login.clica3();
		
	}

	@After

	public void fechaBrowser() {
		driver.quit();

	}
}
