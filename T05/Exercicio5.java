import java.util.Scanner;
public class Exercicio5{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite um número: ");
        double numUm = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double numDois = scanner.nextDouble();
        
        System.out.print("Escolha um operador matemático, (+ ; - ; * ; /): ");
        String operador = scanner.next();
        
        if (operador.equals("+"))
        {
            double resultado = numUm + numDois;
            System.out.println(numUm + " + " + numDois + " = " + resultado);
        }
        else if (operador.equals("-"))
        {
            double resultado = numUm - numDois;
            System.out.println(numUm + " - " + numDois + " = " + resultado);
        }
        else if (operador.equals("*"))
        {
            double resultado = numUm * numDois;
            System.out.println(numUm + " * " + numDois + " = " + resultado);
        }
        else if (operador.equals("/"))
        {
            double resultado = numUm / numDois;
            System.out.println(numUm + " / " + numDois + " = " + resultado);
        } 
        else {
            System.out.println("Invalido, digite um operador valido");
        }
        scanner.close();
    }
}