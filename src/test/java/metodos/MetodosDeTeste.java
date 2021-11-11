package metodos;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MetodosDeTeste {

	WebDriver driver;

	
		public void abrirNavegador(String site) {
			try {
				System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(site);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			} catch (Exception e) {
				System.err.println("-------- erro ao abrir navegedor -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		
		public void escrever(By elemento, String texto) {
			try {
				driver.findElement(elemento).sendKeys(texto);
			} catch (Exception e) {
				System.err.println("-------- erro ao escrever -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		
		public void clicar(By elemento) {
			try {
				driver.findElement(elemento).click();
			} catch (Exception e) {
				System.err.println("-------- erro ao clicar -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		
		public void fecharTodasAbas() {
			try {
				driver.quit();
				System.out.println("------------- TESTE ENCERRADO -----------------");
			} catch (Exception e) {
				System.err.println("-------- erro ao fechar browser -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		
		public void fecharAbaAtual() {
			try {
				driver.close();
				System.out.println("------------- TESTE ENCERRADO -----------------");
			} catch (Exception e) {
				System.err.println("-------- erro ao fechar browser -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		public void pausa(int tempo) {
			try {
				Thread.sleep(tempo);
			} catch (Exception e) {
				System.err.println("-------- erro ao pausar com Thread.sleep -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}
		}

		public void aguardarElementoClicavel(int tempo, By elemento) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, tempo);
				wait.until(ExpectedConditions.elementToBeClickable(elemento));
			} catch (Exception e) {
				System.err.println("-------- erro ao aguardar elemento ser clicavel -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}

		}

		public void validarJanela(WebElement elemento) {
			int contador = 3;
			while (elemento.isDisplayed() && contador > 0) {
				elemento.click();
				contador--;
			}

		}

		
		public void screenShot(String nomeEvidencia) {
			try {
				TakesScreenshot scrShot = (TakesScreenshot) driver;
				File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
				File destFile = new File("./Evidencias/" + nomeEvidencia + ".png");
				FileUtils.copyFile(scrFile, destFile);
			} catch (Exception e) {
				System.err.println("-------- erro ao tirar screenshot -------- " + e.getMessage());
				System.err.println("-------- causa do erro -------- " + e.getCause());
			}

		}

	}

