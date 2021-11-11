#Author: thi_reimberg1@hotmail.com


Feature: Preencher o formulario de simulação e contratação de seguro de vida da SulAmérica
  como usuario quero preencher o fomulario para simular e contratar seguro de vida


  Scenario: cotação de produtos 
    Given que eu entre no site da sulamerica "https://contratafacil-segurovida.paas.sulamerica.com.br/?corretor_id=f6931093-e743-4553-88f6-9d04e3cec067" 
    When em eu quero simular
    And clico em campo qual seu nome completo
    And preencho o campo qual seu nome completo do formulario "Astolfo bignnon veigas"
    And clico em campo qual sua data de nascimento
    And preencho o campo qual sua data de nascimento formulario "25/12/1978"
    And clico em campo sua ocupacao formulario 
    And clico em botao proximo
    And clico no botao ligacao formulario
    And preencho o campo formulario  telefone formulario "1198091-8055"
    And preencho o campo email formulario "teste.teste@hotmail.com"
    And clico no botao autorizo corretor entrar em contato comigo formulario
    And clico no botao encontrar meu seguro 
    And clico no botao gostaria de ajuda
    And preencho o campo valor mansal formulario  "90000,00"
    And preencho o campo periodo formulario " 3 anos "
    And clico no botao calcular 
    And clico em contratar
    And preencho o campo cpf formulario "798.856.730-67"
    And clico no campo sexo formulario 
    And preencho o campo altura formulario "1,85"
    And preencho o campo conf email formulario "teste.teste@hotmail.com"
    And preencho o campo peso formulario "85"
    And clico em proximo
    And preencho o campo cep "04822-200"
    And clicar em enderco 
    And preencho o campo numero "168"
    And preencho o campo complemento "casa 1"
    Then clico em botao para prosseguir
    
    