# encoding: utf-8
# language: pt
  Funcionalidade: Funções Matématicas
    Realizar funções matématicas

    @soma
    Esquema do Cenario: Realizar a soma de dois números inteiros
      Dado que um usuário entrou com o numero <Numero 1>
      E que o usuario clicou no botão +
      E que o usuario entrou com o segundo numero <Numero 2>
      Quando o usuario clicar no botão = da calculadora
      Entao o resultado deve ser <Resultado>
      Exemplos:
      |Numero 1| Numero 2|Resultado|
      |10      |5        |15       |