import java.util.Scanner;
public class Exercicio1 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        double numero;
        System.out.print("Digite um numero: ");
        numero = scanner.nextDouble();
            if (numero >= 0) {
                System.out.println(numero + " é positivo");
            } 
            else {
                System.out.println(numero + " é negativo");
            }
        scanner.close();
    }
}