package clientes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

public class CadastroClientesTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\ChromeDriver\\109");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testCadastroDeClientes() {
        driver.get("https://educ360dev.com.br/qa-test/admin/login");

        // Login
        driver.findElement(By.cssSelector(':nth-child(1) > label')).sendKeys("qa-test");
        driver.findElement(By.cssSelector(':nth-child(2) > label')).sendKeys("qa-test");
        driver.findElement(By.cssSelector('.custom-control-label')).click();
        driver.findElement(By.cssSelector('.btn')).click();

        // Clientes cadastro
        driver.findElement(By.cssSelector('#main-menu > :nth-child(3) > a')).click();

        // Novo cliente
        driver.findElement(By.cssSelector('[href="https://educ360dev.com.br/qa-test/admin/clientes/inserir"]')).click();

        // Formulário
        var usuario = {
            nome: "Denilson",
            estado: "São Paulo",
            cidade: "São Paulo"
        };

        driver.findElement(By.cssSelector('[name="nome"]')).sendKeys(usuario.nome);
        driver.findElement(By.cssSelector('.input-group > .form-control')).sendKeys("15/03/1990");
        driver.findElement(By.cssSelector('[name="estado"]')).sendKeys(usuario.estado);
        driver.findElement(By.cssSelector('[name="cidade"]')).sendKeys(usuario.cidade);
        driver.findElement(By.cssSelector('.badge-success')).click();
        driver.findElement(By.cssSelector('#btn_inserir_editar')).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
