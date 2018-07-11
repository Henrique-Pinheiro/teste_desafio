Feature: Login Siga

  Background:
    Given user would like to log in Siga application

  Scenario: User Invalid Login and Password
    Given user informs Usuário with value equal "1284639425SP"
      And user informs Senha with value equal "756941285"
    When User clicks on Confirmar button
    Then user should see fail message with "Não confere Login e Senha"

  Scenario: User invalid Login and valid password
    Given user informs Usuário with value equal "1284639425SP"
      And user informs Senha with value equal "46946593839"
    When User clicks on Confirmar button
    Then user should see fail message with "Não confere Login e Senha"

  Scenario: User valid Login and invalid password
    Given user informs Usuário with value equal "566440969SP"
      And user informs Senha with value equal "12345678996"
    When User clicks on Confirmar button
    Then user should see fail message with "Não confere Login e Senha"

  Scenario: User valid Login and empty password
    Given user informs Usuário with value equal "566440969SP"
    When User clicks on Confirmar button
    Then user should see fail message with "Forneça a senha"


  Scenario: User valid Login and password
    Given user informs Usuário with value equal "566440969SP"
      And user informs Senha with value equal "46946593839"
    When User clicks on Confirmar button
    Then user should see the Siga home page
      And user should see his name with value equal "HENRIQUE PINHEIRO RODRIGUES"
      And user should see his E-mail with value equal "pinheiro_henrique@hotmail.com"
      And user should see his CPF with value equal "46946593839"
      And user should see his born date with value equal "14/05/1999"