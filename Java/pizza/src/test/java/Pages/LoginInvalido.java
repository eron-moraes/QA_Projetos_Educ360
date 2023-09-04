package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginInvalido extends BasePage {

	public LoginInvalido(WebDriver driver) {
		super(driver);
	}

	public void acessarPaginaDeLogin() {
		driver.get("https://educ360dev.com.br/qa-test/admin/login");
	}

	public void preencherEmail() {
		driver.findElement(By.id("inputEmail")).sendKeys("qa-test");
	}

	public void preencherSenha() {
		driver.findElement(By.id("inputPassword")).sendKeys("qa-test1");
	}

	public void clicarEntrar() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
