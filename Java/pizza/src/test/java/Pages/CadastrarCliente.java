package Pages;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastrarCliente extends BasePage {

	public CadastrarCliente(WebDriver driver) {
		super(driver);
	}

	public void acessarPaginaDeLogin() {
		driver.get("https://educ360dev.com.br/qa-test/admin/login");
	}

	public void preencherEmail() {
		driver.findElement(By.id("inputEmail")).sendKeys("qa-test");
	}

	public void preencherSenha() {
		driver.findElement(By.id("inputPassword")).sendKeys("qa-test");

	}

	public void clicarEntrar() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Test
	public void testCadastroCliente() {
		driver.findElement(By.cssSelector("#main-menu > :nth-child(3) > a")).click(); // Navegar até a seção "Clientes
																						// cadastro"
		driver.findElement(By.cssSelector("[href='https://educ360dev.com.br/qa-test/admin/clientes/inserir']")).click(); // Clicar
																															// em
																															// "Novo
																															// cliente"

		// Preencher o formulário
		driver.findElement(By.name("nome")).sendKeys("Eron");
		driver.findElement(By.cssSelector(".input-group > .form-control")).sendKeys("15/03/1988");
		driver.findElement(By.name("estado")).sendKeys("São Paulo");
		driver.findElement(By.name("cidade")).sendKeys("São José dos Campos");
		driver.findElement(By.cssSelector(".badge-success")).click(); // Clicar no botão "badge-success"
		driver.findElement(By.id("btn_inserir_editar")).click(); // Clicar no botão "btn_inserir_editar"
		assertTrue(driver.getPageSource().contains("Registro inserido com sucesso"));
	}

}