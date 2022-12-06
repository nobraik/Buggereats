@teste
Feature: cadastrar novo motorista
  eu usuario quero acessar o site para efetuar
  cadastro

  @positive
  Scenario: cadastro

    Given que eu coloque os dados pessoais
    And coloque o endereco
    And seleciono metodo de emtrega
    When coloco a cnh
    And clicar no botao cadastrar novo motorista
    Then  recebo a mensagem ai sim


  @invalido
  Scenario: dados invalido

    Given que eu coloque as informacoes pessoais erradas
    And coloque o endereco incorreto
    And seleciono tipo de emtrega
    When  clicar no botao
    Then validar mensagens de erro em vermelho

  @negativo1
  Scenario: cadastra sem  selecionar metodo de entrega

    Given que coloque as informacoes pessoais
    And coloque o endereco correto
    But nao seleciono o metodo de entraga
    Then deve exibir mensagens em vermelho

  @BlackBox
  Scenario: selecionar dois metodos de entrega


    Given que coloque as informacoes pessoais corretas
    And  preecha  o endereco  correto
    But  seleciono dois metodo de entraga
    Then nao deve permitir a selecionar dois metodos

  @SmolkTest
  Scenario: cadastra sem cnh
    Given que coloque as informacoes
    And coloque o endereco certo
    And coloque o metodo de entrega
    But Nao colocar a chn
    Then deve pedir pra colocar um chn valida

  @Negativo2
  Scenario: cadastra sem colocar o cep
    Given que coloque as informacoes pessoais completo
    And coloque o endereco sem colocar o cep
    Then nao deve deixar proceguir



