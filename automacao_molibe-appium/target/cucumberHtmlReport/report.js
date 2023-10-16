$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("teste_calculadora_mobile.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# encoding: utf-8"
    },
    {
      "line": 2,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Funções Matématicas",
  "description": "Realizar funções matématicas",
  "id": "funções-matématicas",
  "keyword": "Funcionalidade"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Realizar a soma de dois números inteiros",
  "description": "",
  "id": "funções-matématicas;realizar-a-soma-de-dois-números-inteiros",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@soma"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que um usuário entrou com o numero \u003cNumero 1\u003e",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "que o usuario clicou no botão +",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "que o usuario entrou com o segundo numero \u003cNumero 2\u003e",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o usuario clicar no botão \u003d da calculadora",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "o resultado deve ser \u003cResultado\u003e",
  "keyword": "Entao "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "funções-matématicas;realizar-a-soma-de-dois-números-inteiros;",
  "rows": [
    {
      "cells": [
        "Numero 1",
        "Numero 2",
        "Resultado"
      ],
      "line": 14,
      "id": "funções-matématicas;realizar-a-soma-de-dois-números-inteiros;;1"
    },
    {
      "cells": [
        "10",
        "5",
        "15"
      ],
      "line": 15,
      "id": "funções-matématicas;realizar-a-soma-de-dois-números-inteiros;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 15,
  "name": "Realizar a soma de dois números inteiros",
  "description": "",
  "id": "funções-matématicas;realizar-a-soma-de-dois-números-inteiros;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@soma"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que um usuário entrou com o numero 10",
  "matchedColumns": [
    0
  ],
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "que o usuario clicou no botão +",
  "keyword": "E "
});
formatter.step({
  "line": 10,
  "name": "que o usuario entrou com o segundo numero 5",
  "matchedColumns": [
    1
  ],
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "o usuario clicar no botão \u003d da calculadora",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "o resultado deve ser 15",
  "matchedColumns": [
    2
  ],
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});