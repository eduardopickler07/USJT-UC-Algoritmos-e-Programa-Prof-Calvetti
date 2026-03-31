import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Coloque o valor de A: ");
        double a = scanner.nextDouble();
        System.out.print("Coloque o valor de B: ");
        double b = scanner.nextDouble();
        System.out.print("Coloque o valor de C: ");
        double c = scanner.nextDouble();
        if (a > b && b > c) {
            System.out.print(a + " - " + b + " - " + c);
        }
        else if (b > c && c > a) {
            System.out.print(b + " - " + c + " - " + a);
        }
        else if (b > a && a > c) {
            System.out.print(b + " - " + a + " - " + c);
        }
        else if (a > c && c > b) {
            System.out.print(a + " - " + c + " - " + b);
        }
        else if (c > a && a > b) {
            System.out.print(c + " - " + a + " - " + b);
        }
        else if (c > b && b > a) {
            System.out.print(c + " - " + b + " - " + c);
        }
        else {
            System.out.print(a + " - " + b + " - " + c);
        }
        scanner.close();
    }
}