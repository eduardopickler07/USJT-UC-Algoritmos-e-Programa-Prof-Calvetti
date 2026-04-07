import java.util.Scanner;
public class Exercicio10{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite um valor para o eixo X: ");
        int eixoX = scanner.nextInt();
        
        System.out.print("Digite um valor para o eixo Y: ");
        int eixoY = scanner.nextInt();
        
        if(eixoX > 0 && eixoY > 0)
        {
            System.out.println("Primeiro quadrante");
        }
        else if (eixoX < 0 && eixoY > 0)
        {
            System.out.println("Segundo quadrante");
        }
        else if (eixoX < 0 && eixoY < 0 )
        {
            System.out.println("Terceiro quadrante");
        }
        else {
            System.out.println("Quarto quadrante");
        }
        scanner.close();
    }
}