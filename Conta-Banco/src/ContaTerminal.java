import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite 1 para abrir uma conta");
        int escolha = sc.nextInt();

        if (escolha == 1) {
            // instanciando um objeto da classse conta
            Conta conta = new Conta();

            System.out.println("Conta Cridada com sucesso!");

            System.out.println("Digite o nome do titular da conta:");
            String nome = sc.next();
            conta.setTitular(nome);

            System.out.println("Informe o valor para depositar em sua conta");
            double valor = sc.nextDouble();
            conta.depositar(valor);

            System.out.println("Olá " + conta.getTitular()
                    + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta "
                    + conta.getNumeroConta() + " e seu saldo " + conta.getSaldo() + " já está disponível para saque");

        } else {
            System.out.println("Operação finalizada!");
        }
    }
}
