package desafio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Desafio extends BasePage {

    public Desafio(WebDriver driver) {
        super(driver);
    }

    public void acessa() {

        // Abrir a URL
        driver.get("https://aracoiabadaserra-alvara.geopixel.com.br/homolog_aracoiaba/login.html");

        // Realização do login...
        String user = "eron.geopixel";
        String senha = "qwe123";
        driver.findElement(By.id("login")).sendKeys(user);
        driver.findElement(By.id("pass")).sendKeys(senha);
        driver.findElement(By.id("submit")).click();

        // Escolhendo Ação e Tipo de Atividade...
        Select acaoDropdown = new Select(driver.findElement(By.id("acao_id")));
        acaoDropdown.selectByValue("6");
        Select tipoAtividadeDropdown = new Select(driver.findElement(By.id("tipo_atividade_id")));
        tipoAtividadeDropdown.selectByValue("1");
        driver.findElement(By.id("tbn_ok_id")).click();
        
        // Escolhendo Ação e Tipo de Atividade...
        Select acaoDropdown1 = new Select(driver.findElement(By.id("acao_id")));
        acaoDropdown1.selectByValue("6");
        Select tipoAtividadeDropdown1 = new Select(driver.findElement(By.id("tipo_atividade_id")));
        tipoAtividadeDropdown1.selectByValue("1");

        // Preenchimento do Formulário...
        String imob = "000054";
        // Preencha os outros campos do formulário...

        // Anexação de documentos...
        driver.findElement(By.cssSelector("[data-index='0'] > [style='text-align: center; '] > #btn_anexar_id")).click();
        // Preencha os campos para anexar o documento...


        // Enviar para a prefeitura...
        driver.findElement(By.id("btn_concluir_id")).click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        // Adicione uma espera adequada aqui para verificar o sucesso

        // Sair...
        driver.findElement(By.className("navbar-toggler-icon")).click();
        driver.findElement(By.cssSelector(".navbar-nav > :nth-child(3) > a")).click();
    }
}
