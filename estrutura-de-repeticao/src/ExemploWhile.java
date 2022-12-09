import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    /** metodo retorna um valor aleatorio entre 1 e 50 */
    private static double valorCompraAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1, 50);
    }

    public static void main(String[] args) {

        double saldoCartao = 100.0;
        double valorCompra = 0;

        while (saldoCartao > 0) {
            // atribuindo valor aleatorio por meio da funçao valorCompraAleatorio
            valorCompra = valorCompraAleatorio();

            if (saldoCartao >= valorCompra) {
                saldoCartao -= valorCompra;

                System.out.println("Prodduto R$ " + valorCompra + " comprado com sucesso!");
                System.out.println("Saldo Cartão Atual R$ " + saldoCartao);
            } else {
                System.out.println("Produto valor R$" + valorCompra + " não adquerido!");
                System.err.println("Saldo cartão insuficiente R$ " + saldoCartao);
                break;
            }

        }

    }

}
