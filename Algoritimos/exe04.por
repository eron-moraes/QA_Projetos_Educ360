programa {
  funcao inicio() {

    var
    inteiro: base
    inteiro: altura
    real : area
   
    // Recebe a base e a altura do triângulo
    escreva("Digite a base do triângulo: ")
    leia(base)

    escreva("Digite a altura do triângulo: ")
    leia(altura)

    // Calcula a área do triângulo
    area = (base * altura) / 2

    // Imprime o resultado da área
    escreva("A área do triângulo é: ", area)
    
  }
}