import java.util.Scanner;
public class Exercicio6 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        double cateto1, cateto2, hipotenusa;
        System.out.print("Insira o valor do primeiro cateto: ");
        cateto1 = sc.nextDouble();
        System.out.print("Insira o valor do segundo cateto: ");
        cateto2 = sc.nextDouble();
        hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.printf("Este é o valor da hipotenusa: %.2f", hipotenusa);
        sc.close();
    }
}