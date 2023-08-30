package desafio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class desafio {
    public static void main(String[] args) {
        // Configurar o caminho para o chromedriver
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

        // Configurar opções do Chrome (para evitar mensagem de warning)
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); // Isso desativa as notificações
        WebDriver driver = new ChromeDriver(options);

        try {
            // Abrir a URL
            driver.get("https://aracoiabadaserra-alvara.geopixel.com.br/homolog_aracoiaba/login.html");

            // Entrada e validação de entrada no sistema
            driver.manage().window().setSize(new org.openqa.selenium.Dimension(1440, 900));
            assert driver.findElement(By.cssSelector(":nth-child(2) > h1")).getText().contains("Prefeitura Municipal de Araçoiaba da Serra");
            Thread.sleep(2000);

            // Realização do login do requerente
            String user = "eron.geopixel";
            String senha = "qwe123";
            driver.findElement(By.id("login")).sendKeys(user);
            driver.findElement(By.id("pass")).sendKeys(senha);
            driver.findElement(By.id("submit")).click();

            // Escolhendo Ação e Tipo de Atividade para iniciar o processo
            assert driver.findElement(By.cssSelector(":nth-child(2) > h1")).getText().contains("Prefeitura Municipal de Araçoiaba da Serra");
            Select acaoDropdown = new Select(driver.findElement(By.id("acao_id")));
            acaoDropdown.selectByValue("6");
            Select tipoAtividadeDropdown = new Select(driver.findElement(By.id("tipo_atividade_id")));
            tipoAtividadeDropdown.selectByValue("1");
            driver.findElement(By.id("tbn_ok_id")).click();

            // Preenchimento do Formulário
            String imob = "000054";
            String complemento = "casa";
            String bairro = "Vila Geo";
            String cep = "18110210";
            String numero = "10";
            String telefone = "12000000000";
            String email = "eron@teste.com";
            String descrip = "descricao realizada!";
            String cpf = "14478379831";
            String crea = "000000000";
            String doc = "DOCTEST.pdf";

            assert driver.findElement(By.id("text_dados-do-i1")).getText().contains("Dados do Imóvel");
            driver.findElement(By.id("inscricao_name")).sendKeys(imob, Keys.ENTER);
            driver.findElement(By.id("complemento")).sendKeys(complemento);
            driver.findElement(By.id("bairro")).sendKeys(bairro);

            // Resto do código de preenchimento do formulário...

            // Anexação de documentos
            assert driver.findElement(By.tagName("h3")).getText().contains("Alvará de Construção");
            driver.findElement(By.cssSelector("[data-index='0'] > [style='text-align: center; '] > #btn_anexar_id")).click();
            driver.findElement(By.className("float-center")).sendKeys(doc);
            driver.findElement(By.id("sendFileId")).click();
            assert driver.findElement(By.id("spanAlertUpload")).getText().contains("Arquivo enviado com sucesso.");

            // Enviar para a prefeitura
            driver.findElement(By.id("btn_concluir_id")).click();
            driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            assert driver.findElement(By.tagName("h1")).getText().contains("Prefeitura Municipal de Araçoiaba da Serra");

            // Sair
            driver.findElement(By.className("navbar-toggler-icon")).click();
            driver.findElement(By.cssSelector(".navbar-nav > :nth-child(3) > a")).click();

            // Fechar o navegador
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}