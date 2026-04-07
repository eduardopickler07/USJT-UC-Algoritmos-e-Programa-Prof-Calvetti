import java.util.Scanner;

public class Exercicio12{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite um número: ");
        double a = scanner.nextDouble();
        System.out.print("Digite um segundo número: ");
        double b = scanner.nextDouble();
        System.out.print("Digite um terceiro número: ");
        double c = scanner.nextDouble();
        if(a > b && a > c && b > c)
            System.out.println(a + " " + b + " " + c);
        
        else if(a > b && a > c && b < c)
        {
            System.out.println(a + " " + c + " " + b);
        }   
        
        else if(b > a && b > c && a > c)
        {
            System.out.println(b + " " + a + " " + c);
        }   
        
        else if(b > a && b > c && a < c)
        {
            System.out.println(b + " " + c + " " + a);
        }
        
        else if(c > a && c > b && a > b)
         {
            System.out.println(b + " " + a + " " + c);
         }   
        
        else if(c > a && c > b && a < b)
        {
            System.out.println(c + " " + b + " " + a);
        }
        scanner.close();
    }
}