import java.util.Scanner;
public class Exercicio6{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        if(idade <= 10 && idade > 5)
        {
            System.out.println("Classificação infantil");
        }
        else if (idade > 10 && idade < 17)
        {
            System.out.println("Classificação juvenil");
        }
        else {
            System.out.println("Classificação sênior");
        }
        scanner.close();
    }
}