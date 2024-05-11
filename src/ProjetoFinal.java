import java.util.Scanner;

public class ProjetoFinal {
    public static void main(String[] args) throws InterruptedException {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Qual seu nome completo?");
        String nomeCliente = leitor.nextLine();
        System.out.println("Digite 1 para Conta Corrente ou 2 para Poupança");
        int tipoConta = leitor.nextInt();

        String tipoContaString = "";
        if (tipoConta == 1) {
            tipoContaString = "Conta Corrente";
        } else if (tipoConta == 2) {
            tipoContaString = "Poupança";
        } else {
            System.out.println("Tipo de Conta Inválido, comece novamente");
            return;
        }
        System.out.println("Qual seu saldo Inicial?");
        double saldoInicial = leitor.nextDouble();
        String menu = "***************************************\nDados do Cliente\n\nNome:              " + nomeCliente + "\nTipo da Conta:     " + tipoContaString + "\nSaldo Inicial:     R$ " + saldoInicial + "\n***************************************";
        System.out.println(menu);
        String operacoes = """
                
                Operações
                
                1 - Consultar Saldos
                2 - Receber Valor
                3 - Transferir Valor
                4 - Sair\n
                """;
        System.out.println(operacoes);
        int escolhaUsuario = 0;
        double saldo = saldoInicial ;
        while (escolhaUsuario != 4) {
            escolhaUsuario = leitor.nextInt();
            if (escolhaUsuario == 1) {
                System.out.println("Seu saldo atual é: R$ " + saldo);
                Thread.sleep(1200);
                System.out.println(operacoes);
            } else if (escolhaUsuario == 2) {
                System.out.println("Quanto deseja Receber? ");
                double valorReceber = leitor.nextDouble();
                saldo += valorReceber;
                System.out.println("Seu saldo atual é: R$ " + saldo);
                Thread.sleep(1200);
                System.out.println(operacoes);
            } else if (escolhaUsuario == 3) {
                System.out.println("Quanto deseja Transferir? ");
                double valorTransferir = leitor.nextDouble();

                if (valorTransferir > saldo) {
                    System.out.println("Não tem saldo suficiente, tente novamente");
                    Thread.sleep(1200);
                    System.out.println(operacoes);
                } else {
                    saldo -= valorTransferir;
                    System.out.println("Seu saldo atual é: R$ " + saldo);
                    Thread.sleep(1200);
                    System.out.println(operacoes);
                }
            } else if (escolhaUsuario != 4) {
                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                Thread.sleep(1200);
                System.out.println(operacoes);
            }
        } 
        System.out.println("Obrigado por utilizar o nosso sistema. Tenha um bom dia!");
    }
}
