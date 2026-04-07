import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o preço do seu produto: ");
        double preco = scanner.nextDouble();
        if (preco <= 50) {
            System.out.println("R$ " + preco + " é barato");
        }

        else if (preco <= 100) {
            System.out.println("R$ " + preco + " é um preço médio");
        }
        else {
            System.out.println("R$ " + preco + " é caro");
        }
        scanner.close();
    }
}