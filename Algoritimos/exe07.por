Algoritmo CalcularDesconto
    // Recebe o valor do produto e a porcentagem de desconto
    Escreva("Digite o valor do produto: ")
    Leia(valorProduto)

    Escreva("Digite a porcentagem de desconto: ")
    Leia(porcentagemDesconto)

    // Calcula o valor do desconto
    desconto <- valorProduto * (porcentagemDesconto / 100)

    // Calcula o valor final do produto
    valorFinal <- valorProduto - desconto

    // Imprime os resultados
    Escreva("O valor do desconto é: ", desconto)
    Escreva("O valor final do produto é: ", valorFinal)
FimAlgoritmo
