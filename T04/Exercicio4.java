import java.util.Scanner;
public class Exercicio4 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        double nota1, nota2, media;
        String resultado;
        System.out.print("Insira a primeira nota: ");
        nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.printf("Sua média é: %.1f\n", media);
        resultado = "Está de exame";
        if (media >= 6) {
            resultado = "Está Aprovado";
        }
        System.out.print(resultado);
        scanner.close();
    }
}