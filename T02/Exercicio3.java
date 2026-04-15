import java.util.Scanner;
public class Exercicio3 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double raio, altura, v;
        System.out.print("Digite o raio da base: ");
        raio = sc.nextDouble();
        System.out.print("Digite a altura da base: ");
        altura = sc.nextDouble();
        v = Math.PI * (Math.pow(raio, 2)) * altura;
        System.out.printf("O volume do seu cilindo é: %.2f", v);
        sc.close();
    }
}