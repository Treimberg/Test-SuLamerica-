package elementoweb;

import org.openqa.selenium.By;

public class ElementoWeb {

	public By continuar = By.xpath("//span[contains(text(),'Continuar')]");
	public By simular = By.xpath("//*[@id=\"root\"]/div/div/div/section[1]/div/div/div[1]/div/button/span[1]");
	public By nome = By.id("id-name");
	public By datanasc = By.name("birthday");
	public By prof = By.id("professionalActivityId");
	public By prof2 = By.id("professionalActivityId-option-2");
	public By proximo = By.xpath("//span[contains(text(),'PRÓXIMO')]");
	public By email = By.name("checkedEmail");
	public By phone = By.name("phone");
	public By email2 = By.name("email");
	public By autorizacao = By.name("shareDataWithPartners");
	public By seguro = By.xpath("//span[contains(text(),'ENCONTRAR MEU SEGURO')]");
	public By ajuda = By.xpath("//*[@id=\"banner-position\"]/div[2]/div/div[1]/p");
	public By valor = By.id("monthlyIncome");
	public By periodo = By.id("howLong");
	public By calcular = By.xpath("//span[contains(text(),'CALCULAR')]");
	public By contratar = By.xpath("//span[contains(text(),'CONTRATAR')] ");
	public By cpf = By.name("cpf");
	public By sexo = By.id("gender-select");
	public By sexo2 = By.xpath("//*[@id=\"menu-gender\"]/div[3]/ul/li[2]");
	public By altura = By.id("height");
	public By confemail = By.name("emailConfirmation");
	public By peso = By.name("weight");
	public By proximo2 = By.xpath("//*[@id=\"root\"]/div/div/div/form/div[2]/button");
	public By cep = By.name("cep");
	public By end = By.name("logradouro");
	public By numero = By.name("numero");
	public By complemento = By.name("complemento");
	public By next = By.xpath("//span[contains(text(),'PRÓXIMO')]");
	
}
