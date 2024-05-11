public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("lançamento");
        } else {
            System.out.println("Filme retro");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")) {
            System.out.println("ta liberado");
        } else {
            System.out.println("deve aluguel do filme");
        }

    }
}
