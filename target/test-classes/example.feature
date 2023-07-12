Feature: Teste Example
    Descrição do negocio.
    Scenario: Procurar um produto no site e verificar seu valor
        Given esteja na pagina : "https://www.amazon.com.br/"
        When fazer busca por : "iphone 14"
        Then Verificar valor acima de : "4.999"