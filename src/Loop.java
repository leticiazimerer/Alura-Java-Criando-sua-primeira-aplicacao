import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("qual sua avaliacao de 0-10?");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.println("media: " + mediaAvaliacao/3);



    }
}
