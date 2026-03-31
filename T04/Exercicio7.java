import java.util.Scanner;
public class Exercicio7 {
    public static void main (String args []) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Coloque o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Coloque o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Coloque o valor de C: ");
        double c = scanner.nextDouble();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.print("A, B e C podem virar um triângulo");
        }
        else {
            System.out.print("A, B e C não podem virar um triângulo");
        }
        scanner.close();
    }
}