import java.util.Scanner;
public class Exercicio9{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Digite o valor: ");
        double temperatura = scanner.nextDouble();
        
        System.out.print("Escolha como converter o valor digitado de Celsius para Fahrenheit (a) ou Fahrenheit para Celsius (b): ");
        String converter = scanner.next();
        
        switch (converter)
        {
            case "a": double fahrenheit = (temperatura * 9/5) + 32;
                System.out.println("Valor inicial: " + temperatura + " valor transformado em Fahrenheit " + fahrenheit);
            break;      
            case "b": double celsius = (temperatura - 32) * 5/9;
                System.out.println("Valor inicial: " + temperatura + " valor transformado em Celsius " + celsius);
            break;
            default: System.out.println("Digite a letra correta");
        }
        scanner.close();
    }
}