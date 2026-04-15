import java.util.Scanner;
public class Exercicio4 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double potencia, horas, preço, custo;
        System.out.print("Digite a potência do seu aparelho (em Watts): ");
        potencia = sc.nextDouble();
        System.out.print("Digite as horas de uso por dia que seu aparelho é utilizado: ");
        horas = sc.nextDouble();
        System.out.print("Digite o preço do KWh cobrado pela concessionária: ");
        preço = sc.nextDouble();
        custo = (potencia * horas * 30 / 1000) * preço;
        System.out.printf("Aqui está o custo final: %.2f", custo);
        sc.close();
    }
}