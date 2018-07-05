![alt text](https://raw.githubusercontent.com/henrique-pinheiro/teste_desafio/master/QA_GFT_BRAZIL.jpg)

# Desafio QA GFT

Automatizar testes funcionais previamente planejados, é uma das atribuições de um QA na GFT.

Atualmente,grande parte das aplicações são desenvolvidas para diversas plataformas (Mobile, Website etc) e consomem um webservice para adicionar uma camada de segurança, redução de código, entre outros benefícios.

Dito isso, além de realizar testes de front em websites, é importante adicionar testes de serviço para obter maior confiabilidade e qualidade no produto.

## Iniciando

Para iniciar realize um Fork desse repositório com seu usuário do Github, após isso inicie seu projeto, ao finalizar, enviar um pull request.

## O Projeto

Criar um único projeto, realizando um Fork desse repositorio, contendo:

* Readme:
    * Contenha orientações de como instalar o ambiente e executar os testes.
    * Contenha clareza na escrita dos testes.
    * Contenha um report simples das execução dos testes.

### Desafio - Web Site

    Você deve automatizar, o web site http://automationpractice.com/index.php com os seguintes requsitos:
        1- Fluxo do Teste:
            1.1 Acessar a Pagina.
            1.2 Selecionar a Opção SigIn.
            1.3 Criar uma Conta no Site (Preencher TODOS os campos).
            1.4 Validar a criação de Conta, realizando um Log Out e um Login, logo em seguida.
        2- Deve ser automatizada em Java, C# ou Ruby.
        3- Usar Selenium Web-Driver.
        4- Utilizar Cucumber para documentar os cenários.
        5- Utlizar as bibliotecas que achar necessária para a execução dos testes.
        6- Utilizar os Conceitos de BDD e/ou Page Objects.

        Diferencias: Prencher os campos com geração de dados dinamicos(exceto Login) e escolha aleatória na seleção das opções (combo boxes, check boxes, etc).

        OBS: Os itens obrigatorios são do 1 ao 6.

### Desafio - Web Service
    Escolher o serviço https://github.com/toddmotto/public-apis ou outra API pública.
        1- Requisição POST:
            1.1 Enviar uma requisção do tipo POST.
            1.2 Validar status code e a resposta do serviço.
        2- Requisção GET:
            2.1 Enviar uma requisção do tipo GET.
            2.2 Validar status code e a resposta do serviço.
        3- Utilizar conceito de ServiceObjects e geração dinâmica de dados para efetuar o POST.
        4- Utilizar Cucumber para documentar os cenários.
        

        OBS: Os itens obrigatorios são do 1 ao 6.
## Desafio de performance
    * Projeto:
        1- Criar um script utilizando o Jmeter.
        2- Escolher uma das APIs de https://github.com/toddmotto/public-apis ou outra API pública.
        3- Validar o retorno da API.
        4- Realizar a leitura de parâmetros em um arquivo CSV.
        5- Criar um report em html para os resultados.

## Finalizando

    Desenvolva seu projeto, faça seus commits, no fork realizado, após o termino do seu projeto nos envie um Pull Request através do Github.

## Dica
    Mesmo não conseguindo terminar o projeto a tempo nos encaminhe, iremos analisar todas as estruturas, lógicas e padrões utilizados.
