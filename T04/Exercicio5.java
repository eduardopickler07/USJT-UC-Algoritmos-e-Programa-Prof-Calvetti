import java.util.Scanner;
public class Exercicio5 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Insira um numero: ");
        int numero = scanner.nextInt();
        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.print(numero + " é multiplo de 3 e 5");
        }
        else if (numero % 5 > 0 && numero % 3 == 0) {
            System.out.print(numero + " é multiplo de 3");
        }
        else if (numero % 5 == 0 && numero % 3 > 0) {
            System.out.print(numero + " é multiplo de 5");
        }
        else {
            System.out.print(numero + " não é multiplo de 5 e nem de 3");
        }
        scanner.close();
    }
}