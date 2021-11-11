# Teste Prático - Test-SuLamerica

# Desafio Técnico - Usando Eclipse Maven-selenium


------------

## Passo a passo para o teste automático:
1. Entrar no site:  https://contratafacil-segurovida.paas.sulamerica.com.br/?corretor_id=f6931093-e743-4553-88f6-9d04e3cec067
2. clico em campo qual sua data de nascimento
3. preencho o campo qual sua data de nascimento formulario "25/12/1978"
4. clico em campo sua ocupacao formulario 
5. clico em botao proximo
6. clico no botao ligacao formulario
7. preencho o campo formulario  telefone formulario "1198091-8055"
8. preencho o campo email formulario "teste.teste@hotmail.com"
9. clicono botao autorizo corretor entrar em contato comigo formulario
10. clico  no botao encontrar meu seguro 
11. clico no botao gostaria de ajuda
12. preencho o campo valor mansal formulario  "90000,00"
13. preencho o campo periodo formulario " 3 anos "
14. clico no botao calcular 
15. clico em contratar
16. preencho o campo cpf formulario "798.856.730-67"
17. clico no campo sexo formulario 
18. preencho o campo altura formulario "1,85"
19. preencho o campo conf email formulario "teste.teste@hotmail.com"
20. preencho o campo peso formulario "85"
21. clico em proximo
22. preencho o campo cep "04822-200"
23. clicar em enderco 
24. preencho o campo numero "168"
25. preencho o campo complemento "casa 1"   
26. clico em botao para prosseguir


## Esrutura e requisitos para execução do projeto:
1. baixe IDE eclipse https://www.eclipse.org/eclipseide/
2. Crie um  projeto mavem java;
3. Baixe as dependencias " sellenum-java, cucmber-java, cucumber-junit,cucumber-core;
4. Crie uma Pasta Drivers para os navegadores;
5. Crie  3 packages em src/test/java, elementoweb, metodos e sulameica.ui para os steps;
6. Crie dentro da package elementoweb uma class: ElementoWeb, na package metodos crie uma class: MetodosDeTeste e na sulamerica.ui crie uma class: SulamericaTeste para melhor organição de seu codigo.
7. crie em scr/test/recources um folder de nome:Features e dentro de Features crie um File com o nome do projeto.feature;
8. Em projeto.feature, crie seu BDD e em seguida clicar em Run-As para gerar as steps;
9. Copiar os steps gerados para a class SulamericaTeste  para a execução dos testes.
10. Na class MetodosDeteste crie os metodos que ira utilizar EX. WebDriver entre outros;
11. Na class ElemntosWeb crie os elementos para execução dos teste.


## Execução
### Local
1. Acesso: acessar a raiz do projeto usando um terminal
2. executar o teste completo, execute o comando: Run As teste.sulamerica.feature
