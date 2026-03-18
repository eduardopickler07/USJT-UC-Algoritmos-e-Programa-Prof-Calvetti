import java.util.Scanner;

public class ConversorMoedas {
    public static void main (String[] args) {
        //declara e instancia um objeto Scanner
        Scanner scanner = new Scanner (System.in);
        //exibe mensagem para o usuário
        System.out.print("digite o valor em Reais: ");
        //declara o double e faz a leitura
        double valorReais = scanner.nextDouble();
        //processamento
        double dolarReais = 5.20;
        double valorDolar = valorReais / dolarReais;
        //Exibir os valores digitados
        System.out.println ("Aqui esta a conversão de Reais para Dolares: " + valorDolar);
        scanner.close();
    }
}
