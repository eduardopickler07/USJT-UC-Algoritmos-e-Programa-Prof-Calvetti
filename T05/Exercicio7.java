import java.util.Scanner;
public class Exercicio7{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        
        double imc = peso / Math.pow(altura,2);
        
        if(imc <= 18.5)
        {
            System.out.println("Magreza");
        }
        else if (imc <= 24.9)
        {
            System.out.println("Normal");
        }
        else if (imc <= 29.9)
        {
            System.out.println("Sobrepeso");
        }
        else if (imc <= 34.9)
        {
            System.out.println("Obesidade grau I");
        }
        else if (imc <= 39.9)
        {
            System.out.println("Obesidade grau II");
        }
        else {
            System.out.println("Obesidade grau III");
        }
        scanner.close();
    }
}