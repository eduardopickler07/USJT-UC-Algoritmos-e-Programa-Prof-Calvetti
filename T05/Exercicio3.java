import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite uma letra: ");
        String letra = scanner.nextLine().toLowerCase();
        switch (letra){
            case "a": //sem break (lógica)
            case "e":
            case "i":
            case "o":
            case "u": System.out.println(letra + " é uma vogal");
                    break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":  
            case "h":
            case "p":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z": System.out.println(letra + " é uma consoante");
            break;
            default: System.out.println("Invalido, escreva uma letra válida");
        }
        scanner.close();
    }
}