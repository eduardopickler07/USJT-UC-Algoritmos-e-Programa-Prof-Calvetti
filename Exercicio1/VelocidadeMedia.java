import java.util.Scanner;

public class VelocidadeMedia {
    public static void main (String[] args) {
        //declara e instancia um objeto Scanner
        Scanner scanner = new Scanner (System.in);
        //exibe mensagem para o usuário
        System.out.print("digite a distância inicial: ");
        //declara o double e faz a leitura
        double kmInicial = scanner.nextDouble();
        //exibbe mensagem para o usuário
        System.out.print("digite a distancia final: ");
        //declara o double e faz a leitura
        double kmFinal = scanner.nextDouble();
        //exibe a mensagem para o usuário
        System.out.print("digite o tempo inicial em horas: ");
        //declara o double e faz a leitura        
        double tempoInicial = scanner.nextDouble();
        //exibe a mensagem para o usuário
        System.out.print("digite o tempo final em horas: ");
        //declara o double e faz a leitura
        double tempoFinal = scanner.nextDouble();

        //processamento
        double deltaKM = kmFinal - kmInicial;
        double deltaTempo = tempoFinal - tempoInicial;
        double velocidadeMedia = deltaKM / deltaTempo;

        //saída
        System.out.println ("veja a velocidade média: " + velocidadeMedia);
        scanner.close();
    }
}