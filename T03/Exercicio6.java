import java.util.Scanner;

public class Exercicio6 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite os segundos: ");
        double segundo = scanner.nextDouble();
        double minutos = segundo / 60;
        double horas = minutos / 60;
        System.out.printf("Em %.2f segundos:\nSão %.2f minutos.\nSão %.2f horas.", segundo, minutos, horas);
        scanner.close();
    }
}