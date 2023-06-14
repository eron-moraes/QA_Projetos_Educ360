programa {

  inclua biblioteca Util

  funcao inicio() {

        inteiro numeroSorteado = Util.sorteia(1, 100)
        inteiro = nSort
        inteiro chute
        inteiro tentativas
    
    escreva("Bem-vindo ao Jogo de Adivinhação!\n")

    chute == 0
    nSort = numeroSorteado

    
    se chute == nSort
    se (chute != numeroSorteado)
        escreva("Digite um número entre 1 e 100: ")
        leia(chute)

        se (chute < nSort)
        escreva ("Chutou baixo, tente novamente!") 
        se (chute > nSort)
        escreva("Chutou alto, tente novamente!")    
        se (chute == nSort)   
        escreva("Parabéns!!! Você acertou o número, ", nSort)
