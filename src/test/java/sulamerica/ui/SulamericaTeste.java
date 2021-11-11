package sulamerica.ui;

import elementoweb.ElementoWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.MetodosDeTeste;

public class SulamericaTeste {
	MetodosDeTeste metodo = new MetodosDeTeste();
	ElementoWeb el = new ElementoWeb();

	@Given("que eu entre no site da sulamerica {string}")

	public void que_eu_entre_no_site_da_sulamerica(String site) {

		metodo.abrirNavegador(site);

	}

	@When("em eu quero simular")
	public void em_eu_quero_simular() throws InterruptedException {
		Thread.sleep(2000);

		metodo.clicar(el.continuar);
		metodo.clicar(el.simular);
	}

	@When("clico em campo qual seu nome completo")
	public void clico_em_campo_qual_seu_nome_completo() {

	}

	@When("preencho o campo qual seu nome completo do formulario {string}")
	public void preencho_o_campo_qual_seu_nome_completo_do_formulario(String texto) {

		metodo.escrever(el.nome, texto);
	}

	@When("clico em campo qual sua data de nascimento")
	public void clico_em_campo_qual_sua_data_de_nascimento() {

	}

	@When("preencho o campo qual sua data de nascimento formulario {string}")
	public void preencho_o_campo_qual_sua_data_de_nascimento_formulario(String texto) {
		metodo.escrever(el.datanasc, texto);

	}

	@When("clico em campo sua ocupacao formulario")
	public void clico_em_campo_sua_ocupacao_formulario() {

		metodo.clicar(el.prof);
		metodo.clicar(el.prof2);

	}

	@When("clico em botao proximo")
	public void clico_em_botao_proximo() {

		metodo.clicar(el.proximo);

	}

	@When("clico no botao ligacao formulario")
	public void clico_no_botao_ligacao_formulario() {
		metodo.clicar(el.email);
	}

	@When("preencho o campo formulario  telefone formulario {string}")
	public void preencho_o_campo_formulario_telefone_formulario(String phone) {
		metodo.escrever(el.phone, phone);
	}

	@When("preencho o campo email formulario {string}")
	public void preencho_o_campo_email_formulario(String email) {
		metodo.escrever(el.email2, email);

	}

	@When("clico no botao autorizo corretor entrar em contato comigo formulario")
	public void clico_no_botao_autorizo_corretor_entrar_em_contato_comigo_formulario() {
		metodo.clicar(el.autorizacao);

	}

	@When("clico no botao encontrar meu seguro")
	public void clico_no_botao_encontrar_meu_seguro() throws Exception {

		Thread.sleep(500);
		metodo.clicar(el.seguro);
	}

	@When("clico no botao gostaria de ajuda")
	public void clico_no_botao_gostaria_de_ajuda() {
		metodo.clicar(el.ajuda);

	}

	@When("preencho o campo valor mansal formulario  {string}")
	public void preencho_o_campo_valor_mansal_formulario(String valor) {
		metodo.escrever(el.valor, valor);
	}

	@When("preencho o campo periodo formulario {string}")
	public void preencho_o_campo_periodo_formulario(String periodo) {
		metodo.escrever(el.periodo, periodo);
	}

	@When("clico no botao calcular")
	public void clico_no_botao_calcular() {
		metodo.clicar(el.calcular);

	}

	@When("clico em contratar")
	public void clico_em_contratar() throws Exception {

		Thread.sleep(500);
		metodo.clicar(el.seguro);
		metodo.clicar(el.contratar);
	}
	@When("preencho o campo cpf formulario {string}")
	public void preencho_o_campo_cpf_formulario(String cpf) {
	    metodo.escrever(el.cpf, cpf);
	}

	@When("clico no campo sexo formulario")
	public void clico_no_campo_sexo_formulario() {
	    metodo.clicar(el.sexo);
	    metodo.clicar(el.sexo2);
	}

	@When("preencho o campo altura formulario {string}")
	public void preencho_o_campo_altura_formulario(String altura) {
	    metodo.escrever(el. altura, altura);
	}

	@When("preencho o campo conf email formulario {string}")
	public void preencho_o_campo_conf_email_formulario(String confemail) {
	    metodo.escrever(el.confemail, confemail);
	}

	@When("preencho o campo peso formulario {string}")
	public void preencho_o_campo_peso_formulario(String peso) {
	    metodo.escrever(el.peso, peso);
	}
	
	@When("clico em proximo")
	public void clico_em_proximo() {
	    metodo.clicar(el.proximo2);
	}
	
	@When("preencho o campo cep {string}")
	public void preencho_o_campo_cep(String cep) {
	   metodo.escrever(el.cep, cep);
	}

	@When("clicar em enderco")
	public void clicar_em_enderco() {
		metodo.clicar(el.end);
	    
	}

	@When("preencho o campo numero {string}")
	public void preencho_o_campo_numero(String numero) {
	    metodo.escrever(el.numero, numero);
	}

	@When("preencho o campo complemento {string}")
	public void preencho_o_campo_complemento(String complemento) {
	    metodo.escrever(el.complemento, complemento);
	}

	@Then("clico em botao para prosseguir")
	public void clico_em_botao_para_prosseguir() throws Exception {
		Thread.sleep(500);
	    metodo.clicar(el.next);
	    
	    
	
	}

}
