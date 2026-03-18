import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o primeiro numero: ");
        double primeiroNumero = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double segundoNumero = scanner.nextDouble();
        System.out.print("Digite o terceiro numero: ");
        double terceiroNumero = scanner.nextDouble();
        double mediaAritmetica = (primeiroNumero + segundoNumero + terceiroNumero) / 3;
        System.out.println("Esta sera a media: " + mediaAritmetica);
        scanner.close();
    }
}