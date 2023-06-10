programa {
  funcao inicio() {

    var
    real: peso
    real: altura
    real : imc
   
    // Recebe o peso e a altura da pessoa
    escreva("Digite o peso (em kg): ")
    leia(peso)

    escreva("Digite a altura (em metros): ")
    leia(altura)

    // Calcula o IMC
    imc = peso / (altura * altura)

    // Imprime o resultado do IMC
    escreva("Seu índice de massa corporal (IMC) é: ", imc)

    
  }
}