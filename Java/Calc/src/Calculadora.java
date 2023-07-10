import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        String numero1 = scanner.nextLine();

        System.out.println("Digite o segundo numero: ");
        String numero2 = scanner.nextLine();

        System.out.println("Digite a operacao (+, -, *, /): ");
        String operacao = scanner.nextLine();

        double resultado = 0;

        switch (operacao) {
            case "+":
                resultado = Double.parseDouble(numero1) + Double.parseDouble(numero2);
                break;
            case "-":
                resultado = Double.parseDouble(numero1) - Double.parseDouble(numero2);
                break;
            case "*":
                resultado = Double.parseDouble(numero1) * Double.parseDouble(numero2);
                break;
            case "/":
                resultado = Double.parseDouble(numero1) / Double.parseDouble(numero2);
                break;
            default:
                System.out.println("Operação invalida!");
                return;
        }

        System.out.println("O resultado da operacao e: " + resultado);
    }
}
