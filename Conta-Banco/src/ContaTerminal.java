import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para abrir uma conta");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            // instanciando um objeto da classse conta
            Conta conta = new Conta();

            System.out.println("Sua conta foi criada e numero dela é " + conta.getNumeroConta());

            System.out.println("Digite o nome do titular da conta:");
            String nome = sc.next();
            conta.setTitular(nome);

            System.out.println("Informe o valor para depositar em sua conta");
            double valor = sc.nextDouble();
            conta.depositar(valor);

            System.out.println("Numero canta: " + conta.getNumeroConta());
            System.out.println("Titular: " + conta.getTitular());
            System.out.println("Saldo R$ " + conta.getSaldo());

        } else {
            System.out.println("Operação finalizada!");
        }
    }
}
