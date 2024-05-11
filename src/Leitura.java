import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();

        System.out.println("qual o ano de lançamento?");
        int ano = leitura.nextInt();

        System.out.println("qual sua avaliacao de 0-10?");
        double avalicao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(ano);
        System.out.println(avalicao);
    }
}
