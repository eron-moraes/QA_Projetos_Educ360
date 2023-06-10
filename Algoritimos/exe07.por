programa {
  funcao inicio() {

    var
    real: valorProduto
    real: porcentagemDesconto
    real: desconto
    real: valorFinal

    // Recebe o valor do produto e a porcentagem de desconto
    escreva("Digite o valor do produto: ")
    leia(valorProduto)

    escreva("Digite a porcentagem de desconto: ")
    leia(porcentagemDesconto)

    // Calcula o valor do desconto
    desconto = valorProduto * (porcentagemDesconto / 100)

    // Calcula o valor final do produto
    valorFinal = valorProduto - desconto

    // Imprime os resultados
    escreva("O valor do desconto é: ", desconto)
    escreva("O valor final do produto é: ", valorFinal)

    
  }
}
