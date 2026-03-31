import java.util.Scanner;
public class Exercicio2 {
    public static void main (String args[]) {
        Scanner scanner = new Scanner (System.in);
        int idade;
        System.out.print("Digite a sua idade: ");
        idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.print("Vocë está classificado para a Categoria Adulta!");
        }
        else {
            System.out.print("Vocë está calssificado para a Categoria Jovem");
        }
        scanner.close();
    }
}