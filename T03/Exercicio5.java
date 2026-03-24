import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();
        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();
        double imc = peso / Math.pow(altura, 2);
        System.out.println("Esta sera o IMC: " + imc);
        scanner.close();
    }
}