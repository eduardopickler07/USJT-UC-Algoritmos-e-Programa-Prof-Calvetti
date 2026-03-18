import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um lado do seu quadrado: ");
        double lado = scanner.nextDouble();
        //processamento
        double area = lado * lado;
        System.out.println("Area do quadrado: " + area);
        scanner.close();
    }
}