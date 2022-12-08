public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 30.0;
        double valorSaque = 17.0;

        if (valorSaque < saldo) {
            saldo = saldo - valorSaque;

        }
        System.out.println("Saldo R$ " + saldo);

    }
}