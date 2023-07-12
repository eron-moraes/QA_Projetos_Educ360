package calculadoraOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Calculadora
        Calculadora calculadora = new Calculadora();
        
        Scanner scanner = new Scanner(System.in);
        
        // Variável para controlar o loop
        boolean continuar = true;
        
        while (continuar) {
            // Exibindo o menu
            System.out.println("======= Calculadora =======");
            System.out.println("** Selecione um operador:**");
            System.out.println("1 - Soma (+)");
            System.out.println("2 - Subtracao (-)");
            System.out.println("3 - Multiplicacao (*)");
            System.out.println("4 - Divisao (/)");
            System.out.println("0 - Sair");
            System.out.print("Digite a opcao desejada: ");
            int opcao = scanner.nextInt();
            
            // Verificando a opção selecionada
            switch (opcao) {
                case 0:
                    continuar = false;
                    System.out.print("Obrigado por usar a calculadora Educ360! ");
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                    // Lendo os valores do usuário
                    System.out.print("Digite o primeiro valor: ");
                    double valor1 = scanner.nextDouble();
                    
                    System.out.print("Digite o segundo valor: ");
                    double valor2 = scanner.nextDouble();
                    
                    char operador;
                    
                    // Definindo o operador com base na opção selecionada
                    switch (opcao) {
                        case 1:
                            operador = '+';
                            break;
                        case 2:
                            operador = '-';
                            break;
                        case 3:
                            operador = '*';
                            break;
                        case 4:
                            operador = '/';
                            break;
                        default:
                            System.out.println("Opcao invalida!");
                            return;
                    }
                    
                    // Calculando o resultado
                    double resultado = calculadora.calcular(valor1, valor2, operador);
                    
                    // Exibindo o resultado
                    System.out.println("Resultado: " + resultado);
                    
                    // Perguntando se deseja continuar
                    System.out.print("Deseja continuar? (S/N): ");
                    String resposta = scanner.next();
                    
                    if (resposta.equalsIgnoreCase("N")) {
                        continuar = false;
                        System.out.println("Obrigado por usar a calculadora Educ360!");
                    }
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}