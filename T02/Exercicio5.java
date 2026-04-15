import java.util.Scanner;
public class Exercicio5 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double raio, valor, areaPreco;
        System.out.print("Informe o raio: ");
        raio = sc.nextDouble();
        System.out.print("Informe o valor do metro quadrado(m²): ");
        valor = sc.nextDouble();
        areaPreco = (Math.PI * Math.pow(raio, 2)) * valor;
        System.out.printf("Este é o preço: %.2f", areaPreco);
        sc.close();
    }
}