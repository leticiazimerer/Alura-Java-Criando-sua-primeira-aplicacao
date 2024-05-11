import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Jogo de Adivinhação");
        int numeroAleatorio = new Random().nextInt(100);
        int numeroDoUsuario = 0;
        int tentativas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um numero de 1-100 ");
            numeroDoUsuario = leitura.nextInt();
            tentativas++;
            if (numeroAleatorio == numeroDoUsuario) {
                System.out.println("ACERTOOOOU! o numero era: " + numeroAleatorio + "e vc acertou em " + tentativas + "tentativas");
                break;
            } else if (numeroDoUsuario > numeroAleatorio) {
                System.out.println("o numero é menor");
            } else {
                System.out.println("o numero é maior");
            }
        }
        if (tentativas == 5 && numeroAleatorio != numeroDoUsuario) {
            System.out.println("Suas tentativas acabaram! O número era: " + numeroAleatorio);
        }
    }
}
