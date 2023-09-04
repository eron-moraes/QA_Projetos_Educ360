package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DuplicarCliente extends BasePage {
	
	public DuplicarCliente(WebDriver driver) {
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
	
	public void clica1() {
		driver.findElement(By.cssSelector("#main-menu > :nth-child(3) > a")).click();
	}
	
	public void clica2() {	
	driver.findElement(By.cssSelector(".post_32 > :nth-child(4) > strong > .row-title")).click();
	}
	public void clica3() {	
	driver.findElement(By.cssSelector(".text-center > .btn")).click();
	}
	

}
