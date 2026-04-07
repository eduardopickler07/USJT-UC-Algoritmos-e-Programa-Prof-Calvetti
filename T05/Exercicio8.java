import java.util.Scanner;
public class Exercicio8 {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite o ano em que você nasceu: ");
        int anoNascimento = scanner.nextInt();
        double seculo = anoNascimento / 1000;
        if (seculo <= 1 && seculo > 0) {
            System.out.println("Século XX");
        }
        else if (seculo <= 2 && seculo > 0) {
            System.out.println("Século XXI");
        }
        else {    
            System.out.println("Nasceu antes do século XX e XXI");
        }
        scanner.close();
    }
}