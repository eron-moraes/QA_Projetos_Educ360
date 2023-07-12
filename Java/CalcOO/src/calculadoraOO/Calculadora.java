package calculadoraOO;

//Classe Calculadora
public class Calculadora {
 // Método para calcular a operação matemática
 public double calcular(double a, double b, char operador) {
     double resultado = 0;
     
     switch (operador) {
         case '+':
             resultado = a + b;
             break;
         case '-':
             resultado = a - b;
             break;
         case '*':
             resultado = a * b;
             break;
         case '/':
             if (b != 0) {
                 resultado = a / b;
             } else {
                 System.out.println("Nao e possivel dividir por zero!");
             }
             break;
         default:
             System.out.println("Operador invalido!");
     }
     
     return resultado;
 }
}
