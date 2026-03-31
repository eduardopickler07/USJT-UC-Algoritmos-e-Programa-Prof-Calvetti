import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    System.out.print("Insira o seu ano de nascimento: ");
    int anoIdade = scanner.nextInt();
    System.out.print("Insira o ano atual: ");
    int anoAtual = scanner.nextInt();
    int idade = anoAtual - anoIdade;
    if (idade >= 18) {
        System.out.print("Sua idade é " + idade + " e já tem idade para dirigir e votar!");
    }
    else if (idade >= 16) {
        System.out.print("Sua idade é " + idade + " e já tem idade para votar, mas não para dirigir!");
    }    
    else {
        System.out.print("Sua idade é " + idade + " e não está apto para votar e dirigir!");
        scanner.close();
    }
    }
}