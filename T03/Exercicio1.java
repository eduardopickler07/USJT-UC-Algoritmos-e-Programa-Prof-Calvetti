import java.util.Scanner;
public class Exercicio1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print ("digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print ("digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.println ("nome: " + nome);
        System.out.println ("idade: " + idade);
        System.out.println ("altura: " + altura);
        scanner.close();
    }
}