Algoritmo CalculaIMC
    // Recebe o peso e a altura da pessoa
    Escreva("Digite o peso (em kg): ")
    Leia(peso)

    Escreva("Digite a altura (em metros): ")
    Leia(altura)

    // Calcula o IMC
    imc <- peso / (altura * altura)

    // Imprime o resultado do IMC
    Escreva("Seu índice de massa corporal (IMC) é: ", imc)
FimAlgoritmo
