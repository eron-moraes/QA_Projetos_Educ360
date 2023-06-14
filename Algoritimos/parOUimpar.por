programa {

  inclua biblioteca Util

  funcao inicio() {

    inteiro jogada
    inteiro nSorteado = Util.sorteia(0, 5)
    inteiro resultado
    inteiro restoDivisao

    escreva("Faça sua jogada(0,5): ")
    leia(jogada)

    escreva("O numero sorteado foi: ")
    escreva (nSorteado)
    resultado = nSorteado + jogada
    

    escreva ("\nO resultado da soma é: ", resultado)

    se (resultado % 2 == 1)
      escreva (" IMPAR")
      senao 
      escreva(" PAR")
    }